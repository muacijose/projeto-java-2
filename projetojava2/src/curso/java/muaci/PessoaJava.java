package curso.java.muaci;

import java.util.Date;

public class PessoaJava {
	
	private String nome;
	private String sobrenome;
	private int idade;
    private Date dataNascimeto;
	
	
	public Date getDataNascimeto() {
		return dataNascimeto;
	}
	public void setDataNascimeto(Date dataNascimeto) {
		this.dataNascimeto = dataNascimeto;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	

}
