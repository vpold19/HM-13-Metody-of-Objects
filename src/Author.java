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
    public boolean equals(Object other){
        if (this.getClass() != other.getClass()){
            return false;
        }
        Author valery = (Author) other;
        return authorName.equals(valery.authorName);
    }
}
