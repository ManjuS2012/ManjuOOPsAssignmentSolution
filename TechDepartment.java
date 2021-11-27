/**
 * TechDepartment extends from SuperDepartment 
 */
package departmentPackage;

/**
 * @author Manju
 *
 */
public class TechDepartment extends SuperDepartment {
	/**
	 * Method overriding
	 */
	public String departmentName () {
		return "Welcome to Tech Department";
	}
	public String getTodaysWork () {
		return "Complete coding of module 1";
	}
	public String getWorkDeadline () {
		return "Complete by EOD";
	}
	// Local method
	public String getTechStackInformation () {
		return "core Java";
	}
}
