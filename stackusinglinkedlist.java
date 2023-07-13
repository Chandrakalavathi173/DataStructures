class Snode{
    public Object item;
    public Snode next;
}
public class stackusinglinkedlist{
    private Snode top;
    public stackusinglinkedlist(){
        this.top=null;
    }
    public void push(String i){
        Snode node = new Snode();
        node.item=i;
        node.next=top;
        top=node;
    }
    public void pop(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Popped element is "+top.item);
            top=top.next;
        }
    }
    public void peek(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(top.item);
        }
    }
    public void display(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Elements in stack are: ");
            while(top!=null){
                System.out.println(top.item);
                top=top.next;
            }
        }
    }
    public static void main(String[] args){
        stackusinglinkedlist sll=new stackusinglinkedlist();
        sll.push("Golla");
        sll.push("Manju");
        sll.push("Nath");
        // sll.display();
        // sll.peek();
        sll.pop();
        // sll.display();
        sll.pop();
        // sll.display();
        sll.pop();
        // sll.display();
        sll.pop();
        sll.display();
    }
}
