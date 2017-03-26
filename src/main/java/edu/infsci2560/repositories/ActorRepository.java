package edu.infsci2560.repositories;
import edu.infsci2560.models.Actor;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface ActorRepository extends PagingAndSortingRepository<Actor, Long> {}
