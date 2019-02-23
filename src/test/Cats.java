package test;

import java.util.Scanner;

public class Cats {

	
	public static void catmouse(int x, int y,int z)
    {
		int c=z-x;
		int d=y-z;
		if(c<d)
		{
			System.out.println("Cat A");
		}
		else if(c>d)
		{
			System.out.println("Cat B");
		}
		else if(c==d)
		{
			System.out.println("Mouse");
		}
			
   	 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter cat a position");
		int x=sc.nextInt();
		System.out.println("enter cat b position");
		int y=sc.nextInt();
		System.out.println("enter mouse position");
		int z=sc.nextInt();
        catmouse(x,y,z);
	}
     
}
