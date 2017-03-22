package controller;
import java.util.ArrayList;

import model.Animal;
import model.Cliente;
import model.Consulta;
import model.Vacinacao;


public class MockupData {


	ArrayList<Cliente> cliente;
	ArrayList<Animal> animal;
	ArrayList<Consulta> consulta;
	ArrayList<Vacinacao> vacina;
	
	public MockupData(){
		
		cliente  = new ArrayList<>();
		animal   = new ArrayList<>();
		consulta = new ArrayList<>();
		vacina   = new ArrayList<>();
	}
	
}
