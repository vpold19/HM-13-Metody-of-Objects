public class Book {
    private String bookName;
    private int publishingYear;
    private Author author;

    public Book (String bookName, int publishingYear, Author author){
        this.bookName=bookName;
        this.publishingYear=publishingYear;
        this.author=author;
    }
    public String getBookName(){
        return this.bookName;
    }
    public int getPublishingYear(){
        return this.publishingYear;
    }
    public Author getAuthor(){
        return this.author;
    }
    public void setPublishingYear(int publishingYear){
        this.publishingYear=publishingYear;
    }
    public String toString(){
        return "Название книги " + this.bookName + " и год выпуска " + this.publishingYear;
    }
    public boolean equals(Object other){
        if (this.getClass() != other.getClass()){
            return false;
        }
        Book harryPotter = (Book) other;
        return bookName.equals(harryPotter.bookName);
    }
}
