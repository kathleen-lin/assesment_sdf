package termfreq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        // read the text into memory while storing them into a map
        System.out.println("Hello world");
        
        Map<String, Integer> wordCount = new HashMap<>();
        int totalWord = 0;

        Reader r = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(r);

        String line = "";
        //System.out.println(firstLine);
        while (null != (line = br.readLine())){
            // split by spaces
            if (line.equals("")){
                continue;
            } else {
                String [] wordsInLine = line.split(" ");
                for (int i = 0; i < wordsInLine.length; i++){
                    Word word = new Word(wordsInLine[i]);
                    word.cleanWord();
                    totalWord++;
                    // check if the word is in the map

                    if (wordCount.containsKey(word.getWord())){
                        // increase count of that word
                        word.setCount(word.count + 1);
                        wordCount.put(word.getWord(), wordCount.get(word.getWord()) +1);     
                    } else {
                        word.setCount(1);
                        wordCount.put(word.getWord(), 1);
                    }

                    //float frequency = word.calculateFrequency(totalWord);

                    }

                }
        }

        // sort the map and print out
//         Map<String, Integer> sortedFrequncy = budget .entrySet() .stream() .sorted(comparingByValue()) .collect( toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));

// Read more: https://javarevisited.blogspot.com/2017/09/java-8-sorting-hashmap-by-values-in.html#ixzz7rZ4ZvQK7
        


        System.out.println(totalWord);
        System.out.println(Arrays.asList(wordCount)); // method 1
    
        }


    }



