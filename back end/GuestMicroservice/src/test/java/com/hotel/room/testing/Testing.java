package com.hotel.room.testing;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.hotel.guest.controller.GuestController;
import com.hotel.guest.details.GuestDetails;
import com.hotel.guest.repo.GuestRepo;
import com.mongodb.assertions.Assertions;

public class Testing {
		@InjectMocks
		GuestController guestcontroller;
			
		@Mock
		GuestRepo repoProduct;
		
		@BeforeEach
		void setup()
		{
			MockitoAnnotations.initMocks(this);
		}
		@Test
		void testGetAllProfiles() {
			List<GuestDetails> testUsers=new ArrayList<GuestDetails>();
			testUsers.add(new GuestDetails());
			when(guestcontroller.getAllguests()).thenReturn(testUsers);
			List<GuestDetails> result = guestcontroller.getAllguests();
			Assertions.assertNotNull(result);
		}

	}

