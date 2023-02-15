package STACK;

import java.util.Stack;

public class pushAtBottom {
public static void atBottom(Stack<Integer>sc,int data){
   if(sc.isEmpty()){
    sc.push(data);
    return;
   }

    int top= sc.pop();
   atBottom(sc, data);
   sc.push(top);

}
    public static void main(String[] args) {
        Stack <Integer> sc=new Stack<>();
        sc.push(2);
        sc.push(4);
        sc.push(6);

        atBottom(sc,9);

        
        System.out.println(sc);
    }
    
}
