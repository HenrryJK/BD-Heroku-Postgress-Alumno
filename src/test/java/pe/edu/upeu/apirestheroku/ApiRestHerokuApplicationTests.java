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
	 //	 System.out.println(alumservice.create(new Alumno("Juanito", "juanitospy@gmail.com", "653214789")).getNombres());
		// System.out.println(alumservice.create(new Alumno("Felipe", "felipepy@gmail.com", "456321879")).getNombres());
		// System.out.println(alumservice.create(new Alumno("Miranda", "mirandapy@gmail.com", "639456258")).getNombres());
		// Eliminar es en el postman
			// alumservice.delete(new Long(5));
		// 	System.out.println("Ha sido eliminado correctamente..");
		
		
		// Actualizar por postman
		
	}

}
