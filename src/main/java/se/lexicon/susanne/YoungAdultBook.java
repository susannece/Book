package se.lexicon.susanne;

public class YoungAdultBook extends Book implements Loanable{


    public YoungAdultBook(String title, String author, int year) {
        super(title, author, year, Category.ADULT);
    }

    @Override
    public void loan() {
        System.out.println("Young adult book.");
    }

}
