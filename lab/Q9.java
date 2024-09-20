package lab;

import java.util.Scanner;

// Write a Java program to create a method that takes a string as input and throws
// an exception if the string does not contain vowels

public class Q9{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       System.out.println("enter text:sgrf");
       String text= sc.next();
       try{
            checkVowels(text);
            System.out.println("input contains vowels");
       }catch(NoVowelException e){
            System.out.println(e);
       }
       sc.close();
    }

    static void checkVowels(String text) throws NoVowelException{
        char ch[]={'a','e','i','o','u','A','E','I','O','U'};
        boolean checker=false;
        for(char i:ch){
            String v= ""+i;
            if(text.contains(v)){
                checker=true;
                break;
            }
        }
        if(!checker){
            throw new NoVowelException("String does not contain vowel");
        }  
    }
}

class NoVowelException extends Exception{
    public NoVowelException(String message){
        super(message);
    }
}

