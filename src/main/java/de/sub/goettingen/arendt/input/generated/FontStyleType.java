//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.11.08 um 11:15:23 AM CET 
//


package de.sub.goettingen.arendt.input.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FontStyleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FontStyleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="baseFont" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="italic" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="bold" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="underline" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="strikeout" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="smallcaps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="scaling" type="{http://www.w3.org/2001/XMLSchema}integer" default="1000" />
 *       &lt;attribute name="spacing" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="backgroundColor" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="ff" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fs" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FontStyleType")
public class FontStyleType {

    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "baseFont")
    protected Boolean baseFont;
    @XmlAttribute(name = "italic")
    protected Boolean italic;
    @XmlAttribute(name = "bold")
    protected Boolean bold;
    @XmlAttribute(name = "underline")
    protected Boolean underline;
    @XmlAttribute(name = "strikeout")
    protected Boolean strikeout;
    @XmlAttribute(name = "smallcaps")
    protected Boolean smallcaps;
    @XmlAttribute(name = "scaling")
    protected BigInteger scaling;
    @XmlAttribute(name = "spacing")
    protected BigInteger spacing;
    @XmlAttribute(name = "color")
    protected BigInteger color;
    @XmlAttribute(name = "backgroundColor")
    protected BigInteger backgroundColor;
    @XmlAttribute(name = "ff", required = true)
    protected String ff;
    @XmlAttribute(name = "fs", required = true)
    protected float fs;

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
     * Ruft den Wert der baseFont-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBaseFont() {
        if (baseFont == null) {
            return false;
        } else {
            return baseFont;
        }
    }

    /**
     * Legt den Wert der baseFont-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBaseFont(Boolean value) {
        this.baseFont = value;
    }

    /**
     * Ruft den Wert der italic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isItalic() {
        if (italic == null) {
            return false;
        } else {
            return italic;
        }
    }

    /**
     * Legt den Wert der italic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItalic(Boolean value) {
        this.italic = value;
    }

    /**
     * Ruft den Wert der bold-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBold() {
        if (bold == null) {
            return false;
        } else {
            return bold;
        }
    }

    /**
     * Legt den Wert der bold-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBold(Boolean value) {
        this.bold = value;
    }

    /**
     * Ruft den Wert der underline-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUnderline() {
        if (underline == null) {
            return false;
        } else {
            return underline;
        }
    }

    /**
     * Legt den Wert der underline-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnderline(Boolean value) {
        this.underline = value;
    }

    /**
     * Ruft den Wert der strikeout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStrikeout() {
        if (strikeout == null) {
            return false;
        } else {
            return strikeout;
        }
    }

    /**
     * Legt den Wert der strikeout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrikeout(Boolean value) {
        this.strikeout = value;
    }

    /**
     * Ruft den Wert der smallcaps-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSmallcaps() {
        if (smallcaps == null) {
            return false;
        } else {
            return smallcaps;
        }
    }

    /**
     * Legt den Wert der smallcaps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmallcaps(Boolean value) {
        this.smallcaps = value;
    }

    /**
     * Ruft den Wert der scaling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScaling() {
        if (scaling == null) {
            return new BigInteger("1000");
        } else {
            return scaling;
        }
    }

    /**
     * Legt den Wert der scaling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScaling(BigInteger value) {
        this.scaling = value;
    }

    /**
     * Ruft den Wert der spacing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpacing() {
        if (spacing == null) {
            return new BigInteger("0");
        } else {
            return spacing;
        }
    }

    /**
     * Legt den Wert der spacing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpacing(BigInteger value) {
        this.spacing = value;
    }

    /**
     * Ruft den Wert der color-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColor() {
        if (color == null) {
            return new BigInteger("0");
        } else {
            return color;
        }
    }

    /**
     * Legt den Wert der color-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColor(BigInteger value) {
        this.color = value;
    }

    /**
     * Ruft den Wert der backgroundColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBackgroundColor() {
        if (backgroundColor == null) {
            return new BigInteger("0");
        } else {
            return backgroundColor;
        }
    }

    /**
     * Legt den Wert der backgroundColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBackgroundColor(BigInteger value) {
        this.backgroundColor = value;
    }

    /**
     * Ruft den Wert der ff-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFf() {
        return ff;
    }

    /**
     * Legt den Wert der ff-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFf(String value) {
        this.ff = value;
    }

    /**
     * Ruft den Wert der fs-Eigenschaft ab.
     * 
     */
    public float getFs() {
        return fs;
    }

    /**
     * Legt den Wert der fs-Eigenschaft fest.
     * 
     */
    public void setFs(float value) {
        this.fs = value;
    }

}
