package week3.day1;

public class Students {
	
	public void getStudentInfo(int studentId)
	{
		System.out.println(studentId);
	}
	public void getStudentInfo(int studentId,String studentName) 
	{
		System.out.println("--------------");
		System.out.println("StudentDetails");
		System.out.println("--------------");
		System.out.println("Id : "+ studentId);
		System.out.println("Name : "+ studentName);
	}
	
	public void getStudentInfo(String emailid,int contactno)
	{
		System.out.println("EmailId : "+ emailid);
		System.out.println("ContactNo : "+ contactno);
	}

	public static void main(String[] args) {
		Students s= new Students();
		s.getStudentInfo(101);
		s.getStudentInfo(101, "Suganya");
		s.getStudentInfo("suganmca2015@gmail.com", 861003433);
	}

}
