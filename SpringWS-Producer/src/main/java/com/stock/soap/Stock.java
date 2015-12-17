//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.12.17 alle 10:48:48 AM CET 
//


package com.stock.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per stock complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="stock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stockID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stock", propOrder = {
    "quote",
    "stockID"
})
public class Stock {

    protected String quote;
    protected String stockID;

    /**
     * Recupera il valore della proprietà quote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuote() {
        return quote;
    }

    /**
     * Imposta il valore della proprietà quote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuote(String value) {
        this.quote = value;
    }

    /**
     * Recupera il valore della proprietà stockID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockID() {
        return stockID;
    }

    /**
     * Imposta il valore della proprietà stockID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockID(String value) {
        this.stockID = value;
    }

}
