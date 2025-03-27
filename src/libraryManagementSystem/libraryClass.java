package libraryManagementSystem;

import java.util.Scanner;
public class libraryClass {

	public static void main(String[] args) {
		 libraryManager library = new libraryManager();
	     Scanner scanner = new Scanner(System.in);
	     int choice;

	     do {
	         System.out.println("\n1. Add Book\n2. View All Books\n3. Search Book by ID\n4. Search Book by Title\n5. Update Book Details\n6. Delete Book\n7. Exit");
	         System.out.print("Enter your choice: ");
	         choice = scanner.nextInt();
	         scanner.nextLine();  // Consume newline

	         switch (choice) {
	             case 1:
	                 System.out.print("Enter Book ID: ");
	                 int id = scanner.nextInt();
	                 scanner.nextLine();
	                 System.out.print("Enter Title: ");
	                 String title = scanner.nextLine();
	                 System.out.print("Enter Author: ");
	                 String author = scanner.nextLine();
	                 System.out.print("Enter Availability Status (Available/Checked Out): ");
	                 String status = scanner.nextLine();
	                 library.addBook(id, title, author, status);
	                 break;
	             case 2:
	                 library.viewBooks();
	                 break;
	             case 3:
	                 System.out.print("Enter Book ID: ");
	                 int searchId = scanner.nextInt();
	                 library.searchBook(searchId);
	                 break;
	             case 4:
	                 System.out.print("Enter Book Title: ");
	                 String searchTitle = scanner.nextLine();
	                 library.searchBook(searchTitle);
	                 break;
	             case 5:
	                 System.out.print("Enter Book ID: ");
	                 int updateId = scanner.nextInt();
	                 scanner.nextLine();
	                 System.out.print("Enter New Title: ");
	                 String newTitle = scanner.nextLine();
	                 System.out.print("Enter New Author: ");
	                 String newAuthor = scanner.nextLine();
	                 System.out.print("Enter New Availability Status (Available/Checked Out): ");
	                 String newStatus = scanner.nextLine();
	                 library.updateBook(updateId, newTitle, newAuthor, newStatus);
	                 break;
	             case 6:
	                 System.out.print("Enter Book ID to delete: ");
	                 int deleteId = scanner.nextInt();
	                 library.deleteBook(deleteId);
	                 break;
	             case 7:
	                 System.out.println("Exiting...");
	                 break;
	             default:
	                 System.out.println("Invalid choice! Please try again.");
	         }
	     } while (choice != 7);
	     scanner.close();
	 }
}




