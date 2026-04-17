package animaux;

import java.util.HashMap;

import structures.NumPuceException;

public class AnimalPuce {

	private String nom;
	private String couleur;
	private int age;
	
	private String puce;
	
	public static HashMap<String,AnimalPuce> tousLesAnimaux = new HashMap<>();
	
	public AnimalPuce(String nom, String couleur, int age, String puce) {
		this.nom = nom;
		this.couleur = couleur;
		this.age = age;
		// puce : pour identification unique
		this.puce = puce;
		
		tousLesAnimaux.put(puce, this);
	}
	
	public static void afficherTousLesAnimaux() {
		for(AnimalPuce a : tousLesAnimaux.values()) {
			System.out.println(a);
		}
	}
	

//	public abstract String crier(); 
	
	@Override
	public String toString() {
		
		return "Je suis un animal" 
				+ ", je m'appelle " + nom 
				+ ", je suis de couleur " + couleur 
				+ ", et j'ai " + age + "ans"
				+ ", [puce = " + puce + "]";
		
	}

	public static AnimalPuce getAnimal(String puce) throws NumPuceException{
		if(tousLesAnimaux.containsKey(puce)) {
			return tousLesAnimaux.get(puce);
		} else {
//			System.out.println("ERROR : puce non trouvée");
			throw new NumPuceException(puce);
		}
		
	}
}
