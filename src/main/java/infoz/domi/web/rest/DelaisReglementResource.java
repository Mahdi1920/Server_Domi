/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.web.rest;

import infoz.domi.domain.DelaisReglement;
import infoz.domi.repository.DelaisReglementRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mahdi
 */
@RestController
@RequestMapping("/api")
public class DelaisReglementResource {
    @Autowired
    private DelaisReglementRepository delaisRep;
    
    @GetMapping(value="/delais")
    public List<DelaisReglement> getDelais(){
        return delaisRep.findAll();
    }
}
