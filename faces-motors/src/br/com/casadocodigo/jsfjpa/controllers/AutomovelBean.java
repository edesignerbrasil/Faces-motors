package br.com.casadocodigo.jsfjpa.controllers;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.casadocodigo.jsfjpa.entities.Automovel;
import br.com.casadocodigo.jsfjpa.persistence.JPAUtil;

@ManagedBean
public class AutomovelBean {

	private Automovel automovel = new Automovel();
	
	private List<Automovel> automoveis;
	
	public Automovel getAutomovel(){
		return this.automovel;
	}
	
	public List<Automovel> getAutomoveis(){
		EntityManager em = JPAUtil.getEntityManager();
		Query q = em.createQuery("select a from Automovel a", Automovel.class);
		this.automoveis = q.getResultList();
		em.close();
		return automoveis;
	}

	public void salva(Automovel automovel){
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(automovel);
		em.getTransaction().commit();
		em.close();
	}
}
