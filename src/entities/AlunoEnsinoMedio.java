package entities;

import java.util.Date;

public class AlunoEnsinoMedio extends Aluno{
	
	private int ano;

	public AlunoEnsinoMedio(String nome, Date anoNascimento, int ano) {
		super(nome, anoNascimento);
		this.ano = ano;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if(getAno() >= 1 && getAno() <=3) {
			this.ano = ano;
		}
		else {
			throw new IllegalArgumentException("Ano inválido");
		}
	}

	@Override
	public String mostra() {
		return getNome() + " está cursando o " + getAno() + "º do ensino médio e tem " + getIdade() + " anos.";
	}
	
	
	
	

}
