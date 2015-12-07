
##SpringWS Producer


The project uses a Maven plugin to generate Java Classes since a SCHEMA description 'students.xsd'
On this basis, the services operations are created as a Spring Endpoint in 'StudentEndpoint'.
Student Dataset is 'simulated' within the StudentUtility class for simplicity.

This web application produces Web Service Endpoint which is deployed at:
http://localhost:8080/spring4soap/soapws/students.wsdl

It can be tested using SpringWS Consumer project