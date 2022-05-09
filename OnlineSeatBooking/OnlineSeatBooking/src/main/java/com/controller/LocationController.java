package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Location;
import com.model.LocationDAO;

@RestController
public class LocationController {
	@Autowired
	LocationDAO locationDAO;
	
	
	@PostMapping("/addlocation")
	public String addLocation(@RequestBody Location location) {
		locationDAO.save(location);
		return "Location added";

}
	@PatchMapping("/updatelocation")
	public String updateLocation(@RequestBody Location location) {
		locationDAO.save(location);
		return "Location Updated";
	}
	
	
}
