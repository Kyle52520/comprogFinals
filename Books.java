
package libmansys;

import java.util.Scanner;
import java.util.*;

public class Books {
    public static String stored[][] = new String[10][3];
    public static String[][] books = Books.stored;
    public static ArrayList<Books>bookList = new ArrayList<Books>();
    String book,writer,date;

    public Books(String book,String writer,String date){
            this.book=book;
            this.writer=writer;
            this.date=date;

        }
    // DO NOT USE STATIC METHOD IF YOU DONT NEED IT IN THE LIST OF COMMANDS
    public static String list() {
        String[][] books = Books.stored;
        int newI=1;
        for (Books book : bookList) { 
            
                System.out.println("\n===== BOOK ID: " + newI + " =======");
                newI++;
                System.out.println("Name: " + book.book);
                System.out.println("Author: " + book.writer);
                System.out.println("Date: " + book.date);
                
            
            }
        if(bookList.size()==0){
            System.out.println("\nNO BOOKS HAVE BEEN ADDED YET");
               
        
        }

     

        // System.out.println(Arrays.deepToString(books));


        return "";
    }

    public static String set() {
        Scanner inputs = new Scanner(System.in);
        

        
                        System.out.println("\nPlease enter the book title:");
                        String title = inputs.nextLine();
                        
                  
                        System.out.println("\nPlease enter the book author:");
                        String author = inputs.nextLine();
                        
               
                        System.out.println("\nPlease enter the date:");
                        String date = inputs.nextLine();
                        
                        Books newBook = new Books(title,author,date);
                        bookList.add(newBook);
                    
             
                
            
           
            System.out.println();
        

        return "";
    }
    
    public static String get() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nPlease enter the book title:");
        String get = input.nextLine();
        
        for (Books book : bookList) {
            if(book.book.equals(get)){
                bookList.remove(book);
                System.out.println("\nUser has taken the book : "+ get);
            
            }
        }

        
         

        return "";
    }
}
