package pe.edu.upeu.apirestheroku.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.apirestheroku.entity.Alumno;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

	
	
	
}
