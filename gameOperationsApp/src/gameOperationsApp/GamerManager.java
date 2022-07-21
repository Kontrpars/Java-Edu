package gameOperationsApp;


public abstract class GamerManager implements IGamer {

	public void singIn(Gamer gamer) {
		  
		  System.out.println("Singin to game : " + gamer.username);

	}
	
	public void logIn(Gamer gamer) {
		  
		  System.out.println("Login to game : " + gamer.username);

	}
}
