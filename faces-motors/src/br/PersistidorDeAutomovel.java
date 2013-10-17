package br;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.casadocodigo.jsfjpa.entities.Automovel;
import br.com.casadocodigo.jsfjpa.persistence.JPAUtil;

public class PersistidorDeAutomovel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		EntityManager em = JPAUtil.getEntityManager();
		
		Automovel auto = new Automovel();
		auto.setAnoFabricacao(2011);
		auto.setModelo("Ferrari Super");
		auto.setObservacoes("Nunca foi batido");
		
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.persist(auto);
		
		tx.commit();
		
		em.close();
		
	}

}
