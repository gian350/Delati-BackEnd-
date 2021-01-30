package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import edu.moduloalumno.entity.Alumno;
import edu.moduloalumno.entity.Oferta;

public class OfertaRowMapper implements RowMapper<Oferta>{

	@Override
	public Oferta mapRow(ResultSet row, int rowNum) throws SQLException {
		Oferta oferta = new Oferta();
		
	//	oferta.setId_oferta(row.getInt("id_oferta"));
		oferta.setEmpresa(row.getString("empresa"));
		oferta.setTitulo(row.getString("titulo"));
		oferta.setLugar(row.getString("lugar"));
		oferta.setUrl_pagina(row.getString("url_pagina"));
		oferta.setAnio_publicacion(row.getDouble("anio_publicacion"));
		oferta.setAnuncios(row.getInt("anuncios"));
		
		return oferta;
	}
}
