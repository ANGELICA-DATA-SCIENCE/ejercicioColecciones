import java.util.HashMap;

public class CourseService{
    HashMap<String, Student> students = new HashMap<>(); // hasmap de estudiante
    HashMap<String, Course> courses = new HashMap<>();   // hashmap de cursos


    public CourseService(){
        students.put( "120120", new Student( "Santiago", "120120" ) );  //creacion de estudiantes
        students.put( "884545", new Student( "Kate", "884545" ) );
        students.put( "458787", new Student( "Alejandra", "458787" ) );
        students.put( "135464", new Student( "Maria", "135464" ) );
        students.put( "778979", new Student( "Peter", "778979" ) );

        courses.put( "math_01", new Course( "Mathematics 1", "math_01", 8 ) );  //creacion de cursos
        courses.put( "biol_01", new Course( "Biology 1", "biol_01", 8 ) );
        courses.put( "phys_01", new Course( "Physics 1", "phys_01", 8 ) );
        courses.put( "art_01", new Course( "Arts 1", "art_01", 8 ) );
        courses.put( "chem_01", new Course( "Chemistry 1", "chem_01", 8 ) );
        courses.put( "sport_01", new Course( "Sports 1", "sport_01", 8 ) );
    }// constructor

    public void enrollStudent(String studentId, String courseId){
    	//TODO implement so it adds the given course form the student
    	Student estudiante = students.get(studentId);
    	Course curso = courses.get(courseId);
    	
    	System.out.println("********* enrollStudent ******");
    	if (estudiante != null && curso != null) {  //validando que el objeto estudiante y curso no sean nulos
    		estudiante.enroll(curso);
    		System.out.println("Estudiante " + estudiante.getName()+" está incrito en "+ curso.toString());
    	}else {
    		System.out.println("Estudiante no encontrado.");
    	}//if else
    }//enrollStudent


	public void unEnrollStudent(String studentId, String courseId){
        //TODO implement so it removes the given course form the student
		Student estudiante = students.get(studentId);
    	Course curso = courses.get(courseId);
    	
    	System.out.println("********* unEnrollStudent ******");
    	if (estudiante != null && curso != null) {
    		estudiante.unEnroll(curso);
    		System.out.println("Estudiante " + estudiante.getName() + " se dió de baja de " + curso.toString()); //el to string devolvera la representacion del objeto
    	}else {
    		System.out.println("Curso no encontrado. Vuelve a intentarlo.");
    	}//if else
    }//unEnrollStudent

    public void displayCourseInformation(String courseId){
        //TODO implement so it shows the course name, id and credits
    	Course curso = courses.get(courseId);
    	
    	System.out.println("********* displayCourseInformation ******");
    	if (curso != null) {
    		System.out.println("Nombre del curso " + curso.toString());
    	}else {
    		System.out.println("Curso no encontrado.");
    	}//if else
    	
    	
    }//displayCourseInformation

    public void displayStudentInformation(String studentId){  //mostrar informacion del estudiante
    	//TODO implement so it shows the student name, id and list of enrolled courses
    	//buscar el mapa con el id, para obtener al estudiante e imprimir el toda lainformacion del estudiante
    	
//    	Student estudiante = students.get(studentId){
//    		
//    	}
    	
    	
    }//displayStudentInformation


}// class CourseService