package pe.edu.upeu.apirestheroku;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.apirestheroku.entity.Alumno;
import pe.edu.upeu.apirestheroku.service.AlumnoService;

@SpringBootTest
class ApiRestHerokuApplicationTests {
	@Autowired
	AlumnoService alumservice;
	
	@Test
	void contextLoads() {
	 /*
	  // Leer un registro por id
		List<Alumno> lista = new ArrayList<>();
		lista = alumservice.readAll();
		System.out.println( "Nombre del Alumno: " + lista.get(0).getNombres());
		
		
		*/
		 // Insertar
	//	 System.out.println(alumservice.create(new Alumno("Mario", "Mariospy@gmail.com", "996362123")).getNombres());
		// System.out.println(alumservice.create(new Alumno("Manuel", "manuelpy@gmail.com", "993125784")).getNombres());
		
		// Eliminar es en el postman
		
		
		
		// Actualizar por postman
		
	}

}
