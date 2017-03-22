package model;

public class Consulta {

	public Consulta(){
		
	}
	
	
	
	public Consulta(String dataConsulta, String descricaoConsulta) {
		super();
		this.dataConsulta = dataConsulta;
		this.descricaoConsulta = descricaoConsulta;
	}



	private String dataConsulta;
	private String descricaoConsulta;
	public String getDataConsulta() {
		return dataConsulta;
	}



	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}



	public String getDescricaoConsulta() {
		return descricaoConsulta;
	}



	public void setDescricaoConsulta(String descricaoConsulta) {
		this.descricaoConsulta = descricaoConsulta;
	}
	
	
	
	
	
}
