import java.util.*;
import java.io.*;
//import java.util.StringTokenizer;
class skill1{
	public static void main(String[] args){
		
		Scanner s=new Scanner(System.in);
		String b;
		System.out.println("the string");
		b=s.nextLine();
		System.out.println("no");
		int a=s.nextInt();
		String e,f;
		/*StringTokenizer tokens = new StringTokenizer(b);
        int c= tokens.countTokens();
        System.out.println(c);*/
       String[] words = b.split("\\s+");
        int c= words.length;
        char d[]=b.toCharArray();
        int g=a-1;
       
        for(int i=0;i<=c-1;i++){
        	 int h=g*i;
        	if(i==h){
        	System.out.print(words[i]);
        }
        }
        
	}
}