package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

/* TODO: try this one! */
public class CountingCharacters {

    public static void main(String[] args) {
        HashMap<Character, Integer> characterCounts = new HashMap<>();
        String testString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charsInString = testString.toCharArray();

        for (char c : charsInString) {
            if (characterCounts.containsKey(c)) {
                characterCounts.put(c, characterCounts.get(c) + 1);
            }
            else {
                characterCounts.put(c, -1);
            }
        }
        for (Map.Entry<Character, Integer> oneChar : characterCounts.entrySet()) {
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }
    }
}
