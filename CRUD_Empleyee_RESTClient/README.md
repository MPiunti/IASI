==One page APP REST CLIENT in AngularJS==

HTTP and J2EE Preview servers can be used to launch the html 

If you want to use preview servers to test it against the REST APIs, you may change the service port manually. 

Open the "servers.xml" found in the ".metadata\.plugins\org.eclipse.wst.server.core" directory 
under your workspace in a text editor or using File -> Open File in 
Eclipse. Find the <Server> element for the Preview server in question 
and add a "port" attribute, e.g. port="<new_port_number>". Then restart 
Eclipse to pickup the change.