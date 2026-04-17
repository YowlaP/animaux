package main;

import java.util.Scanner;

import animaux.AnimalPuce;
import structures.NumPuceException;

public class TestAnimaux2 {

	public static void main(String[] args) {
		AnimalPuce a1 = new AnimalPuce("Smarties","blanc", 5, "xcex45de");
		AnimalPuce a2 = new AnimalPuce("Medor", "noir", 8, "dkjfkjd21");
		AnimalPuce a3 = new AnimalPuce("Titus", "marron", 10, "sdjdj19ssd");
		AnimalPuce a4 = new AnimalPuce("Ronron", "gris", 2, "jgjfjfd12dd");
		AnimalPuce.afficherTousLesAnimaux();
		System.out.println("--- recherche --- ");
		Scanner input = new Scanner(System.in) ;
		int rep;
		do {
			System.out.print("Saisir numero de puce --> ");
			String num = input.next();
			AnimalPuce a;
			try {
				a = AnimalPuce.getAnimal(num);
				System.out.println(a);
			} catch (NumPuceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				System.out.print("Recommencer ? (0/1) --> ");
			rep = input.nextInt();
		} while (rep==1);
	}

}
