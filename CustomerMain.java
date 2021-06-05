package Activity1;

import java.util.Scanner;

public class CustomerMain {
	public static void main(String[] args) {
		
		System.out.println("Enter the Details");
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
        String[] arrOfStr = str.split(",", 3);
        int num = arrOfStr.length;
        //System.out.println("the length of array is"+num);
		Customer cus = new Customer();
		String name,mobile,address;
		cus.setName(name = arrOfStr[0]);
		cus.setAddress( address = arrOfStr[1]);
		cus.setMobile( mobile = arrOfStr[2]);
		System.out.println(cus.alldetails());
	}
}
