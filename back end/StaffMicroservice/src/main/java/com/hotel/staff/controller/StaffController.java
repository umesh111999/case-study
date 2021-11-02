package com.hotel.staff.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hotel.staff.details.StaffDetails;
import com.hotel.staff.repo.StaffRepo;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/staff")
public class StaffController {
	 @Autowired
	    private  StaffRepo StaffRepository;

	    @GetMapping(value = "/list")
	    public List<StaffDetails> getAllStaffDetails(){
	        return  StaffRepository.findAll();
	    }
	    
	    
	    @PostMapping(value = "/add")
	    public StaffDetails addNewStaff(@RequestBody StaffDetails up){
	        return  StaffRepository.save(up);
	    }
	    
	    
	    @DeleteMapping(value = "/delete/{code}")
	    public String  deleteStaff(@PathVariable String code) 
	    {
	        System.out.println("Delete method called");
	        StaffRepository.deleteById(code);
	        return " ratedeleted";
	    }
	    
	    
		    
	    @PutMapping(value="/update/{code}")
	    public StaffDetails updateRate(@RequestBody StaffDetails Updated) 
	    {
	    return	 StaffRepository.save(Updated);
        }
	    
}