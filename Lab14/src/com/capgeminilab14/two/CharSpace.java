package com.capgeminilab14.two;

@FunctionalInterface
interface SpaceChar
{
	String spaceAfterChar(String s);
}

public class CharSpace
{
	public static void main(String[] args)
	{
		SpaceChar ss=s->
		{
			StringBuffer sb=new StringBuffer();
			for(int i=0;i<s.length();i++)
			{
			sb.append(s.charAt(i));
			sb.append(" ");
			}
		return sb.toString();
		
		};
		System.out.println(ss.spaceAfterChar("ABCD"));
	}

}
