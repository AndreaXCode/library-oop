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
