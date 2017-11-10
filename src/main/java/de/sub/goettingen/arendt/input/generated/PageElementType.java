//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.11.08 um 11:15:23 AM CET 
//


package de.sub.goettingen.arendt.input.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PageElementType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PageElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="text" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}TextType" minOccurs="0"/>
 *         &lt;element name="table" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}TableType" minOccurs="0"/>
 *         &lt;element name="barcode" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}BarcodeType" minOccurs="0"/>
 *         &lt;element name="picture" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}PictureType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pageElemId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageElementType", propOrder = {
    "text",
    "table",
    "barcode",
    "picture"
})
public class PageElementType {

    protected TextType text;
    protected TableType table;
    protected BarcodeType barcode;
    protected PictureType picture;
    @XmlAttribute(name = "pageElemId", required = true)
    protected String pageElemId;

    /**
     * Ruft den Wert der text-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getText() {
        return text;
    }

    /**
     * Legt den Wert der text-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setText(TextType value) {
        this.text = value;
    }

    /**
     * Ruft den Wert der table-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TableType }
     *     
     */
    public TableType getTable() {
        return table;
    }

    /**
     * Legt den Wert der table-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TableType }
     *     
     */
    public void setTable(TableType value) {
        this.table = value;
    }

    /**
     * Ruft den Wert der barcode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BarcodeType }
     *     
     */
    public BarcodeType getBarcode() {
        return barcode;
    }

    /**
     * Legt den Wert der barcode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BarcodeType }
     *     
     */
    public void setBarcode(BarcodeType value) {
        this.barcode = value;
    }

    /**
     * Ruft den Wert der picture-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PictureType }
     *     
     */
    public PictureType getPicture() {
        return picture;
    }

    /**
     * Legt den Wert der picture-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureType }
     *     
     */
    public void setPicture(PictureType value) {
        this.picture = value;
    }

    /**
     * Ruft den Wert der pageElemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageElemId() {
        return pageElemId;
    }

    /**
     * Legt den Wert der pageElemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageElemId(String value) {
        this.pageElemId = value;
    }

}
