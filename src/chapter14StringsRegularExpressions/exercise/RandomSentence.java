package chapter14StringsRegularExpressions.exercise;

import java.util.Random;

public class RandomSentence {
    public static void main(String[] args) {

        String [] sentences = new String[20];
        String [] article = {"the", "a", "one", "some" , "any"};
        String [] noun = {"boy", "girl", "dog", "town" , "car"};
        String [] verb = {"drove", "jumped", "ran", "walked" , "skipped"};
        String [] preposition = {"to", "from", "over", "under" , "on"};
        Random rand = new Random();
        //  noun, verb, preposition, article and noun

        for ( int i = 0; i < 20; i++){
            sentences[i] = noun[rand.nextInt(noun.length)] + " " + verb[rand.nextInt(verb.length)] + " "
                    + preposition[rand.nextInt(preposition.length)] + " " + article[rand.nextInt(article.length)]
                    + " " + noun[rand.nextInt(noun.length)] + ".";
            System.out.println(noun[rand.nextInt(noun.length)]);

            String duza = String.valueOf(sentences[i].charAt(0));

            System.out.println(sentences[i] = sentences[i].replaceFirst("\\w", duza.toUpperCase()));
            }
    }
}
