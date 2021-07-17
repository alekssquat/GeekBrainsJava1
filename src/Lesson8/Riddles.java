package Lesson8;

import java.util.Random;

public class Riddles {
    String[] words;

    Riddles(String[]words){
        this.words=words;
        gameStart();
    }
    private String getRandomWord(){
        Random r=new Random();
        String answer = words[r.nextInt(words.length)];
        System.out.println("the answer is - " + answer);
        return answer.toLowerCase();
    }

    public void gameStart(){
        new CompareTwoWords(getRandomWord());
    }
}
