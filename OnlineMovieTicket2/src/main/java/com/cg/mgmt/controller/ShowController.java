/**
 * 
 */
package com.cg.mgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mgmt.entity.Booking;
import com.cg.mgmt.entity.Movie;
import com.cg.mgmt.entity.Show;
import com.cg.mgmt.service.ShowService;

/**
 * @author Shruti
 *
 */
@RestController
@RequestMapping("/show")
public class ShowController {

	@Autowired
	ShowService showService ;
	
//	Get the seat available for a particular Show using the show ID
	@GetMapping("/show/{id}")
	public Booking getAvailableSeat(@PathVariable ( value = "id") long id)
	{
		return showService.getAvailableSeat(id);
	}
	
//	Get Available Show for a particular movie 
	
	@GetMapping("/movie/{id}/show")
	public List<Show> geShowByMovieId(@PathVariable(value ="id") long id){
		
		Movie theMovie = showService.findOne(id);
	
		return showService.fetchByMovie(theMovie);
	}
}
