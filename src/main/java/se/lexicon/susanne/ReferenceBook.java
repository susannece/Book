package se.lexicon.susanne;

public class ReferenceBook extends Book {


    public ReferenceBook(String title, String author, int year) {
        super(title, author, year, Category.NOT_LOANABLE);

    }

}

