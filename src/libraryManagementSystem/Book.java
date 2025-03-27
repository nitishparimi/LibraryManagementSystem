package libraryManagementSystem;

public class Book {
	private int bookId;
	private String book_title;
	private String book_author;
	private String book_availabilityStatus;

	public Book(int bookId, String title, String author, String availabilityStatus) {
	   this.bookId = bookId;
	   this.book_title = title;
	   this.book_author = author;
	   this.book_availabilityStatus = availabilityStatus;
	}

	

	@Override
	public String toString() {
	   return "Book ID: " + bookId + ", Title: " + book_title + ", Author: " + book_author + ", Status: " + book_availabilityStatus;
	}



	public int getBookId() {
		return bookId;
	}



	public void setBookId(int bookId) {
		this.bookId = bookId;
	}



	public String getBook_title() {
		return book_title;
	}



	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}



	public String getBook_author() {
		return book_author;
	}



	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}



	public String getBook_availabilityStatus() {
		return book_availabilityStatus;
	}



	public void setBook_availabilityStatus(String book_availabilityStatus) {
		this.book_availabilityStatus = book_availabilityStatus;
	}

}
