public class Main {
    public  static  final String URL="C:\\Users\\Avik\\Desktop\\Lesson.txt";
    public static void main(String[] args) throws Exception {
        String[] s = FileService.read(URL);

        StudentService.newStudent(s);
    }
}