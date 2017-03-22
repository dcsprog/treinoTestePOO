package controller;

import java.util.Scanner;

import model.Cliente;

public class GestaoCliente {

	 Scanner n = new Scanner(System.in);
	 MockupData bd = new  MockupData();


	public void addCliente(int idCliente, String nomeCliente, String moradaCliente, String emailCliente, int telefone){
			
		Cliente c = new  Cliente(bd.cliente.size(),nomeCliente, moradaCliente,emailCliente,telefone);
		bd.cliente.add(c);
		
		System.out.println("QUANTOS ANIMAIS QUERES REGISTAR?");
		
		int quant=n.nextInt();
		
		for(int i=0;i<quant;i++){
			System.out.println("");;
			
			
			bd.cliente.get(i);
		}
		
	}
	
	
}
