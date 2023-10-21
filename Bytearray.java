

import java.util.Arrays;

public class Bytearray {

	public static void main(String[] args) {
		String str = "SHAGUN";
		byte[] byteArr = str.getBytes();
		// print the byte[] elements
		System.out.println("String to byte array: " + Arrays.toString(byteArr));
	}
}