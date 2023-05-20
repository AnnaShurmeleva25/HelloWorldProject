package by.teachmeskills.HomeWork13;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        String str = "Ничего не понимаю вообще";
        String[] words = str.split(" ");
        List<String> allWords = new ArrayList<>();
        for (String allWord : words) {
            allWords.add(allWord);
        }
            Collections.sort(allWords);
            System.out.println(allWords);
        }
    }
