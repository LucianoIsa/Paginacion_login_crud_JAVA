package com.gestion.empleados.util.paginacion;

public class PageItem {
	private int numero;
	private boolean actual;

	public PageItem(int numero, boolean actual) { //el nro de la pagina y comprobvar si estamos 
												  //en la pagina actual
		super();
		this.numero = numero;
		this.actual = actual;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isActual() {
		return actual;
	}

	public void setActual(boolean actual) {
		this.actual = actual;
	}

}
