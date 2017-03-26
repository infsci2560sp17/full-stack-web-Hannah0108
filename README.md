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
TODO : Modify to match your project specific Travis Build
[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-Hannah0108.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-Hannah0108)

## Changelog

[Changelog](Changelog.md)
    
## Web Site

[QuickMovie](https://shielded-shelf-64265.herokuapp.com)
![](https://github.com/infsci2560sp17/full-stack-web-Hannah0108/blob/master/src/main/resources/img/icon.png)

## Key Features

* The user could find the most popular movies in history in this website
* The information of upcoming movies will be provided 
* Comments of both the movie and the actor could be applied through this plateform
* The user could upload their own files into website
* All data can be retrieved through the API as a JSON format.

## Project Details

### Landing Page

please provide a description of your landing page inluding a screen shot ![](landingpage.jpeg)

### User Input Form

TODO : please provide a description of at least 1 user input form including a screen shot ![](UserINput.jpeg)

## API

TODO : 
please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    POST photos/:id/tags

#### Parameters

- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.

#### Response

A JSON or XMLobject containing the PhotoID and list of tags accepted.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.