package com.Encryption;

public class Reverser extends Transpose {

    public Reverser(String s){
        super(s);
        System.out.println("This is inside of reverser");
    }

    public String reverseText(String word){
        StringBuffer result = new StringBuffer(word);
        result.reverse();
        return result.toString();
    }

    public String decode(String word){
        StringBuffer result = new StringBuffer(word);
        result.reverse();
        return result.toString();
    }
}