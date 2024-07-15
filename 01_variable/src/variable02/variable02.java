package variable02;

public class variable02 {
	public static void main(String[] args) {
		
//		1. 대소문자가 구분된다. (길이제한 x)
		int num = 10;
		int nuM = 20;
		System.out.println(num);
		System.out.println(nuM);
		
//		2. 예약어를 사용하면 안된다. 
//		int class;
		
//		3. 숫자로 시작하면 안된다. 
//		int 1test;
		
//		4. 특수문자는 '_'와 '$'만을 허용한다.
		int _test;
		int $shrp;
		
//		5. 여러 단어 이름의 첫문자는 대문자를 사용한다.
//		첫 글자일 경우에는 사용하지 않는 것이 관례이다. 
		String AllOfTheWorld; // 문법상 오류는 아니나 추후 어떤 환경에서는 문제가 발생할지도...
		String allOfTheWorld; // 이것을 카멜케이스라고 한다.
		int productId; //제품의 번호를 정수형으로 저장
		String bookTitle; // 책의 제목을 문자열로 저장
		
		String str = "123";
		String nm = "123";
		System.out.println(str+nm);
		
		final int AGE = 100;
		System.out.println(AGE); // 상수 명명 규칙 : 대문자로만 작성을 한다. 문자 사이는 '_'로 구분한다.
	}
}
