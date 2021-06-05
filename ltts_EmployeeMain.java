package Activity1;
import java.util.*;

public class ltts_EmployeeMain {
		public static void main(String[] args) {
			ltts_Employee emp = new ltts_Employee();
			String name,mobile,address;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the name:");
			emp.setName(name = sc.nextLine());
			System.out.println("Enter the Address:");
			emp.setAddress( address = sc.nextLine());
			System.out.println("Enter the Mobile:");
			emp.setMobile( mobile = sc.nextLine());
			System.out.println(emp.alldetails());
		}
}
