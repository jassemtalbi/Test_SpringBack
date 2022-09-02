package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class EmployeService {
	@Autowired
private EmployeRepo employerepo;

	public EmployeService(EmployeRepo employerepo) {
		super();
		this.employerepo = employerepo;
	}
	public void AddEmploye(String user_Name, String email, String password, String rpassword, int id_Department, int id_role)
	{
		 employerepo.addEmploye( user_Name,  email,  password,  rpassword,  id_Department,  id_role);
	}
	public List<Employe> Login(String user_Name, String password)
	{
		 return employerepo.Login(user_Name, password);
	}
	public List<Employe> findAllEmployes()
	{
		return  employerepo.FindAllEmploye();
	}
	public Employe updateEmploye(Employe employe)
	{
		return employerepo.save(employe);
	}
	public Employe findEmployeById(Long id)
	{
		return employerepo.findEmployeById(id);
	}
	public void deleteEmploye(Long id)
	{
		 employerepo.deleteEmployeById(id);
	}
}
