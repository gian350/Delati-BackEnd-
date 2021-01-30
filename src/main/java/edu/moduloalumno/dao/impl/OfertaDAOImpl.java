package edu.moduloalumno.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IOfertaDAO;
import edu.moduloalumno.entity.Alumno;
import edu.moduloalumno.entity.Oferta;
import edu.moduloalumno.rowmapper.AlumnoRowMapper;
import edu.moduloalumno.rowmapper.OfertaRowMapper;

@Transactional
@Repository
public class OfertaDAOImpl implements IOfertaDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Oferta> getQueryOferta() {
		/**/
		String sql = "select empresa, extract(year from fecha_publicacion) as anio_publicacion, lugar, titulo, url_pagina, \r\n" + 
				"count(empresa) as anuncios from oferta where empresa is not null and fecha_publicacion is not null and lugar is not null\r\n" + 
				"group by empresa, anio_publicacion, lugar, titulo, url_pagina  order by anuncios desc;";
		
		RowMapper<Oferta> rowMapper = new OfertaRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	
}
