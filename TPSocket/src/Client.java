import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			System.out.println("Cr�er une connexion au serveur");
			Socket clientSocket = new Socket("localhost", 1234);
			System.out.println("g�n�ration de objet InputStream et OutputSteam de la socket ");
			InputStream is = clientSocket.getInputStream();
			OutputStream os = clientSocket.getOutputStream();
			
			System.out.println("Lire un nombre au clavier NB :");
			Scanner scanner = new Scanner(System.in); 
			int nb = scanner.nextInt();
			
			System.out.println("Envoyer le nombre "+nb+" au serveur");
			os.write(nb);
			
			System.out.println("Atendre la r�ponse du serveur");
			int rep = is.read();
			System.out.println("La r�ponse est : "+rep);
		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

