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
	private int nombreSecret;
	private boolean fin;
	private String gagnant;
	
	@Override
	public void run() {
		try {
			ServerSocket ss = new ServerSocket(234);
			nombreSecret = (int)(Math.random()*1000);
			
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
				pw.println("Devinez le nombre secret entre 0 et 1000");
				
				while(true) {
					String req;
					while((req = br.readLine())!=null) {
						System.out.println(IP+ " a envoyé" +req);
						int nb = Integer.parseInt(req);
						
						if(fin == false) {
							if(nb < nombreSecret) {
								pw.println("Votre nombre est plus petit");
							}
							else if(nb > nombreSecret) {
								pw.println("Votre nombre est plus grand");
							}
							else {
								gagnant = IP;
								fin = true;
								pw.println("************************");
								pw.println("BRAVO mr"+IP);
								pw.println("************************");


							}
					    }
						else {
							pw.println("Le jeu est terminé, le gagnant est :" +gagnant);

							
						}
					

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
