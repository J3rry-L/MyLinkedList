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
      Node node = new Node(value);
      start = node;
      end = node;
      size++;
      return true;
    }
    else{
      Node node = new Node(value);
      node.setPrev(end);
      end.setNext(node);
      end = node;
      size++;
      return true;
    }
  }
  public void add(int index, String value){
    if (index < 0 || index > size()){
      throw new IndexOutOfBoundsException("Given index out of bounds");
    }
    else if (size() == 0){
      add(value);
    }
    else if (index == 0){
      Node node = new Node(value);
      node.setNext(start);
      start.setPrev(node);
      start = node;
      size++;
    }
    else if (index == size()){
      Node node = new Node(value);
      node.setNext(null);
      end.setNext(node);
      node.setPrev(end);
      end = node;
      size++;
    }
    else{
      int currentIndex = 0;
      Node currentNode = start;
      while (index > currentIndex){
        currentNode = currentNode.getNext();
        currentIndex++;
      }
      Node node = new Node(value);
      node.setNext(currentNode);
      node.setPrev(currentNode.getPrev());
      currentNode.getPrev().setNext(node);
      currentNode.setPrev(node);
      size++;
    }
  }
  public String get(int index){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Given index out of bounds");
    }
    else{
      int currentIndex = 0;
      Node currentNode = start;
      while (index > currentIndex){
        currentNode = currentNode.getNext();
        currentIndex++;
      }
      return currentNode.getData();
    }
  }
  public String set(int index, String value){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Given index out of bounds");
    }
    else{
      String temp;
      int currentIndex = 0;
      Node currentNode = start;
      while (index > currentIndex){
        currentNode = currentNode.getNext();
        currentIndex++;
      }
      temp = currentNode.getData();
      currentNode.setData(value);
      return(temp);
    }
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

  public String toStringReversed(){
    String result = "";
    Node current = end;
    result += "[";
    while (current != null){
      if (current != end){
        result += ", ";
      }
      result += current.getData();
      current = current.getPrev();
    }
    result += "]";
    return result;
  }

  public String remove(int index){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Given index out of bounds");
    }
    else if (size() == 1){
      String temp = start.getData();
      start = null;
      end = null;
      size = 0;
      return temp;
    }
    else if (index == 0){
      String temp = start.getData();
      start.getNext().setPrev(null);
      start = start.getNext();
      size--;
      return temp;
    }
    else if (index == size() - 1){
      String temp = end.getData();
      end = end.getPrev();
      end.setNext(null);
      size--;
      return temp;
    }
    else{
      int currentIndex = 0;
      Node currentNode = start;
      while (index > currentIndex){
        currentNode = currentNode.getNext();
        currentIndex++;
      }
      String temp = currentNode.getData();
      currentNode.getPrev().setNext(currentNode.getNext());
      currentNode.getNext().setPrev(currentNode.getPrev());
      size--;
      return temp;
    }
  }

  public void extend(MyLinkedList other){
    if (size() == 0){
      size = other.size();
      start = other.start;
      end = other.end;
    }
    else if (other.size() == 0){
    }
    else{
      size += other.size();
      end.setNext(other.start);
      other.start.setPrev(end);
      end = other.end;
      other.size = 0;
      other.start = null;
      other.end = null;
    }
  }
}
