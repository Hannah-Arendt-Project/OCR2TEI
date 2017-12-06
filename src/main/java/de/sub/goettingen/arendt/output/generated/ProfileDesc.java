//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.11.14 um 11:36:43 AM CET 
//


package de.sub.goettingen.arendt.output.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}creation"/>
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}langUsage"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creation",
    "langUsage"
})
@XmlRootElement(name = "profileDesc")
public class ProfileDesc {

    @XmlElement(required = true)
    protected Creation creation;
    @XmlElement(required = true)
    protected LangUsage langUsage;

    /**
     * Ruft den Wert der creation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Creation }
     *     
     */
    public Creation getCreation() {
        return creation;
    }

    /**
     * Legt den Wert der creation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Creation }
     *     
     */
    public void setCreation(Creation value) {
        this.creation = value;
    }

    /**
     * Ruft den Wert der langUsage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LangUsage }
     *     
     */
    public LangUsage getLangUsage() {
        return langUsage;
    }

    /**
     * Legt den Wert der langUsage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LangUsage }
     *     
     */
    public void setLangUsage(LangUsage value) {
        this.langUsage = value;
    }

}
