package edu.infsci2560.controllers;

import edu.infsci2560.models.Actor;
import edu.infsci2560.repositories.ActorRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Hannah
 */
@Controller
public class ActorController {
    @Autowired
    private ActorRepository repository;
    
    @RequestMapping(value = "Actor", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("Actor", "Actor", repository.findAll());
    }
    
    @RequestMapping(value = "Actor/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Actor actor, BindingResult result) {
        repository.save(actor);
        return new ModelAndView("Actor", "Actor", repository.findAll());
    }
     @RequestMapping(value = "Actor/delete", method = RequestMethod.GET)
    public ModelAndView deleteComments(@RequestParam(value="id", required=true) Long id) {
        Actor actor = repository.findOne(id);  
        if ( actor != null ) {
            repository.delete(id);
        }
        return new ModelAndView("Actor", "Actor", repository.findAll());
    }
    
       @RequestMapping(value = "Actor/{id}", 
            method = RequestMethod.DELETE, 
            consumes="application/x-www-form-urlencoded", 
            produces = "application/json")
    public ModelAndView delete( @Valid Actor Actor, BindingResult result) {
        repository.delete(Actor);
        return new ModelAndView("Actor", "Actor", repository.findAll());
    }
    
}
