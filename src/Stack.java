public class Stack {
    int size;
    int top;
    int[] array;

    Stack(int capacity){
        top = 1;
        size = capacity;
        array = new int[size];
    }

    boolean isfull(){
        return (top == size-1);
    }

    boolean isEmpty(){
        return (top == -1);
    }

    void push(int item){
        if (isfull()){
            System.out.printIn("Stack Overflow");
        }else {
            array[top + 1] = item;
            top++;
        }
    }
    int pop(){
        if (isEmpty()){
            System.out.printIn("Stack Overflow");
        }else {
            top--;
        }
        return array[Previous Top];
    }
}
