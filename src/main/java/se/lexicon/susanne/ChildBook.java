package se.lexicon.susanne;

public class ChildBook extends Book implements Loanable{

    public ChildBook(String title, String author, int year) {
        super(title, author, year, Category.CHILD);
    }

    @Override
    public void loan(){
        System.out.println("Child book.");
    }


}
