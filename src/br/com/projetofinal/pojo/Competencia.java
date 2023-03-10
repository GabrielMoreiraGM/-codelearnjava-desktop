package br.com.projetofinal.pojo;

public class Competencia{
	//atributos
	private int id;
	private String descricao;
	private int minutos;
	private static int contador;
	
	public Competencia() {
		contador++;
		
	}
	//construtor
	public Competencia(int id,String descricao,int minutos) {
		super();
		this.id = id;
		this.descricao = descricao;		
		this.minutos = minutos;
		contador++; 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public static int getContador() {
		return contador;
	}	
		
}