package se.lexicon.susanne;

public abstract class Book {
    private String title;
    private String author;
    private int year;
    private int pages;
    private Category category;

    public Book(String title, String author, int year, Category category) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = 100;
        this.category = category;
    }

    public Book(String title, String author, int year, int pages, Category category) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.category = category;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
