package Collections;

import java.util.*;
public class Hashset 
{
 public static void main(String args[])
 {
	 HashSet<String> hs = new HashSet<String>(); //Accepts only unique value
	 hs.add("B");
	 hs.add("A");
	 hs.add("D");
	 hs.add("E");
	 hs.add("C");
	 hs.add("F");
	 System.out.println(hs);
 }
}
