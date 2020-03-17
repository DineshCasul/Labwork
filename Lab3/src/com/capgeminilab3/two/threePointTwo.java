package com.capgeminilab3.two;
import java.util.Arrays;

public class threePointTwo {
	private String s;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public boolean positiveString(String s) {
		int n = s.length();
		char c[] = new char[n];
		for (int i = 0; i < n; i++) {
			c[i] = s.charAt(i);
		}
		Arrays.sort(c);
		for (int i = 0; i < n; i++)
			if (c[i] != s.charAt(i))
				return false;
		return true;
	}
}
