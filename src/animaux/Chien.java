package animaux;

public class Chien extends Animal{
	
	public Chien(String nom, String couleur, int age) {
		super(nom, couleur, age);
	}
	
	@Override
	public  String crier() {
		return aboyer();
	}
	
	public String aboyer() {
		return "Woaf Woaf !";
	}
	
	
	@Override
	public String toString() {
		
		return "Je suis un chien et " + super.toString();
	}
}
