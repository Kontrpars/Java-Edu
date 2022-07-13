package day3work2;

public class StudentManager extends UserManager
{
	public void add(Student student) 
	{
		System.out.println(student.getName()+" eklendi");
	}
	public void update(Student student) 
	{
		System.out.println(student.getName()+" güncellendi");
	}
	public void delete(Student student) 
	{
		System.out.println(student.getName()+" silindi");
	}
	public Student[] getAll() 
	{
		Student student1=new Student(1,"Ahmet","99999","Java","Erkek");
		Student student2=new Student(2,"Melike","11111","Python","Kadın");
		Student[] students= {student1,student2};

		return students;
	}
}