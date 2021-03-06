package leetcode.string;

public class ValidPalindrome {
//	Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//
//	For example,
//	"A man, a plan, a canal: Panama" is a palindrome.
//	"race a car" is not a palindrome.
//
//	Note:
//	Have you consider that the string might be empty? This is a good question to ask during an interview.
//
//	For the purpose of this problem, we define empty string as valid palindrome.

//	have an solution with only constant space
	 public boolean isPalindrome(String s) {
		 if(s == null)
			 return true;
		 s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		 int length = s.length();
		 if (length < 2)
			 return true;
		 int start = 0;
		 int end = length-1;
		 while(start < end){
			 if(s.charAt(start) == s.charAt(end)){
				 start++;
				 end--;
			 }else{
				 return false;
			 }
		 }
		 return true;
	 }
}
