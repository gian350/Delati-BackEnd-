package edu.moduloalumno.model;

import java.io.Serializable;
import java.util.Date;

public class OfertaJSON implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id_oferta;
	
	private String empresa;
	private String titulo;
	private String lugar;
	private String url_pagina;
	private Double anio_publicacion;
	private Integer anuncios;
	

	public OfertaJSON(Integer id_oferta, String empresa, String titulo, String lugar, String url_pagina,
			Double anio_publicacion, Integer anuncios) {
		super();
		this.id_oferta = id_oferta;
		this.empresa = empresa;
		this.titulo = titulo;
		this.lugar = lugar;
		this.url_pagina = url_pagina;
		this.anio_publicacion = anio_publicacion;
		this.anuncios = anuncios;
	}

	public Integer getId_oferta() {
		return id_oferta;
	}

	public void setId_oferta(Integer id_oferta) {
		this.id_oferta = id_oferta;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getUrl_pagina() {
		return url_pagina;
	}

	public void setUrl_pagina(String url_pagina) {
		this.url_pagina = url_pagina;
	}

	public Double getAnio_publicacion() {
		return anio_publicacion;
	}

	public void setAnio_publicacion(Double anio_publicacion) {
		this.anio_publicacion = anio_publicacion;
	}

	public Integer getAnuncios() {
		return anuncios;
	}

	public void setAnuncios(Integer anuncios) {
		this.anuncios = anuncios;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
