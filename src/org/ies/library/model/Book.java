package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Book {

    private String isbn;
    private  String title;
    private int year;
    private Autor[] autores;


    public Book(String isbn, String title, int year, Autor[] autores) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.autores = autores;
    }

    //METODOS

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return year;
    }

    public void setAge(int age) {
        this.year = year;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(isbn, book.isbn) && Objects.equals(title, book.title) && Objects.deepEquals(autores, book.autores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, year, Arrays.hashCode(autores));
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", age=" + year +
                ", autores=" + Arrays.toString(autores) +
                '}';
    }
}
