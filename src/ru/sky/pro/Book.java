package ru.sky.pro;

public class Book {
    Author author;
    String nameBook;
    int yearBook;


    public Book(Author nameAuthor, String nameBook, int yearBook) {
        this.author = author;
        this.nameBook = nameBook;
        this.yearBook = yearBook;

    }

    public Author getAuthor() {
        return author;
    }

    public String getNameBook() {
        return this.nameBook;
    }



    public int getYearBook() {
        return this.yearBook;
    }

    public void setYearBook (int yearBook) {
        this.yearBook = yearBook;
    }


    @Override
    public String toString() {
        return "Книга{" +
                "автор: " + author +
                ", название: " + nameBook + '\'' +
                ", год издания: " + yearBook +
                '}';
    }


}
