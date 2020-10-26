/**
 * 
 */
package com.kubernetes.controller;



import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kubernetes.springbootkubernetes.SpringbootKubernetesApplication;


/**
 * @author anand.tiwari
 *
 */
@RestController
@RequestMapping("/microservice")
public class MicroController {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootKubernetesApplication.class);
	
	@GetMapping(path = "/message" ,produces = "application/json")
	public ResponseEntity<String> getMessage(){
		
		  Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		  LOGGER.info("MicroController::getMessage Method call   :: " + sdf.format(timestamp));
		 
		 return ResponseEntity.ok("Hello Jenkins+GIT+Docker+Kubernets+ELK ******* Hurreyyyy1");
		 
	}

}
