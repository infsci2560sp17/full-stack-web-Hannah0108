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
public class movie {

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
    protected String comment;
    protected MovieType movietype;
    protected String name;

    public movie() {
        this.id = Long.MAX_VALUE;
        this.comment = null;
        this.movietype = MovieType.Action;
        this.name=null;

    }

    public movie (Long id, String comment, MovieType movietype, String name) {
        this.id = id;
        this.comment = comment;
        this.movietype = movietype;
        this.name=name;
        
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", comment=" + this.comment + ", movieType=" + this.movietype + " ]";
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