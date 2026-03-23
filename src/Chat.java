
public class Chat extends Animal {
	/**
	 * Constructeur de la classe qui ne fait qu'appeler le constructeur de la classe mère
	 * @param nom
	 */
	public Chat(String nom)
	{
		super(nom);
		
	}
	/**
	 *  On surchage ici la méthode en ajoutant le fait que ça soit un chat
	 */
	@Override
	public void affiche() {
		super.affiche();
		System.out.println(" et je suis un Chat");
	}
}
