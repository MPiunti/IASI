//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.12.17 alle 02:01:33 PM CET 
//


package com.stockservice.soap;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.stockservice.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.stockservice.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStockResponse }
     * 
     */
    public GetStockResponse createGetStockResponse() {
        return new GetStockResponse();
    }

    /**
     * Create an instance of {@link GetStockRequest }
     * 
     */
    public GetStockRequest createGetStockRequest() {
        return new GetStockRequest();
    }

    /**
     * Create an instance of {@link Stock }
     * 
     */
    public Stock createStock() {
        return new Stock();
    }

}
