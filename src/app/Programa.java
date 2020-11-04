package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Aluno;
import entities.AlunoEnsinoMedio;
import entities.AlunoUniversitario;
import entities.Curso;

public class Programa {

	public static void main(String[] args) throws ParseException{
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		
		List<Aluno> alunos = new ArrayList<>();
		
		alunos.add(new AlunoUniversitario("Jo�o da Maia", sdf.parse("2001"), 'V', new Curso("PSI", "Psicologia")));
		
		alunos.add(new AlunoEnsinoMedio("Maria Clara", sdf.parse("2003"), 3));
		
		alunos.add(new AlunoUniversitario("Paulo Rubens", sdf.parse("2002"), 'S', new Curso("BCC", "Ci�ncia da Computa��o")));
		
		alunos.add(new AlunoEnsinoMedio("Carlinhos", sdf.parse("2004"), 2));
		
		alunos.add(new AlunoUniversitario("Aur�lio Gustavo", sdf.parse("1977"), 'I', new Curso("SIS", "Sistemas de Informa��o")));

		Collections.sort(alunos);
		
		for(Aluno a : alunos) {
			System.out.println("------------------------");
			System.out.println(a.mostra());
		}
		
	}

}
