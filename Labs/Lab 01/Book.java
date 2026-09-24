class Book{
    private String title;
    private String author;
    private int year;
    
    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return year;
    }

    public boolean equals(Object obj) {
        if (obj == null) {return false;} 
        if (this == obj) {return true;}  // they're the exact same book (same memory location)
        
        if (!(obj instanceof Book)) return false; // Object is not a book
        Book other = (Book) obj;
        
    // if the following are true, then true && true & && true -> true, otherwise false
        return this.title.equals(other.title) && this.author.equals(other.author) && this.year == other.year;
    }
    
    public String getBookInformation(){
        return "Book: " + title + ", Author: " + author + ", Year: " + year;
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Hobbit", "JRR Tolkein", 1937);
        System.out.println(book1.getBookInformation());
    }
}