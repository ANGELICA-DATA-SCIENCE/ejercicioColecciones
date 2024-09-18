public class Main
{
    public static void main( String[] args ){
        CourseService courseService = new CourseService();

        String courseId = "math_01"; //id para curso
        String studentId = "120120";  // id del primer estudiante
        courseService.displayCourseInformation( courseId );  //muestra informacion del estudiante y del curso por su id
        courseService.displayStudentInformation( studentId);

        courseService.enrollStudent( studentId, courseId );  //informacion de sutdiante inscrito en matematicas
        courseService.displayStudentInformation( studentId);

        courseService.unEnrollStudent( studentId, courseId );  //desinscribe al estudiante de la materia math
        courseService.displayStudentInformation( studentId);
    }//main


}//class Main