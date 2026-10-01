package com.example.employee1;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:5173/")
public class EmpController {
@GetMapping("/retrieve")
	public Employee getEmp() {
		Employee ob = new Employee(1,"Hima","hr");
		return ob;
	}
@GetMapping("/")
public String hello() {
	return "welcome to the Application";
	
}

}
