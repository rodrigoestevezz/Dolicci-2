package model.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table
@DynamicUpdate(value = true) 
@SelectBeforeUpdate(value = true) 
@DynamicInsert(value = true)
public class Clientes extends Pessoas{
	//Declaração das relações e variaveis
	@Column
	private String endereco;
	private String cep;
	
	//Construtores
	public Clientes(long id, String nome, String cpf, String senha, String telefone, String email, String tipo) {
		super(id, nome, cpf, senha, telefone, email, tipo);
	}
	
	public Clientes() {
	}

	//Getters e setters
	protected String getEndereco() {
		return endereco;
	}
	protected void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	protected String getCep() {
		return cep;
	}
	protected void setCep(String cep) {
		this.cep = cep;
	}
}
