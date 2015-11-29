package com.unicredit.iasi.ws;

import javax.jws.WebService;
	 
//Service Implementation
@WebService(endpointInterface = "com.unicredit.iasi.ws.MyService")
public class MyServiceImpl implements MyService {
 
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

	@Override
	public String getCtoF(String c) {
		Double fahrenheit;
		Double celsius = Double.parseDouble(c);
		fahrenheit = ((celsius * 9) / 5) + 32;
		return fahrenheit.toString();
	}

	@Override
	public String getFtoC(String f) {
		Float celsius;
		celsius =  (Float.parseFloat(f) - 32)*5/9; 
		return celsius.toString();
	}
 
}