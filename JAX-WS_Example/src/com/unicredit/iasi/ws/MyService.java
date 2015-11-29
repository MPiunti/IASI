package com.unicredit.iasi.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface MyService{
 
	@WebMethod String getHelloWorldAsString(String name);
	
	@WebMethod String getCtoF(String c);
	
	@WebMethod String getFtoC(String f);

}