import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WritePeople {
  public static void main(String[] args) {
    List<Person> people = new ArrayList<>();
    people.add(new Person("Anna", 11));
    people.add(new Person("Boris", 2));
    people.add(new Person("Aleksandr", 53));
    people.add(new Person("Olga", 77));
    people.add(new Person("Anton", 16));
    people.add(new Person("Lev", 39));

    try{
      FileOutputStream outputFile = new FileOutputStream("people.bin");
      ObjectOutputStream outputObject = new ObjectOutputStream(outputFile);
      outputObject.writeObject(people);
      outputFile.close();
    }
    catch (IOException e){
      e.printStackTrace();
    }

  }


}
