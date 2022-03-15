package lesson_07;

public class Book {
    private String ISBN;
    private String title;
    private String authorName;
    private int year;

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }


    public String toString(){
        return getISBN() + " - " + getTitle() + " - " + getAuthorName() + " - " + getYear();
    }
}
