/**
 * 
 */
package com.cg.mgmt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.mgmt.entity.Movie;
import com.cg.mgmt.entity.Show;

/**
 * @author Shruti
 *
 */
@Repository
public interface ShowRepository extends JpaRepository<Show, Long>{

	public List<Show> findByMovie(Movie m); 
}
