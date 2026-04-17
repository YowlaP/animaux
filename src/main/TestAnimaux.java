package main;

import animaux.Animal;
import animaux.Chat;
import animaux.Chien;
import structures.Refuge;

public class TestAnimaux {

	public static void main(String[] args) {
		// Création d’un animal, un chat et un chien.
		//Animal animal = new Animal();
		Chat chat = new Chat("Minou", "blanc", 5);
		Chien chien = new Chien("Paul", "noir", 7);
		// Affichage des trois animaux (toString)
		//System.out.println(animal);
		System.out.println(chat);
		System.out.println(chien);
		// Affichage des cris des animaux
		//System.out.println(animal.crier());
		System.out.println(chat.crier());
		System.out.println(chien.crier());
		System.out.println(chien.aboyer());
		// On considère le chat et le chien comme étant des animaux
		Animal achat = chat;
		Animal achien = chien;
		System.out.println(achat);
		System.out.println(achien);
		//System.out.println(achien.aboyer());
		
		//Refuge
		Refuge r = new Refuge();
		r.ajouterAnimal(chat);
		r.ajouterAnimal(chien);
		r.ajouterAnimal(achien);
		r.ajouterAnimal(achat);
		System.out.println(r);
//		r.supprimerAnimal(chien);
		System.out.println(r);
	}

}
