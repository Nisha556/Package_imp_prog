package College;

abstract  class Department {
public abstract void deptName();
public abstract void examInfo();
 public void  placementInfo()
 {
	 System.out.println(" placement_info : This year no Possible");
 }
}
interface Faculty
{
	public void facName();
	public void facSub();
}
class Student1 extends Department implements Faculty
{

	public void deptName()
	
	{
		System.out.println(" Dept_Name : MCA");
		
	}
	public void examInfo()
	{
		System.out.println(" Exam_Info : Due to Corona , All exam cancelled ");
		
	}
	public void facName()
	{
		System.out.println(" Faculty_name : John");
	}
	public void facSub()
	{
		System.out.println("Faculty_Sub : JAVA");
	}
	 //System.out.println("Student name is Micky");
}
class Myclass
{
	
	public static void main(String args[])
	{
		System.out.println("Student name is Micky");
		Department ob = new Student1();
		ob.deptName();
		ob.examInfo();
		ob.placementInfo();
		Faculty obj= new Student1();
		obj.facName();
		obj.facSub();
		
		
	}
}

//outputDept_Name : Student name is Micky
//MCA
//Exam_Info : Due to Corona , All exam cancelled 
//placement_info : This year no Possible
//Faculty_name : John
//Faculty_Sub : JAVA