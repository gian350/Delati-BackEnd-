package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.Date;

public class Oferta implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id_oferta;
	
	private String empresa;
	private String titulo;
	private String lugar;
	private String url_pagina;
	private Double anio_publicacion;
	private Integer anuncios;
	
	/*
	
	private String tiempo_publicado;
	private String salario;
	private String modalidad_trabajo;
	
	private String subarea;
	private String url_oferta;
	
	private String area;
	
	private Date fecha_creacion;
	private Date fecha_modificacion;
	private String oferta_detalle;
	
	private String time_publicacion;
	private String id_anuncioempleo;
	
	private char id_estado;
	
*/
	/*
	public Oferta(Integer id_oferta, Integer id_webscraping, String titulo, String empresa, String lugar,
			String tiempo_publicado, String salario, String modalidad_trabajo, String subarea, String url_oferta,
			String url_pagina, String area, Date fecha_creacion, Date fecha_modificacion, String oferta_detalle,
			Date fecha_publicacion, String time_publicacion, String id_anuncioempleo, char id_estado) {
		super();
		this.id_oferta = id_oferta;
		this.id_webscraping = id_webscraping;
		this.titulo = titulo;
		this.empresa = empresa;
		this.lugar = lugar;
		this.tiempo_publicado = tiempo_publicado;
		this.salario = salario;
		this.modalidad_trabajo = modalidad_trabajo;
		this.subarea = subarea;
		this.url_oferta = url_oferta;
		this.url_pagina = url_pagina;
		this.area = area;
		this.fecha_creacion = fecha_creacion;
		this.fecha_modificacion = fecha_modificacion;
		this.oferta_detalle = oferta_detalle;
		this.fecha_publicacion = fecha_publicacion;
		this.time_publicacion = time_publicacion;
		this.id_anuncioempleo = id_anuncioempleo;
		this.id_estado = id_estado;
	}
*/
	
	
	public Oferta() {
		super();
	}
	
	

	

	public Oferta(Integer id_oferta, String empresa, String titulo, String lugar, String url_pagina,
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
