package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        //The intended action is to reverse the string we get here, I think.
        //We were told to use a StringBuilder instead of appending characters into a new string.
        StringBuilder invMessage = new StringBuilder();
        //But I'm not sure how we would get the characters into the StringBuilder to begin with without it.
        invMessage.append(message);
        invMessage.reverse();
        return invMessage.toString(); //I don't want to make a second String object just to return it.
    }
    
}