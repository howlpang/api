package sample10_map;

import java.util.HashMap;
import java.util.Map;

public class MapApp4 {

	public static void main(String[] args) {
		//Map 객체를 이용해서 변화가 많은 정보를 저장할 수 있다.
		
		//Map객체를 이용해서 다양한 검색조건 정보를 저장할 수 있다.
		/*
		 * Map객체를 이용해서 다양한 정보를 저장한 ValueObject처럼 사용하기
		 *  - 저장할 정보의 항목이 매우 다양하고, 변화가 많은 경우
		 *  - 하나의 정보를 매우 다양한 형식으로 표현해야 하는 경우
		 *  * Map을 사용할 때 조심해야 할 경우
		 *  - key값이 문자열인 경우가 많은데, 오탈자가 있어서 체크가 되지 않는다.
		 *  	map.get("seachKeyword") // 오탈자가 있어도 오류가 발생하지 않음	
		 *  							// ide의 자동완성 기능을 사용할 수 없
		 *  - value의 타입이 Object인 경우, 값을 조회할 때 클래스 형변환이 필요하다.
		 *  	Map<String, Object> map = new HashMap<>();
		 *  // key, value의 쌍으로 값저장하기
		 *  	map.put("sort" , "price");
		 *  	map.put("row" , 10);
		 *  //key로 값 조회하기
		 *  Object obj1 = map.get("sort"); // Obj 타입이므로 내가 원하는 값을 사용할 수 없음
		 *  Object obj2 = map.get("row");
		 *  Map 객체에 처음 저장했던 타입 그대로 조회하기 위해서 클래스 형변환이 필요하다.
		 *  String value1 = (String) map.get("sort"); // 그러므로 String으로 클래스 형변환 해줘야 함
		 *  int value2 =(Integer) map.get("row");		// 이하동문 (Integer)로
		 *  	
		 * 
		 */
		Map<String , Object> map = new HashMap<>();
		map.put("sort", "price"); 	// 정렬기준
		map.put("row", 20);		//출력갯수
		map.put("searchOpt", "titie"); // 검색옵션
		map.put("searchKeyword", "토익시험"); 	//검색키워드
		map.put("maxPrice", 30000);	//최대가격
		map.put("minPrice", 15000); //최소가격
		map.put("pageNo", 2);	//요청페이지 번호

	}

}
