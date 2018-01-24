import java.io.*;

public class Cat {
  public static void main(String[] args) {
    try {
      Cat c = new Cat();
      for (String fileName: args) {
         c.cat(fileName);
      }
    } catch (Exception bland) {
      bland.printStackTrace();
    }
  }

  public void cat(String fileName) throws Exception {
     LineNumberReader in = new LineNumberReader(new FileReader(fileName));
     String line = null;
     while (null != (line = in.readLine())) {
       System.out.println(line);
     }
  }
}
