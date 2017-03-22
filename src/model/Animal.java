package model;

public class Animal {

	public Animal(){
		
	}
	
	
	public Animal(String classificacao, String raca, String dataNascimento, Ficha ficha) {
		super();
		this.classificacao = classificacao;
		this.raca = raca;
		this.dataNascimento = dataNascimento;
		this.ficha = ficha;
	}




	private String classificacao;
	private String raca;
	private String dataNascimento;
	private Ficha ficha;
	
	
	
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Ficha getFicha() {
		return ficha;
	}
	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}
	
	
	
	
}
