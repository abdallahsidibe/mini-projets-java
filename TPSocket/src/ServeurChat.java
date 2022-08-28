import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class ServeurChat extends Thread {
	int nbClients;
	private List<Conversation> clientsConnectes = new ArrayList<>();
	@Override
	public void run() {
		try {
			ServerSocket ss = new ServerSocket(234);
			
			while(true) { 
				Socket s = ss.accept();
				++nbClients;
			Conversation c = new Conversation(s,nbClients);
			clientsConnectes.add(c);
			c.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void broadCast(String message, int[] numeroClients) {
		
		try {
			for(Conversation c:clientsConnectes) {
				boolean trouve = false;
				for(int i=0; i<numeroClients.length; i++) {
					 if(c.numeroClient==numeroClients[i]) {
						 trouve =true;
						 break;
					 }
				}
				if(trouve ==true) {
					PrintWriter pw = new PrintWriter(c.socket.getOutputStream(), true);
					pw.println(message);
				}
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	class Conversation extends Thread{
		protected Socket socket;
		protected int numeroClient;
		
		public Conversation(Socket socket, int num) {
			super();
			this.socket = socket;
			this.numeroClient = num;
		}

		@Override
		public void run() {
			//peut interne ou externe
			/**
			 * S'exécute en parallèle et indépendamment 
			 * du reste de l'appli
			 */
			try {
				/***Pour Lire*/
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);//caractere
				BufferedReader br = new BufferedReader(isr);//chaine de caractere
				
				/** Pour Envoyer*/
				OutputStream os = socket.getOutputStream();
				PrintWriter pw = new PrintWriter(os,true);
				
				/**Affichage au niveau du serveur**/
				String IP = socket.getRemoteSocketAddress().toString();
				
				System.out.println("Connexion du client" +numeroClient+ " IP= " +IP);
				pw.println("Bienvenue, vous etes le client numero " +numeroClient);
				
				while(true) {
					String req;
					while((req = br.readLine())!=null) {
						String[] t = req.split("-");
						String message = t[0];
						String[]  t2  = t[1].split(",");
						int[] numeroClients = new int[t2.length];
						for(int i=0; i<t2.length; i++) {
							numeroClients[i] = Integer.parseInt(t2[i]);
						}
						broadCast(req, numeroClients);
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		new ServeurMT().start();

	}

}
