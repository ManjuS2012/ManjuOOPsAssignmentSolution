/**
 *Super Department class will be the superclass and all other departments must extend it. 
 */
package departmentPackage;

/**
 * @author Manju
 *
 */
public class SuperDepartment {
	// Below are the super class methods which are overriding
	public String departmentName () {
		return "Welcome to Super Department";
	}

	public String getTodaysWork () {
		return "No Work as of now";
	}

	public String getWorkDeadline () {
		return "Nil";
	}

	public String isTodayAHoliday () {
	 // super class method which is not overriding 
		return "Today is not a holiday";
	}

}
