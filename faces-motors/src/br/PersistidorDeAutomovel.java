package br;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.casadocodigo.jsfjpa.entities.Automovel;
import br.com.casadocodigo.jsfjpa.persistence.JPAUtil;

public class PersistidorDeAutomovel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		EntityManager em = JPAUtil.getEntityManager();
		
		/**
		Automovel auto = new Automovel();
		auto.setAnoFabricacao(2011);
		auto.setModelo("Ferrari Super");
		auto.setObservacoes("Nunca foi batido");
		**/
		
		/**
		Query q = em.createQuery("select a from Automovel a", Automovel.class);		
		List<Automovel> autos = q.getResultList();
		
		for(Automovel a : autos){
			System.out.println(a.getModelo());
		}
		**/
		
		/*
		EntityTransaction tx = em.getTransaction();
		
		Automovel auto = em.getReference(Automovel.class, 1L);
		tx.begin();
		em.remove(auto);
		//em.persist(auto);
		
		tx.commit();
		
		em.close();
		*/
		
		//4.3 Ciclo de vida de um objeto na JPA
		/**em.getTransaction().begin();
		
		Automovel porscheDetached = em.find(Automovel.class, 1L);
		em.detach(porscheDetached);
		
		porscheDetached.setObservacoes("Porshe 911 Turbo");
		porscheDetached.setMarca("Ferrari");
		
		Automovel porsheGerenciado = em.find(Automovel.class, 1L);
		porsheGerenciado.setObservacoes("Porshe 911 Turbo TTT");
		porsheGerenciado.setMarca("Carroça");
		
		Automovel porsheModificado = em.merge(porscheDetached);
		
		System.out.println(porscheDetached != porsheModificado);
		
		System.out.println(porsheGerenciado == porsheModificado);
		
		em.getTransaction().commit();
		*/
		//Fim 4.3
	}

}
