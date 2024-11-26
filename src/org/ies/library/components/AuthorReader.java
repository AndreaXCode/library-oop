package org.ies.library.components;

import org.ies.library.model.Autor;

import java.util.Scanner;

public class AuthorReader {

    private final Scanner scanner;

    public AuthorReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Autor read(){

        System.out.println("Introduce los datos del autor");

        System.out.println("Introduce el NIF:");
        String nif = scanner.nextLine();


        System.out.println("Introduce el nombre del autor:");
        String name = scanner.nextLine();

        System.out.println("Introduce el apellido del autor:");
        String surname = scanner.nextLine();

        return new Autor(

                nif,
                name,
                surname

        );




    }
}
