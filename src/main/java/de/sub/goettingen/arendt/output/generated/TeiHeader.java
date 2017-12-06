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
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}fileDesc"/>
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}encodingDesc"/>
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}profileDesc"/>
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
    "fileDesc",
    "encodingDesc",
    "profileDesc"
})
@XmlRootElement(name = "teiHeader")
public class TeiHeader {

    @XmlElement(required = true)
    protected FileDesc fileDesc;
    @XmlElement(required = true)
    protected EncodingDesc encodingDesc;
    @XmlElement(required = true)
    protected ProfileDesc profileDesc;

    /**
     * Ruft den Wert der fileDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FileDesc }
     *     
     */
    public FileDesc getFileDesc() {
        return fileDesc;
    }

    /**
     * Legt den Wert der fileDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDesc }
     *     
     */
    public void setFileDesc(FileDesc value) {
        this.fileDesc = value;
    }

    /**
     * Ruft den Wert der encodingDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EncodingDesc }
     *     
     */
    public EncodingDesc getEncodingDesc() {
        return encodingDesc;
    }

    /**
     * Legt den Wert der encodingDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EncodingDesc }
     *     
     */
    public void setEncodingDesc(EncodingDesc value) {
        this.encodingDesc = value;
    }

    /**
     * Ruft den Wert der profileDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProfileDesc }
     *     
     */
    public ProfileDesc getProfileDesc() {
        return profileDesc;
    }

    /**
     * Legt den Wert der profileDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileDesc }
     *     
     */
    public void setProfileDesc(ProfileDesc value) {
        this.profileDesc = value;
    }

}
