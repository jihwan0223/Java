package cote.exam1020;

public class Book {
	private String title;
	private String author;
	private int Price = 5;
	private String isbn;

	public Book(String title, String author, String isbn) {
		this(title, author, isbn, 0);		
	}
	public Book(String title, String author, String isbn, int ptice) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.Price = 0;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
