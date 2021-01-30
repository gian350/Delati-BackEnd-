package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IAlumnoDAO;
import edu.moduloalumno.dao.IOfertaDAO;
import edu.moduloalumno.entity.Alumno;
import edu.moduloalumno.entity.Oferta;
import edu.moduloalumno.service.IAlumnoService;
import edu.moduloalumno.service.IOfertaService;

@Service
public class OfertaServiceImpl implements IOfertaService{

	@Autowired
	private IOfertaDAO ofertaDAO;

	@Override
	public List<Oferta> getQueryOferta() {
		List<Oferta> ofertaList = ofertaDAO.getQueryOferta();
		
		return ofertaList;
	}
	
	
	
	
}
