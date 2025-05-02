package javapractices;

public class Book {
	// properties will be represented by instance/object member variable

	String Author;
	int Publicationyr;
	int Price;

	public Book(String Author, int Publicationyr, int Price) {
		this.Author = Author;
		this.Publicationyr = Publicationyr;
		this.Price = Price;
	}
	// Behavior will be represented by instance/object member functions/methods

	void unavailable() {
		System.out.println("Book is unavailable");
	}

	void available() {
		System.out.println("Book is available");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b = new Book("Sanjivani", 2025, 120);
		b.available();
		// System.out.println("Book Author : " + b.Author);

		b.Author = "Sanjivani Choudhari";
		System.out.println("Book Author : " + b.Author);
		System.out.println("Book Publicationyr : " + b.Publicationyr);
		System.out.println("Book Price : " + b.Price);
	}

}
