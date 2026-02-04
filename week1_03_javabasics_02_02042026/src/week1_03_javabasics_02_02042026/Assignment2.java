package week1_03_javabasics_02_02042026;

import java.util.Scanner;
public class Assignment2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Array Size: ");
		int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elemnts are:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
		
	}
