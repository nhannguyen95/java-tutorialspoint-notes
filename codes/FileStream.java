import java.io.*;

public class FileStream {
  public static void main(String[] args) throws IOException {
    try {
      byte bWrite[] = {1,2,3,4,5};
      OutputStream out = new FileOutputStream("text.txt");
      for(byte x : bWrite) {
        out.write(x);
      }
      out.close();

      InputStream in = new FileInputStream("text.txt");
      int size = in.available();
      for(int i = 0; i < size; i++) {
        System.out.println((byte)in.read() + " ");
      }
      in.close();
    } catch(IOException e) {
      System.out.print("Exception");
    }
  }
}
