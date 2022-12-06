/**
 * "Book" class definition
 *
 * Alumno: Pablo Gonzalez Troyano
 * Grado en Ciencia, Gestion e Ingenieria de Servicios (Semipresencial)
 * 
 */

public class Book {

    String title;
    boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
        title = bookTitle;
    }
   
    // Marks the book as rented
    public void borrowed() {
        borrowed = true;
        System.out.println("   Info: new status of book '" + title + "' is: BORROWED");
    }
   
    // Marks the book as not rented
    public void returned() {
        borrowed = false;
        System.out.println("   Info: new status of book '" + title + "' is: RETURNED");
    }
   
    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        return borrowed;
    }
   
    // Returns the title of the book
    public String getTitle() {
        return title;
    }
    
} 