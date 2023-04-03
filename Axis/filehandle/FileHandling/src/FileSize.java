import java.io.File;

class Class1 {
    public void size() {
        String Path = "files/test2";
        File file = new File(Path);
        long fileSizeInBytes = file.length();
        double fileSizeInMB = (double) fileSizeInBytes / (1024 * 1024);
        System.out.println("File size: " + fileSizeInMB + " MB");
    }
}

public class FileSize {
    public static void main(String[] args) {
        Class1 c = new Class1();
        c.size();
    }
}
