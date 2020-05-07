/**
 * 
 */
package com.cg.mgmt.model;

import java.util.Date;

/**
 * @author Nishant
 *
 */
public class Response {

	private Object data;
	private Date date;

	public Response(Object data, Date date) {
		super();
		this.data = data;
		this.date = date;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
