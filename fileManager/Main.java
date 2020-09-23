import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    System.out.println("Введите абсолютный путь к файлу и ключ операции");
    System.out.println("-c создание файла");
    System.out.println("-d удаление файла");
    System.out.println("-r чтение из файла");
    System.out.println("-w запись в файл");
    Scanner scanner = new Scanner(System.in);
    while (true) {
      String path = scanner.next();
      String key = scanner.next();
        FileOperations fileOperations = new FileOperations(path, key);
    }
  }
}
