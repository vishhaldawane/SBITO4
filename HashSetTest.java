import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class HashSetTest {
	public static void main(String[] args) {
	
		Book b1 = new Book(101,"Java 1.5","James Gosling",850.0f,1,1200); //hashcode is unique
		Book b2 = new Book(101,"Java 1.8","James Gosling",850.0f,1,1200); //hashcode is unique
		Book b3 = new Book(101,"Java 11","James Gosling",850.0f,1,1200); //hashcode is unique
		Book b4 = new Book(101,"Java 15","James Gosling",850.0f,1,1200); //hashcode is unique
		Book b5 = new Book(101,"Java 11","Kathey Seirra",850.0f,1,1200); //hashcode is unique
		
		HashSet<Book> bookShelf = new HashSet<Book>();
		
		System.out.println("Adding 1st book");
		bookShelf.add(b1);
		bookShelf.add(b2);
		bookShelf.add(b3);
		bookShelf.add(b4);
		bookShelf.add(b5);
		
		System.out.println("Books are added....");
		
		Iterator<Book> bookIterator = bookShelf.iterator();
		
		while(bookIterator.hasNext()) {
			Book theBook = bookIterator.next();
			System.out.println("Book : "+theBook);
			
		}
		
		
	}
}

class Book
{
	int bookNumber;
	String bookTitle;
	String bookAuthor;
	float bookPrice;
	int edition;
	int numberOfPages;
	public Book(int bookNumber, String bookTitle, String bookAuthor, float bookPrice, int edition, int numberOfPages) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.edition = edition;
		this.numberOfPages = numberOfPages;
	}
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor
				+ ", bookPrice=" + bookPrice + ", edition=" + edition + ", numberOfPages=" + numberOfPages + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookAuthor, bookTitle);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookAuthor, other.bookAuthor) && Objects.equals(bookTitle, other.bookTitle);
	}
	
	
	
	
}