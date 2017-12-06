//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.11.14 um 11:36:43 AM CET 
//


package de.sub.goettingen.arendt.output.generated;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}titleStmt"/>
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}editionStmt"/>
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}extent"/>
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}publicationStmt"/>
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}sourceDesc"/>
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
    "titleStmt",
    "editionStmt",
    "extent",
    "publicationStmt",
    "sourceDesc"
})
@XmlRootElement(name = "fileDesc")
public class FileDesc {

    @XmlElement(required = true)
    protected TitleStmt titleStmt;
    @XmlElement(required = true)
    protected EditionStmt editionStmt;
    @XmlElement(required = true)
    protected BigInteger extent;
    @XmlElement(required = true)
    protected PublicationStmt publicationStmt;
    @XmlElement(required = true)
    protected SourceDesc sourceDesc;

    /**
     * Ruft den Wert der titleStmt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TitleStmt }
     *     
     */
    public TitleStmt getTitleStmt() {
        return titleStmt;
    }

    /**
     * Legt den Wert der titleStmt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleStmt }
     *     
     */
    public void setTitleStmt(TitleStmt value) {
        this.titleStmt = value;
    }

    /**
     * Ruft den Wert der editionStmt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EditionStmt }
     *     
     */
    public EditionStmt getEditionStmt() {
        return editionStmt;
    }

    /**
     * Legt den Wert der editionStmt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EditionStmt }
     *     
     */
    public void setEditionStmt(EditionStmt value) {
        this.editionStmt = value;
    }

    /**
     * Ruft den Wert der extent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExtent() {
        return extent;
    }

    /**
     * Legt den Wert der extent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExtent(BigInteger value) {
        this.extent = value;
    }

    /**
     * Ruft den Wert der publicationStmt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicationStmt }
     *     
     */
    public PublicationStmt getPublicationStmt() {
        return publicationStmt;
    }

    /**
     * Legt den Wert der publicationStmt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationStmt }
     *     
     */
    public void setPublicationStmt(PublicationStmt value) {
        this.publicationStmt = value;
    }

    /**
     * Ruft den Wert der sourceDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SourceDesc }
     *     
     */
    public SourceDesc getSourceDesc() {
        return sourceDesc;
    }

    /**
     * Legt den Wert der sourceDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceDesc }
     *     
     */
    public void setSourceDesc(SourceDesc value) {
        this.sourceDesc = value;
    }

}
