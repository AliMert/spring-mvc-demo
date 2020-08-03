package com.ozhayta.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Value("#{departmentOptions}") 
	private Map<String, String> departmentOptions;
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create a student object
		Student theStudent = new Student();
		
		// add student object to the model
		theModel.addAttribute(theStudent);
		
		// add the department options to the model 
	    theModel.addAttribute("departmentOptions", departmentOptions); 
	    
	    LinkedHashMap<String, String> favoriteLanguageOptions = new LinkedHashMap<String, String>();
	    favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("PHP", "PHP");
        favoriteLanguageOptions.put("Ruby", "Ruby");        
	    theModel.addAttribute("favoriteLanguageOptions", favoriteLanguageOptions); 

		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm( @ModelAttribute("student") Student theStudent, Model theModel) {
		
		// log the input data
		System.out.println("theStudent: " + theStudent.toString());
		
		// get department from the student object that is filled from the form
		String selectedDepartment = theStudent.getDepartment();
		// get the value of the departmentOption by key (long version)
		selectedDepartment = departmentOptions.get(selectedDepartment);		
		// add the selected department 
	    theModel.addAttribute("selectedDepartment", selectedDepartment); 
		// add the department options to the model 
	    theModel.addAttribute("departmentOptions", departmentOptions); 

		return "student-confirmation";
	}
	
	
	
}
