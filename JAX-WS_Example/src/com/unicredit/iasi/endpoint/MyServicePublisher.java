package com.unicredit.iasi.endpoint;


import javax.xml.ws.Endpoint;

import com.unicredit.iasi.ws.MyServiceImpl;

//Endpoint publisher
public class MyServicePublisher {
	
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/myservice", new MyServiceImpl());
    }

}