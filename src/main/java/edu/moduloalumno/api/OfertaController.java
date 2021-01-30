package edu.moduloalumno.api;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.entity.Alumno;
import edu.moduloalumno.entity.Oferta;
import edu.moduloalumno.service.IAlumnoService;
import edu.moduloalumno.service.IOfertaService;

@RestController
@RequestMapping("/oferta")
public class OfertaController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IOfertaService service;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Oferta>> getAllOferta() {
		logger.info("> getAlumnoIdByNombresApellidos [Oferta]");

		List<Oferta> list = null;

		try {
			list = service.getQueryOferta();
			
			if (list == null) {
				list = new ArrayList<Oferta>();
			}
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Oferta>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		logger.info("< getAlumnoIdByNombresApellidos [Alumno]");
		return new ResponseEntity<List<Oferta>>(list, HttpStatus.OK);
	}
	
	
	
	
}
