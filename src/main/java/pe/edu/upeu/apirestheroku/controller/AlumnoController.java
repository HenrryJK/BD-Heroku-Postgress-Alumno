package pe.edu.upeu.apirestheroku.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.apirestheroku.entity.Alumno;
import pe.edu.upeu.apirestheroku.service.AlumnoService;

@RestController
public class AlumnoController {
	@Autowired
	private AlumnoService alumnoservice;
	
	@GetMapping("/")
	public String mensaje(){
		return "REST";
	}
	@GetMapping("/alumno")
	public List<Alumno> getList(){
		return alumnoservice.readAll();
	}
	@DeleteMapping("/alumno/delete/{id}")
	public String delete(@PathVariable Long id){
		alumnoservice.delete(id);
		return "Usuario Eliminado";
	}
	@GetMapping("/alumno/{id}")
	public Alumno read(@PathVariable Long id){
		return alumnoservice.read(id);
	}
	@PutMapping("/alumno/update/{id}")
	public String update(@PathVariable Long id, @RequestBody Alumno alumno){
		System.out.println(id);
		Alumno alu = alumnoservice.read(id);
		System.out.println(alumno.getNombres());
		alu.setNombres(alumno.getNombres());
		alu.setCorreo(alumno.getCorreo());
		alu.setTelefono(alumno.getTelefono());
	
		alumnoservice.update(alu);
		return "Alumno Modificado";
	}
}
