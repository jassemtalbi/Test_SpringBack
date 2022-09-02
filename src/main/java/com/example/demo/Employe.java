package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "Employe")
public class Employe{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String User_Name;
     private String email;
     private String password;
     private String Rpassword;
     private int id_Department;
     private int id_role;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRpassword() {
		return Rpassword;
	}
	public void setRpassword(String rpassword) {
		Rpassword = rpassword;
	}
	public int getId_Department() {
		return id_Department;
	}
	public void setId_Department(int id_Department) {
		this.id_Department = id_Department;
	}
	public int getId_role() {
		return id_role;
	}
	public void setId_role(int id_role) {
		this.id_role = id_role;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", User_Name=" + User_Name + ", email=" + email + ", password=" + password
				+ ", Rpassword=" + Rpassword + ", id_Department=" + id_Department + ", id_role=" + id_role + "]";
	}
	public Employe(Long id, String user_Name, String email, String password, String rpassword, int id_Department,
			int id_role) {
		super();
		this.id = id;
		User_Name = user_Name;
		this.email = email;
		this.password = password;
		Rpassword = rpassword;
		this.id_Department = id_Department;
		this.id_role = id_role;
	}
	public Employe() {
		super();
	}
	
	

}
