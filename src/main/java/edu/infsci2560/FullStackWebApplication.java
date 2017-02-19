package edu.infsci2560;

import edu.infsci2560.models.movie;
import edu.infsci2560.models.movie.MovieType;
import edu.infsci2560.repositories.movieRepository;

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
      repository.save(new movie(1L, "The Dark Knight” is a haunted film that leaps beyond its origins and becomes an engrossing tragedy. It creates characters we come to care about. That’s because of the performances, because of the direction, because of the writing, and because of the superlative technical quality of the entire production.  ", MovieType.Action, "Dark Knight"));
      repository.save(new movie(2L, "The funniest movie character so far this year is a stuffed teddy bear. And the best comedy screenplay so far is Ted, the saga of the bear's friendship with a 35-year-old manchild. I know; this also was hard for me to believe. After memories of Mel Gibson's bond with a sock puppet, Ted was not high on the list of movies I was impatient to see. ", MovieType.Comedy, "TED"));
      repository.save(new movie(3L, "Most of Martin Scorsese's films have been about men trying to realize their inner image of themselves. That's as true of Travis Bickle as of Jake LaMotta, Rupert Pupkin, Howard Hughes, the Dalai Lama, Bob Dylan or, for that matter, Jesus Christ. The Departed is about two men trying to live public lives that are the radical opposites of their inner realities. Their attempts threaten to destroy them, either by implosion or fatal betrayal. The telling of their stories involves a moral labyrinth, in which good and evil wear each other's masks. ", MovieType.Crime, "THE DEPARTED"));
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
