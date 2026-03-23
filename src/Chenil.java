import java.util.ArrayList;

/**
 * Gère un chenil contenant des chats et des chiens.
 */
public class Chenil {
	
	/** Nombre maximum de chats autorisés. */
	public static final int NBRMAXCHAT = 5;

	/** Nombre maximum de chiens autorisés. */
	public static final int NBRMAXCHIEN = 3;
	
	private int nbrchat, nbrchien;
	private final ArrayList<Animal> animaux;
	
	/**
	 * Initialise un chenil vide.
	 */
	public Chenil()
	{
		animaux = new ArrayList<Animal>();
		this.nbrchat = 0;
		this.nbrchien = 0;
	}
	
	/**
	 * Ajoute un animal si la capacité maximale de son type n'est pas atteinte.
	 *
	 * @param ani animal à ajouter
	 */
	public void ajouter(Animal ani)
	{
		if (ani instanceof Chien) {
			if (nbrchien >= NBRMAXCHIEN) {
				System.out.println("On ne peut plus accueillir de chien dsl !");
				return;
			}
			this.nbrchien++;
		}
		
		if (ani instanceof Chat) {
			if (nbrchat >= NBRMAXCHAT) {
				System.out.println("On ne peut plus accueillir de chat dsl !");
				return;
			}
			this.nbrchat++;
		}
		
		animaux.add(ani);
	}
	
	/**
	 * Retire un animal du chenil s'il est présent.
	 *
	 * @param ani animal à retirer
	 * @return {@code true} si l'animal a été retiré, sinon {@code false}
	 */
	public boolean retirer(Animal ani)
	{
		if (animaux.indexOf(ani) >= 0)
		{
			animaux.remove(animaux.indexOf(ani));
			if (ani instanceof Chien) this.nbrchien--;
			if (ani instanceof Chat) this.nbrchat--;
			return true;
		}
		else
			return false;
	}
	
	/**
	 * Affiche tous les animaux présents dans le chenil.
	 */
	public void afficher()
	{
		for (Animal ani : animaux)
		{
			ani.affiche();
		}
	}
	
	/**
	 * Retourne le nombre de chats présents.
	 *
	 * @return nombre de chats
	 */
	public int nbrChat()
	{
		return this.nbrchat;
	}
	
	/**
	 * Retourne le nombre de chiens présents.
	 *
	 * @return nombre de chiens
	 */
	public int nbrChien()
	{
		return this.nbrchien;
	}
	
	/**
	 * Retourne le nombre total d'animaux présents.
	 *
	 * @return nombre total d'animaux
	 */
	public int combien()
	{
		return animaux.size();
	}

}
