package com.example.planets.pluto;

import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;







@Repository
public class InteractingDao {
	@Autowired
	private EntityManager entityManager;
	 @Transactional
	    public String savingDetails(SolarDetails solarDetails) {
	        try {
	            System.out.println("Before saving");
	            entityManager.persist(solarDetails);  // Persist the entity
	            return "saved in dao successfully";
	        } catch (Exception e) {
	            e.printStackTrace();
	            return "Error saving data in DAO";
	        }
	    }
	 @Transactional
	 public  String delRecs(SolarDetails solardetails) {
		 try {
		 entityManager.remove(solardetails);
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 
		 return "deleted";
	 }
}
