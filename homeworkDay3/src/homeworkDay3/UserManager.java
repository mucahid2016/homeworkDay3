package homeworkDay3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() +" Kunllan�c�  ad� eklendi.");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName()+ "Kullan�c� ad� silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getPassword() + "Parola G�ncellendi");
	}
	public  void list(User user) {
		System.out.println("Id  listelendi"+user.getId()  );
	}

}
