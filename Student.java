package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName()
	{
		System.out.println("StudentName : Suganya Ravichandran");

	}

	public void studentDept()
	{
		System.out.println("Student Department : Computer Applications");
	}

	public void studentId()
	{
		System.out.println("StudentId : MCA201504052");
	}

	public static void main(String[] args)
	{
		Student s = new Student();
		s.studentId();
		s.studentName();
		s.studentDept();
		s.deptName();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
	}


}
