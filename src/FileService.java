import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileService {
    public  static String[] read (String url) throws Exception{
        Path way= Paths.get(url);
        String[] cuantity= Files.readAllLines(way).toArray(new String[0]);
        return  cuantity;
    }
    public  static  void  write(String way, String text)throws Exception{
        Files.write(Paths.get(way),text.toString().getBytes(), StandardOpenOption.APPEND);
    }
}
