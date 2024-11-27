package org.ies.library.model;

import javax.swing.plaf.PanelUI;
import java.util.Arrays;
import java.util.Objects;

public class Library {

    private String name;
    private Book[] libros;


    public Library(String name, Book[] libros) {
        this.name = name;
        this.libros = libros;
    }

    //MÉTODOS

    //hasAuthor(authorNif): dado un NIF devuelve si hay algún libro de ese autor
    public  Autor hasAuthor(String nif){
        for (Book libro: libros){
            if (libro.getAutores(nif)){

            }
        }

        return ;

    }


    //countBooks(authroNif): dado un NIF devuelve el número de libros del autor
    public int countBooks(String autorNif){
        int count = 0;
        for (Book libro: libros){
            if (libro.hasAutor(autorNif)){
                count++;
            }
        }
        return count;

    }

    //countYearBooks(year): dado un año, devuelve el número de libros de ese año.
    public int countYearBooks(int year){
        int count = 0;
        for (Book libro: libros){
            if (libro.getyear()==year){

                count++;
            }

        }
        return count;
    }


    //findBook(isbn): dado un ISBN, devuelve el libro con ese ISBN. Si no lo encuentra, devuelve null
    public Book findBook(String isbn){
        for (Book libro: libros){
            if (libro.getIsbn().equals(isbn)){

                return libro;
            }

        }
        return null;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getLibros() {
        return libros;
    }

    public void setLibros(Book[] libros) {
        this.libros = libros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(name, library.name) && Objects.deepEquals(libros, library.libros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(libros));
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", libros=" + Arrays.toString(libros) +
                '}';
    }
}
