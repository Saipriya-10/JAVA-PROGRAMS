public class palindrome_sentence
{
	
	public static void main(String[] args)
	{
		String sentence="my name is nitin and i can speak malayalam";
		String[] words=sentence.split(" ");
		for(String temp:words)
		{
			if(isPalindrome(temp))
			System.out.println(temp+" "+"is a palindrome");
			
		}
	}
	public static boolean isPalindrome(String temp1)
	{
		StringBuilder s1=new StringBuilder(temp1);
		String rev=s1.reverse().toString();
		if(temp1.equals(rev))
		return true;
		else
		return false;
	}
}