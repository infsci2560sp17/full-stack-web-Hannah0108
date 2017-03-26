package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Entity
public class MostPopular {

    private static final long serialVersionUID = 1L;

    public enum MovieType {
        Action,
        Documentary,
        Comedy,
        Adventure,
        Crime,
        Others
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String name;
    protected String comment;
    protected MovieType movietype;
    

    public MostPopular() {
        this.id = Long.MAX_VALUE;
         this.name=null;
        this.comment = null;
        this.movietype = MovieType.Action;
       

    }

    public MostPopular(Long id, String name, String comment, MovieType movietype) {
        this.id = id;
        this.name=name;
        this.comment = comment;
        this.movietype = movietype;
        
        
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", name=" + this.name + ",comment=" + this.comment + ", movieType=" + this.movietype + " ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * @return the name
     */
    public String getComment() {
        return comment;
    }

    /**
    
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return
     */
    public MovieType getMovieType() {
        return movietype;
    }

    /**
     * @param 
     */
    public void setMovieType(MovieType movietype) {
        this.movietype = movietype;
    }

    /**
     * @return 
     */
    public Long getId() {
        return id;
    }

    /**
     * @param 
     */
    public void setName(String name) {
        this.name = name;
    }
     public String getName() {
        return name;
    }

    /**
     * @param 
     */
    public void setId(Long id) {
        this.id = id;
    }

}
