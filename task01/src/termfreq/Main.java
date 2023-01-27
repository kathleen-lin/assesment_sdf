package termfreq;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        // read the text into memory while storing them into a map
        
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
        //System.out.println(totalWord);
        //System.out.println(Arrays.asList(wordCount));

        // sort the map and print out top 10 (modify the number to frquency)
        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
 
        wordCount.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(word -> reverseSortedMap.put(word.getKey(), word.getValue()));

        //System.out.println(Arrays.asList(reverseSortedMap));

        // got a LinkedHashMap name reverseSortedMap
        for (int i = 1; i < 11; i++){
            Map.Entry<String,Integer> topWords = reverseSortedMap.entrySet().iterator().next();
            String key= topWords.getKey();
            Integer value=topWords.getValue();
            float frequency = (float) value/totalWord;
            System.out.printf("%d. Word: \"%s\" Frequency: %f\n", i, key, frequency);
            reverseSortedMap.remove(key);
        }
        br.close();
    }
}


