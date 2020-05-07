/**
 * 
 */
package com.cg.mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.mgmt.entity.Theater;

/**
 * @author Nishant
 *
 */
@Repository
public interface TheaterRepository extends JpaRepository<Theater, Long>{

}
