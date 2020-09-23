package exceptions;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws ExceededNumberOfArrayList {
    List<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < 12; i++) {
      if (arrayList.size() < 10) {
        arrayList.add(i);
        System.out.println(arrayList.get(i));
      }
        else throw new ExceededNumberOfArrayList("You can add up to 10 items to ArrayList");
    }

  }
}
