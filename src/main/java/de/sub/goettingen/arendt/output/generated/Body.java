//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.11.14 um 11:36:43 AM CET 
//


package de.sub.goettingen.arendt.output.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}p"/>
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}ab"/>
 *         &lt;element ref="{http://www.tei-c.org/ns/1.0}pb"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pOrAbOrPb"
})
@XmlRootElement(name = "body")
public class Body {

    @XmlElements({
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "ab", type = Ab.class),
        @XmlElement(name = "pb", type = Pb.class)
    })
    protected List<Object> pOrAbOrPb;

    /**
     * Gets the value of the pOrAbOrPb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pOrAbOrPb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOrAbOrPb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P }
     * {@link Ab }
     * {@link Pb }
     * 
     * 
     */
    public List<Object> getPOrAbOrPb() {
        if (pOrAbOrPb == null) {
            pOrAbOrPb = new ArrayList<Object>();
        }
        return this.pOrAbOrPb;
    }

}
