
class Node{
    public Object item;
    public Node next;//pointing to next node
}
public class linkedlistimplementation {
    private int size;
    private Node head;

   public linkedlistimplementation(){
        this.size=0;
        this.head= null;   
   }
   public void insertingnode(String i){
    Node node= new Node();
    node.item= i;
    if(this.head==null){
        this.head=node;
        this.size+=1;
    }
    else{
        Node current=this.head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=node;
        node.next=null;
        this.size+=1;
    }
  }
   public void addAtStart(String i){
    Node node=new Node();
    node.item=i;
    node.next=this.head;
    this.head=node;
    this.size+=1;
    }
    public void addAtMiddle(String i,int pos)
	{
		Node node=new Node();
		Node current=this.head;
		if(this.head!=null && pos<=this.size)
		{
			for(int j=1;j<pos-1;j++) {
				current=current.next;
			}
			node.item=i;
			node.next=current.next;
			current.next=node;
			this.size+=1;
		}
		else
		{
			System.out.println("position is greater than size");
		}
	}
    public void addAtEnd(String i){
        Node node=new Node();
        Node current=this.head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=node;
        node.item=i;
        node.next=null;
        this.size+=1;

    }
    public void deleteAtStart(){
        if(this.head==null){
            System.out.println("list is empty");
        }
        else{
            this.head=head.next;
        }
    }
    public void deleteAtMiddle(int pos){
        Node current=this.head;
        for(int j=1;j<pos-1;j++){
            current=current.next;
        }
        current.next=current.next.next;

    }
    public void deleteAtEnd(){
        Node current=this.head;
        if(this.head==null){
            System.out.println("List is empty");
        }
        else if(head.next==null){
            this.head=null;
            this.size=0;
        }
        else{
            Node prev=null;
            while(current.next!=null){
                prev=current;
                current=current.next;
            }
            prev.next=null;
            this.size-=1;
        }
        
    }
    public void find(String value) {
        Node current = this.head;
        boolean flag = false;
        int count=1;
        if(this.head==null){
            System.out.println("list is empty");
            // return;
        }
        else{
        while(current!=null) {
            if (current.item.equals(value)) {
                System.out.println("Element present at position " +count);
                flag = true;
            }
            count++;
            current = current.next;
        }
        if (!flag) {
            System.out.println("Element not present in Linked List");
        }
    }
    }

     public void display() {
        Node current = this.head;
        System.out.println("The elements in the linkedlist are ");
        while(current!=null) {
                System.out.println(current.item);
                current=current.next;
        }
    
     }
    public static void main(String args[]){
        linkedlistimplementation llist=new linkedlistimplementation();
        // inserting nodes
        llist.insertingnode("Chandu");
        llist.insertingnode("Manju");
        llist.insertingnode("sruthi");
        llist.insertingnode("priyanka");
        llist.insertingnode("Veena");
        llist.display();
        // adding at start
        llist.addAtStart("pallavi");
        llist.display();
        // adding at middle
        llist.addAtMiddle("Deepthi",3);
        llist.display();
        // adding at end
        llist.addAtEnd("Harathi");
        llist.display();
        // deleting at start
        llist.deleteAtStart();
        llist.display();
        // deleting at middle
        llist.deleteAtMiddle(4);
        llist.display();
        // deleting at end
        llist.deleteAtEnd();
        llist.display();
        // finding a value
        llist.find("Veena");

    }
}
