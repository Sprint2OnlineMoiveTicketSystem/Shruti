/**
 * 
 */
package com.cg.mgmt.exception;

/**
 * @author Nishant
 *
 */
@SuppressWarnings("serial")
public class ShowNotFound extends RuntimeException{

	public ShowNotFound(String msg) {
		super(msg) ;
	}
}
