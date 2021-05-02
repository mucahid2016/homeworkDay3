package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		studentManager.studentRegister("Ahmet");
		
		
		Student student = new Student(1, "Mücahid", "Ekmekçi", "mucahid2011@gmail.com", "1234", "8568");
		student.getFirstName();
		student.getLastName();
		student.getEmail();
		student.getPassword();
		student.getStudentNumber();
		
		System.out.println("Ýsim: "+student.getFirstName());
		System.out.println("Soyisim: "+ student.getLastName());
		System.out.println("Mail: "+student.getEmail());
		System.out.println("Parola: " +student.getPassword());
		System.out.println("Ögrenci numarasý: "+ student.getStudentNumber());
		
		Instructor instructor = new Instructor(10, "Engin", "Demirog", "demirog@gmail.com", "12312", "Java kampý");
		instructor.getFirstName();
		instructor.getLastName();
		instructor.getEmail();
		instructor.getPassword();
		instructor.getInstructorName();
		
		System.out.println( "Eðitmen adý: " +instructor.getFirstName());
		System.out.println( "Eðitmen Soyadý: " +instructor.getLastName());
		System.out.println( "Eðitmen Maili: " +instructor.getEmail());
		System.out.println( "Eðitmen þifresi : " +instructor.getPassword());
		System.out.println( "Eðitmen kurs adý :" +instructor.getInstructorName());
		

	}

}
