package utils;

import org.json.JSONObject;

public class APIPayloadConstant {

    public static String createEmployeePayload(){
        String createEmployeePayload =
                "{\n" +
                        "    \"emp_firstname\": \"mika\",\n" +
                        "    \"emp_lastname\": \"Kaka\",\n" +
                        "    \"emp_middle_name\": \"mk\",\n" +
                        "    \"emp_gender\": \"F\",\n" +
                        "    \"emp_birthday\": \"2008-10-16\",\n" +
                        "    \"emp_status\": \"confirmed\",\n" +
                        "    \"emp_job_title\": \"QA Engineer\"\n" +
                        "}";
            return createEmployeePayload;

    }

    public static String createEmployeeJsonBody(){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", "mika");
        obj.put("emp_lastname", "Kaka");
        obj.put("emp_middle_name", "mk");
        obj.put("emp_gender", "F");
        obj.put("emp_birthday", "2008-10-16");
        obj.put("emp_status", "confirmed");
        obj.put("emp_job_title", "QA Engineer");

        return  obj.toString();
    }

    public static String createEmployeePayloadDynamic(String firstName, String lastName, String middleName,
                                                      String gender, String dob,
                                                      String empStatus, String jobTitle){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", firstName);
        obj.put("emp_lastname", lastName);
        obj.put("emp_middle_name", middleName);
        obj.put("emp_gender", gender);
        obj.put("emp_birthday", dob);
        obj.put("emp_status", empStatus);
        obj.put("emp_job_title", jobTitle);

        return  obj.toString();
    }

    public static String adminPayload(){
        String adminPayload =
                "{\n" +
                        "    \"email\": \"batch14mik01a@test.com\",\n" +
                        "    \"password\": \"Testmika01@123\"\n" +
                        "}";
        return adminPayload;

    }
}
