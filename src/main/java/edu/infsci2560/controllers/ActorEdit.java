package edu.infsci2560.controllers;

import edu.infsci2560.models.Actor;
import edu.infsci2560.repositories.ActorRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Hannah
 */
@Controller
public class ActorEdit {
    @Autowired
    private ActorRepository repository;
    @RequestMapping(value = "Actor/edit/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) { 
        Actor Actor = repository.findOne(id);
        return new ModelAndView("ActorEdit", "Actor", Actor);
    }
    
    @RequestMapping(value = "Actor/edit/{id}", method = RequestMethod.PUT, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView update( @Valid Actor Actor, BindingResult result) {
        repository.save(Actor);
//        return "redirect:/recipes";
        return new ModelAndView("Actor", "Actor", repository.findAll());
    } 
}