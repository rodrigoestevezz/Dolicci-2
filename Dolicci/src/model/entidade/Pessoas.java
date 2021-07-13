package model.entidade;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import model.persistencia.PPessoas;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DynamicUpdate(value = true)
@SelectBeforeUpdate(value = true) 
@DynamicInsert(value = true)
public class Pessoas {
	//Declaração das relações e variaveis
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String nome;
	private String cpf;
	private String senha;
	private String telefone;
	private String email;
	private String tipo;
	
	public boolean logar(String cpf, String senha) {
		PPessoas pp = new PPessoas();
		return pp.logar(cpf, senha);
	}
	
	public Pessoas(long id, String nome, String cpf, String senha, String telefone, String email, String tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.telefone = telefone;
		this.email = email;
		this.tipo = tipo;
	}
	
	public Pessoas() {
	}
	
	//Getters e setters
	protected long getId() {
		return id;
	}
	protected void setId(long id) {
		this.id = id;
	}
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected String getCpf() {
		return cpf;
	}
	protected void setCpf(String cpf) {
		this.cpf = cpf;
	}
	protected String getSenha() {
		return senha;
	}
	protected void setSenha(String senha) {
		this.senha = senha;
	}
	protected String getTelefone() {
		return telefone;
	}
	protected void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	protected String getEmail() {
		return email;
	}
	protected void setEmail(String email) {
		this.email = email;
	}
	protected String getTipo() {
		return tipo;
	}
	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
