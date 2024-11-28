package org.ies.library.model;

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

    // hasBook(isbn): dado un ISBN devuelve si el libro existe en la biblioteca OK

    public boolean hasBook(String isbn){

        for (Book book: libros){
            if (book.getIsbn().equals(isbn)){
                return true;
            }
        }
        return false;
    }

    // Esta en Book.java

    public boolean hasAuthor(String nif){

        for (Book book: libros){

            //look authors
            if (book.hasAuthor(nif)){

                return true;
            }

        }

        return false;

    }


    //countBooks(authroNif): dado un NIF devuelve el número de libros del autor

    // dado un nif  --> creo una variable de tipo String llamada nif

    // como quiero devolver un numero creo uan variable llamada count que empieza desde 0.
    // hago un for each, y pongo el array Book y su contenido.
    // Luego pongo un if para que cada vez que el NIF sea de un autor se incremente a count
    // despues cuando termine el bucle se devolverá el número total de libros usando return count;

    public int countBooks(String autorNif){
        int count = 0;
        for (Book libro: libros){
            if (libro.hasAuthor(autorNif)){
                count++;
            }
        }
        return count;

    }



    //countYearBooks(year): dado un año, devuelve el número de libros de ese año.

    // dado un año  --> creo una variable de tipo int llamada year

    // como quiero devolver un numero creo uan variable llamada count que empieza desde 0.
    // hago un for each, y pongo el array Book y su contenido.
    // Luego pongo un if con la condicion de que si el año del libro es igual al que hemos declarado se incremente a count
    // despues cuando termine el bucle se devolverá el número total de libros d eese año usando return count;


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

    // dado un isbn  --> creo una variable de tipo String llamada isbn

    // hago un for each, y pongo el array Book y su contenido.
    // Luego pongo un if con la condicion de que si el isbn introducido es igual que el isbn de algun libro, devuelva ese libro con return libro.
    // despues cuando termine el bucle si no se encuetra ningun libro con ese isbn se devuelve null usando return null.
    
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
