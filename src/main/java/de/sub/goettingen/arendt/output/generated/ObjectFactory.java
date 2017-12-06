//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.11.14 um 11:36:43 AM CET 
//


package de.sub.goettingen.arendt.output.generated;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.sub.goettingen.arendt.output.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Title_QNAME = new QName("http://www.tei-c.org/ns/1.0", "title");
    private final static QName _Extent_QNAME = new QName("http://www.tei-c.org/ns/1.0", "extent");
    private final static QName _Date_QNAME = new QName("http://www.tei-c.org/ns/1.0", "date");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.sub.goettingen.arendt.output.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hi }
     * 
     */
    public Hi createHi() {
        return new Hi();
    }

    /**
     * Create an instance of {@link Unclear }
     * 
     */
    public Unclear createUnclear() {
        return new Unclear();
    }

    /**
     * Create an instance of {@link Language }
     * 
     */
    public Language createLanguage() {
        return new Language();
    }

    /**
     * Create an instance of {@link FileDesc }
     * 
     */
    public FileDesc createFileDesc() {
        return new FileDesc();
    }

    /**
     * Create an instance of {@link TitleStmt }
     * 
     */
    public TitleStmt createTitleStmt() {
        return new TitleStmt();
    }

    /**
     * Create an instance of {@link EditionStmt }
     * 
     */
    public EditionStmt createEditionStmt() {
        return new EditionStmt();
    }

    /**
     * Create an instance of {@link P }
     * 
     */
    public P createP() {
        return new P();
    }

    /**
     * Create an instance of {@link Foreign }
     * 
     */
    public Foreign createForeign() {
        return new Foreign();
    }

    /**
     * Create an instance of {@link PublicationStmt }
     * 
     */
    public PublicationStmt createPublicationStmt() {
        return new PublicationStmt();
    }

    /**
     * Create an instance of {@link SourceDesc }
     * 
     */
    public SourceDesc createSourceDesc() {
        return new SourceDesc();
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link Ab }
     * 
     */
    public Ab createAb() {
        return new Ab();
    }

    /**
     * Create an instance of {@link Pb }
     * 
     */
    public Pb createPb() {
        return new Pb();
    }

    /**
     * Create an instance of {@link RefsDecl }
     * 
     */
    public RefsDecl createRefsDecl() {
        return new RefsDecl();
    }

    /**
     * Create an instance of {@link ProfileDesc }
     * 
     */
    public ProfileDesc createProfileDesc() {
        return new ProfileDesc();
    }

    /**
     * Create an instance of {@link Creation }
     * 
     */
    public Creation createCreation() {
        return new Creation();
    }

    /**
     * Create an instance of {@link LangUsage }
     * 
     */
    public LangUsage createLangUsage() {
        return new LangUsage();
    }

    /**
     * Create an instance of {@link EncodingDesc }
     * 
     */
    public EncodingDesc createEncodingDesc() {
        return new EncodingDesc();
    }

    /**
     * Create an instance of {@link EditorialDecl }
     * 
     */
    public EditorialDecl createEditorialDecl() {
        return new EditorialDecl();
    }

    /**
     * Create an instance of {@link ProjectDesc }
     * 
     */
    public ProjectDesc createProjectDesc() {
        return new ProjectDesc();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link TeiHeader }
     * 
     */
    public TeiHeader createTeiHeader() {
        return new TeiHeader();
    }

    /**
     * Create an instance of {@link TEI }
     * 
     */
    public TEI createTEI() {
        return new TEI();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tei-c.org/ns/1.0", name = "title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tei-c.org/ns/1.0", name = "extent")
    public JAXBElement<BigInteger> createExtent(BigInteger value) {
        return new JAXBElement<BigInteger>(_Extent_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tei-c.org/ns/1.0", name = "date")
    public JAXBElement<String> createDate(String value) {
        return new JAXBElement<String>(_Date_QNAME, String.class, null, value);
    }

}
