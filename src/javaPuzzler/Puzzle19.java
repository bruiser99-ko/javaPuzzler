package javaPuzzler;

public class Puzzle19 {
	public static void main(String[] args) {
		System.out.println(classify('n') + );
	}

	private static String classify(char ch) {
		if("0123456789".indexOf(ch) >= 0) return "NUMERAL";
		if("abcdefghijklmnopqrstuvwxyz".indexOf(ch) >= 0) return "LETTER";
//		/* (아직 지원하지 않는 연산자들)
//			if("+-*/&|!=".indexOf(ch) >= 0) return "NUMERAL";
//		*/
		return "UNKNOWN";
	}
}

/*
 * 여러 줄 주석은 에러를 일으킬 수 있으므로
 * 한 줄 주석을 이용하는 것이 더 좋다. 
 * */
