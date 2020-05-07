/**
 * 
 */
package com.cg.mgmt.service;

import java.util.List;

import com.cg.mgmt.entity.Show;

/**
 * @author Nishant
 *
 */
public interface ShowService {

public Show addShow(Show show) ;
	
	public List<Show> getShow() ;
	
	public String deleteShow(Show s) ;
	
	public Show findOne(long Id) ;
}
