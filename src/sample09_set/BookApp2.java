package sample09_set;

import java.util.HashSet;
import java.util.Iterator;

public class BookApp2 {

	// 동일한 책번호를 가진 책정보는 같은 객체로 보고 저장되지 않게 하자.
	//Book 클래스에서 hashCode()와 equals(Object o) 메소드를 재정의한다.
	public static void main(String[] args) {
		HashSet<Book> books = new HashSet<>();
		
		books.add(new Book(101, "자바의 정석" , "남궁성" , 35000));
		books.add(new Book(102, "자바의 정석" , "남궁성" , 35000));
		books.add(new Book(103, "자바의 정석" , "남궁성" , 35000));
		books.add(new Book(104, "이것이 자바다" , "신용권" , 32000));
		books.add(new Book(105, "생각하는 프로그래밍" , "김창준" , 29000));
		
//		for(Book book : books) {
//			System.out.println("번호 -> "+book.getNo());
//			System.out.println("제목 -> "+book.getTitle());
//			System.out.println("저자 -> "+book.getWriter());
//			System.out.println("가격 ->" +book.getPrice());
//			System.out.println();
//		}
		
		//책번호가 짝수인 책정보를 삭제하기
		Iterator<Book> iter = books.iterator();
		while(iter.hasNext()) {
			Book book =iter.next();
			if(book.getNo()%2 == 0) {
				iter.remove();
			}
		}
		// Set객체에 저장된 객체의 갯수 조회하기
		System.out.println("저장된 객체의 갯수 -> " + books.size());
		

	}

}
