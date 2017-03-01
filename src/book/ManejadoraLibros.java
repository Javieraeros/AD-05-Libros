package book;

import model.Bookstore;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejadoraLibros {
    public Bookstore abrirFicheroBook (File archivoXML){
        JAXBContext contexto;
        Bookstore listaLibros=new Bookstore();
        try {
            contexto = JAXBContext.newInstance(Bookstore.class);
            Unmarshaller u = contexto.createUnmarshaller();
            listaLibros = (Bookstore) u.unmarshal(archivoXML);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return listaLibros;
    }

    /**
     * Mñetodo que añade los libros de origen a destino, sin modificar los de origen
     * @param origen
     * @param destino
     */
    public void aniadeLibros(Bookstore origen,Bookstore destino){
        for (int i = 0; i < origen.getBook().size(); i++) {
            destino.getBook().add(origen.getBook().get(i));
        }
    }

    public void guardarListaFichero(File archivoXML,Bookstore libros){
        JAXBContext contexto;
        try {
            contexto = JAXBContext.newInstance(Bookstore.class);
            Marshaller marshalero = contexto.createMarshaller();
            marshalero.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            StringWriter escribiente = new StringWriter();
            marshalero.marshal(libros, archivoXML);
            // ahora lo marshaleamos a un stream para visualizarlo
            marshalero.marshal(libros, escribiente);
            System.out.println("-----------------");
            System.out.println("Object2XML:");
            System.out.println(escribiente.toString());
            System.out.println("-----------------");
        } catch (JAXBException ex) {
            Logger.getLogger(ManejadoraLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
