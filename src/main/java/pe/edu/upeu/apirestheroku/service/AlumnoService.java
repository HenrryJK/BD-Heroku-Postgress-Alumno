package pe.edu.upeu.apirestheroku.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pe.edu.upeu.apirestheroku.entity.Alumno;
import pe.edu.upeu.apirestheroku.repository.AlumnoRepository;

@Service
public class AlumnoService {
	
	@Autowired
	private AlumnoRepository repository;
		
	public List<Alumno> readAll(){
		List<Alumno> alums = new ArrayList<>();
		repository.findAll().forEach(alums::add);
		return alums;
	}
	
	public Alumno create(Alumno alum) {
		return repository.save(alum);
	
	}
	
	public Alumno read(Long id) {
		return repository.findById(id).get();
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	public Alumno update(Alumno alum) {
		return repository.save(alum);
	}
}
