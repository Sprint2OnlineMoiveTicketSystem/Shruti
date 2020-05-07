/**
 * 
 */
package com.cg.mgmt.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 * @author Nishant
 *
 */
@Entity
@Table(name = "movie")
public class Movie implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long movieId;

	private String movieName;

	private String movieDirector;

	private String movieDescription;
	
	private String movieImg ;

	@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
	@OnDelete(action=OnDeleteAction.CASCADE)
	public List<Show> show;

	

	public Movie() {
		
	}

	public Movie(String movieName, String movieDirector, String movieDescription, String movieImg, List<Show> show) {
		super();
		this.movieName = movieName;
		this.movieDirector = movieDirector;
		this.movieDescription = movieDescription;
		this.movieImg = movieImg;
		this.show = show;
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public String getMovieDescription() {
		return movieDescription;
	}

	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}

	public String getMovieImg() {
		return movieImg;
	}

	public void setMovieImg(String movieImg) {
		this.movieImg = movieImg;
	}

	public List<Show> getShow() {
		return show;
	}

	public void setShow(List<Show> show) {
		this.show = show;
	}
}