package javaPuzzler;

public class Puzzle20 {
	public static void main(String[] args) {
		/* Ŭ���� �̸� ��� */
		System.out.println(Puzzle20.class.getName() + ".class");
		
		/* Ŭ������ ������ ��� ��� - ���� */
		System.out.println(Puzzle20.class.getName().replaceAll(".", "/") + ".class");
		
		/* Ŭ������ ������ ��� ��� - ���� */
		System.out.println(Puzzle20.class.getName().replaceAll("\\.", "/") + ".class");	//���н��� '/'�� ����ϹǷ� ����
		
		/* Ŭ������ ������ ��� ��� - ��� �ü������ ��� ���� */
		System.out.println(Puzzle20.class.getName().replaceAll(java.util.regex.Pattern.quote("."), "/") + ".class");
		/*
		 * replaceAll�� ����ǥ������ ����ϱ� ������ .�� ��� ���̶�� �ǹ̸� ������.
		 */
	}
}
