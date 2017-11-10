//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.11.08 um 11:15:23 AM CET 
//


package de.sub.goettingen.arendt.input.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParagraphAlignment.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParagraphAlignment">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Left"/>
 *     &lt;enumeration value="Center"/>
 *     &lt;enumeration value="Right"/>
 *     &lt;enumeration value="Justified"/>
 *     &lt;enumeration value="CjkJustified"/>
 *     &lt;enumeration value="ThaiJustified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParagraphAlignment")
@XmlEnum
public enum ParagraphAlignment {

    @XmlEnumValue("Left")
    LEFT("Left"),
    @XmlEnumValue("Center")
    CENTER("Center"),
    @XmlEnumValue("Right")
    RIGHT("Right"),
    @XmlEnumValue("Justified")
    JUSTIFIED("Justified"),
    @XmlEnumValue("CjkJustified")
    CJK_JUSTIFIED("CjkJustified"),
    @XmlEnumValue("ThaiJustified")
    THAI_JUSTIFIED("ThaiJustified");
    private final String value;

    ParagraphAlignment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParagraphAlignment fromValue(String v) {
        for (ParagraphAlignment c: ParagraphAlignment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
