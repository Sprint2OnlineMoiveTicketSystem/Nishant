/**
 * 
 */
package com.cg.mgmt.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mgmt.dao.Showdao;
import com.cg.mgmt.entity.Show;
import com.cg.mgmt.exception.ShowNotFound;

/**
 * @author Nishant
 *
 */
@Service
@Transactional
public class ShowServiceImpl implements ShowService{

	@Autowired
	private Showdao showDao ;
	
	@Override
	public Show addShow(Show show) {
		return showDao.addShow(show) ;
	}

	@Override
	public List<Show> getShow() {
		return showDao.getShow() ;
	}

	@Override
	public String deleteShow(Show show) {
		Optional<Show> s = showDao.findById(show.getShowId()) ;
		if(!s.isPresent()) {
			throw new ShowNotFound("Show Not Found!") ;
		}
		return showDao.deleteShow(show) ;
	}
	
	@Override
	public Show findOne(long Id){
		return showDao.findOne(Id) ;
	}

}
