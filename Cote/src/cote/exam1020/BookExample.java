package cote.exam1020;

public class BookExample {

	public static void main(String[] args) {
		Book[] book = new Book[3];
		book[0] = new Book("1", "2", "3", 1000);
		book[1] = new Book("4", "5", "6", 2000);
		book[2] = new Book("7", "8", "9", 3000);
		
		//for loop로 book 배열에 있는 책들의 제목을 모두 출력
		for(int i = 0; i < book.length;i++) {
			System.out.println(book[i].getTitle());
		}
		for(Book Book : book) {	//for Each
			System.out.println(Book.getTitle());
		}
	}
}
