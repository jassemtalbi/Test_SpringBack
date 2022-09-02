package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;



public interface EmployeRepo extends CrudRepository<Employe, Long> {
@Transactional 
	void deleteEmployeById(long id);
	Employe findEmployeById(long id);
 @Transactional
	@Modifying
	@Query(value="INSERT INTO Employe (user_Name,email,password,rpassword,id_Department,id_role) VALUES (:user_Name,:email,:password,:rpassword,:id_Department,:id_role) ", nativeQuery = true)
	 void addEmploye(@Param("user_Name") String user_Name, @Param("email") String email,@Param("password") String password,@Param("rpassword") String rpassword,@Param("id_Department") Integer id_Department,@Param("id_role") Integer id_role);

	@Query(value="SELECT * from Employe E WHERE E.user_Name=:user_Name AND E.password=:password ", nativeQuery = true)
	List<Employe> Login(@Param("user_Name") String user_Name,@Param("password") String password);
	@Query(value="SELECT * from Employe ", nativeQuery = true)
	List<Employe> FindAllEmploye();


}
