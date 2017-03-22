package model;

public class Vacinacao {

	
	public Vacinacao(){
		
	}
	
	
	
	
	public Vacinacao(String dataVacinacao, String nomeVacina, float precoVacina) {
		super();
		this.dataVacinacao = dataVacinacao;
		this.nomeVacina = nomeVacina;
		this.precoVacina = precoVacina;
	}

	
	


	private String dataVacinacao;
	private String nomeVacina;
	private float precoVacina;
	public String getDataVacinacao() {
		return dataVacinacao;
	}




	public void setDataVacinacao(String dataVacinacao) {
		this.dataVacinacao = dataVacinacao;
	}




	public String getNomeVacina() {
		return nomeVacina;
	}




	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}




	public float getPrecoVacina() {
		return precoVacina;
	}




	public void setPrecoVacina(float precoVacina) {
		this.precoVacina = precoVacina;
	}
	
	
	
	
}
