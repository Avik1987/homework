import java.io.File;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;



public class StudentService {
    public  static Student[] convert(String[] result){
    Student[] students=new Student[result.length];
        for (int i = 0; i < result.length; i++) {
            Student student=new Student(result[i]);
            students[i]= student;

        }
        return students;
    }
    public static  void  newStudent(String[] user) throws  Exception{
        for (int i = 0; i < user.length; i++) {
            String [] s = user[i].split("-");
            String fileName = s[0];
            File file= new File("C:\\Users\\Avik\\Desktop\\" + fileName + ".txt");
            file.createNewFile();
            String way = "C:\\Users\\Avik\\Desktop\\" + fileName + ".txt";
           FileService.write(way, user[i]);
        }
    }
}
