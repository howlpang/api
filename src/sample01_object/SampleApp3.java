package sample01_object;

public class SampleApp3 {

	public static void main(String[] args) {
		
		Sample sample = new Sample(100, "홍길동");
		
		//객체 복제하기
		Sample cloneSample = sample.copy();
		System.out.println("번호 -> " +cloneSample.getNo());
		System.out.println("이름 -> " +cloneSample.getName());
	}

}
