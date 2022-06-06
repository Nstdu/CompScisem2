import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static int rowA(int a ,int [][] rowAv){
		int sum  = 0;
		System.out.println("the row number is "+a);
		for(int x = 0; x<rowAv[a].length-1; x++){
			sum = sum +rowAv[a][x];
		}
		int avg = sum/ rowAv[a].length;
		return avg;
	}
	public static int overallAvg(int [][] arr){
		int sum  = 0;
		int c = 0;
		for(int x = 0; x<arr.length-1;x++){
			for(int y = 0;y<arr[x].length;y++){
				sum = sum+arr[x][y];
				c++;
				
			}
			
		}
		int avg = sum/ c;
		return avg;
	}
	public static void printArr(int [][]arr){
		for(int x = 0; x<arr.length;x++){
			for(int y = 0; y<arr[x].length;y++){
			System.out.println(arr[x][y]+ " ");
			System.out.println("");
			}
		
			
		}
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("row");
	int a = sc.nextInt();
	System.out.println("columns");
	int b = sc.nextInt();
	int[][] arr = new int [a][b];
	
	for(int x = 0; x< arr.length;x++){
		for(int y = 0; y<arr.length;y++){
			arr[x][y] = (int)(1+ Math.random()*10);
			
		}
	}
System.out.println("the average for the row is"+ rowA(a,arr));
System.out.println("overall avg :"+ overallAvg(arr));
printArr(arr);
		
	}
}
