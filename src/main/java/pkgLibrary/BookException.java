package pkgLibrary;

public class BookException extends Throwable {
	public BookException(Book b) {
		this.D = b;
	}
	
	public Book getD() {
		return D;
	}

	private Book D;
	
}