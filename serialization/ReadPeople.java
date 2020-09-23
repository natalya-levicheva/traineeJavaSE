import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadPeople {
  public static void main(String[] args) throws FileNotFoundException {
    try {
      FileInputStream inputFile = new FileInputStream("people.bin");
      ObjectInputStream inputObject = new ObjectInputStream(inputFile);
      List<Person> people = (List<Person>) inputObject.readObject();
      for(Person person : people){
        person.setActivity();
        System.out.println(person.toString());
      }
    }
    catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }

  }

}
