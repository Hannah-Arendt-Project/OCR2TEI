//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.11.09 um 08:08:26 AM CET 
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
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}editorialDecl"/>
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}projectDesc"/>
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}refsDecl"/>
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
    "editorialDecl",
    "projectDesc",
    "refsDecl"
})
@XmlRootElement(name = "encodingDesc")
public class EncodingDesc {

    @XmlElement(required = true)
    protected EditorialDecl editorialDecl;
    @XmlElement(required = true)
    protected ProjectDesc projectDesc;
    @XmlElement(required = true)
    protected RefsDecl refsDecl;

    /**
     * Ruft den Wert der editorialDecl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EditorialDecl }
     *     
     */
    public EditorialDecl getEditorialDecl() {
        return editorialDecl;
    }

    /**
     * Legt den Wert der editorialDecl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EditorialDecl }
     *     
     */
    public void setEditorialDecl(EditorialDecl value) {
        this.editorialDecl = value;
    }

    /**
     * Ruft den Wert der projectDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProjectDesc }
     *     
     */
    public ProjectDesc getProjectDesc() {
        return projectDesc;
    }

    /**
     * Legt den Wert der projectDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectDesc }
     *     
     */
    public void setProjectDesc(ProjectDesc value) {
        this.projectDesc = value;
    }

    /**
     * Ruft den Wert der refsDecl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RefsDecl }
     *     
     */
    public RefsDecl getRefsDecl() {
        return refsDecl;
    }

    /**
     * Legt den Wert der refsDecl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RefsDecl }
     *     
     */
    public void setRefsDecl(RefsDecl value) {
        this.refsDecl = value;
    }

}
