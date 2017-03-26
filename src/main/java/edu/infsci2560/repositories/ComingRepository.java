package edu.infsci2560.repositories;
import edu.infsci2560.models.Coming;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface ComingRepository extends PagingAndSortingRepository<Coming, Long> {}
