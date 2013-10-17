package br.com.casadocodigo.jsfjpa.controllers;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

import br.com.casadocodigo.jsfjpa.entities.Automovel;
import br.com.casadocodigo.jsfjpa.persistence.JPAUtil;

@ManagedBean
public class AutomovelBean {

	private Automovel automovel = new Automovel();
	
	public Automovel getAutomovel(){
		return this.automovel;
	}

	public void salva(Automovel automovel){
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(automovel);
		em.getTransaction().commit();
		em.close();
	}
}
