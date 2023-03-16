import java.util.Objects;

public class Author {
    private   String authorName;
    private String authorSurname;

    public Author (String name, String surname){
        this.authorName=name;
        this.authorSurname=surname;
    }
    public String getAuthorName(){
        return this.authorName;
    }
    public String getAuthorSurname(){
        return this.authorSurname;
    }
    public String toString(){
        return "Имя " + this.authorName + " Фамилия " + this.authorSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorSurname, author.authorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);
    }
}
