package model.persistencia;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import model.entidade.Clientes;

public class PClientes {
	private Session session;
	
	public boolean logar(String cpf, String senha) {
		 boolean ok = false;
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			
			Criteria crit = session.createCriteria(Clientes.class);
			crit.add(Restrictions.eq("cpf", cpf));
			crit.add(Restrictions.eq("senha", senha));
			List lista = crit.list();
			
			if(lista.size()==0 || lista == null) {
				ok = false;
			} else {
				ok = true;
			}
			
			session.close();
		return ok;
	}
}
