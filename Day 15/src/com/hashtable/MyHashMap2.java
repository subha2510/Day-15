package com.hashtable;
public class MyHashMap2 {
    public static void main(String[] args) {
        String str = "Paranoids are not paranoid because \r\n"
                + "they are paranoid but because \r\n"
                + "they keep putting themselves deliberately \r\n"
                + "into paranoid avoidable situations";
        String word = "avoidable";
        removeWord(str, word);
    }
    public static void removeWord(String str, String word) {
        String split[] = str.split(" ");							
        String s = "";
        for (String words : split) {
            if (!words.equals(word)){								
                s += words + " "; 									
            }
        }
        System.out.print(s);
    }
}