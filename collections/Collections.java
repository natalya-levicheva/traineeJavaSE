import java.util.*;

public class Collections {
  public static void main(String[] args) {
    Collections collections = new Collections();
  }

  public Collections() {
    this.test();
  }

  List<Integer> arrayList = new ArrayList<>();
  List<Integer> linkedList = new LinkedList<>();
  Set<Integer> hashSet = new HashSet<>();
  Set<Integer> treeSet = new TreeSet<>();

  private void test(){
    System.out.print("Добавление 500 тыс элементов в ArrayList ");
    System.out.println(this.addElement(this.arrayList));
    System.out.print("Добавление 500 тыс элементов в LinkedList ");
    System.out.println(this.addElement(this.linkedList));
    System.out.print("Добавление 500 тыс элементов в HashSet ");
    System.out.println(this.addElement(this.hashSet));
    System.out.print("Добавление 500 тыс элементов в TreeSet ");
    System.out.println(this.addElement(this.treeSet));
    System.out.println();
    System.out.print("Поиск 50 тыс элементов в ArrayList ");
    System.out.println(this.containsElement(this.arrayList));
    System.out.print("Поиск 50 тыс элементов в LinkedList ");
    System.out.println(this.containsElement(this.linkedList));
    System.out.print("Поиск 50 тыс элементов в HashSet ");
    System.out.println(this.containsElement(this.hashSet));
    System.out.print("Поиск 50 тыс элементов в TreeSet ");
    System.out.println(this.containsElement(this.treeSet));
    System.out.println();
    System.out.print("Удаление 40 тыс элементов из ArrayList ");
    System.out.println(this.removeElement(this.arrayList));
    System.out.print("Удаление 40 тыс элементов из LinkedList ");
    System.out.println(this.removeElement(this.linkedList));
    System.out.print("Удаление 40 тыс элементов из HashSet ");
    System.out.println(this.removeElement(this.hashSet));
    System.out.print("Удаление 40 тыс элементов из TreeSet ");
    System.out.println(this.removeElement(this.treeSet));
    System.out.println();
    System.out.print("Добавление 500 тыс элементов в начало ArrayList ");
    System.out.println(this.addElementToBeginning(this.arrayList));
    System.out.print("Добавление 500 тыс элементов в начало LinkedList ");
    System.out.println(this.addElementToBeginning(this.linkedList));
    System.out.println();
    System.out.print("Добавление 50 тыс элементов в середину ArrayList ");
    System.out.println(this.addElementToMiddle(this.arrayList));
    System.out.print("Добавление 50 тыс элементов в середину LinkedList ");
    System.out.println(this.addElementToMiddle(this.linkedList));
    System.out.println();

  }

  private Long addElement(List<Integer> list){
    long start = System.currentTimeMillis();
    for (int i = 0; i < 500000; i++){
      list.add(i);
    }
    long finish = System.currentTimeMillis();
    return finish - start;
  }

  private Long addElement(Set<Integer> set){
    long start = System.currentTimeMillis();
    for (int i = 0; i < 500000; i++){
      set.add(i);
    }
    long finish = System.currentTimeMillis();
    return finish - start;
  }

  private Long removeElement(List<Integer> list){
    long start = System.currentTimeMillis();
    for (int i = 0; i < 400000; i+=10){
      list.remove(i);
    }
    long finish = System.currentTimeMillis();
    return finish - start;
  }


  private Long removeElement(Set<Integer> set){
    long start = System.currentTimeMillis();
    for (int i = 0; i < 400000; i+=10){
      set.remove(i);
    }
    long finish = System.currentTimeMillis();
    return finish - start;
  }

  private Long containsElement(List<Integer> list){
    long start = System.currentTimeMillis();
    for(int i = 0; i < 500000; i+=10){
      list.contains(i);
    }
    long finish = System.currentTimeMillis();
    return finish - start;
  }

  private Long containsElement(Set<Integer> set){
    long start = System.currentTimeMillis();
    for(int i = 0; i < 50000; i+=10){
      set.contains(i);
    }
    long finish = System.currentTimeMillis();
    return finish - start;
  }

  private Long addElementToBeginning(List<Integer> list){
    long start = System.currentTimeMillis();
    for (int i = 0; i < 50000; i++){
      list.add(0, i);
    }
    long finish = System.currentTimeMillis();
    return finish - start;
  }

  private Long addElementToMiddle(List<Integer> list){
    long start = System.currentTimeMillis();
    for (int i = 0; i < 50000; i++){
      list.add(300000, i);
    }
    long finish = System.currentTimeMillis();
    return finish - start;
  }

}
