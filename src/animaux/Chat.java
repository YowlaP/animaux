package animaux;

public class Chat extends Animal{
	
	public Chat(String nom, String couleur, int age) {
		super(nom, couleur, age);
	}

	public String crier() {
		return "Miaouuu";
	}
	
	@Override
	public String toString() {
		
		return "Je suis un chat et " + super.toString();
	}
}
