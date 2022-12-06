/**
 * "Library" class definition
 *
 * Alumno: Pablo Gonzalez Troyano
 * Grado en Ciencia, Gestion e Ingenieria de Servicios (Semipresencial)
 * 
 */

public class Library {
    
    String address;
    static String openninghours = "9 AM to 5 PM daily";
    int numberbooks = 0;
    Book[] books = new Book[100];
    
    public Library(String LibraryAddress){
        this.openninghours = openninghours; 
        address = LibraryAddress;
        Book[] books = new Book[100];
    };
    
    static void printOpeningHours(){
        System.out.println(openninghours);
    };
    
    public String printAddress(){
        System.out.println(address);
        return address;
    };
    
    public int getTotalBooks(){
        return numberbooks;
    };
    
    public void addBook(Book book){
        this.books[numberbooks] = book;
        numberbooks++;
        //System.out.println(numberbooks);
    };
    
    public void borrowBook(String bookTitle){
        boolean found = false;
        //System.out.println(bookTitle);
        //System.out.println(this.books[0].title);
        for(int i = 0; i < this.numberbooks; i++){
            // System.out.println(this.books[i].title);
             if (bookTitle.equals(this.books[i].title)){
                found = true;
                //System.out.println(this.books[i].title);
                if(!this.books[i].isBorrowed()){ // Si NO esta lo permito
                    this.books[i].borrowed();
                } else {
                    System.out.println("   ERROR: El libro " + bookTitle + " ya se encuentra bajo prestamo en " + this.address);
                }
                break;
             }
        };
        if(!found){
            System.out.println("   ERROR: El libro solicitado (" + bookTitle + ") no se encuentra en la biblioteca "+ this.address);
        }
    };
    
    public void printAvailableBooks(){
        boolean found = false;
        System.out.print("\nLista de libros disponibles en "+ this.address + ":\n");
        for(int i = 0; i < this.numberbooks; i++){
            if (!this.books[i].isBorrowed()){
                found = true;
               System.out.println((i+1) + ". " + this.books[i].title);
            };
        };
        if (!found){
            System.out.println("   INFO: No books available in catalog of " + this.address + " Library.");
        };
    };
    
    public void printBorrowedBooks(){
        boolean found = false;
        System.out.print("\nLista de libros bajo prestamo en "+ this.address + ":\n");
        for(int i = 0; i < this.numberbooks; i++){
            if (this.books[i].isBorrowed()){
                found = true;
                System.out.print((i+1) + ". " + this.books[i].title);
            };
        };
        if (!found){
            System.out.println("   INFO: No books borrowed from catalog of " + this.address + " Library.");
        };
    };

    public void returnBook(String bookTitle){
        boolean found = false;
        for(int i = 0; i < this.numberbooks; i++){
            // System.out.println(this.books[i].title);
             if (bookTitle.equals(this.books[i].title)){
                found = true;
                //System.out.println(this.books[i].title);
                if(this.books[i].isBorrowed()){ // Si SI esta lo permito
                    this.books[i].returned();
                } else {
                    System.out.println("   ERROR: El libro " + bookTitle + " no se encuentra bajo prestamo en " + this.address);
                }
                break;
             }
        };
        if(!found){
            System.out.println("   ERROR: El libro solicitado (" + bookTitle + ") no se encuentra en la biblioteca "+ this.address);
        }
    };
}