package se.lexicon.susanne;

public class App 
{

    public static void main( String[] args )
    {
        //A - Instantiate three books, one for each type of book, and store them in an array of type Book.
        ChildBook cBook1 = new ChildBook("Morgon", "Jens", 2008);
        YoungAdultBook yBook1 = new YoungAdultBook("Love", "Lisa", 2020);
        ReferenceBook rBook1 = new ReferenceBook("Natur", "Andersson", 2021);

        Book[] books = {cBook1, yBook1, rBook1};

        // B - Iterate through the array and only print out the books that are instanceof the Loanable interface.
        // (int i = 0; i < books.length; i++) eller (Book book : books)
        for (Book book : books) {
            if (book instanceof Loanable) {
                System.out.println(book);
            }
        }

// (int i = 0; i < books.length; i++) eller (Book book : books)
        // C - Iterate through the array and only print out the book that is not loanable.
        for (Book book : books) {
            if (book.getCategory() == Category.NOT_LOANABLE)
                System.out.println("This book " + book + " is a reference book.");
        }
        //D - Iterate through the array and only print out the book that has the category CHILD.
        for (Book book : books) {
            if (book.getCategory() == Category.CHILD)
                System.out.println("This book " + book + " is a childrens book.");
        }
        //E - Iterate through the array and only print out the book that has the category ADULT.
        for (Book book : books) {
            if (book.getCategory() == Category.ADULT)
                System.out.println("This book " + book + " is an adult book.");
        }

/*  c. Iterate through the array and only print out the book that is not loanable.
    d. Iterate through the array and only print out the book that has the category CHILD.
    e. Iterate through the array and only print out the book that has the category ADULT.
    (int i = 0; i < books.length; i++) eller (Book book : books)
 */
        for (Book book : books) {
            switch (book.getCategory()) {
                case NOT_LOANABLE:
                    System.out.println("Reference book.");
                    break;

                case CHILD:
                    System.out.println("Childrens book.");
                    break;

                case ADULT:
                    System.out.println("Young adult book.");
                    break;

                default:
                    System.out.println("Something is wrong with the category.");
                    break;

            }

        }


    }
}
