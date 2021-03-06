package testes;

import java.io.UnsupportedEncodingException;

public class TestEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String[] codes = { "ISO-8859-1", "UTF-8", "UTF-16" };
		String palavra = "a";
		System.out.println("Codficaçao\tN bytes\tCódigo Hex");
		for (String encoding : codes) {
		  byte[] b = palavra.getBytes(encoding);
		  System.out.printf("%10s\t%d\t", encoding, b.length);
		  for (int k = 0; k < b.length; k++) {
		    String hex = Integer.toHexString((b[k] + 256) % 256);
		    if (hex.length() == 1)
		      hex = "0" + hex;
		    System.out.print(hex);
		  }
		  System.out.println();
		}
	}
}
