/**
 * 
 */
package com.cg.mgmt.exception;

/**
 * @author Nishant
 *
 */
@SuppressWarnings("serial")
public class MovieNotFound extends RuntimeException{

	public MovieNotFound(String msg) {
		super(msg) ;
	}
}
