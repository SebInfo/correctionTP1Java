/**
 * Représente un animal identifié par son nom.
 */
public abstract class Animal {

	/** Nom de l'animal. */
	protected String nom;
	
	/**
	 * Initialise un animal avec son nom.
	 *
	 * @param nom nom de l'animal
	 */
	public Animal(String nom) 
	{
		this.nom = nom;
	}

	/**
	 * Affiche le nom de l'animal.
	 */
	public void affiche() {
		System.out.print(this.nom);
	}
}
