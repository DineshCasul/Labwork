package com.capgeminilab3.one;

public class stringInput {

	private String input;

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String stringAdd(String input) {
		String add = input + input;
		return add;
	}
	
	public void area(int l,float h) {
		int area = l * (int)h;
		System.out.println(area);
	}
	
	public void area(float h,int l) {
		int area = l * (int)h;
		System.out.println(area);
	}

	public void oddPosition(String input) {
		char[] inputString = input.toCharArray();

		for (int i = 0; i < inputString.length; i = i + 2) {
			inputString[i] = '#';
		}

		System.out.println(inputString);
	}

	public String duplicateString(String input) {
		if (input == null || input.length() < 2) {
			return input;
		}
		char[] characters = input.toCharArray();
		for (int i = 1; i < input.length(); i++) {
			int j;
			for (j = 0; j < i; ++j) {
				if (characters[i] == characters[j]) {
					break;
				}
			}
			if (j != i) {
				characters[i] = 0;
			}
		}
		return toUniqueString(characters);
	}

	private String toUniqueString(char[] letters) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(letters.length);	
		for (char c : letters) {
			if (c != 0) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	public String upperCase(String input) {
		char ch;
		String str = "";
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			if(i % 2 != 0) {
				str = str + Character.toLowerCase(ch);
			}else if(i % 2 == 0)
				 str = str +Character.toUpperCase(ch);			
		}
		return str;
		
	}

}
