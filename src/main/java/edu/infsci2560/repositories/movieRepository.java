package edu.infsci2560.repositories;
import edu.infsci2560.models.movie;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface movieRepository extends PagingAndSortingRepository<movie, Long> {}

