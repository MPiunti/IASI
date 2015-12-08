##SpringMVC using Spring Boot

Code taken from the official online tutorials at https://spring.io/guides/


_Spring Boot Aplication_, to run it launch Application.java as a normal Java application (no need to use Application Server).

Three usages are available, they rely on three different Controllers and can be tested with CURL or with a REST Client:

###1. Greeting Controller - gives WEB response
> curl http://localhost:8080/greeting/?name=myName     

###2. Greeting REST Controller - gives REST response
> curl http://localhost:8080/rest/greeting/?name=myName      

###3. Greeting HATEOAS Controller -  gives REST HATEOAS response
> curl http://localhost:8080/hateoas/greeting/?name=myName     


