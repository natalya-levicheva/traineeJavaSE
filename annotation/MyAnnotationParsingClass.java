import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyAnnotationParsingClass {

  public static void main(String[] args) {
    try {
      for (Method method : MyAnnotationParsingClass.class
        .getClassLoader()
        .loadClass(("MyAnnotationExampleClass"))
        .getMethods()) {
        if (method.isAnnotationPresent(MyAnnotation.class)) {
          try {
            for (Annotation annotation : method.getDeclaredAnnotations()) {
              System.out.println("Аннотация в методе '"
                + method + "' : " + annotation);
            }
            MyAnnotation methodAnnotation = method
              .getAnnotation(MyAnnotation.class);
          } catch (Throwable ex) {
            ex.printStackTrace();
          }
        }
      }
    } catch (SecurityException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
