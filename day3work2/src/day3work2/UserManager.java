package day3work2;

		public class UserManager
		{
			public void add(User user) 
			{
				System.out.println(user.getName()+" eklendi");
			}
			public void update(User user)
			{
				System.out.println(user.getName()+" güncellendi");
			}
			public void delete(User user) 
			{
				System.out.println(user.getName()+" silindi");
			}
			public User[] getAll()
			{

				User user1=new User(1,"Eren","77777","Java");
				User user2=new User(2,"Mert","55555","Python");
				User[] users= {user1,user2};

				return users;
			}
		}
