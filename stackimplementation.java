public class stackimplementation {
    private static Object[] stackarray;
    private static int size;
    private static int top;
    public stackimplementation(int size){
        this.size=size;
        this.top=-1;
        stackarray=new Object[size];
    }
    public void push(Object value){
        if(top==size-1){
            System.out.println("stack is full");
        }
        else if(top==-1){
            top=0;
            stackarray[top]=value;
        }
        else{
            top++;
            stackarray[top]=value;
        }
    }
    public Object pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            int oldtop=top;
            top--;
            stackarray[oldtop]=null;
            return stackarray[oldtop];
        }
    }
    public Object peek(){
        return stackarray[top];
    }
    public void display(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            for(int i=0;i<=top;i++){
                System.out.println(stackarray[i]);
            }
        }
    }
    public static void main(String[] args) {
        stackimplementation stack=new stackimplementation(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        System.out.println();
        stack.pop();
        stack.display();

    }   
}
