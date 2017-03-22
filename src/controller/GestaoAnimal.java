package controller;

import model.Animal;
import model.Cliente;
import model.Ficha;

public class GestaoAnimal {

	MockupData bdAnimal = new MockupData();
	
	public void addAnimal(String classificacao, String raca, String dataNascimento, Ficha ficha){
		
		Animal a = new  Animal(classificacao, raca,dataNascimento, ficha);
		bdAnimal.animal.add(a);
	
		
	}
		
}
	

