/**
 * 
 */
package com.cg.mgmt.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.mgmt.entity.Movie;
import com.cg.mgmt.repository.MovieRepository;

/**
 * @author Nishant
 *
 */
@Repository
public class MovieDao {

	@Autowired
	private MovieRepository movieRepository ;
	
	public Movie addMovie(Movie movie) {
		return movieRepository.save(movie) ;
	}

	public List<Movie> getMovie() {
		return movieRepository.findAll() ;
	}

	public String deleteMovie(Movie m) {
		movieRepository.deleteById(m.getMovieId());
		return "Movie Deleted Successfully!" ;
	}
	
	public Optional<Movie> findById(long id) {
		return movieRepository.findById(id) ;
	}
	
	public Movie save(Movie m) {
		return movieRepository.save(m) ;
	}

	public List<Object[]> getMovieByTheaterId(long ID) {
		return movieRepository.getMovieByTheateID(ID);
	}
	
	public Movie findOne(long Id){
		return movieRepository.findById(Id).get();
	}
}
