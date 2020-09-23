import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class MyAnnotationExampleClass {

  public static void main(String[] args) {
  }

  @MyAnnotation(message = "This is the MyAnnotation")
  public String myMethod() {
    return "Переопределили метод toString() ";
  }


}
