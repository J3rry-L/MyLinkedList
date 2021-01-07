public class Tester{
  public static void main(String[] args){
    MyLinkedList list1 = new MyLinkedList();
    System.out.println(list1);
    System.out.println(list1.size());
    list1.add("element1");
    System.out.println(list1);
    System.out.println(list1.size());
    list1.add("element2");
    System.out.println(list1);
    System.out.println(list1.size());
    list1.add("element3");
    System.out.println(list1);
    System.out.println(list1.size());
    list1.add("element4");
    System.out.println(list1);
    System.out.println(list1.size());
    list1.add("element6");
    System.out.println(list1);
    System.out.println(list1.size());
    list1.add(4, "element5");
    System.out.println(list1);
    System.out.println(list1.size());
    list1.add(0, "element0");
    System.out.println(list1);
    System.out.println(list1.size());
    list1.add("element8");
    System.out.println(list1);
    System.out.println(list1.size());
    list1.add(7, "element7");
    System.out.println(list1);
    System.out.println(list1.size());
    list1.add("oops");
    System.out.println(list1);
    System.out.println(list1.size());
    System.out.println(list1.set(9,"element9"));
    System.out.println(list1);
    System.out.println(list1.size());
    System.out.println(list1.get(0));
    System.out.println(list1.get(5));
    System.out.println(list1.toStringReversed());

    MyLinkedList list2 = new MyLinkedList();
    list2.add("element10");
    list2.add("element11");
    list2.add("element12");
    list1.extend(list2);
    System.out.println(list1);
    System.out.println(list2);
    System.out.println(list1.size());

    list1.remove(12);
    System.out.println(list1);
    list1.remove(0);
    System.out.println(list1);
    list1.remove(9);
    System.out.println(list1);

    MyLinkedList a = new MyLinkedList();
    MyLinkedList b = new MyLinkedList();
    for(int i = 0; i < 10; i++){
      if(i < 5){
        a.add(i+"");
      }else{
        b.add(i+"");
      }
    }
    System.out.println();
    System.out.println("A:"+a+a.size());
    System.out.println("B:"+b+b.size());

    a.extend(b);
    System.out.println("A:"+a+a.size());
    System.out.println("B:"+b+b.size());
    System.out.println("A reversed:"+a.toStringReversed()+a.size());
    System.out.println("B reversed:"+b.toStringReversed()+b.size());
  }
}
/*
Expected Output[]
[]
0
[element1]
1
[element1, element2]
2
[element1, element2, element3]
3
[element1, element2, element3, element4]
4
[element1, element2, element3, element4, element6]
5
[element1, element2, element3, element4, element5, element6]
6
[element0, element1, element2, element3, element4, element5, element6]
7
[element0, element1, element2, element3, element4, element5, element6, element8]
8
[element0, element1, element2, element3, element4, element5, element6, element7, element8]
9
[element0, element1, element2, element3, element4, element5, element6, element7, element8, oops]
10
oops
[element0, element1, element2, element3, element4, element5, element6, element7, element8, element9]
10
element0
element5
[element9, element8, element7, element6, element5, element4, element3, element2, element1, element0]
[element0, element1, element2, element3, element4, element5, element6, element7, element8, element9, element10, element11, element12]
[]
13
[element0, element1, element2, element3, element4, element5, element6, element7, element8, element9, element10, element11]
[element1, element2, element3, element4, element5, element6, element7, element8, element9, element10, element11]
[element1, element2, element3, element4, element5, element6, element7, element8, element9, element11]

A:[0, 1, 2, 3, 4]5
B:[5, 6, 7, 8, 9]5
A:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]10
B:[]0
A reversed:[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]10
B reversed:[]0
*/
