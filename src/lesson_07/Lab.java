package lesson_07;

import java.util.HashMap;
import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        boolean isContinuing = true;
        Scanner scanner = new Scanner(System.in);
        int option;
        HashMap<String, Book> bookHashMap = new HashMap<>();

        do{
            System.out.println("-----Menu-------");
            System.out.println("1. Input book");
            System.out.println("2. Find book by ISBN");
            System.out.println("3. Exit!");

            System.out.print("Select an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    Book book = new Book();

                    System.out.print("Input ISBN: ");
                    book.setISBN(scanner.nextLine());
                    System.out.print("Input title: ");
                    book.setTitle(scanner.nextLine());
                    System.out.print("Input author name: ");
                    book.setAuthorName(scanner.nextLine());
                    System.out.print("Input year: ");
                    book.setYear(scanner.nextInt());

                    bookHashMap.put(book.getISBN(), book);

                    break;
                case 2:
                    System.out.print("Enter ISBN of the book you're looking for: ");
                    String enteredISBN = scanner.nextLine();

                    if(bookHashMap.containsKey(enteredISBN)){
                        System.out.println("Book found: " + bookHashMap.get(enteredISBN).toString());
                    }else{
                        System.out.println("Book not found!");
                    }

                    break;
                case 3:
                    isContinuing = false;
                    break;
                default:
                    System.out.println("The option you selected does not exist! Try again!");
            }

        }while(isContinuing);
    }
}
