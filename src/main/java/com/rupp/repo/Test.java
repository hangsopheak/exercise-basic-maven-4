package com.rupp.repo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setFirstName("Vichea");
		employee.setLastName("So");
		employee.setSalary((double) 660);
		employee.setYears(3);
		employee.setBirthDate(stringToDate("1990-01-01", "yyyy-MM-dd"));
		
		Developer developer = new Developer();
		developer.setFirstName("Makara");
		developer.setLastName("Leng");
		developer.setSalary((double) 460);
		developer.setYears(1);
		developer.setComment("He is a developer");
		developer.setBirthDate(stringToDate("1992-08-21", "yyyy-MM-dd"));

		TeamLeader teamLeader = new TeamLeader();
		teamLeader.setFirstName("Dara");
		teamLeader.setLastName("Seng");
		teamLeader.setSalary((double) 760);
		teamLeader.setYears(4);
		teamLeader.setProjectNum(4);
		teamLeader.setBirthDate(stringToDate("1985-11-09", "yyyy-MM-dd"));

		Employee employees[] = {employee, developer, teamLeader};
		
		List<Employee> employeeList = new ArrayList<Employee>(Arrays.asList(employees));
		
		for(Employee emp:employeeList){
			System.out.println(emp.getDataView());
		}
		System.out.println("========================");
		System.out.println(employee.getDataView());
		System.out.println(developer.getDataView());
		System.out.println(teamLeader.getDataView());
		
	}
	
	public static Date stringToDate(String dateString, String dateFormat) {
		Date result = null;
		if(dateString != null && dateFormat != null){
			SimpleDateFormat fmt = new SimpleDateFormat(dateFormat);
			try {
				result = fmt.parse(dateString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;	
	}

}
