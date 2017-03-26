
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Entity
public class Coming {

    private static final long serialVersionUID = 1L;

    public enum MovieType {
        Action,
        Documentary,
        Comedy,
        Adventure,
        Crime,
        Romance,
        Animation,
        Others
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
     protected String name;
    protected String Release;
    protected MovieType movietype;
   

    public Coming() {
        this.id = Long.MAX_VALUE;
        this.Release = null;
        this.movietype = MovieType.Action;
        this.name=null;

    }

    public Coming (Long id,String name, String Release, MovieType movietype) {
        this.id = id;
        this.name=name;
        this.Release = Release;
        this.movietype = movietype;
        
        
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", name=" + this.name + ", Release=" + this.Release + ", movieType=" + this.movietype + " ]";
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
    public String getRelease() {
        return Release;
    }

    /**
    
     */
    public void setRelease(String Release) {
        this.Release = Release;
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
