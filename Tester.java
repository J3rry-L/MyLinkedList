public class Tester{
  public static void main(String[] args){
    MyLinkedList list1 = new MyLinkedList();
    list1.add("element1");
    System.out.println(list1);
    list1.add("element2");
    System.out.println(list1);
    list1.add("element3");
    System.out.println(list1);
    list1.add("element4");
    System.out.println(list1);
    list1.add("element6");
    System.out.println(list1);
    list1.add(4, "element5");
    System.out.println(list1);
    list1.add(0, "element0");
    System.out.println(list1);
    list1.add(-8, "element7");
    System.out.println(list1);
    list1.add(123, "element7");
    System.out.println(list1);
  }
}
