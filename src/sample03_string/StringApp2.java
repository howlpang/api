package sample03_string;

public class StringApp2 {

	public static void main(String[] args) {
		
		// String의 주요 API
		String str1 = "public static void main(String[] args)";
		
		// int length() : 문자열의 길이를 반환한다.
		int len = str1.length();
		System.out.println("문자열의 길이 -> "+ len);
		
		//String toUpperCase() : 문자열에 대해서 대문자로 변환된 새 문자열을 반환한다.
		//String toLowerCase() : 문자열에 대해서 소문자로 변환된 새 문자열을 반환한다.
		String text1 = str1.toUpperCase();
		String text2 = str1.toLowerCase();
		System.out.println("대문자로 변환된 문자열 ->" +text1);
		System.out.println("소문자로 변환된 문자열 - >"+text2);
		System.out.println(str1);
		
		// boolean contains(CharSequence text) : 문자열에 text에 해당하는 문자열이 포함되어 있으면 true를 반환한다. 
		boolean isContains = str1.contains("main");
		System.out.println("지정된 문자열이 포함되어 있는가?" + isContains);
		
		//boolean isEmpty() : 문자열이 빈 문자열이면 true를 반환한다. 길이가 0인 문자열일 때 true를 반환한다.
		//boolean isBlank() : 문자열이 비어있으면 문자열이면 true를 반환한다. 길이가 0인 문자열과 공백, 탭만 포함하고 있을 때 true를 반환한다.
		System.out.println("".isEmpty());			// true
		System.out.println("   ".isEmpty());		// false, 공백문자가 여러 개 포함되어 있기 때문에 빈 문자열이 아니다.
		System.out.println("".isBlank());			// true
		System.out.println("   ".isBlank());		// true, 공백문자, 탭문자로만 구성되어 있으면 true를 반환한다. 
		
		// String substring(int beginIndex) : 문자열에 지정된 시작위치부터 문자열의 끝까지 포함된 새 문자열을 반환한다.
		// String subString( int beginIndex , int endIndex) : 문자열에 지정된 범위의 문자열이 포함된 새 문자열을 반환한다.
		String str2 = "Returns the char value at the specified index.";
		String text3 = str2.substring(12);
		String text4 = str2.substring(2,9);
		System.out.println("첫번째 부분문자열 - > "+ text3);
		System.out.println("두번째 부분문자열 - > "+ text4);
		
		//int indexOf(int ch) : 문자열에서 지정된 문자가 등장하는 인덱스를 반환한다.
		//int indexOf(int ch, int fromIndex) :지정된 위치에서부터 검색했을 때 지정된 문자가 등장하는 인덱스를 반환한다.
		//int indexOf(String text): 문자열에서 지정된 문자열이 등장하는 인덱스를 반환한다.
		//int indexOf(String text, intfromIndex) : 지정된 위치에서부터 검색했을 때 지정된 문자열이 등장하는 인덱스를 반환한다.
		
		//int lastindexOf(int ch) : 문자열의 끝에서부터 역순으로 지정된 문자가 등장하는 인덱스를 반환한다.
		//int lastindexOf(int ch, int fromIndex) : 지정된 위치에서부터 역순으로 지정된 문자가 등장하는 인덱스를 반환한다.
		//int lastindexOf(String text) :
		//int lastindexOf(String text, intfromIndex) :
		String str3 = "Returns the char value at the specified index.";
		int index1 = str3.indexOf('t');
		int index2 = str3.indexOf('t', 20);
		int index3 = str3.indexOf("the");
		int index4 = str3.indexOf("the", 20);
		int index5 = str3.indexOf("color");
		System.out.println("등장위치 -> " +index1);	//2, Re't'
		System.out.println("등장위치 -> " +index2);	//24, value a't' 
		System.out.println("등장위치 -> " +index3);	//8, Returns "the"
		System.out.println("등장위치 -> " +index4);	//26, value at "the"
		System.out.println("등장위치 -> " +index5);	//-1, 일치하는 것이 존재하지 않는다.
		
		int index6 = str3.lastIndexOf("i");
		int index7 = str3.lastIndexOf("i", 20);
		System.out.println("등장위치 -> " +index6);	//40, specified "i"ndex.
		System.out.println("등장위치 -> " +index7);	//-1, 일치하는것이 존재하지 않는다.
		
		// char charAt(int index) : 문자열에서 지정된 위치의 문자를 반환한다.
		String str4 = "abcdefghhijklmn";
		char ch1 = str4.charAt(5);
		char ch2 = str4.charAt(10);
		//char ch3 = str4.charAt(20);  문자열의 인덱스범위를 초과했기 때문에 StringIndexOutofBoundException 오류가 발생한다.
		System.out.println("5번째 문자 -> "+ ch1);
		System.out.println("10번째 문자 -> "+ ch2);
		//System.out.println("20번째 문자 -> "+ ch3);
		
		// String[] split(String regex) : 문자열을 구분자(지정된 표현식)로 잘라서 배열에 담아 반환한다. 
		String str5 = "김유신,강감찬,이순신,유관순";
		String[] arr1 = str5.split(","); // "김유신,강감찬,이순신,유관순" -> {"김유신","강감찬","이순신","유관순"}
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		
		
	}
}
