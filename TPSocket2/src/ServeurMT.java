import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServeurMT extends Thread {
	int nbClients;
	
	@Override
	public void run() {
		try {
			ServerSocket ss = new ServerSocket(234);
			while(true) { 
				Socket s = ss.accept();
				++nbClients;
				new Conversation(s,nbClients).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	class Conversation extends Thread{
		private Socket socket;
		private int numeroClient;
		
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
					String req = br.readLine();
					System.out.println(IP+" a envoyé" +req);
					if(req!=null) {
						String rep = "Size " +req.length();
						pw.println(rep);

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
