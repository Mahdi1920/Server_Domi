/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import infoz.domi.domain.Devise;
/**
 *
 * @author Mahdi
 */
@Repository
public interface DeviseRepository extends JpaRepository<Devise, Integer>{
    
}
