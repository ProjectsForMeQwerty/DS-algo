package dsAlgo.src;

import dsAlgo.question.arrays_Hashing.ValidAnagram;

public class App {
    public static void main(String[] args) throws Exception {
        ValidAnagram obj = new ValidAnagram();
        System.err.println("isAnagram");
        System.out.println(obj.isAnagramFastApprochWithOnlyArray("aacc","ccac"));
    }
}
