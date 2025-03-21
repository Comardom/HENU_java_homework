// package S3_5;

public class S3_5
{
	public static void main(String[] args)
	{
		Book[] libraryBooks = {
				new Book("1", "AAA"),
				new Book("2", "BBB"),
				new Book("3", "CCC")
		};

		Student student1 = new Student("Anny", libraryBooks);
		student1.borrowBook("AAA");
		student1.borrowBook("BBB");

		System.out.println("—— Returning books ——");
		student1.returnBook("AAA");
	}
}
class Book
{
	private String id;
	private String title;
	private boolean isBorrowed;

	public Book(String id, String title)
	{
		this.id = id;
		this.title = title;
		this.isBorrowed = false;
	}

	public String getTitle()
	{
		return title;
	}

	public boolean isAvailable()
	{
		return !isBorrowed;
	}

	public void borrowBook()
	{
		isBorrowed = true;
	}

	public void returnBook()
	{
		isBorrowed = false;
	}
}

class Student
{
	private String name;
	private Book[] books;

	public Student(String name, Book[] books)
	{
		this.name = name;
		this.books = books;
	}

	public void borrowBook(String title)
	{
		for (Book book : books)
		{
			if (book.getTitle().equals(title) && book.isAvailable())
			{
				book.borrowBook();
				System.out.println("Successfully borrowed: " + book.getTitle());
				return;
			}
		}
		System.out.println("Sorry, \"" + title + "\" is not available!");
	}

	public void returnBook(String title)
	{
		for (Book book : books)
		{
			if (book.getTitle().equals(title))
			{
				book.returnBook();
				System.out.println("Successfully returned: " + book.getTitle());
				return;
			}
		}
		System.out.println("This book does not belong to this library!");
	}
}
