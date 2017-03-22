package model;

public class Ficha {

	public Ficha(){
		
	}
	
	
	
	public Ficha(Consulta consulta, Vacinacao vacinacao) {
		super();
		this.consulta = consulta;
		this.vacinacao = vacinacao;
	}



	private Consulta consulta;
	private Vacinacao vacinacao;
	
	
	public Consulta getConsulta() {
		return consulta;
	}
	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
	public Vacinacao getVacinacao() {
		return vacinacao;
	}
	public void setVacinacao(Vacinacao vacinacao) {
		this.vacinacao = vacinacao;
	}
	
	
	
	
}
