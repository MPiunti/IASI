
##Spring MVC JPA REST

Spring 4 
MVC, Security and REST CONTROLLOER 
with JPA and MySQL data model

PREREQUISITES: this example uses Tomcat 8 and works with MySQL instance up and running. Before launchng please set the MySQL environment  SCHEMA `jpa-app` (refer to the script_create_db in respurces direcotry) and set the DB persistence properties;

Consists in a simple Spring Web MVC application includidng authentication components (Spring Security), logging, traces, filter, Java Configuration and JPA Object Relational Mapping

It also provides open REST SERVICES and CRUD ACTIONS for the Employee ENTITY, to be accessed form web frontend.
Run it as a web application using Tomcat 8, and test it using CRUD_Employee_RESTClient.

For running the application a SCHEMA called JPA-APP must be set up and run on localhost (dataSource.url=jdbc:mysql://localhost/jpa-app).
Notice: JPA can automatically create the database if the property 'hibernate.hbm2ddl.auto' is set.