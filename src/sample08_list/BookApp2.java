package sample08_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import sample09_set.Book;

public class BookApp2 {

	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<>();

		books.add(new Book(102, "생각하는 프로그래밍" , "김창준" , 35000));
		books.add(new Book(103, "Do it! 점프 투 파이썬" , "박응용" , 35000));
		books.add(new Book(100, "자바의 정석" , "남궁성" , 35000));
		books.add(new Book(104, "혼자 공부하는 파이썬" , "윤인성" , 21000));
		books.add(new Book(105, "모던 자바스크립트" , "이응모" , 42000));
		books.add(new Book(101, "이것이 자바다" , "신용권" , 32000));
		
		
		//List객체에 저장된 책정보 정렬시키기
		Collections.sort(books);
		
		//List객체에 저장된 책정보 가격을 기준으로 정렬시키기
		Collections.sort(books,(b1,b2) -> b1.getPrice() - b2.getPrice());
		// List객체에 저자된 책정보를 저자명을 기준으로 졍렬시키기
		Collections.sort(books,(b1,b2) -> b1.getWriter().compareTo(b2.getWriter()));
		//List객체에 저장된 책정보를 가격순을 기준으로 정렬시키기
		Collections.sort(books,(b1,b2) -> {
			int gap = b1.getPrice() - b2.getPrice();
			if(gap == 0) {
				return b1.getTitle().compareTo(b2.getTitle());
			}
					
				return gap;
		});
			
		
		for(Book book : books) {
			System.out.println(book.getNo());
			System.out.println(book.getTitle());
			System.out.println(book.getPrice());
			System.out.println(book.getWriter());
			System.out.println();
		}
	}

}
