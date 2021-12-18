package ru.sky.pro;

public class Main {

        public static void main (String[]args){
        Author pushkin = new Author("Пушкин");
        Author lermontov = new Author("Лермонтов");
                System.out.println(pushkin.toString());

        Book evgenijOnegin = new Book(pushkin,"Евгений Онегин", 1825);
        Book gerojNashegoVremeni = new Book(lermontov,"Герой нашего времени", 1840);

        System.out.println(evgenijOnegin);
        System.out.println(gerojNashegoVremeni);
        
        System.out.println("Изменение года издания");
        evgenijOnegin.setYearBook(1915);
        System.out.println(evgenijOnegin);

        }
    }
