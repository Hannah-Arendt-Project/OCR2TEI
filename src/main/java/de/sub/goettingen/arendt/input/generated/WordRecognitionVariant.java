//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.11.08 um 11:15:23 AM CET 
//


package de.sub.goettingen.arendt.input.generated;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für WordRecognitionVariant complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WordRecognitionVariant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="variantText">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="charParams" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}CharParamsType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="wordFromDictionary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="wordNormal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="wordNumeric" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="wordIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="wordPenalty" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="meanStrokeWidth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WordRecognitionVariant", propOrder = {
    "variantText"
})
public class WordRecognitionVariant {

    @XmlElement(required = true)
    protected WordRecognitionVariant.VariantText variantText;
    @XmlAttribute(name = "wordFromDictionary")
    protected Boolean wordFromDictionary;
    @XmlAttribute(name = "wordNormal")
    protected Boolean wordNormal;
    @XmlAttribute(name = "wordNumeric")
    protected Boolean wordNumeric;
    @XmlAttribute(name = "wordIdentifier")
    protected Boolean wordIdentifier;
    @XmlAttribute(name = "wordPenalty")
    protected BigInteger wordPenalty;
    @XmlAttribute(name = "meanStrokeWidth")
    protected BigInteger meanStrokeWidth;

    /**
     * Ruft den Wert der variantText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WordRecognitionVariant.VariantText }
     *     
     */
    public WordRecognitionVariant.VariantText getVariantText() {
        return variantText;
    }

    /**
     * Legt den Wert der variantText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WordRecognitionVariant.VariantText }
     *     
     */
    public void setVariantText(WordRecognitionVariant.VariantText value) {
        this.variantText = value;
    }

    /**
     * Ruft den Wert der wordFromDictionary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWordFromDictionary() {
        return wordFromDictionary;
    }

    /**
     * Legt den Wert der wordFromDictionary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWordFromDictionary(Boolean value) {
        this.wordFromDictionary = value;
    }

    /**
     * Ruft den Wert der wordNormal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWordNormal() {
        return wordNormal;
    }

    /**
     * Legt den Wert der wordNormal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWordNormal(Boolean value) {
        this.wordNormal = value;
    }

    /**
     * Ruft den Wert der wordNumeric-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWordNumeric() {
        return wordNumeric;
    }

    /**
     * Legt den Wert der wordNumeric-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWordNumeric(Boolean value) {
        this.wordNumeric = value;
    }

    /**
     * Ruft den Wert der wordIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWordIdentifier() {
        return wordIdentifier;
    }

    /**
     * Legt den Wert der wordIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWordIdentifier(Boolean value) {
        this.wordIdentifier = value;
    }

    /**
     * Ruft den Wert der wordPenalty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWordPenalty() {
        return wordPenalty;
    }

    /**
     * Legt den Wert der wordPenalty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWordPenalty(BigInteger value) {
        this.wordPenalty = value;
    }

    /**
     * Ruft den Wert der meanStrokeWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeanStrokeWidth() {
        return meanStrokeWidth;
    }

    /**
     * Legt den Wert der meanStrokeWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeanStrokeWidth(BigInteger value) {
        this.meanStrokeWidth = value;
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
     *         &lt;element name="charParams" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}CharParamsType" maxOccurs="unbounded" minOccurs="0"/>
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
        "content"
    })
    public static class VariantText {

        @XmlElementRef(name = "charParams", namespace = "http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml", type = JAXBElement.class, required = false)
        @XmlMixed
        protected List<Serializable> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * {@link JAXBElement }{@code <}{@link CharParamsType }{@code >}
         * 
         * 
         */
        public List<Serializable> getContent() {
            if (content == null) {
                content = new ArrayList<Serializable>();
            }
            return this.content;
        }

    }

}
