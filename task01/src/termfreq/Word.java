package termfreq;

public class Word {
    public String word;
    public int count;
    public float frequency;

    public Word(String word) {
        this.word = word;
    }

    
    public String getWord() {
        return word;
    }

    


    public int getCount() {
        return count;
    }


    public void setCount(int count) {
        this.count = count;
    }


    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }


    public String cleanWord() {
        
        String cleanedWord = this.word.replaceAll("[;.,:!-(){},\"?]", "").toLowerCase();
        this.word = cleanedWord;
        //System.out.println(cleanedWord);

        return cleanedWord;
    }

    public void addCount(){
        this.count += 1;
    }

    public float calculateFrequency (int totalWordCount){
        
        float frequency= (float) (count/totalWordCount);

        return frequency;

    }

    
    

    
}
