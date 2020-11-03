package day4;
import java.util.*;

public class Alphabets 
{ 

static int MAX = 26; 

//Returns a String of random alphabets 
//length n. 
static String printRandomString(int n) 
{ 
  char []alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 
                      'h', 'i', 'j', 'k', 'l', 'm', 'n',  
                      'o', 'p', 'q', 'r', 's', 't', 'u', 
                      'v', 'w', 'x', 'y', 'z' }; 

  String res = ""; 
  for (int i = 0; i < n; i++)  
      res = res + alphabet[(int) (Math.random() * 10 % MAX)]; 
    
  return res; 
} 

	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	    int n = 10; 
	    System.out.print(printRandomString(n)); 
	} 
	} 
		
