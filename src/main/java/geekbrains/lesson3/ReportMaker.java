package geekbrains.lesson3;

import java.io.FileOutputStream;
import java.io.IOException;

public class ReportMaker {
    public static void makePDFReport(String path, String data) throws IOException{
//        try {
            FileOutputStream outputStream = new FileOutputStream(path);
            outputStream.write(data.getBytes());
            outputStream.close();
//        } catch (IOException e) {
//
//        }
    }
}
