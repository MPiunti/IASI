HTTP and J2EE Preview servers can be used to lounch the html which is a one page app REST CLIENT in AngularJS.


However, to test it against the REST APIs, you must change the service port manually. 

Open the "servers.xml" found in the ".metadata\.plugins\org.eclipse.wst.server.core" directory 
under your workspace in a text editor or using File -> Open File in 
Eclipse. Find the <Server> element for the Preview server in question 
and add a "port" attribute, e.g. port="<new_port_number>". Then restart 
Eclipse to pickup the change.