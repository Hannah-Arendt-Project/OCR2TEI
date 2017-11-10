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
 * <p>Java-Klasse für TableType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caption" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}CaptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tableCell" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="text" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}PageElementType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="topPos" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="bottomPos" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="leftPos" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="rightPos" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="VerticalAlignment" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="top"/>
 *                       &lt;enumeration value="center"/>
 *                       &lt;enumeration value="bottom"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableType", propOrder = {
    "caption",
    "tableCell"
})
public class TableType {

    protected List<CaptionType> caption;
    protected List<TableType.TableCell> tableCell;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the caption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaptionType }
     * 
     * 
     */
    public List<CaptionType> getCaption() {
        if (caption == null) {
            caption = new ArrayList<CaptionType>();
        }
        return this.caption;
    }

    /**
     * Gets the value of the tableCell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableCell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableType.TableCell }
     * 
     * 
     */
    public List<TableType.TableCell> getTableCell() {
        if (tableCell == null) {
            tableCell = new ArrayList<TableType.TableCell>();
        }
        return this.tableCell;
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
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="text" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}PageElementType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="topPos" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="bottomPos" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="leftPos" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="rightPos" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="VerticalAlignment" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="top"/>
     *             &lt;enumeration value="center"/>
     *             &lt;enumeration value="bottom"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "text"
    })
    public static class TableCell {

        protected PageElementType text;
        @XmlAttribute(name = "topPos", required = true)
        protected BigInteger topPos;
        @XmlAttribute(name = "bottomPos", required = true)
        protected BigInteger bottomPos;
        @XmlAttribute(name = "leftPos", required = true)
        protected BigInteger leftPos;
        @XmlAttribute(name = "rightPos", required = true)
        protected BigInteger rightPos;
        @XmlAttribute(name = "VerticalAlignment", required = true)
        protected String verticalAlignment;

        /**
         * Ruft den Wert der text-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link PageElementType }
         *     
         */
        public PageElementType getText() {
            return text;
        }

        /**
         * Legt den Wert der text-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link PageElementType }
         *     
         */
        public void setText(PageElementType value) {
            this.text = value;
        }

        /**
         * Ruft den Wert der topPos-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTopPos() {
            return topPos;
        }

        /**
         * Legt den Wert der topPos-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTopPos(BigInteger value) {
            this.topPos = value;
        }

        /**
         * Ruft den Wert der bottomPos-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBottomPos() {
            return bottomPos;
        }

        /**
         * Legt den Wert der bottomPos-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBottomPos(BigInteger value) {
            this.bottomPos = value;
        }

        /**
         * Ruft den Wert der leftPos-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLeftPos() {
            return leftPos;
        }

        /**
         * Legt den Wert der leftPos-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLeftPos(BigInteger value) {
            this.leftPos = value;
        }

        /**
         * Ruft den Wert der rightPos-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRightPos() {
            return rightPos;
        }

        /**
         * Legt den Wert der rightPos-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRightPos(BigInteger value) {
            this.rightPos = value;
        }

        /**
         * Ruft den Wert der verticalAlignment-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVerticalAlignment() {
            return verticalAlignment;
        }

        /**
         * Legt den Wert der verticalAlignment-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVerticalAlignment(String value) {
            this.verticalAlignment = value;
        }

    }

}
