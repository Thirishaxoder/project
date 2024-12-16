package com.thirisha.assignment;
import com.thirisha.assignment.Manager;
import com.thirisha.assignment.Developer;
import com.thirisha.assignment.EmployeeUtilities;
public class AssignmentMain {
public static void main(String[] args) {
Manager manager = new Manager("John", 101, 90000, "Sales");
Developer developer = new Developer("Alice", 102, 80000, "Java");
EmployeeUtilities.printEmployeeDetails(manager);
EmployeeUtilities.printEmployeeDetails(developer);
}
}
