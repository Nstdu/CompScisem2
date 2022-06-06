
import java.util.*;
import java.util.ArrayList;

class starter {
	public static void toStringArray(ArrayList<Integer>arr){
		for(int x = 0; x<arr.size();x++){
			System.out.print(arr.get(x)+" ");
		}
	}
	public static void bubbleSort(ArrayList<Integer> arr){
		for(int outer = 0;outer<arr.size()-1;outer++){
			for(int inner = 0; inner<arr.size()-outer-1; inner++){
				if(arr.get(inner)> arr.get(inner+1)){
					int temp = arr.get(inner);
					arr.set(inner,arr.get(inner+1) );
					arr.set(inner+1, temp);
				
				}
			}
		}
	}
	public static void SelectionSort(ArrayList<Integer> arr){
		int outer, inner,min_index;
		for(outer = 0; outer< arr.size();outer++){
			min_index  = outer;
			for(inner = outer+1;inner< arr.size();inner++){
				if(arr.get(inner)<arr.get(min_index)){
					min_index = inner;
				}
			}
			int temp = arr.get(outer);
			arr.set(outer,arr.get(min_index));
			arr.set(min_index,temp);
		}
	}
	public static void InsertionSort(ArrayList<Integer> arr){
		int outer,inner,key;
		for(outer = 1; outer<arr.size(); outer++){
			key = arr.get(outer);
			inner = outer-1;
			while(inner>= 0 &&arr.get(inner)>key){
				arr.set(inner+1,arr.get(inner));
				inner = inner-1;
			}
			arr.set(inner+1,key);
		}
	}
	public static int Median(ArrayList<Integer> arr){
		int a = arr.size()/2;
		int b = arr.get(arr.size()/2);
		int c=arr.get(arr.size()/2-1);
		if(arr.size()%2 ==0){
			a = (b+c)/2;
			
		}
		else{
			a = arr.get(arr.size()/2);
		}
		return a ;
	}
	public static void main(String args[]) {
		ArrayList <Integer> arr = new ArrayList<Integer>(100);
		for(int x = 0;x< 100;x++){
		arr.add(x,(int)(Math.random()*101));
	}
	toStringArray(arr);
	System.out.println();
	System.out.println(" --------------------- bubbleSort-----------------------------------");
		for(int y = 0; y< arr.size(); y++){
		bubbleSort(arr);
		System.out.print(arr.get(y)+" ");
	}
	System.out.println();
		System.out.println(" --------------------- SelectionSort-----------------------------------");
			for(int t = 0; t< arr.size(); t++){
		SelectionSort(arr);
		System.out.print(arr.get(t)+" ");
	}
	System.out.println();
		System.out.println(" --------------------- InsertionSort-----------------------------------");
		for(int r = 0; r< arr.size(); r++){
		InsertionSort(arr);
		System.out.print(arr.get(r)+" ");
	}
	System.out.println();
	System.out.println("the median is "+Median(arr));
	}

}