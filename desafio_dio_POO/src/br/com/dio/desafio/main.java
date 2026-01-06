package br.com.dio.desafio;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		Curso curso = new Curso();
		Mentoria mentoria = new Mentoria();
		
		curso.setCargaHoraria(8);
		curso.setDescricao("Um curso");
		curso.setTirulo("Titulo do curso");
		
		mentoria.setData(LocalDate.now());
		mentoria.setDescricao("Descrição do curso");
		mentoria.setTirulo("Titulo da mentoria");
		
		System.out.print(curso);
		System.out.print(mentoria);
	}

}
