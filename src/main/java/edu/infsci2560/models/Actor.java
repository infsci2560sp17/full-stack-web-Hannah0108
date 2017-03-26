
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
public class Actor {

    private static final long serialVersionUID = 1L;

    public enum Rating {
       pooracting,
       goodacting,
       greatacting
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String actorname;
    protected String comment;
    protected Rating rating;
    protected String moviename;

    public Actor() {
        this.id = Long.MAX_VALUE;
        this.actorname=null;
        this.comment = null;
         this.moviename=null;
        this.rating = Rating.goodacting;
        
       

    }

    public Actor (Long id,String actorname, String comment,  String moviename, Rating rating) {
        this.id = id;
        this.actorname = actorname;
        this.comment = comment;
        this.moviename = moviename;
        this.rating=rating;
        
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", actorname=" + this.actorname + ", comment=" + this.comment +", moviename=" + this.moviename + ", Rating=" + this.rating +" ]";
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
    public Rating getRating() {
        return rating;
    }

    /**
     * @param 
     */
    public void setRating(Rating rating) {
        this.rating = rating;
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
    public void setActorName(String actorname) {
        this.actorname = actorname;
    }
     public String getActorName() {
        return actorname;
    }
 public void setMovieName(String moviename) {
        this.moviename = moviename;
    }
     public String getMovieName() {
        return moviename;
    }
    /**
     * @param 
     */
    public void setId(Long id) {
        this.id = id;
    }

}
