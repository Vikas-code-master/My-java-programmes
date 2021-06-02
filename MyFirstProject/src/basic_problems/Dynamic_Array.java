package basic_problems;

import java.util.Scanner;

public class Dynamic_Array {

	public static void main(String[] args) {
		System.out.println("Hello world");
		int [] arr ;
		Scanner sc = new Scanner (System.in) ; 
		char st ;
		st = sc.next().charAt(0);
		
		int n = sc.nextInt();
		arr = new int[n];
		for(int i=0; i<n ; i++)
		{
			arr[i] = i+1 ;
		}
		for (int x : arr)
		{
			System.out.println(x);
		}
		System.out.println(st);
		sc.close();
	}
}
