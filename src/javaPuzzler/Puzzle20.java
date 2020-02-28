package javaPuzzler;

public class Puzzle20 {
	public static void main(String[] args) {
		/* 클래스 이름 출력 */
		System.out.println(Puzzle20.class.getName() + ".class");
		
		/* 클래스의 폴더명 경로 출력 - 에러 */
		System.out.println(Puzzle20.class.getName().replaceAll(".", "/") + ".class");
		
		/* 클래스의 폴더명 경로 출력 - 정상 */
		System.out.println(Puzzle20.class.getName().replaceAll("\\.", "/") + ".class");	//유닉스는 '/'를 사용하므로 에러
		
		/* 클래스의 폴더명 경로 출력 - 모든 운영체제에서 사용 가능 */
		System.out.println(Puzzle20.class.getName().replaceAll(java.util.regex.Pattern.quote("."), "/") + ".class");
		/*
		 * replaceAll은 정규표현식을 사용하기 때문에 .은 모든 것이라는 의미를 가진다.
		 */
	}
}
