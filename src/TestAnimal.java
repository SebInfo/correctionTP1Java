public class TestAnimal {

	private static String accordAnimal(int nombre) {
		return nombre > 1 ? "animaux" : "animal";
	}

	private static String accordChat(int nombre) {
		return nombre > 1 ? "chats" : "chat";
	}

	private static String accordChien(int nombre) {
		return nombre > 1 ? "chiens" : "chien";
	}

	public static void main(String[] args) {
		// Création d'un chenil avec la classe Chenil
		Chenil monChenil = new Chenil();
		
		// Création des animaux
		Chien rex=new Chien("Rex");
		Chien albert=new Chien("Albert");
		Chat pipo=new Chat("Pipo");
		Chat sushi=new Chat("Sushi");
		
		// On les ajoute au chenil 
		monChenil.ajouter(rex);
		monChenil.ajouter(pipo);
		
		// Un test afin de retirer un animal 
		if (!monChenil.retirer(albert)) 
		{
			System.out.println("Cet animal n'existe pas !");
		};
		monChenil.afficher();
		System.out.println("Il y a "+ monChenil.combien() +" " + accordAnimal(monChenil.combien()) + " dans le chenil");
		monChenil.ajouter(sushi);
		System.out.println("Il y a "+ monChenil.combien() +" " + accordAnimal(monChenil.combien()) + " dans le chenil");
		monChenil.ajouter(new Chat("cat"));
		monChenil.ajouter(new Chien("ouaf"));
		System.out.println("Il y a "+ monChenil.nbrChat()+" " + accordChat(monChenil.nbrChat()) + " dans mon chenil");
		System.out.println("Il y a "+ monChenil.nbrChien()+" " + accordChien(monChenil.nbrChien()) + " dans mon chenil");
		monChenil.retirer(rex);
		System.out.println("Il y a "+ monChenil.nbrChien()+" " + accordChien(monChenil.nbrChien()) + " dans mon chenil");
		monChenil.ajouter(new Chat("cat"));
		monChenil.ajouter(new Chat("cat"));
		monChenil.ajouter(new Chat("cat"));
		
		System.out.println("Nombre de chat maximum pour n'importe quel Chenil est de: "+Chenil.NBRMAXCHAT);
		System.out.println("Nombre de chien maximum pour n'importe quel Chenil est de: "+Chenil.NBRMAXCHIEN);	
	}
}
