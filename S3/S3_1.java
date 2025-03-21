// package S3_1;

import java.util.Scanner;

public class S3_1
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);


		Book b1 = new Book(
				"ISBN123456789",
				"Java Programming",
				"John Doe",
				2024);
		Book b2 = new Book(
				"ISBN987654321",
				"Data Structures",
				"Jane Smith",
				2023);
		System.out.println(
				b1.showBookNo()+
				b1.showBookTitle()+
				b1.showAuthor()+
				b1.showYearPublished());
		System.out.println(
				b2.showBookNo()+
				b2.showBookTitle()+
				b2.showAuthor()+
				b2.showYearPublished());


		b1.modifyYearPublished(2021);
		System.out.println(b1.showYearPublished());

		in.close();
	}
}
class Book
{
	private String bookNo = "";
	private String bookTitle = "";
	private String author = "";
	private int yearPublished = 0;


	public Book(Scanner in)
	{
		this.setAuthor(in);
		this.setBookNo(in);
		this.setBookTitle(in);
		this.setYearPublished(in);
	}
	public Book(String no,String title, String author, int year)
	{
		this.bookNo = no;
		this.bookTitle = title;
		this.author = author;
		this.yearPublished = year;
	}


	private void setBookNo(Scanner in)
	{
		bookNo = in.nextLine();
	}
	private void setBookTitle(Scanner in)
	{
		bookTitle = in.nextLine();
	}
	private void setAuthor(Scanner in)
	{
		author = in.nextLine();
	}
	private void setYearPublished(Scanner in)
	{
		yearPublished = in.nextInt();
	}


	public String showBookNo()
	{
		return bookNo;
	}
	public String showBookTitle()
	{
		return bookTitle;
	}
	public String showAuthor()
	{
		return author;
	}
	public int showYearPublished()
	{
		return yearPublished;
	}


	public void modifyYearPublished(int newYear)
	{
		yearPublished = newYear;
	}
}
