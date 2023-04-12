package sample03_string;

import java.util.StringTokenizer;

public class StringTokenizerApp2 {

	public static void main(String[] args) {

		// String의 split메소드와 StringTokenizer의 차이점
		
		String text1 = "김유신,영업2팀,과장,010-1111-1111";
		String text2 = "강감찬,,인턴,010-2222-2222";
		
		// split 메소드  -> 스플릿한 한 값이 공백이라도 카운팅한다.
		System.out.println("### split메소드로 문자열 자르기");
		String[] value1 = text1.split(",");
		String[] value2 = text2.split(",");
		System.out.println("첫번째 문자열의 텍스트갯수 -> "+ value1.length);  //4
		System.out.println("두번째 문자열의 텍스트갯수 -> "+ value2.length);  //4
		
		
		// StringTokenizer  -> 토큰화 한 값이 공백일 경우 무시(카운팅하지 않음)한다. 
		System.out.println("### StringTokenizer메소드로 문자열 토큰화하기");
		StringTokenizer tokenizer1 = new StringTokenizer(text1, ",");
		StringTokenizer tokenizer2 = new StringTokenizer(text2, ",");
		System.out.println("첫번째 문자열의 토큰갯수 -> "+ tokenizer1.countTokens()); //4
		System.out.println("두번째 문자열의 토큰갯수 -> "+ tokenizer2.countTokens()); //3
		 
		
		

	}

}
