/**
 * Driver class Main will be used to create objects of HrDepartment, TechDepartment, AdminDepartment 
 */
package departmentPackage;

/**
 * @author Manju
 *
 */
public class DepartmentDriver {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Each department  will display whether today is a holiday or not with the help of the Super Department.
		// SuperDepartment will act as a super class for all the departments
	
		AdminDepartment AdObj = new AdminDepartment(); 		//AdminDepartment class object
		HrDepartment HdObj = new HrDepartment(); 			//HrDepartment class object
		TechDepartment TdObj = new TechDepartment();		//TechDepartment class object
		
		// AdminDepartment method invocations
		System.out.println(AdObj.departmentName());
		System.out.println(AdObj.getTodaysWork());
		System.out.println(AdObj.getWorkDeadline());
		// SuperDepartment method invocations
		System.out.println(AdObj.isTodayAHoliday());
		
		System.out.println("");
		System.out.println("");
		
		// HrDepartment method invocations
		System.out.println(HdObj.departmentName());
		System.out.println(HdObj.doActivity());
		System.out.println(HdObj.getTodaysWork());
		System.out.println(HdObj.getWorkDeadline());
		// SuperDepartment method invocations
		System.out.println(HdObj.isTodayAHoliday());
		
		System.out.println("");
		System.out.println("");
		
		// TechDepartment method invocations
		System.out.println(TdObj.departmentName());
		System.out.println(TdObj.getTodaysWork());
		System.out.println(TdObj.getWorkDeadline());
		System.out.println(TdObj.getTechStackInformation());
		// SuperDepartment method invocations
		System.out.println(TdObj.isTodayAHoliday());
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("End of program");
	}

}
