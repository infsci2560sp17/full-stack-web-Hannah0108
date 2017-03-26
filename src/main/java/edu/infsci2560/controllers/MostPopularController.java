package edu.infsci2560.controllers;

import edu.infsci2560.models.MostPopular;
import edu.infsci2560.repositories.MostPopularRepository;
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
 * @author Hannah
 */
@Controller
public class MostPopularController {
    @Autowired
    private MostPopularRepository repository;
    
    @RequestMapping(value = "MostPopular", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("MostPopular", "MostPopular", repository.findAll());
    }
    
    @RequestMapping(value = "MostPopular/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid MostPopular top, BindingResult result) {
        repository.save(top);
        return new ModelAndView("MostPopular", "MostPopular", repository.findAll());
    }
    
}

