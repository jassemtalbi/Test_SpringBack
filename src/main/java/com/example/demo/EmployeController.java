package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/employee")
public class EmployeController {
	@Autowired
	private EmployeService service;

	public EmployeController(EmployeService service) {
		super();
		this.service = service;
	}
	@GetMapping("/all")
	public Iterable<Employe> getAllEmployes(){
		return service.findAllEmployes();
	}
	
	@GetMapping("/find/{id}")
	public Employe getEmploye(@PathVariable("id") Long id){
		return service.findEmployeById(id);
			}
	@PostMapping("/AddEmploye/{user_Name}/{email}/{password}/{rpassword}/{id_Department}/{id_role}")
	public void AddEmploye(@PathVariable String user_Name, @PathVariable String email,@PathVariable String password,@PathVariable String rpassword,@PathVariable int id_Department,@PathVariable int id_role){
		service.AddEmploye(user_Name, email, password,rpassword,id_Department,id_role);
	}
	@GetMapping("/Login/{user_Name}/{password}")
	public List<Employe> Login(@PathVariable String user_Name,@PathVariable String password){
		return service.Login(user_Name, password);
	}
	@PutMapping("/update")
	public void updateEmploye(@RequestBody Employe employe){
		service.updateEmploye(employe);
	}
	@GetMapping("/Deleteemploye/{id}")
	public void deleteEmploye(@PathVariable("id") Long id){
		 service.deleteEmploye(id);
	}
}
