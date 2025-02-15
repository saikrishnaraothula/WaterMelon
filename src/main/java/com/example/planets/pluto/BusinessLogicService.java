package com.example.planets.pluto;

import java.util.List;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;



@Service
public class BusinessLogicService {
	@Autowired
	private  InteractingDao interactingDao;
	
	public BusinessLogicService() {
		// TODO Auto-generated constructor stub
	}
	
	public String addDetails(SolarDetails solarDetails){
		
		String message = null;
			 try {
				 if (Boolean.TRUE.equals(solarDetails.getMilkywayGalaxy())) {
					 System.out.println("Inside service method");
					message= interactingDao.savingDetails(solarDetails);
				 }else {
					 message="you choose false";
				 }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 return message;
		
	}
	public  String delRec(SolarDetails solardetails) {
	String	message= interactingDao.delRecs(solardetails);
		return message;
	}
	
}
