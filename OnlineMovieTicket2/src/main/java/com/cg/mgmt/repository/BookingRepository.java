/**
 * 
 */
package com.cg.mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.mgmt.entity.Booking;

/**
 * @author Nishant
 *
 */
@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>{

}
