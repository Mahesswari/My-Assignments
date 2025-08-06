package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) 
	{
		Library book = new Library();
		String Tittle = book.addBook("Harry potter");
		System.out.println(Tittle);
		book.issueBook();
	}
	

}

