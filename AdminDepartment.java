/**
 * AdminDepartment extends from SuperDepartment 
 */
package departmentPackage;

/**
 * @author Manju
 *
 */
public class AdminDepartment extends SuperDepartment {

	/**
	 * Method overriding
	 */
	public String departmentName () {
		return "Welcome to Admin Department";
	}
	public String getTodaysWork () {
		return "Complete your documents Submission";
	}
	public String getWorkDeadline () {
		return "Complete by EOD";
	}
}
