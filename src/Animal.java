
/**
 * Classe abstraite servant de modèle 
 * 
 * @author sebastien
 *
 */
public abstract class Animal {
	protected String nom;
	
	/**
	 * Constructeur qui sera appelé dans les classe filles
	 * @param nom
	 */
	
	
	public Animal(String nom) 
	{
		this.nom=nom;
	}

	/**
	 *  Méthode qu'on pourra surcharger dans les classes filles
	 */
	public void affiche() {
		System.out.print(this.nom);
	}
	
}
