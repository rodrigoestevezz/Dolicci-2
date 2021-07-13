package model.entidade;

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
public class Donos extends Pessoas {
	public Donos() {
	}

	public Donos(long id, String nome, String cpf, String senha, String telefone, String email, String tipo) {
		super(id, nome, cpf, senha, telefone, email, tipo);
	}
}
