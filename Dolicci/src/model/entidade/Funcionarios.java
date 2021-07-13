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
public class Funcionarios extends Pessoas{
	//Declaração das relações e variaveis
	@Column
	private String cargo;
	private double salario;
	
	//Construtores
	public Funcionarios(long id, String nome, String cpf, String senha, String telefone, String email, String tipo) {
		super(id, nome, cpf, senha, telefone, email, tipo);
	}
	
	public Funcionarios() {
	}

	//Getters e setters
	protected String getCargo() {
		return cargo;
	}

	protected void setCargo(String cargo) {
		this.cargo = cargo;
	}
	protected double getSalario() {
		return salario;
	}
	protected void setSalario(double salario) {
		this.salario = salario;
	}
	
}
