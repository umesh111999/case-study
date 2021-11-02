package com.hotel.guest.controller;

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
import com.hotel.guest.details.GuestDetails;
import com.hotel.guest.repo.GuestRepo;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/guest")
public class GuestController {
	 @Autowired
	    private GuestRepo guestRepository;

	 
	 
	    @GetMapping(value = "/list")
	    
	    public List<GuestDetails> getAllguests()
	    {
	        return guestRepository.findAll();
	    }
	    
	    
	    
	    @PostMapping(value = "/add")
	    public GuestDetails addNewGuest(@RequestBody GuestDetails up)
	    {
	        return guestRepository.save(up);
	    }
	    
	    
	    @DeleteMapping(value = "/delete/{roomId}")
	    public String  deleteGuest(@PathVariable String roomId) 
	    {
	        System.out.println("Delete method called");
	        guestRepository.deleteById(roomId);
	        return "guestdeleted";
	    }
	    
	    
	    
	    
	    @PutMapping(value="/update/{roomId}")
	    public GuestDetails updateGuest(@RequestBody GuestDetails Updated) 
	    {
	    return	guestRepository.save(Updated);
        }
	  
}