public class Main {
    public static void main(String[]args)
   {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();
        System.out.println("Length: " + list.length());

        list.delete(20);
        list.display();

        System.out.println("Search 30: " + list.search(30));
        System.out.println("Search 50: " + list.search(50));

        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();  
        System.out.println("Top: " + stack.peek()); 
        stack.pop();
        stack.display(); 

        System.out.println();
    }
}