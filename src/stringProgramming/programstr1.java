package stringProgramming;

import java.util.StringJoiner;

public class programstr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("abc");
String s = new String("Jwala");
s=s.concat("Prakash");
System.out.println(s);

String Q = new String("JwalaPrakash");
System.out.println(s==Q);
System.out.println(s.equals(Q));
s= s.concat("Ragini");
System.out.println(s);
StringBuffer SB= new StringBuffer("Anurag");
StringBuffer SB1= new StringBuffer("AnuragRagini");
SB.append("Ragini");
System.out.println(SB);
System.out.println(SB.toString().equals(SB1.toString()));
System.out.println("Result : "
        + SB1.toString().contentEquals(SB.toString()));
String a= "bola"+"lola";
System.out.println(a);
String b="rupa";
String c="li";
String d= String.join("",b,c);
System.out.println(d);
StringJoiner s1= new StringJoiner("");
s1.add("Jwa");
s1.add("la");
System.out.println(s1);

}

}
