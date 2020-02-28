package javaPuzzler;

public class Puzzle20 {
	public static void main(String[] args) {
		System.out.println(Puzzle20.class.getName() + ".class");
		System.out.println(Puzzle20.class.getName().replaceAll(".", "/") + ".class");
		System.out.println(Puzzle20.class.getName().replaceAll("\\.", "/") + ".class");
		/*
		 * replaceAll은 정규표현식을 사용하기 때문에 .은 모든 것이라는 의미를 가진다.
		 */
	}
}
