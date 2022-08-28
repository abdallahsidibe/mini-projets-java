import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(1234);
			System.out.println("J'attend la connexion d'un client");
			/*Pour la connexion d'un client on aura besoin de declarer
			 * un objet socket
			 *Socket s = ss.accept(); cad l'objet socket sever accept  
			 * attend la connexion d'un client
			 * Quand un client automatiquement, il y a génération d'une socket
			 * */
			Socket clientSocket = ss.accept();
			System.out.println("Nouveau client connecté");
			System.out.println("génération de objet InputStream et OutputSteam de la socket ");
			InputStream is = clientSocket.getInputStream();
			OutputStream os = clientSocket.getOutputStream();
			System.out.println("J'attend un nombre :");
			int nb = is.read();
			int rep = nb*8;
			System.out.println("J'envoie la réponse");
			os.write(rep);
			System.out.println("Déconnexion du client");
			clientSocket.close();//fermer la coonexion
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
