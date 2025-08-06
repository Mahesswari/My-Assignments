package week2.day1;

public class Library {
	
	public String addBook(String bookTitle) 
	{
          return bookTitle;
	}
	public void issueBook() 
	{
      System.out.println("Book issued sucessfully");
	}
	public static void main(String[] args) {
		Library book = new Library();
		String Title = book.addBook("Harry potter");
		System.out.println(Title);
		book.issueBook();

	}

}
