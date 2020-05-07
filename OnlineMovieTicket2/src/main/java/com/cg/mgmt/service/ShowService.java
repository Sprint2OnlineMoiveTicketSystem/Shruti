/**
 * 
 */
package com.cg.mgmt.service;

import java.util.List;

import com.cg.mgmt.entity.Booking;
import com.cg.mgmt.entity.Movie;
import com.cg.mgmt.entity.Show;

/**
 * @author Shruti
 *
 */
public interface ShowService {
	

	public Show addShow(Show show) ;
	
	public List<Show> getShow() ;
	
	public String deleteShow(Show s) ;
	
	public Movie findOne(long Id) ;
	
	public Booking getAvailableSeat(long showID);
	
	public List<Show> fetchByMovie(Movie m) ;
	
}
