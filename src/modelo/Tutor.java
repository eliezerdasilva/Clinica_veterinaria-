package modelo;

import java.util.ArrayList;

public class Tutor extends Pessoa {

	
	public ArrayList<Animal> animais = new ArrayList<>();


	public ArrayList<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}
}
