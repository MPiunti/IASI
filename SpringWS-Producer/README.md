
##SpringWS Consumer

This web application is a client using Web Service deployed at:
http://localhost:8080/spring4soap/soapws/students.wsdl

The main class is 'RunSoapClient'. 
In order to test the project the Producer Application must be uo and run.

The project uses a Maven plugin to generate Java Classes since a SCHEMA description 'students.xsd'
On this basis, the services operations are created as a Spring Endpoint in 'StudentEndpoint'.
Student Dataset is 'simulated' within the StudentUtility class for simplicity.