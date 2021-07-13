package model.entidade;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table
@DynamicUpdate(value = true) 
@SelectBeforeUpdate(value = true) 
@DynamicInsert(value = true)
public class Produtos {
	//Declaração das relações e variaveis
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String nome;
	private double preco;
	private int peso;
	private String descricao;
	
	@ManyToMany(mappedBy ="listaProdutos")
	private List<Pedidos> pedido;
	
	//Construtores
	public Produtos() {
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

	protected double getPreco() {
		return preco;
	}

	protected void setPreco(double preco) {
		this.preco = preco;
	}

	protected int getPeso() {
		return peso;
	}

	protected void setPeso(int peso) {
		this.peso = peso;
	}

	protected String getDescricao() {
		return descricao;
	}

	protected void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	protected List<Pedidos> getPedido() {
		return pedido;
	}

	protected void setPedido(List<Pedidos> pedido) {
		this.pedido = pedido;
	}
}
