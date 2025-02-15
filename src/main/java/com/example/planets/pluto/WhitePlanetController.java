package com.example.planets.pluto;

import org.apache.commons.logging.Log;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;


@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/api/users")
public class WhitePlanetController {
	@Autowired
	SolarDetails solardetails;
	@Autowired
	BusinessLogicService businessLogicService;
	public WhitePlanetController() {
		// TODO Auto-generated constructor stub
	}
//	@GetMapping("/ring")
//	public String getMessage() {
//		return "Hello Namaskaram";
//	
//		
//	}
//	 @PostMapping(value = "/tryingHard", consumes = "application/json", produces = "application/json")
//	    public ResponseEntity<String> saveInfo(@RequestBody SolarDetails solarDetails) {
//	//public String saveInfo(@RequestBody SolarDetails solarDetails){
//		 String msg=null;
//		try {
//			System.out.println("Inside save method");
//			
//			msg= businessLogicService.addDetails(solarDetails);
//			 return ResponseEntity.ok(msg);
//		} catch (Exception e) {
//			System.out.println(e);
//			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error saving data");
//		}
//		
//		 
//	}
	 @PostMapping(value = "/delete", consumes = "application/json", produces = "application/json")
	 public String delRecords(@RequestBody SolarDetails solardetails) {
		 String color = solardetails.getPlanetColor();
		 String name = solardetails.getPlanets();
		 String msg;
		 try {
		 msg= businessLogicService.delRec(solardetails);
		 }catch(Exception e) {
			 return e.getMessage();
		 }
		 return msg+" records of "+color+" and "+name;
	 }
	 
	 
	 

}
