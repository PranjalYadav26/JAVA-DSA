package STACK;

import java.util.Stack;


public class paranthesis {

public static boolean isValid(String str){

Stack<Character> sc= new Stack<>();
for (int i = 0; i < str.length(); i++) {
    char ch=str.charAt(i);
if (ch=='['||ch=='{'||ch=='(') {
    sc.push(ch);
    }   
    else{
        if (sc.isEmpty()) {
            return false;
        }
        if (sc.peek()=='(' && ch==')'|| sc.peek()=='['&& ch==']'||sc.peek()=='{'&& ch=='}') {
        sc.pop();
        }
        else{
            return false;
        }
    } 
}
if(sc.isEmpty()){
    return true;
}
else{
    return false;
}
}
    public static void main(String[] args) {
       String str="{[]}";
boolean a=isValid(str);
    if(a==true){
        System.out.println("isBalance");

    }
    else{
        System.out.println("notBalance");
    }
    
    }
    
}
