##QuickMovie

1. What is the proposed name for your Web application?

    - QuickMovie
    
2. Who is the target audience for your Web application?

    - The primary target is the movie enthusiasts that want to share film reviews online with others.
      The second target is the people who don't post but want to get information on the movie they are interested. 
      
3. What problem is it intended to solve for the target audience?

    - Create a platform for the movie to be discussed by either movie fans or critics. All of them could create their
      own topic with freedom of expression. Also, The role of this site as providers of information, as educational tools,
      will be strenghtened. Besides, this site intends to be a great resourse when people somehow don't understand a movie 
      or don't have time to see a known film.
      
4. How will it meet the minimum project requirements?

    - All reviews and videos created by the user will be freely accessible without a login. If users want to interact with each other,
      a login will be required which I'll store in my database. The site usage and traffic will be tracked reguarly. All public data 
      will be accessible through RESTful services. 
     
5. Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?

    - My site will be capabale of providing interaction among users and authors of movie reviews.
      On my site either I or authors can interact with the users and respond suggestions and 
      other commentary to acquisite more information. 
    



## Build status

[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-Hannah0108.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-Hannah0108)

## Changelog

[Changelog](Changelog.md)
    
## Web Site

[QuickMovie](https://shielded-shelf-64265.herokuapp.com)
![](https://github.com/infsci2560sp17/full-stack-web-Hannah0108/blob/master/src/main/resources/img/icon.png)

## Key Features

* The user could find the most popular movies in history in this website
* The user is able to add the information of popular movie.
* The information of upcoming movies will be provided 
* Comments of both the movie and the actor could be applied through this plateform
* The user could upload their own files into website
* All data can be retrieved through the API as a JSON format.
* Users are able to modify and delete the data (comments or other information).

## Project Details

### Landing Page
As for a welcome page, it includes the navigation bar with “Quickmovie”, “join us” and “contact”. Besides, at the middle of the page, the user could get more information of this website while clicking on the word "click” of the sentence “click to find movie now". 

 ![](https://github.com/infsci2560sp17/full-stack-web-Hannah0108/blob/master/src/main/resources/img/landingpage.jpeg)
### Home Page
![](https://github.com/infsci2560sp17/full-stack-web-Hannah0108/blob/master/src/main/resources/img/mainpage.PNG)
### User Input Form
### Log in 
![](https://github.com/infsci2560sp17/full-stack-web-Hannah0108/blob/master/src/main/resources/img/login.jpeg)
### Add Comments for Movies
![](https://github.com/infsci2560sp17/full-stack-web-Hannah0108/blob/master/src/main/resources/img/movie.PNG)
### Add Comments for Actors
![](https://github.com/infsci2560sp17/full-stack-web-Hannah0108/blob/master/src/main/resources/img/Actor.PNG)
### Add Upcoming movies
![](https://github.com/infsci2560sp17/full-stack-web-Hannah0108/blob/master/src/main/resources/img/hot.PNG)
### Add recommandations
![](https://github.com/infsci2560sp17/full-stack-web-Hannah0108/blob/master/src/main/resources/img/link.jpeg)
### Update Comments
![](https://github.com/infsci2560sp17/full-stack-web-Hannah0108/blob/master/src/main/resources/img/update.jpeg)
### Upload files 
![](https://github.com/infsci2560sp17/full-stack-web-Hannah0108/blob/master/src/main/resources/img/upload.jpeg)
## API
(JUST FOR EXAMPLE)
Function "GET", "Delete"

### API Method 1

    GET public/api/actor/id

#### Parameters

- **id** 
#### Response

A JSON  containing the data by ID.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — 

#### Example

##### Request

    https://shielded-shelf-64265.herokuapp.com/public/api/actor/4


##### JSON Response

```json
{
   {"id":4,"comment":"Men in Black III opened on May 25, 2012 with Smith again reprising his role as Agent J. This was his first major starring role in four years","rating":"goodacting","actorName":"Will Smith","movieName":"Men in Black "}
}
```

##### XML Response

NA
### API Method 2

 Delete public/api/actor/id

#### Parameters

- **id** 

#### Response

Delete the item by ID


## Technologies Used

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.
- [Bootstrap](http://getbootstrap.com)- Bootstrap contains the template of HTML- and CSS for typography, forms, buttons, navigation, etc.