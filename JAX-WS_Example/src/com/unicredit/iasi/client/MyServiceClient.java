package com.unicredit.iasi.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.unicredit.iasi.ws.MyService;


public class MyServiceClient{
	
	public static void main(String[] args) throws Exception {
	   
	URL url = new URL("http://localhost:9999/ws/myservice?wsdl");
	
        //1st argument service URI, refer to wsdl document above
	    //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ws.iasi.unicredit.com/", "MyServiceImplService");

        Service service = Service.create(url, qname);

        MyService hello = service.getPort(MyService.class);

        System.out.println(hello.getHelloWorldAsString("IASI"));

    }

}