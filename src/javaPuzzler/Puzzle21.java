package javaPuzzler;

import java.io.File;
import java.util.regex.Matcher;

public class Puzzle21 {
	public static void main(String[] args) {
		/* 윈도우의 파일 구분자는 역슬러시인데 역슬러시 1개만 사용하면 이스케이프문자 사용이므로 오류 발생 */
//		System.out.println(Puzzle21.class.getName().replaceAll("\\.", File.separator) + ".class");
		
		/* Matcher클래스를 활용하면 오류 해결 */
		System.out.println(Puzzle21.class.getName().replaceAll("\\.", Matcher.quoteReplacement(File.separator)) + ".class");
	}
}
