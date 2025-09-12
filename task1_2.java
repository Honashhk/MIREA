//Запись массив данных типа список на java
import java.util.ArrayList;
public class Main {
public static void main(String args) {
ArrayList<Integer> myList = new ArrayList<Integer>();
myList.add(1);
myList.add(2);
myList.add(3);
System.out.println(myList); // => [1, 2, 3]
}
}



//Создание структуры данных типа стэк на java
public class MyStack<T> {
    private T stackArray;
    private int top;
    public MyStack(int capacity) {
        stackArray = (T) new Object[capacity];
        top = -1;
    }
    public void push(T item) {
        if (top == stackArray.length - 1) {
            throw new IllegalStateException("Stack overflow");
        }
        stackArray[++top] = item;
    }
    public T pop() {
        if (top == -1) {
            throw new IllegalStateException("Stack underflow");
        }
        return stackArray[top--];
    }
    public T peek() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackArray[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public int size() {
        return (top + 1);
    }
}
