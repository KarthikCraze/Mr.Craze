package MileStone2;

public class Logical3 {
	public static void main(String[] args) { //Anagram
		String s =  "malayalam";
		String s1 = "mmaaaally";
		for(int i=0;i<s.length();i++)
		{
			s1 = s1.replaceFirst(Character.toString(s.charAt(i)),"");
		}
		System.out.println(s1);
		if(s1.length()==0)
			System.out.println("True");
		else
			System.out.println("False");
	}
}
