package edu.infsci2560.repositories;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.infsci2560.models.dvd;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author kolobj
 */
public interface dvdRepository extends PagingAndSortingRepository<dvd, Long> {}
