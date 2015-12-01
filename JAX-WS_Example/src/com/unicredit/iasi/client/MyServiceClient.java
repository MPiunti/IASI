package com.unicredit.iasi.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.unicredit.iasi.ws.MyService;
import com.unicredit.iasi.ws.domain.Temperature;


public class MyServiceClient{
	
	public static void main(String[] args) throws Exception {
	   
	URL url = new URL("http://localhost:9999/ws/myservice?wsdl");
	
        //1st argument service URI, refer to wsdl document above
	    //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ws.iasi.unicredit.com/", "MyServiceImplService");

        Service service = Service.create(url, qname);

        MyService myService = service.getPort(MyService.class);

        System.out.println("TEST1: " + myService.getHelloWorldAsString("IASI"));
        
        System.out.println("TEST2: F° 32.0 is C°:" + myService.getFtoC("32.0"));
        
        System.out.println("TEST3: F° 32.0 is C°:" + myService.getFtoC("32.0"));

        
        System.out.println("C° 0.0 is F°:" + myService.getCtoF("0.0"));
        
        Temperature t = new Temperature();
        t.setCelsius(Float.valueOf("0"));
        t.setFarenheit(Float.valueOf("0"));
        
        Temperature response = myService.getTemperature(t);
        
        System.out.println("TEST 4:" + myService.getTemperature(t) );
        
        

    }

}