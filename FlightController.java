package com.example.demo.layer5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ResponseStatus;
import com.example.demo.exceptions.FlightNotFoundException;
import com.example.demo.layer2.Flight;
import com.example.demo.layer4.FlightService;

@RestController
@RequestMapping("/flight")
public class FlightController {

	@Autowired
	FlightService flightService;
//import org.springframework.http.ResponseEntity;
	@RequestMapping("/getFlight/{fid}")
	public ResponseEntity<Flight> getFlightObject(@PathVariable("fid") int flightNumber) throws FlightNotFoundException 
	{
		Flight flight = null;
		ResponseEntity responseRef=null;
		try {
			flight = flightService.findFlightByIdService(flightNumber);
			responseRef = ResponseEntity.ok(flight);
			return responseRef;
		} catch (FlightNotFoundException e) {
			//throw e;
			System.out.println("Inside flight not found exception ");
			ResponseStatus respStatus = new ResponseStatus();
			respStatus.setMessage(e.getMessage());
			responseRef = ResponseEntity.status(HttpStatus.NOT_FOUND).body(respStatus);
			//return responseRef;
		}
		return responseRef;
	}
}
