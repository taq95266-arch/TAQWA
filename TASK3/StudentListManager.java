import java.util.ArrayList;
import java.util.List;

public class StudentListManager {
    public static void main(String [] args){
        String student;
        List<String> Student =new ArrayList<>();
        Student.add("TAQWA");
        Student.add("REEM");
        Student.add("MAIADA");
        Student.add("SALWA");
        Student.add("KHALID");
        Student.add("NAWAF");
        Student.add("JOKHA");
        Student.add("KHALID");
        Student.add("SALIMA");
        Student.add("SAMIA");

        for (String Student1 :Student){
            System.out.println(Student1);
        }

         System.out.println("\n  total number of students : " + Student.size() );
        System.out.println("\n  first student : " + Student.get(0) );
        System.out.println("\n  last student : " + Student.get(9) );

        String searchName="taqwa";

        if (Student.contains(searchName)){
            System.out.println(searchName = " is in the Student list ");
        }
        else{
            System.out.println(searchName = " is not in the Student list ");}
        }

        String removeName=("TAQWA");


    }


