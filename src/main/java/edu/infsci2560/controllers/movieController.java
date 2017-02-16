package edu.infsci2560.controllers;

import edu.infsci2560.models.movie;
import edu.infsci2560.repositories.movieRepository;
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

/**
 *
 * @author kolobj
 */
@Controller
public class movieController {
    @Autowired
    private movieRepository repository;
    
    @RequestMapping(value = "movie", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("movie", "movie", repository.findAll());
    }
    
    @RequestMapping(value = "movie/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid movie movie, BindingResult result) {
        repository.save(movie);
        return new ModelAndView("movie", "movie", repository.findAll());
    }
    
}