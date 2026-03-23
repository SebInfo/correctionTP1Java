public class TestAnimal {

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
		System.out.println("Il y a "+ monChenil.combien() +" animaux dans le chenil");
		monChenil.ajouter(sushi);
		System.out.println("Il y a "+ monChenil.combien() +" animaux dans le chenil");
		monChenil.ajouter(new Chat("cat"));
		monChenil.ajouter(new Chien("ouaf"));
		System.out.println("Il y a "+ monChenil.nbrChat()+" chats dans mon chenil");
		System.out.println("Il y a "+ monChenil.nbrChien()+" chiens dans mon chenil");
		monChenil.retirer(rex);
		System.out.println("Il y a "+ monChenil.nbrChien()+" chiens dans mon chenil");
		monChenil.ajouter(new Chat("cat"));
		monChenil.ajouter(new Chat("cat"));
		monChenil.ajouter(new Chat("cat"));
		
		System.out.println("Nombre de chat maximum pour n'importe quel Chenil est de: "+Chenil.NBRMAXCHAT);
		System.out.println("Nombre de chien maximum pour n'importe quel Chenil est de: "+Chenil.NBRMAXCHIEN);	
	}
}
