package com.example.library_spring_h2;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity


public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private  long id;
    @Column(name = "Nazwa ksiazki")
    private String bookName;
    @Column(name = "Autor")
    private String author;
    @Column(name = "Ilosc stron")
    private int numberOfPages;
    @Column(name = "Kategoria")
    private String category;

    public long getId() {
        return id;
    }

    public void setId(long number) {
        this.id = number;
    }

    private int isbn;
    @Column(name = "Imie")
    private String firstName;
    @Column(name = "Nazwisko")
    private String lastName;
    @Column(name = "Seria i nr dokumentu")
    private String documentNumber;


    public LocalDate getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(LocalDate dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }
    @Column(name = "Data zwrotu")

    private LocalDate dateOfReturn;

    public Library() {
    }




    public Library(String bookName, String author, int numberOfPages, String category, int isbn) {
        this.bookName = bookName;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.category = category;
        this.isbn = isbn;

    }




    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String id) {
        this.documentNumber = id;
    }

    @Override
    public String toString() {
        return
                "  Tytul: " + bookName +
                "  Autor: " + author +
                "  Ilosc stron: " + numberOfPages +
                "  kategoria: " + category +
                "  ISBN: "+ isbn +
                "  Imie: "+ firstName +
                "  Nazwisko: " + lastName +
                "  Seria i nr. dokumentu tozsamosci: " + documentNumber ;

    }
}
