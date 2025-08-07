public class SinglyLinkedList{
    Node head;
    public void insert(int data){
      Node newnode = new Node(data);
      if(this.head==null){
        this.head = newnode;
      }
      else{
        Node temp = this.head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newnode;
      }
    }
}
