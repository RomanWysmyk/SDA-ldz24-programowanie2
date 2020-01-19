package pl.sdaacademy.intermediate.basic.Zadanie8obslugaPlikow;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class Book {
    public Book(String title, String author, Integer yearPublished, Integer numberOfPages, Double price, Genre type) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.type = type;
    }

    String title;
    String author;
    Integer yearPublished;
    Integer numberOfPages;
    Double price;
    Genre type;


    public String getTitle() {
        System.out.println("lol");
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYearPublished() {
        return yearPublished;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public Double getPrice() {
        return price;
    }

    public Genre getType() {
        return type;
    }
}
