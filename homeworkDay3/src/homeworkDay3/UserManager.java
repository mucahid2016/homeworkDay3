package homeworkDay3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() +" Kunllanýcý  adý eklendi.");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName()+ "Kullanýcý adý silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getPassword() + "Parola Güncellendi");
	}
	public  void list(User user) {
		System.out.println("Id  listelendi"+user.getId()  );
	}

}
