package br.com.casadocodigo.jsfjpa.controllers;

import javax.faces.bean.ManagedBean;

import br.com.casadocodigo.jsfjpa.entities.Automovel;

@ManagedBean
public class AutomovelBean {

	private Automovel automovel = new Automovel();
	
	
	
	public Automovel getAutomovel() {
		return this.automovel;
	}



	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}

	public void salva(){
		System.out.println("entrei salva!!!");
	}
}
