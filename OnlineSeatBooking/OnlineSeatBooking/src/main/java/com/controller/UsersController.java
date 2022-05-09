package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.model.OfficeDAO;
import com.model.Users;
import com.model.UsersDAO;




@RestController
public class UsersController {

	@Autowired
	UsersDAO usersDAO;
	@Autowired
	OfficeDAO officeDAO;
	
	@GetMapping("/homes")
	public String getHome() {
		
		return "Hello User";
	}
	
	@PostMapping("/registeruser")
	public String registerUser(@RequestBody Users users) {
		usersDAO.save(users);	
		return "User Successfully Registered";
	}
	@PatchMapping("/modifydetails")
	public String updateDetails(@RequestBody Users users) {
		usersDAO.save(users);
		return "user details updated";
	}
	@DeleteMapping("/deleteuser")
	public String deleteUser(@PathVariable("id") int uId ) {
		usersDAO.deleteById(uId);
		return "UserDeleted";
		
	}
	@GetMapping("/findfloor")
	public String findFloor(@PathVariable("id")int floorNo ) {
		officeDAO.findById(floorNo);
		return "floorFound";
	}
	
	
	
}
