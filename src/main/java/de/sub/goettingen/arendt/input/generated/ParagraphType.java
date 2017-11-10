//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.11.08 um 11:15:23 AM CET 
//


package de.sub.goettingen.arendt.input.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParagraphType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ParagraphType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="line" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}LineType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dropCapCharsCount" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="dropCap-l" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="dropCap-t" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="dropCap-r" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="dropCap-b" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="align" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}ParagraphAlignment" default="Left" />
 *       &lt;attribute name="leftIndent" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="rightIndent" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="startIndent" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="lineSpacing" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hasOverflowedHead" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="hasOverflowedTail" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParagraphType", propOrder = {
    "line"
})
public class ParagraphType {

    protected List<LineType> line;
    @XmlAttribute(name = "dropCapCharsCount")
    protected BigInteger dropCapCharsCount;
    @XmlAttribute(name = "dropCap-l")
    protected BigInteger dropCapL;
    @XmlAttribute(name = "dropCap-t")
    protected BigInteger dropCapT;
    @XmlAttribute(name = "dropCap-r")
    protected BigInteger dropCapR;
    @XmlAttribute(name = "dropCap-b")
    protected BigInteger dropCapB;
    @XmlAttribute(name = "align")
    protected ParagraphAlignment align;
    @XmlAttribute(name = "leftIndent")
    protected BigInteger leftIndent;
    @XmlAttribute(name = "rightIndent")
    protected BigInteger rightIndent;
    @XmlAttribute(name = "startIndent")
    protected BigInteger startIndent;
    @XmlAttribute(name = "lineSpacing")
    protected BigInteger lineSpacing;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "hasOverflowedHead")
    protected Boolean hasOverflowedHead;
    @XmlAttribute(name = "hasOverflowedTail")
    protected Boolean hasOverflowedTail;

    /**
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineType }
     * 
     * 
     */
    public List<LineType> getLine() {
        if (line == null) {
            line = new ArrayList<LineType>();
        }
        return this.line;
    }

    /**
     * Ruft den Wert der dropCapCharsCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDropCapCharsCount() {
        if (dropCapCharsCount == null) {
            return new BigInteger("0");
        } else {
            return dropCapCharsCount;
        }
    }

    /**
     * Legt den Wert der dropCapCharsCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDropCapCharsCount(BigInteger value) {
        this.dropCapCharsCount = value;
    }

    /**
     * Ruft den Wert der dropCapL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDropCapL() {
        return dropCapL;
    }

    /**
     * Legt den Wert der dropCapL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDropCapL(BigInteger value) {
        this.dropCapL = value;
    }

    /**
     * Ruft den Wert der dropCapT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDropCapT() {
        return dropCapT;
    }

    /**
     * Legt den Wert der dropCapT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDropCapT(BigInteger value) {
        this.dropCapT = value;
    }

    /**
     * Ruft den Wert der dropCapR-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDropCapR() {
        return dropCapR;
    }

    /**
     * Legt den Wert der dropCapR-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDropCapR(BigInteger value) {
        this.dropCapR = value;
    }

    /**
     * Ruft den Wert der dropCapB-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDropCapB() {
        return dropCapB;
    }

    /**
     * Legt den Wert der dropCapB-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDropCapB(BigInteger value) {
        this.dropCapB = value;
    }

    /**
     * Ruft den Wert der align-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParagraphAlignment }
     *     
     */
    public ParagraphAlignment getAlign() {
        if (align == null) {
            return ParagraphAlignment.LEFT;
        } else {
            return align;
        }
    }

    /**
     * Legt den Wert der align-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphAlignment }
     *     
     */
    public void setAlign(ParagraphAlignment value) {
        this.align = value;
    }

    /**
     * Ruft den Wert der leftIndent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLeftIndent() {
        if (leftIndent == null) {
            return new BigInteger("0");
        } else {
            return leftIndent;
        }
    }

    /**
     * Legt den Wert der leftIndent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLeftIndent(BigInteger value) {
        this.leftIndent = value;
    }

    /**
     * Ruft den Wert der rightIndent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRightIndent() {
        if (rightIndent == null) {
            return new BigInteger("0");
        } else {
            return rightIndent;
        }
    }

    /**
     * Legt den Wert der rightIndent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRightIndent(BigInteger value) {
        this.rightIndent = value;
    }

    /**
     * Ruft den Wert der startIndent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartIndent() {
        if (startIndent == null) {
            return new BigInteger("0");
        } else {
            return startIndent;
        }
    }

    /**
     * Legt den Wert der startIndent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartIndent(BigInteger value) {
        this.startIndent = value;
    }

    /**
     * Ruft den Wert der lineSpacing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineSpacing() {
        if (lineSpacing == null) {
            return new BigInteger("0");
        } else {
            return lineSpacing;
        }
    }

    /**
     * Legt den Wert der lineSpacing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineSpacing(BigInteger value) {
        this.lineSpacing = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der style-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Legt den Wert der style-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Ruft den Wert der hasOverflowedHead-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHasOverflowedHead() {
        if (hasOverflowedHead == null) {
            return false;
        } else {
            return hasOverflowedHead;
        }
    }

    /**
     * Legt den Wert der hasOverflowedHead-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasOverflowedHead(Boolean value) {
        this.hasOverflowedHead = value;
    }

    /**
     * Ruft den Wert der hasOverflowedTail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHasOverflowedTail() {
        if (hasOverflowedTail == null) {
            return false;
        } else {
            return hasOverflowedTail;
        }
    }

    /**
     * Legt den Wert der hasOverflowedTail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasOverflowedTail(Boolean value) {
        this.hasOverflowedTail = value;
    }

}
