package ru.sky.pro;

public class Author {
    private final String nameAuthor;

    public Author(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }
        public String getNameAuthor() {
        return this.nameAuthor;
    }
    @Override
    public String toString() {
        return "Автор{" +
                "автор: '" + nameAuthor + '\'' +
                '}';

    }
    }
