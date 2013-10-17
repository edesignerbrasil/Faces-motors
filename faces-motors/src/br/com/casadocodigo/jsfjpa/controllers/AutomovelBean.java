package br.com.casadocodigo.jsfjpa.controllers;

import javax.faces.bean.ManagedBean;

import br.com.casadocodigo.jsfjpa.entities.Automovel;

@ManagedBean
public class AutomovelBean {

	private Automovel automovel = new Automovel();
	
	public Automovel getAutomovel(){
		return this.automovel;
	}

	public void salva(Automovel automovel){
		this.automovel = automovel;
		System.out.println("entrei salva!!!" + this.automovel.getMarca());
	}
}
