/**
 * 
 */
package com.cg.mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.mgmt.entity.Show;

/**
 * @author Shruti
 *
 */
@Repository
public interface ShowRepository extends JpaRepository<Show, Long>{

}
