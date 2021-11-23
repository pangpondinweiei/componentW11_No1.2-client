package homework13_Ex1_2_client;

import java.util.List;

public class homework13_Ex1_2_client {

    public static void main(String[] args) {
      int std = insertStudent(61050959, "Supawich", 3.28);
      //String std = updateStudent(61050959, "John Doe", 2.00);
       //services.Student std = findStudentById(61050210);
       //String std = removeStudent(61050959);
       System.out.println(std);  
    }
    private static services.Student findStudentById(int id){
        
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        return port.findStudentById(id);
    }
    
    private static int insertStudent(int id, String name, double GPA){
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        return port.insertStudent(id, name, GPA);
    }
    
    private static String updateStudent(int id, String name, double GPA){
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        return port.updateStudent(id, name, GPA);
    }
    
    private static String removeStudent(int id){
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        return port.removeStudent(id);
    }
    
   
    
    
    
}
