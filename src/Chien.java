
public class Chien extends Animal {
	public Chien(String nom)
	{
		super(nom);
	}
	
	@Override
	public void affiche() {
		super.affiche();
		System.out.println(" et je suis un chien");
	}
}
