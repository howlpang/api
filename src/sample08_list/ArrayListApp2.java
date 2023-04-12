package sample08_list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListApp2 {

	public static void main(String[] args) {
		
		ArrayList<String> names= new ArrayList<>();
		names.add("김유신");
		names.add("강감찬");
		names.add("이순신");
		names.add("유관순");
		
		System.out.println("### 콜렉션객체(ArrayList객체)에 저장된 값을 외부반복으로 처리한 것");
		for(String name : names) {
			System.out.println(name);
		}
		
		//map(변형)collect(수집)
		List<Character> values = new ArrayList<>();
		for(String name : names) {
			values.add(name.charAt(0));
		}
		//forEach(소비하는 것)
		for(char c: values) {
			System.out.println(c);
		}
		
		System.out.println("### 콜렉션객체(ArrayList객체)에 저장된 값을 내부반복으로 처리한 것");
		names.stream().forEach(name -> System.out.println(name));
		
		names.stream().
		map(name -> name.charAt(0))   //변형
		.collect(Collectors.toList()) // 수집
		.forEach(value -> System.out.println(value)); //소비
		
		
	}

}
