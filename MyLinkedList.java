public class MyLinkedList{
  private int size;
  private Node start,end;
  public MyLinkedList(){
    size = 0;
    start = null;
    end = null;
  }
  public int size(){
    return size;
  }
  public boolean add(String value){
    if (size == 0){
      Node node = new Node(value, null, null);
      start = node;
      end = node;
      size++;
      return true;
    }
    else{
      Node node = new Node(value, null, end);
      end.setNext(node);
      end = node;
      size++;
      return true;
    }
  }
  public boolean add(int index, String value){
    if (index < 0){
      return false;
    }
    else if (index > size || size == 0){
      return(add(value));
    }
    else if (index == 0){
      Node node = new Node(value, start, null);
      start.setPrev(node);
      start = node;
      size++;
      return true;
    }
    else{
      int currentIndex = 0;
      Node currentNode = start;
      while (index > currentIndex){
        currentNode = currentNode.getNext();
        currentIndex++;
      }
      Node node = new Node(value, currentNode, currentNode.getPrev());
      currentNode.getPrev().setNext(node);
      currentNode.setPrev(node);
      size++;
      return true;
    }
  }
  public String get(int index){
    return null;
  }
  public String set(int index, String value){
    return null;
  }
  public String toString(){
    String result = "";
    Node current = start;
    result += "[";
    while (current != null){
      if (current != start){
        result += ", ";
      }
      result += current.getData();
      current = current.getNext();
    }
    result += "]";
    return result;
  }
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
