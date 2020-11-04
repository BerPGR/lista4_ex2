package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Aluno implements Comparable<Aluno> {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
	
	private String nome;
	private Date anoNascimento;
	
	public Aluno(String nome, Date anoNascimento) {
		this.setNome(nome);
		this.setAnoNascimento(anoNascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(Date anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	public int compareTo(Aluno outro) {
		return nome.compareTo(outro.getNome());
	}
	
	public int getIdade() {
		Date hoje = new Date();
		int anoNasc = Integer.parseInt(sdf.format(getAnoNascimento()));
		int today = Integer.parseInt(sdf.format(hoje));
		return today - anoNasc;
	}
	
	public abstract String mostra();
	

}
