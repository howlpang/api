package sample03_string;

public class StringApp4 {
   
   public static void main(String[] args) {
      
      String[] emailArr = {"hong@gmail.com", "lee-sushin@naver.com","kimys@hanmail.net"};
      
      // 고객의 이메일주소에서 아이디만 조회해서 출력하기
      for(String email : emailArr) {
         //System.out.println(email.indexOf("@"));
         String id = email.substring(0, email.indexOf("@"));
         System.out.println(id);
         //문자열의 0번째부터 골뱅이의 앞까지 잘라내야함
         //골뱅이가 등장하는 위치를 알아야함
         
      }
      //고객의 이메일주소에서 도메인네임 출력하기
      for(String email : emailArr) {
         String domainName = email.substring(email.indexOf("@")+1);
         System.out.println(domainName);
      
    }
   }
}
