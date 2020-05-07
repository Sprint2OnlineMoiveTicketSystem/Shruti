/**
 * 
 */
package com.cg.mgmt.service;

import java.util.List;

import com.cg.mgmt.entity.Movie;

/**
 * @author Nishant
 *
 */
public interface MovieService {

	public Movie addMovie(Movie movie) ;
	
	public List<Movie> getMovie() ;
	
	public String deleteMovie(Movie m) ;
	
	public List<Object[]> getMovieByTheaterId(long ID) ;
	
	public Movie findOne(long Id) ;
}
