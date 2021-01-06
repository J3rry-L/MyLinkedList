public class Node{
  private String data;
  private Node next,prev;
  public Node(String data){
    this.data = data;
    this.next = null;
    this.prev = null;
  }
  public String getData(){
    return data;
  }
  public void setData(String newData){
    data = newData;
  }
  public Node getNext(){
    return next;
  }
  public void setNext(Node newNext){
    next = newNext;
  }
  public Node getPrev(){
    return prev;
  }
  public void setPrev(Node newPrev){
    prev = newPrev;
  }
}
