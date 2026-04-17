package animaux;

public abstract class Animal {
	
	private String nom;
	private String couleur;
	private int age;
	
	public Animal(String nom, String couleur, int age) {
		this.nom = nom;
		this.couleur = couleur;
		this.age = age;
	}
	

	public abstract String crier(); 
	
	@Override
	public String toString() {
		
		return "Je suis un animal" 
				+ ", je m'appelle " + nom 
				+ ", je suis de couleur " + couleur 
				+ ", et j'ai " + age + "ans";
	}
}
