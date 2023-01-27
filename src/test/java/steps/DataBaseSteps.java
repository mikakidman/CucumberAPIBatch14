package steps;

public class DataBaseSteps {

    public static String getFnameLnameQuery(){

    String query = "select emp_firstname, emp_lastname from hs_hr_employees where employee_id=";

    return query;
    }
}
