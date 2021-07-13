package model.entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table
@DynamicUpdate(value = true)
@SelectBeforeUpdate(value = true) 
@DynamicInsert(value = true)
public class Pedidos {
	//Declaração das relações e variaveis
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String formaPagamento;
	private double valorTotal;
	private double valorFinal;
	private boolean estado;
	private Date data;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "pedidos_produtos", joinColumns = @JoinColumn(name = "id_pedido"), inverseJoinColumns = @JoinColumn(name = "id_produto"))
	private List<Produtos> listaProdutos;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Clientes Cliente;

	@ManyToOne
	@JoinColumn(name = "id_funcionario")
	private Funcionarios funcionario;
	
	//Construtores
	public Pedidos() {
	}
	
	//Getters e setters
	protected long getId() {
		return id;
	}

	protected Date getData() {
		return data;
	}

	protected void setData(Date data) {
		this.data = data;
	}

	protected void setId(long id) {
		this.id = id;
	}

	protected String getFormaPagamento() {
		return formaPagamento;
	}

	protected void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	protected double getValorTotal() {
		return valorTotal;
	}

	protected void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	protected double getValorFinal() {
		return valorFinal;
	}

	protected void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}

	protected boolean isEstado() {
		return estado;
	}

	protected void setEstado(boolean estado) {
		this.estado = estado;
	}

	protected List<Produtos> getListaProdutos() {
		return listaProdutos;
	}

	protected void setListaProdutos(List<Produtos> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	protected Clientes getCliente() {
		return Cliente;
	}

	protected void setCliente(Clientes cliente) {
		Cliente = cliente;
	}

	protected Funcionarios getFuncionario() {
		return funcionario;
	}

	protected void setFuncionario(Funcionarios funcionario) {
		this.funcionario = funcionario;
	}
}
