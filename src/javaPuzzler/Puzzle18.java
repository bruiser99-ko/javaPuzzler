package javaPuzzler;

import java.io.UnsupportedEncodingException;

public class Puzzle18 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] bytes = new byte[256];
		for(int i=0; i<256; i++) {
			bytes[i] = (byte)i;
		}
		String str1 = new String(bytes);
		for(int i=0, n=str1.length(); i < n; i++) {
			System.out.println((int)str1.charAt(i) + " ");
		}
		
		String str2 = new String(bytes, "ISO-8859-1");
		for(int i=0, n=str2.length(); i < n; i++) {
			System.out.println((int)str2.charAt(i) + " ");
		}

	}
}
