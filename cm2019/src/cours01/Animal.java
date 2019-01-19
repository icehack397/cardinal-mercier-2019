package cours01;

public class Animal {
	private int age;
	private int poids;
	private int taille;
	private String couleur;

	public String toString() {
		return "Animal [age=" + age + "ans, poids=" + poids + "kg, taille=" + taille + "cm, couleur=" + couleur + "]";
	}

	public static void main(String[] args) {
		Animal chat = new Animal();
		chat.age = 5;
		chat.poids = 3;
		chat.taille = 50;
		chat.couleur = "rouge";
		System.out.println(chat);
		Animal chien = new Animal();
		chien.age = 8;
		
		
	}





}



