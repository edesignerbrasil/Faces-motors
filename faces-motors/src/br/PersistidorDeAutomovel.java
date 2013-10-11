package br;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
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
		
		em.persist(auto);
		
		em.close();
		emf.close();
	}

}
