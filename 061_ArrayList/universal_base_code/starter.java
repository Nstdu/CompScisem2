import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
	ArrayList <String> arr = new ArrayList<String>(input);

	for(int y = 0;y<input; y++){
		arr.add("cookies");
	}
		for(int x = 0; x< arr.size(); x++){
		System.out.println(arr.get(x));
	}
	
	

		
	}
}
