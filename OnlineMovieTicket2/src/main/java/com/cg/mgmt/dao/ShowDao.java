/**
 * 
 */
package com.cg.mgmt.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.mgmt.entity.Movie;
import com.cg.mgmt.entity.Show;
import com.cg.mgmt.repository.ShowRepository;

/**
 * @author Shruti
 *
 */
@Repository
public class ShowDao {

	@Autowired
	private ShowRepository showRepository ;
	
	public Show addShow(Show show) {
		return showRepository.save(show) ;
	}

	public List<Show> getShow() {
		return showRepository.findAll() ;
	}

	public String deleteShow(Show s) {
		showRepository.deleteById(s.getShowId());
		return "Show Deleted Successfully!" ;
	}
	
	public Optional<Show> findById(long Show) {
		return showRepository.findById(Show) ;//
		//returns optional datatype
	}
	
	public Show findOne(long Id){
		return showRepository.findById(Id).get() ;
	}//directly called by controller

	public Show save(Show s) {
		return showRepository.save(s) ;
	}

	public List<Show> findBytheMovie(Movie m) {
		return showRepository.findByMovie(m) ;
	}
}
