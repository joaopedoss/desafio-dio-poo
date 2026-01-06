package br.com.dio.desafio;

public class Curso {
	private String tirulo;
	private String descricao;
	private int cargaHoraria;
	
	public String getTirulo() {
		return tirulo;
	}
	public void setTirulo(String tirulo) {
		this.tirulo = tirulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso [tirulo=" + tirulo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
}
