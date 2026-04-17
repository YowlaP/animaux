package structures;

import java.util.ArrayList;

import animaux.Animal;

public class Refuge {

	public static final int MAX_A = 100;
	private ArrayList<Animal> list;
//	Animal[] list;
	
	public Refuge() {
		list = new ArrayList<>(); // ArrayList<Animal>()
	}
	
	public void ajouterAnimal(Animal a) {
		if(list.size() < MAX_A) {
			list.add(a);
		} else {
			System.out.println("ERROR : Refuge plein !");
		}
	}
	
	@Override
	public String toString() {
		String s = "Refuge : \n";
		for(Animal a : list) {
			s += a + "\n";
		}
		return s;
	}
}
