package entities;

import java.util.Date;

public class AlunoUniversitario extends Aluno{
	
	private char formaIngresso;
	private Curso curso;
	
	public AlunoUniversitario(String nome, Date anoNascimento, char formaIngresso, Curso curso) {
		super(nome, anoNascimento);
		this.setFormaIngresso(formaIngresso);
		this.setCurso(curso);
	}

	public char getFormaIngresso() {
		return formaIngresso;
	}

	public void setFormaIngresso(char formaIngresso) {
		if("VESTI".contains(String.valueOf(formaIngresso))) {
			this.formaIngresso = formaIngresso;
		}
		else {
			throw new IllegalArgumentException("Modo de entrada inválido: V E S T I");
		}
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public String modoIngresso() {
		switch (this.formaIngresso) {
		case 'V' : return "Vestibular";
		case 'E' : return "Enem";
		case 'S' : return "Seletivo";
		case 'T' : return "Transf. Externa";
		case 'I' : return "Transf. Interna";
			default : return "Modo não reconhecido";
		}
	}

	@Override
	public String mostra() {
		return getNome() + " é aluno universitário do curso de " + curso.getSigla() + " - " + curso.getNome() + ", ingressando por " + modoIngresso();
	}
	
	
	
}
