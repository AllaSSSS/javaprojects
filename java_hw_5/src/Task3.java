import java.util.*;
import java.util.stream.Collectors;

public class Task3 {

    // Дана строка. Необходимо написать метод, который отсортирует слова в строке по длине с помощью TreeMap.
    // Слова с одинаковой длиной не должны “потеряться”.
    public static void main(final String[] args) {
        System.out.println(getSortedIncludesWords("Если вы можете мечтать об этом вы можете это сделать"));
    }

    public static String getSortedIncludesWords(String sentence){
        String[] words = sentence.split("\s+");
        Set<Word> ordered = Collections.newSetFromMap(
                new TreeMap<>(Comparator.<Word>comparingInt(w -> w.word.length()).thenComparing(w -> w.pos)));
        for (int i=0; i < words.length; i++) {
            ordered.add(new Word(i, words[i]));
        }
        return ordered.stream().map(w -> w.word).collect(Collectors.joining(" "));
    }


    static class Word {

        final int pos;
        final String word;

        Word(int pos, String word) {
            this.pos = pos;
            this.word = word;
        }
    }
}