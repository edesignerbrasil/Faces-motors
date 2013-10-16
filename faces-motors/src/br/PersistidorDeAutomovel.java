package br;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.casadocodigo.jsfjpa.entities.Automovel;

public class PersistidorDeAutomovel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");		
		EntityManager em = emf.createEntityManager();
		
		Automovel auto = new Automovel();
		auto.setAnoFabricacao(2010);
		auto.setModelo("Ferrari");
		auto.setObservacoes("Nunca foi batido");
		
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.persist(auto);
		
		tx.commit();
		
		em.close();
		emf.close();
	}

}
