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
 *         &lt;element name="documentData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="paragraphStyles" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="paragraphStyle" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}ParagraphStyleType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="sections" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="section" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}SectionType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="page" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="block" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}BlockType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="pageSection" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}PageSectionType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="pageStream" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}PageStreamType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="resolution" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="originalCoords" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="producer" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pagesCount" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="mainLanguage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="languages" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentData",
    "page"
})
@XmlRootElement(name = "document")
public class Document {

    protected Document.DocumentData documentData;
    protected List<Document.Page> page;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "producer", required = true)
    protected String producer;
    @XmlAttribute(name = "pagesCount")
    protected BigInteger pagesCount;
    @XmlAttribute(name = "mainLanguage")
    protected String mainLanguage;
    @XmlAttribute(name = "languages")
    protected String languages;

    /**
     * Ruft den Wert der documentData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Document.DocumentData }
     *     
     */
    public Document.DocumentData getDocumentData() {
        return documentData;
    }

    /**
     * Legt den Wert der documentData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.DocumentData }
     *     
     */
    public void setDocumentData(Document.DocumentData value) {
        this.documentData = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the page property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document.Page }
     * 
     * 
     */
    public List<Document.Page> getPage() {
        if (page == null) {
            page = new ArrayList<Document.Page>();
        }
        return this.page;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der producer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducer() {
        return producer;
    }

    /**
     * Legt den Wert der producer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducer(String value) {
        this.producer = value;
    }

    /**
     * Ruft den Wert der pagesCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPagesCount() {
        if (pagesCount == null) {
            return new BigInteger("1");
        } else {
            return pagesCount;
        }
    }

    /**
     * Legt den Wert der pagesCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPagesCount(BigInteger value) {
        this.pagesCount = value;
    }

    /**
     * Ruft den Wert der mainLanguage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainLanguage() {
        return mainLanguage;
    }

    /**
     * Legt den Wert der mainLanguage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainLanguage(String value) {
        this.mainLanguage = value;
    }

    /**
     * Ruft den Wert der languages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguages() {
        return languages;
    }

    /**
     * Legt den Wert der languages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguages(String value) {
        this.languages = value;
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
     *         &lt;element name="paragraphStyles" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="paragraphStyle" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}ParagraphStyleType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="sections" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="section" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}SectionType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "paragraphStyles",
        "sections"
    })
    public static class DocumentData {

        protected Document.DocumentData.ParagraphStyles paragraphStyles;
        protected Document.DocumentData.Sections sections;

        /**
         * Ruft den Wert der paragraphStyles-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Document.DocumentData.ParagraphStyles }
         *     
         */
        public Document.DocumentData.ParagraphStyles getParagraphStyles() {
            return paragraphStyles;
        }

        /**
         * Legt den Wert der paragraphStyles-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Document.DocumentData.ParagraphStyles }
         *     
         */
        public void setParagraphStyles(Document.DocumentData.ParagraphStyles value) {
            this.paragraphStyles = value;
        }

        /**
         * Ruft den Wert der sections-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Document.DocumentData.Sections }
         *     
         */
        public Document.DocumentData.Sections getSections() {
            return sections;
        }

        /**
         * Legt den Wert der sections-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Document.DocumentData.Sections }
         *     
         */
        public void setSections(Document.DocumentData.Sections value) {
            this.sections = value;
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
         *         &lt;element name="paragraphStyle" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}ParagraphStyleType" maxOccurs="unbounded" minOccurs="0"/>
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
            "paragraphStyle"
        })
        public static class ParagraphStyles {

            protected List<ParagraphStyleType> paragraphStyle;

            /**
             * Gets the value of the paragraphStyle property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the paragraphStyle property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getParagraphStyle().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ParagraphStyleType }
             * 
             * 
             */
            public List<ParagraphStyleType> getParagraphStyle() {
                if (paragraphStyle == null) {
                    paragraphStyle = new ArrayList<ParagraphStyleType>();
                }
                return this.paragraphStyle;
            }

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
         *         &lt;element name="section" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}SectionType" maxOccurs="unbounded" minOccurs="0"/>
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
            "section"
        })
        public static class Sections {

            protected List<SectionType> section;

            /**
             * Gets the value of the section property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the section property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSection().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SectionType }
             * 
             * 
             */
            public List<SectionType> getSection() {
                if (section == null) {
                    section = new ArrayList<SectionType>();
                }
                return this.section;
            }

        }

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
     *         &lt;element name="block" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}BlockType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="pageSection" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}PageSectionType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="pageStream" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}PageStreamType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="resolution" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="originalCoords" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "block",
        "pageSection",
        "pageStream"
    })
    public static class Page {

        protected List<BlockType> block;
        protected List<PageSectionType> pageSection;
        protected List<PageStreamType> pageStream;
        @XmlAttribute(name = "width", required = true)
        protected BigInteger width;
        @XmlAttribute(name = "height", required = true)
        protected BigInteger height;
        @XmlAttribute(name = "resolution", required = true)
        protected BigInteger resolution;
        @XmlAttribute(name = "originalCoords")
        protected Boolean originalCoords;

        /**
         * Gets the value of the block property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the block property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBlock().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BlockType }
         * 
         * 
         */
        public List<BlockType> getBlock() {
            if (block == null) {
                block = new ArrayList<BlockType>();
            }
            return this.block;
        }

        /**
         * Gets the value of the pageSection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pageSection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPageSection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PageSectionType }
         * 
         * 
         */
        public List<PageSectionType> getPageSection() {
            if (pageSection == null) {
                pageSection = new ArrayList<PageSectionType>();
            }
            return this.pageSection;
        }

        /**
         * Gets the value of the pageStream property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pageStream property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPageStream().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PageStreamType }
         * 
         * 
         */
        public List<PageStreamType> getPageStream() {
            if (pageStream == null) {
                pageStream = new ArrayList<PageStreamType>();
            }
            return this.pageStream;
        }

        /**
         * Ruft den Wert der width-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getWidth() {
            return width;
        }

        /**
         * Legt den Wert der width-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setWidth(BigInteger value) {
            this.width = value;
        }

        /**
         * Ruft den Wert der height-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getHeight() {
            return height;
        }

        /**
         * Legt den Wert der height-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setHeight(BigInteger value) {
            this.height = value;
        }

        /**
         * Ruft den Wert der resolution-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getResolution() {
            return resolution;
        }

        /**
         * Legt den Wert der resolution-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setResolution(BigInteger value) {
            this.resolution = value;
        }

        /**
         * Ruft den Wert der originalCoords-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isOriginalCoords() {
            if (originalCoords == null) {
                return false;
            } else {
                return originalCoords;
            }
        }

        /**
         * Legt den Wert der originalCoords-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOriginalCoords(Boolean value) {
            this.originalCoords = value;
        }

    }

}
