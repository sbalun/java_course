package chapter11b;

public class Customer {
    public static void main(String[] args) {
        Product book = new Book();
        book.setPrice(9.99);
        book.setName("War and Peace");
        System.out.println(book.getName());
        System.out.println(book.getPrice());
    }
}
