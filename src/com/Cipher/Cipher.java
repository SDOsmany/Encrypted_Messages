package com.Cipher;

import java.util.StringTokenizer;

public abstract class Cipher {

    private String  message;
    StringBuffer    encrypted_message = new StringBuffer();

    public Cipher(String text){
        message = text;
    }

    public final void encrypt(){
        /* The message string is tokenized into individual words,
         * and each word is encoded by calling the encode method
         */
        encrypted_message = new StringBuffer();
        StringTokenizer words = new StringTokenizer(message);

        while (words.hasMoreTokens()){
            String s = words.nextToken();
            s = encode(s) + " ";
            encrypted_message.append(s);
        }

    }
    public abstract String encode(String s);
    public abstract String decode(String s);
}
