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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CharParamsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CharParamsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="charRecVariants" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="charRecVariant" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}CharRecognitionVariant" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="l" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="t" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="r" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="b" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="suspicious" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="proofed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="wordStart" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="wordFromDictionary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="wordNormal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="wordNumeric" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="wordIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="charConfidence" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="serifProbability" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="wordPenalty" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="meanStrokeWidth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="characterHeight" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="hasUncertainHeight" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="baseLine" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharParamsType", propOrder = {
    "content"
})
public class CharParamsType {

    @XmlElementRef(name = "charRecVariants", namespace = "http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml", type = JAXBElement.class, required = false)
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "l", required = true)
    protected BigInteger l;
    @XmlAttribute(name = "t", required = true)
    protected BigInteger t;
    @XmlAttribute(name = "r", required = true)
    protected BigInteger r;
    @XmlAttribute(name = "b", required = true)
    protected BigInteger b;
    @XmlAttribute(name = "suspicious")
    protected Boolean suspicious;
    @XmlAttribute(name = "proofed")
    protected Boolean proofed;
    @XmlAttribute(name = "wordStart")
    protected Boolean wordStart;
    @XmlAttribute(name = "wordFromDictionary")
    protected Boolean wordFromDictionary;
    @XmlAttribute(name = "wordNormal")
    protected Boolean wordNormal;
    @XmlAttribute(name = "wordNumeric")
    protected Boolean wordNumeric;
    @XmlAttribute(name = "wordIdentifier")
    protected Boolean wordIdentifier;
    @XmlAttribute(name = "charConfidence")
    protected BigInteger charConfidence;
    @XmlAttribute(name = "serifProbability")
    protected BigInteger serifProbability;
    @XmlAttribute(name = "wordPenalty")
    protected BigInteger wordPenalty;
    @XmlAttribute(name = "meanStrokeWidth")
    protected BigInteger meanStrokeWidth;
    @XmlAttribute(name = "characterHeight")
    protected BigInteger characterHeight;
    @XmlAttribute(name = "hasUncertainHeight")
    protected Boolean hasUncertainHeight;
    @XmlAttribute(name = "baseLine")
    protected BigInteger baseLine;

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
     * {@link JAXBElement }{@code <}{@link CharParamsType.CharRecVariants }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Ruft den Wert der l-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getL() {
        return l;
    }

    /**
     * Legt den Wert der l-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setL(BigInteger value) {
        this.l = value;
    }

    /**
     * Ruft den Wert der t-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getT() {
        return t;
    }

    /**
     * Legt den Wert der t-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setT(BigInteger value) {
        this.t = value;
    }

    /**
     * Ruft den Wert der r-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getR() {
        return r;
    }

    /**
     * Legt den Wert der r-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setR(BigInteger value) {
        this.r = value;
    }

    /**
     * Ruft den Wert der b-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getB() {
        return b;
    }

    /**
     * Legt den Wert der b-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setB(BigInteger value) {
        this.b = value;
    }

    /**
     * Ruft den Wert der suspicious-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSuspicious() {
        if (suspicious == null) {
            return false;
        } else {
            return suspicious;
        }
    }

    /**
     * Legt den Wert der suspicious-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuspicious(Boolean value) {
        this.suspicious = value;
    }

    /**
     * Ruft den Wert der proofed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProofed() {
        if (proofed == null) {
            return false;
        } else {
            return proofed;
        }
    }

    /**
     * Legt den Wert der proofed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProofed(Boolean value) {
        this.proofed = value;
    }

    /**
     * Ruft den Wert der wordStart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWordStart() {
        return wordStart;
    }

    /**
     * Legt den Wert der wordStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWordStart(Boolean value) {
        this.wordStart = value;
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
     * Ruft den Wert der charConfidence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCharConfidence() {
        return charConfidence;
    }

    /**
     * Legt den Wert der charConfidence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCharConfidence(BigInteger value) {
        this.charConfidence = value;
    }

    /**
     * Ruft den Wert der serifProbability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSerifProbability() {
        return serifProbability;
    }

    /**
     * Legt den Wert der serifProbability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSerifProbability(BigInteger value) {
        this.serifProbability = value;
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
     * Ruft den Wert der characterHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCharacterHeight() {
        return characterHeight;
    }

    /**
     * Legt den Wert der characterHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCharacterHeight(BigInteger value) {
        this.characterHeight = value;
    }

    /**
     * Ruft den Wert der hasUncertainHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasUncertainHeight() {
        return hasUncertainHeight;
    }

    /**
     * Legt den Wert der hasUncertainHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasUncertainHeight(Boolean value) {
        this.hasUncertainHeight = value;
    }

    /**
     * Ruft den Wert der baseLine-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBaseLine() {
        return baseLine;
    }

    /**
     * Legt den Wert der baseLine-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBaseLine(BigInteger value) {
        this.baseLine = value;
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
     *         &lt;element name="charRecVariant" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}CharRecognitionVariant" maxOccurs="unbounded" minOccurs="0"/>
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
        "charRecVariant"
    })
    public static class CharRecVariants {

        protected List<CharRecognitionVariant> charRecVariant;

        /**
         * Gets the value of the charRecVariant property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the charRecVariant property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCharRecVariant().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CharRecognitionVariant }
         * 
         * 
         */
        public List<CharRecognitionVariant> getCharRecVariant() {
            if (charRecVariant == null) {
                charRecVariant = new ArrayList<CharRecognitionVariant>();
            }
            return this.charRecVariant;
        }

    }

}
