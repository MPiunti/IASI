package com.unicredit.iasi.ws;

import javax.jws.WebService;
	 
//Service Implementation
@WebService(endpointInterface = "com.unicredit.iasi.ws.MyService")
public class MyServiceImpl implements MyService {
 
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}
 
}