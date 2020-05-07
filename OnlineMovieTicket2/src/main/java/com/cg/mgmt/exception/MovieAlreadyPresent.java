/**
 * 
 */
package com.cg.mgmt.exception;

/**
 * @author Nishant
 *
 */
@SuppressWarnings("serial")
public class MovieAlreadyPresent extends RuntimeException{

	public MovieAlreadyPresent(String msg) {
		super(msg) ;
	}
}
