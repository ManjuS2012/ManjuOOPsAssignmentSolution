/**
 * HrDepartment extends from SuperDepartment 
 */
package departmentPackage;

/**
 * @author Manju
 *
 */
public class HrDepartment extends SuperDepartment {
	/**
	 * Method overriding
	 */
	public String departmentName () {
		return "Welcome to HR Department";
	}
	public String getTodaysWork () {
		return "Fill today’s timesheet and mark your attendance";
	}
	public String getWorkDeadline () {
		return "Complete by EOD";
	}
	// local method
	public String doActivity () {
		return "team Lunch";
	}
}
