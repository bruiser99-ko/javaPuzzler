package javaPuzzler;

import java.io.File;
import java.util.regex.Matcher;

public class Puzzle21 {
	public static void main(String[] args) {
		/* �������� ���� �����ڴ� ���������ε� �������� 1���� ����ϸ� �̽����������� ����̹Ƿ� ���� �߻� */
//		System.out.println(Puzzle21.class.getName().replaceAll("\\.", File.separator) + ".class");
		
		/* MatcherŬ������ Ȱ���ϸ� ���� �ذ� */
		System.out.println(Puzzle21.class.getName().replaceAll("\\.", Matcher.quoteReplacement(File.separator)) + ".class");
	}
}
