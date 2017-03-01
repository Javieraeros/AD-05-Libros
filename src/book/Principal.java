package book;

import model.Bookstore;

import java.io.File;

/**
 * Created by Javi on 01/03/2017.
 */
public class Principal {
    public static void main(String[] args) {
        ManejadoraLibros miMane=new ManejadoraLibros();
        File fichero=new File("src\\book\\Books.xsl");
        File ficheroMas=new File("src\\book\\MoreBooks.xsl");
        File ficheroDestino=new File("src\\book\\AllBooks.xsl");

        Bookstore libros=miMane.abrirFicheroBook(fichero);
        Bookstore masLibros=miMane.abrirFicheroBook(ficheroMas);

        miMane.aniadeLibros(masLibros,libros);

        miMane.guardarListaFichero(ficheroDestino,libros);
    }
}
