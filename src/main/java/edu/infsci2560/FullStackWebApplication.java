package edu.infsci2560;

import edu.infsci2560.models.movie;
import edu.infsci2560.models.movie.MovieType;
import edu.infsci2560.repositories.movieRepository;
import edu.infsci2560.models.Actor;
import edu.infsci2560.models.Actor.Rating;
//import edu.infsci2560.models.Actor.MovieType;
import edu.infsci2560.repositories.ActorRepository;
import edu.infsci2560.models.MostPopular;
import edu.infsci2560.repositories.MostPopularRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class FullStackWebApplication {

    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);

    public static void main(String[] args) {
       ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);
      movieRepository repository = ctx.getBean(movieRepository.class);
     
      MostPopularRepository repository2=ctx.getBean(MostPopularRepository.class);
      repository.save(new movie(1L, "The Dark Knight” is a haunted film that leaps beyond its origins and becomes an engrossing tragedy.", MovieType.Action, "Dark Knight"));
     repository.save(new movie(2L, "The funniest movie character so far this year is a stuffed teddy bear. And the best comedy screenplay so far is Ted ", MovieType.Comedy, "TED"));
     repository.save(new movie(3L, "Most of Martin Scorsese's films have been about men trying to realize their inner image of themselves. ", MovieType.Crime, "THE DEPARTED"));
      ActorRepository repository1=ctx.getBean(ActorRepository.class);
     repository1.save(new Actor(1L, "Brant", "The Dark Knight” is a haunted film that leaps beyond its origins and becomes an engrossing tragedy.", "Dark Knight",Rating.goodacting ));
     repository2.save(new MostPopular(1L, "The Dark Knight", " is a haunted film that leaps beyond its origins and becomes an engrossing tragedy.", MostPopular.MovieType.Action));
    
    }
    

//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }
   /* @Bean
    public CommandLineRunner databaseDemo(CustomerRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new Customer("Jack", "Bauer"));
            repository.save(new Customer("Chloe", "O'Brian"));
            repository.save(new Customer("Kim", "Bauer"));
            repository.save(new Customer("David", "Palmer"));
            repository.save(new Customer("Michelle", "Dessler"));
            repository.save(new Customer("Billy", "Bean"));

            // fetch all customers
            log.info("[Database Demo] Customers found with findAll():");
            log.info("[Database Demo] -------------------------------");
            for (Customer customer : repository.findAll()) {
                log.info("[Database Demo] " + customer.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Customer customer = repository.findOne(1L);
            log.info("[Database Demo] Customer found with findOne(1L):");
            log.info("[Database Demo] --------------------------------");
            log.info("[Database Demo] " + customer.toString());            

            // fetch customers by last name
            log.info("[Database Demo] Customer found with findByLastName('Bauer'):");
            log.info("[Database Demo] --------------------------------------------");
            for (Customer bauer : repository.findByLastName("Bauer")) {
                log.info("[Database Demo] " + bauer.toString());
            }            
        };
    }*/
}
