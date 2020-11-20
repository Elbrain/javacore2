package lesson3;

public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add("Ivanov","21313 ");
        book.add("Smirnov","2132122");
        book.add("Sidorov","21313");
        book.add("Mironov","343332");
        book.add("Sidorov", "2343");
        book.get("Sidorov");
        System.out.println(book.toString());
    }
}
