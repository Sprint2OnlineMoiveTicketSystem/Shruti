/**
 * 
 */
package com.cg.mgmt.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mgmt.dao.MovieDao;
import com.cg.mgmt.dao.ShowDao;
import com.cg.mgmt.entity.Booking;
import com.cg.mgmt.entity.Movie;
import com.cg.mgmt.entity.Show;
import com.cg.mgmt.exception.ShowNotFound;
import com.cg.mgmt.repository.BookingRepository;

/**
 * @author Shruti
 *
 */
@Service
@Transactional
public class ShowServiceImpl implements ShowService {

	@Autowired
	ShowDao showDao;

	@Autowired
	MovieDao movieDao;

	@Autowired
	private BookingRepository bookingDao;

	@Override
	public Show addShow(Show show) {
		return showDao.save(show);
	}

	@Override
	public List<Show> getShow() {
		return showDao.getShow();
	}

	@Override
	public String deleteShow(Show show) {
		Optional<Show> s = showDao.findById(show.getShowId());
		if (!s.isPresent()) {
			throw new ShowNotFound("Show Not Found!");
		}
		return showDao.deleteShow(show);
	}

	@Override
	public Movie findOne(long Id) {
		return movieDao.findOne(Id);
	}
//	Fetch show by Movie ID

	public List<Show> fetchByMovie(Movie m) {
		return showDao.findBytheMovie(m);
	}

//	Get the available seat for the movie 
	@Override
	public Booking getAvailableSeat(long showId) {
		return bookingDao.findById(showId).get();
	}
}
