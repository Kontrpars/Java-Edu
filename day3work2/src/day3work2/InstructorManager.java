package day3work2;

public class InstructorManager extends UserManager 
{
		
		public void add(Instructor instructor) 
		{
			System.out.println(instructor.getName()+" eklendi");
		}
		public void update(Instructor instructor) 
		{
			System.out.println(instructor.getName()+" güncellendi");
		}
		public void delete(Instructor instructor) 
		{
			System.out.println(instructor.getName()+" silindi");
		}
		public Instructor[] getAll() 
		{

			Instructor instructor1 = new Instructor(1, "Engin", "12345", "Java", 20000);
			Instructor instructor2 = new Instructor(2, "Metin", "67890", "Python", 15000);
			Instructor[] instructors= {instructor1,instructor2};

			return instructors;
		}
	
}
