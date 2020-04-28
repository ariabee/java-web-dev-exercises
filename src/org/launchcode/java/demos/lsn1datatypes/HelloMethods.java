package org.launchcode.java.demos.lsn1datatypes;

public class HelloMethods {
    public static void main(String[] args) {
        // Calling a static method
        String message = Message.getMessage("fr");
        System.out.println(message);

        /* A non-static method must be called on an instance of the class
        (i.e. create a new object to call the method on) */
        String note = "This is my message note.";
        Message mew = new Message();
        int length = mew.getLength(note);
        System.out.println(length);
    }
}
