package com.Encryption;

import java.util.StringTokenizer;

public abstract class Cipher implements Constants{

    private String  message;
    StringBuffer    encrypted_message, decypted_message;

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

    public final void decrypt(String message){
        /* The encoded message string is tokenized into individual words,
         * and each word is encoded by calling the decode method
         */
        decypted_message = new StringBuffer();
        StringTokenizer words = new StringTokenizer(message);

        while(words.hasMoreTokens()){
            String s = words.nextToken();
            s = decode(s) + " ";
            decypted_message.append(s);
        }
    }

    public String getEncodedMessage(){
        return encrypted_message.toString();
    }

    public String getDecodedMessage(){
        return decypted_message.toString();
    }

    public abstract String encode(String s);
    public abstract String decode(String s);
}
