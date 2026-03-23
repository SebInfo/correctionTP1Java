package chenil;

/**
 * Représente un chien.
 */
public class Chien extends Animal {

	/**
	 * Initialise un chien avec son nom.
	 *
	 * @param nom nom du chien
	 */
	public Chien(String nom)
	{
		super(nom);
	}
	
	/**
	 * Affiche le nom du chien et son type.
	 */
	@Override
	public void affiche() {
		super.affiche();
		System.out.println(" et je suis un chien");
	}
}
