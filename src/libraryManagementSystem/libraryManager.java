package libraryManagementSystem;
import java.util.HashMap;
import java.util.Map;

public class libraryManager {
	
	private final Map<Integer, Book> bookCatalog = new HashMap<>();

	 public void addBook(int id, String title, String author, String status) {
	     if (bookCatalog.containsKey(id)) {
	         System.out.println("Error: Book ID already exists.");
	         return;
	     }
	     Book book = new Book(id, title, author, status);
	     bookCatalog.put(id, book);
	     System.out.println("Book added successfully!");
	 }

	 public void viewBooks() {
	     if (bookCatalog.isEmpty()) {
	         System.out.println("No books available.");
	     } else {
	         bookCatalog.values().forEach(System.out::println);
	     }
	 }

	 public void searchBook(int id) {
	     if (bookCatalog.containsKey(id)) {
	         System.out.println(bookCatalog.get(id));
	     } else {
	         System.out.println("Book not found.");
	     }
	 }

	 public void searchBook(String title) {
	     boolean found = false;
	     for (Book book : bookCatalog.values()) {
	         if (book.getBook_title().equalsIgnoreCase(title)) {
	             System.out.println(book);
	             found = true;
	         }
	     }
	     if (!found) {
	         System.out.println("Book not found.");
	     }
	 }

	 public void updateBook(int id, String title, String author, String status) {
	     if (bookCatalog.containsKey(id)) {
	         Book book = bookCatalog.get(id);
	         book.setBook_title(title);
	         book.setBook_author(author);
	         book.setBook_availabilityStatus(status);
	         System.out.println("Book details updated successfully.");
	     } else {
	         System.out.println("Book not found.");
	     }
	 }

	 public void deleteBook(int id) {
	     if (bookCatalog.remove(id) != null) {
	         System.out.println("Book deleted successfully.");
	     } else {
	         System.out.println("Book not found.");
	     }
	 }

}




