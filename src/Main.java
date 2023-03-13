public class Main {
    public static void main(String[] args) {
        Author vadim = new Author("Vadim", "Poldolin");
        Book stalker = new Book("Stalker", 2007, vadim);
        System.out.println(stalker);
        System.out.println(vadim);
        stalker.setPublishingYear(2009);
        System.out.println("Повторное переиздание - " + stalker.getPublishingYear());

        System.out.println();
        Author valery = new Author("Valery", "Zavolsky");
        Book harryPotter = new Book("Harry Potter", 2000,valery);
        System.out.println(harryPotter);
        System.out.println(valery);


        System.out.println();


        System.out.println("Имя автора - " + vadim.getAuthorName());
        System.out.println("Фамилия автора - " + vadim.getAuthorSurname());
        System.out.println();
        System.out.println("Имя автора - " + valery.getAuthorName());
        System.out.println("Фамилия автора - " + valery.getAuthorSurname());

    }
}