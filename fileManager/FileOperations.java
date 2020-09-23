import java.io.*;
import java.util.Scanner;

public class FileOperations {
  String path;
  String key;

  public FileOperations(String path, String key) {
    this.path = path;
    this.key = key;
    this.caseOperation();
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getPath() {
    return path;
  }

  public void setPath() {
    this.path = path;
  }

  private void caseOperation() {
    switch (this.key){
      case "-c":
        this.createFile();
        break;
      case "-w":
        this.writeToFile();
        break;
      case "-r":
        this.readFromFile();
        break;
      case "-d":
        this.deleteFile();
        break;
    }
  }

  private void createFile(){
    File file = new File(this.path);
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(file);
    } catch (FileNotFoundException e) {
      System.out.println("Error");
    }
  }

  private void deleteFile(){
    File file = new File(this.path);
    if (file.delete())
      System.out.println("Delete successfully");
    else {
      System.out.println("Failed to delete the file");
    }

  }

  private void writeToFile(){
    FileOutputStream fileOutputStream = null;
    String text = "";
    try {
      fileOutputStream = new FileOutputStream(this.path);
      System.out.println("Введите текст");
      Scanner scanner = new Scanner(System.in);
      text = scanner.nextLine();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    try {
      fileOutputStream.write(text.getBytes());
      fileOutputStream.close();
      System.out.println("Write successfully");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void readFromFile(){
    try {
      FileReader fileReader = new FileReader(path);
      int i;
        while ((i = fileReader.read()) != -1)
          System.out.print((char) i);
    } catch (FileNotFoundException e) {
      System.out.println("Файл не найден");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
