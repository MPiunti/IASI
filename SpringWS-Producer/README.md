
##SpringWS Producer


The project uses a Maven plugin to generate Java Classes since a SCHEMA describing basic business objects and operation  'students.xsd'

Service operations are managed as a Spring Endpoint in 'StudentEndpoint'.
Student Dataset is then 'simulated' within the StudentUtility class for simplicity (one direction for development would be to connect a MySQL database for managing a Student Table)

This web application produces Web Service Endpoint which is available at:
http://localhost:8080/spring4soap/soapws/students.wsdl

It can be tested using SpringWS Consumer project, to be run against the deployed services