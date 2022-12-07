package javase;
import java.io.*;
import java.util.*;
 class Backtrack1 {
	   public static void printPermutation(String str, int idx, String perm) {
	       if(str.length() == 0) {
	           System.out.println(perm);
	           return;
	       }
	      
	       for(int i=0; i<str.length(); i++) {
	           char currChar = str.charAt(i);
	           String newStr = str.substring(0, i) + str.substring(i+1);
	           printPermutation(newStr, idx+1, perm+currChar);
	       }
	   }
	   public static void main(String args[]) {
	       String str = "ABC";
	       printPermutation(str, 0, "");
	   }
	}
