
package book;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the book package. 
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

    private final static QName _Bookstore_QNAME = new QName("", "bookstore");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: book
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoBookStore }
     * 
     */
    public TipoBookStore createTipoBookStore() {
        return new TipoBookStore();
    }

    /**
     * Create an instance of {@link TipoTitle }
     * 
     */
    public TipoTitle createTipoTitle() {
        return new TipoTitle();
    }

    /**
     * Create an instance of {@link TipoBook }
     * 
     */
    public TipoBook createTipoBook() {
        return new TipoBook();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoBookStore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "bookstore")
    public JAXBElement<TipoBookStore> createBookstore(TipoBookStore value) {
        return new JAXBElement<TipoBookStore>(_Bookstore_QNAME, TipoBookStore.class, null, value);
    }

}
