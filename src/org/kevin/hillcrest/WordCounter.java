package org.kevin.hillcrest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) throws FileNotFoundException{
        var words= new HashMap<String, Integer>();
        var doc = readWords("doc");
        for(var word: doc){
            var count = words.get(word);
            if(count == null){
                count =1;
            } else {
                count += 1;
            }
            words.put(word,count);
        }
        for (var entry: words.entrySet()){
            System.out.printf("%s : %d\n", entry.getKey(),entry.getValue());
        }
    }
    private static List<String> readWords(String filename) throws FileNotFoundException {
        var words = new ArrayList<String>();
        var in = new Scanner(new File(filename));
        in.useDelimiter("[^a-zA-Z]+");
        while (in.hasNext()){
            words.add(in.next().toLowerCase());
        }
        return words;
    }
}
