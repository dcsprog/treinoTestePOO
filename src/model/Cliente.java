package model;

public class Cliente {

	
	public Cliente(){
		
		
	}
	
	
	
	
	public Cliente(int idCliente, String nomeCliente, String moradaCliente, String emailCliente, int telefone) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.moradaCliente = moradaCliente;
		this.emailCliente = emailCliente;
		this.telefone = telefone;
	}




	private int idCliente;
	private String nomeCliente;
	private String moradaCliente;
	private String emailCliente;
	private int telefone;
	public int getIdCliente() {
		return idCliente;
	}




	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}




	public String getNomeCliente() {
		return nomeCliente;
	}




	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}




	public String getMoradaCliente() {
		return moradaCliente;
	}




	public void setMoradaCliente(String moradaCliente) {
		this.moradaCliente = moradaCliente;
	}




	public String getEmailCliente() {
		return emailCliente;
	}




	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}




	public int getTelefone() {
		return telefone;
	}




	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	
	
}
