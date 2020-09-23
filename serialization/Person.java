import java.io.Serializable;

public class Person implements Serializable {
  String name;
  int age;
  transient String activity;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setActivity() {
    if (age > 0 && age <= 3)
      this.activity = "Sit at home";
    else if (age > 3 && age < 7)
      this.activity = "Go to kindergarten";
    else if (age >= 7 && age <= 17)
      this.activity = "Study at school";
    else if (age >=18 && age <= 23)
      this.activity = "Study at University";
    else if (age >= 24 && age < 65)
      this.activity = "Go to work";
    else if (age > 65)
      this.activity = "In retirement";
  }

  public void setActivity(String activity) {
    this.activity = activity;
  }

  @Override
  public String toString() {
    return "Person{" +
      "name ='" + name + '\'' +
      ", age ='" + age + '\'' +
      ", activity ='" + activity + '\'' +
      '}';
  }
}
