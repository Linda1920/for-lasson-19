package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class Task2 {


    public static void main(String[] args) {
        List<String> clothesList=new ArrayList<>(Arrays.asList("Coat","Skirt", "Jumpsuit"));
        System.out.println("The original list ");
        System.out.println(clothesList);

  //      clothesList.sort((first,second)-> Integer.compare(second.length(),first.length()));
 //       System.out.println(clothesList);
        String longestWord = findLongestWord(new ArrayList<>(clothesList));
        System.out.println("Longest word: " + longestWord);
    }

        public static String findLongestWord(ArrayList<String> words) {
            String longestWord = "";
            int maxLength=0;
            for (String s : words) {
                if (s.length() > maxLength) {
                    maxLength = s.length();
                    longestWord = s;
                }
            }
            return longestWord;
}

}
