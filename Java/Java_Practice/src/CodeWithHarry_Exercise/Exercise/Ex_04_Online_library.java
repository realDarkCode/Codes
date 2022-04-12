
/**
 * You have to implement a library using Java Class "Library"
 * 
 * Methods: addBook, issueBook, returnBook, showAvailableBooks
 * Properties: Array to store the available books,
 * Array to store the issued books
 */

class Library {
    private String[] bookList;
    private String[][] issuedBookList;
    private int noOfBooks, noOfIssuedBook;

    Library() {
        this.bookList = new String[100];
        this.issuedBookList = new String[100][2];
        System.out.println("Your library has been created, you can have 100 books in your library");
    }

    Library(int bookSize) {
        // checking is bookSize is a valid size or not
        if (bookSize < 0 || bookSize > Integer.MAX_VALUE) {
            // if book size is invalid then inform the user and create a library with 100 of
            // books
            System.out.println("you can't have that many books in you library :out-of-range:");

            bookSize = 100;
        }
        this.bookList = new String[bookSize];
        this.issuedBookList = new String[bookSize][2];
        System.out.println("Your library has been created, you can have " + bookSize + " books in your library");

    }

    // add book to the book list, take book name as argument
    void addBook(String bookName) {

        // checking is there already any book with same name
        if (isThereThisBook(bookName)) {
            System.out.println("You already have this book named: " + bookName + " in your library");
            return;
        }

        // adding the book to book list
        this.bookList[this.noOfBooks] = bookName;
        increaseNoOfBooks();
        System.out.println("book: '" + bookName + "' is added to your library");
    }

    // issue book to real humans, take book name and whom to issue as argument
    void issueBook(String bookName, String issuedTo) {
        // checking is the book present in library of not
        if (!isThereThisBook(bookName)) {
            // if the book is not present in library print the error message
            System.out.println("Book named " + bookName + " is not added yet to to library");
        }

        // check is that book has been already issued to somebody else

        if (isBookIssued(bookName)) {
            // if the book is already issued to somebody, print error text and issued person
            // name
            System.out.println("error: The book '" + bookName + "' has already issued to someone");
            return;
        }

        // issuing the book
        this.issuedBookList[this.noOfIssuedBook][0] = bookName; // book name
        this.issuedBookList[this.noOfIssuedBook][1] = issuedTo; // issued to
        increaseNoOfIssuedBooks();
        System.out.println("booK : '" + bookName + "' is issued to '" + issuedTo + "'");

    }

    // return a book to the library;
    void returnBook(String bookName) {
        boolean isIssuedToSomeone = false;
        // checking is the book present in library of not
        if (!isThereThisBook(bookName)) {
            // if the book is not present in library print the error message
            System.out.println("Book named " + bookName + " is not added yet to to library");
            return;
        }

        // check is that book is issued to somebody or not
        for (int index = 0; index < this.issuedBookList.length; index++) {
            if (this.issuedBookList[index][0].toLowerCase().equals(bookName)) {
                isIssuedToSomeone = true;
                // returning the book
                System.out.println(
                        "Returning book: '" + bookName + "' was issued to '" + this.issuedBookList[index][1] + "'");
                // removing book from issued list
                this.issuedBookList[index][0] = null;
                this.issuedBookList[index][1] = null;
                decreaseNoOfIssuedBooks();
                break;
            }
        }

        if (!isIssuedToSomeone) {
            System.out.println("The book is not issued to anyone yet.");
        }

    }

    // print the book list which is not issued to anyone
    void showAvailableBooks() {
        String[] availableBookList = this.bookList.clone();
        for (int index = 0; index < this.issuedBookList.length; index++) {
            if (this.bookList[index] != null && isBookIssued(this.bookList[index])) {
                availableBookList[index] = null;
            }
        }
        System.out.println("Available book at this moment are:");
        for (String book : availableBookList) {
            if (book != null) {
                System.out.println("* '" + book + "'");
            }
        }
    }

    // setters
    private void increaseNoOfBooks() {
        this.noOfBooks++;
    }

    private void increaseNoOfIssuedBooks() {
        this.noOfIssuedBook++;
    }

    private void decreaseNoOfIssuedBooks() {
        this.noOfIssuedBook--;
    }

    // private method

    // search though library book list to find is there any book in library with
    // given book name
    private boolean isThereThisBook(String bookName) {
        for (String book : this.bookList) {
            if (book != null && book.toLowerCase().equals(bookName.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    private boolean isBookIssued(String bookName) {
        for (String[] book : this.issuedBookList) {
            if (book[0] != null && book[0].toLowerCase().equals(bookName.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Ex_04_Online_library
 */
public class Ex_04_Online_library {

    public static void main(String[] args) {
        Library awesomeLibrary = new Library();
        awesomeLibrary.addBook("Full stack Web Development");
        awesomeLibrary.addBook("The power of your subconscious mind");
        awesomeLibrary.addBook("try not to learn javascript");
        awesomeLibrary.addBook("Himu");
        awesomeLibrary.showAvailableBooks();
        awesomeLibrary.issueBook("Himu", "someone wants to be cool");
        awesomeLibrary.showAvailableBooks();
        awesomeLibrary.issueBook("Himu", "random romantic Cat");
        awesomeLibrary.returnBook("himu");
        awesomeLibrary.issueBook("Himu", "Savage Tom");
    }
}