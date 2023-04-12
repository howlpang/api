package sample01_object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class SampleApp4 {

	public static void main(String[] args) {
		
		Sample sample = new Sample(100, "홍길동");
		
		//getClass() 메소드를 실행해서 객체의 설계도 정보 조회하기
		Class<?> clazz = sample.getClass();

		String classFullName = clazz.getName();
		System.out.println("클래스 전체이름 -> "+classFullName);
		
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			field.getType().getName();
			field.getName();
			String typeName = field.getType().getName();
			String name = field.getName();
			System.out.println("필드정보 -> "+ typeName + " "+name);
		}
		//설계도정보에서 메소드정보 조회하기
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			String returnTypeName = method.getReturnType().getName();
			String methodName = method.getName();
			
			System.out.println("메소드 정보 -> "+ returnTypeName + " "+ methodName);
	}
		}
}
