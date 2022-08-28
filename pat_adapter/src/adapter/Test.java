package adapter;
public class Test {

	public static void main(String[] args) {
		Client client = new Client();
		/**
		 * client.setStandard(new AncienneImpl());
		 * le probl�me est qu'au lieu d'utiliser mon Impl�mentation Standard
		 * le client voudrait utiliser l'Ancienne Impl�mentation
		 * On ne peut pas brancher le client avec l'Ancienne Impl�mentation
		 * Car le client ne connait que l'interface Standard
		 */
		//client.setStandard(new StandardImpl());
		//client.setStandard(new AdapterImpl());
		client.setStandard(new AdapterImpl2());
		client.traitement(7,4);	
	}
}
