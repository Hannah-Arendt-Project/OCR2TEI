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
 * <p>Java-Klasse für ParagraphStyleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ParagraphStyleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fontStyle" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}FontStyleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mainFontStyleId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="role" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="text"/>
 *             &lt;enumeration value="tableText"/>
 *             &lt;enumeration value="heading"/>
 *             &lt;enumeration value="tableHeading"/>
 *             &lt;enumeration value="pictureCaption"/>
 *             &lt;enumeration value="tableCaption"/>
 *             &lt;enumeration value="contents"/>
 *             &lt;enumeration value="footnote"/>
 *             &lt;enumeration value="endnote"/>
 *             &lt;enumeration value="rt"/>
 *             &lt;enumeration value="garb"/>
 *             &lt;enumeration value="other"/>
 *             &lt;enumeration value="barcode"/>
 *             &lt;enumeration value="headingNumber"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="roleLevel" type="{http://www.w3.org/2001/XMLSchema}integer" default="-1" />
 *       &lt;attribute name="align" use="required" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}ParagraphAlignment" />
 *       &lt;attribute name="before" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="after" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="startIndent" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="leftIndent" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="rightIndent" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="lineSpacing" type="{http://www.w3.org/2001/XMLSchema}integer" default="-1" />
 *       &lt;attribute name="lineSpacingRatio" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="fixedLineSpacing" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParagraphStyleType", propOrder = {
    "fontStyle"
})
public class ParagraphStyleType {

    protected List<FontStyleType> fontStyle;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "mainFontStyleId", required = true)
    protected String mainFontStyleId;
    @XmlAttribute(name = "role", required = true)
    protected String role;
    @XmlAttribute(name = "roleLevel")
    protected BigInteger roleLevel;
    @XmlAttribute(name = "align", required = true)
    protected ParagraphAlignment align;
    @XmlAttribute(name = "before")
    protected BigInteger before;
    @XmlAttribute(name = "after")
    protected BigInteger after;
    @XmlAttribute(name = "startIndent")
    protected BigInteger startIndent;
    @XmlAttribute(name = "leftIndent")
    protected BigInteger leftIndent;
    @XmlAttribute(name = "rightIndent")
    protected BigInteger rightIndent;
    @XmlAttribute(name = "lineSpacing")
    protected BigInteger lineSpacing;
    @XmlAttribute(name = "lineSpacingRatio")
    protected BigInteger lineSpacingRatio;
    @XmlAttribute(name = "fixedLineSpacing")
    protected Boolean fixedLineSpacing;

    /**
     * Gets the value of the fontStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fontStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFontStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FontStyleType }
     * 
     * 
     */
    public List<FontStyleType> getFontStyle() {
        if (fontStyle == null) {
            fontStyle = new ArrayList<FontStyleType>();
        }
        return this.fontStyle;
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
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der mainFontStyleId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainFontStyleId() {
        return mainFontStyleId;
    }

    /**
     * Legt den Wert der mainFontStyleId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainFontStyleId(String value) {
        this.mainFontStyleId = value;
    }

    /**
     * Ruft den Wert der role-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Legt den Wert der role-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Ruft den Wert der roleLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRoleLevel() {
        if (roleLevel == null) {
            return new BigInteger("-1");
        } else {
            return roleLevel;
        }
    }

    /**
     * Legt den Wert der roleLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRoleLevel(BigInteger value) {
        this.roleLevel = value;
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
        return align;
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
     * Ruft den Wert der before-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBefore() {
        if (before == null) {
            return new BigInteger("0");
        } else {
            return before;
        }
    }

    /**
     * Legt den Wert der before-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBefore(BigInteger value) {
        this.before = value;
    }

    /**
     * Ruft den Wert der after-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAfter() {
        if (after == null) {
            return new BigInteger("0");
        } else {
            return after;
        }
    }

    /**
     * Legt den Wert der after-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAfter(BigInteger value) {
        this.after = value;
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
     * Ruft den Wert der lineSpacing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineSpacing() {
        if (lineSpacing == null) {
            return new BigInteger("-1");
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
     * Ruft den Wert der lineSpacingRatio-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineSpacingRatio() {
        if (lineSpacingRatio == null) {
            return new BigInteger("1");
        } else {
            return lineSpacingRatio;
        }
    }

    /**
     * Legt den Wert der lineSpacingRatio-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineSpacingRatio(BigInteger value) {
        this.lineSpacingRatio = value;
    }

    /**
     * Ruft den Wert der fixedLineSpacing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFixedLineSpacing() {
        if (fixedLineSpacing == null) {
            return true;
        } else {
            return fixedLineSpacing;
        }
    }

    /**
     * Legt den Wert der fixedLineSpacing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedLineSpacing(Boolean value) {
        this.fixedLineSpacing = value;
    }

}
