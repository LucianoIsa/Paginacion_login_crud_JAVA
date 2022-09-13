package com.gestion.empleados.util.paginacion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;

public class PageRender <T> {
	
	private String url;
	private Page<T>page;
	private int totalPaginas;
	private int numeroElementosPorPagina;
	private int paginaActual;
	private List<PageItem> paginas;
	
	public PageRender(String url, Page<T> page) {
		this.url = url;
		this.page = page;
		this.paginas=new ArrayList<PageItem>();
		
		numeroElementosPorPagina = 5;
	} 
	
}
