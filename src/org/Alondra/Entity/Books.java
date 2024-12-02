package org.Alondra.Entity;

public class Books {

    private String title;

    private String autor;

    private int numPages;

    public Books(String title, String autor, int numPages) {
        this.title = title;
        this.autor = autor;
        this.numPages = numPages;
    }

    public void showInformation() {
        System.out.println("Title: " + title);
        System.out.println("Autor: " + autor);
        System.out.println("Pages: " + numPages);
    }

    public boolean isLong() {
        return numPages > 300;
    }

    }
