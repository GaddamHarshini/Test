package test;

import java.util.Scanner;

public class Space {
      
	public static void space()
	{
		Scanner sc= new Scanner(System.in);
		String s = new String("sos");
		System.out.println("enter the received signal");
		String signal = new String(sc.next());
		char a1[] = signal.toCharArray();
		char a2[]=s.toCharArray();
		//for (int i = 0; i < a1.length; i++) {
		
		//}
		int count=0;
		int i ;
		int c=0;
		for (i = 0; i <= 2 ; i++) {
			if(a1[i]==a2[i])
			{
				count=count+0;
			}
			else
			{
				count++;
			}
				
		}
		c=i;
		System.out.println(count);
		int count1=0;
		for (i = c; i <c+3 ; i++) {
			int j=0;
			if(a1[i]==a2[j])
			{
				count1=count1+0;
			}
			else
			{
				count1++;
			}
			j++;
		}
		System.out.println(count1);
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		space();

	}

}
