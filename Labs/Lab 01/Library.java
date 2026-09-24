import java.util.ArrayList;
class Library {


     private ArrayList<Book> books;
     private String name;

    public void addBook(Book book) {
       this.books.add(book);
    }
        
    public int getBookCount(Book book){
        int count = 0;
        for(Book currentBook: this.books){
            if(currentBook.equals(book)){
                count++;
            }
        }
        return count;
    }

    public String getLibraryName(){
        return this.name;
    }

    public Library(String name){
        this.name = name;
        this.books = new ArrayList<Book>();
    }
}
