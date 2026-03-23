package chenil;

/**
 * Représente un chat.
 */
public class Chat extends Animal {

	/**
	 * Initialise un chat avec son nom.
	 *
	 * @param nom nom du chat
	 */
	public Chat(String nom)
	{
		super(nom);
	}

	/**
	 * Affiche le nom du chat et son type.
	 */
	@Override
	public void affiche() {
		super.affiche();
		System.out.println(" et je suis un chat");
	}
}
