package org.launchcode.java.demos.lsn1datatypes;

public class Message {
    // A static method can be called with Message.getMessage()
    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else {
            return "Hello, World!";
        }
    }

    // A non-static method must be called on an obj
    public int getLength(String message) {
        return message.length();
    }

    // Note that no "main" method means the class can't run on its own
}
