package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		studentManager.studentRegister("Ahmet");
		
		
		Student student = new Student(1, "M�cahid", "Ekmek�i", "mucahid2011@gmail.com", "1234", "8568");
		student.getFirstName();
		student.getLastName();
		student.getEmail();
		student.getPassword();
		student.getStudentNumber();
		
		System.out.println("�sim: "+student.getFirstName());
		System.out.println("Soyisim: "+ student.getLastName());
		System.out.println("Mail: "+student.getEmail());
		System.out.println("Parola: " +student.getPassword());
		System.out.println("�grenci numaras�: "+ student.getStudentNumber());
		
		Instructor instructor = new Instructor(10, "Engin", "Demirog", "demirog@gmail.com", "12312", "Java kamp�");
		instructor.getFirstName();
		instructor.getLastName();
		instructor.getEmail();
		instructor.getPassword();
		instructor.getInstructorName();
		
		System.out.println( "E�itmen ad�: " +instructor.getFirstName());
		System.out.println( "E�itmen Soyad�: " +instructor.getLastName());
		System.out.println( "E�itmen Maili: " +instructor.getEmail());
		System.out.println( "E�itmen �ifresi : " +instructor.getPassword());
		System.out.println( "E�itmen kurs ad� :" +instructor.getInstructorName());
		

	}

}
