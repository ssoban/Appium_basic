
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Create_txt_file{  

	public static void log(String msg) {

        FileWriter writer = null;
        try {
            File f = new File("C:\\Users\\soban\\AndroidStudioProjects\\PowerTest\\app\\src\\androidTest\\java\\com\\mi\\soban\\powertest\\test.txt");
            if (!f.exists()) {
               f.createNewFile();
                // device.console("hsjjs");

                System.out.printf("created new file");
            }
            writer = new FileWriter("C:\\Users\\soban\\AndroidStudioProjects\\PowerTest\\app\\src\\androidTest\\java\\com\\mi\\soban\\powertest\\test.txt", true);
            writer.write(msg + "\n");
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (Exception e) {
                log(e.toString());
            }
        }
    }
public static void main(String args[]){
	
	Create_txt_file.log("ssss");
    
}
}
