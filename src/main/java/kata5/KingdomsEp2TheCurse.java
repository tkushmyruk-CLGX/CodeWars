package kata5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KingdomsEp2TheCurse {

    public static void main(String[] args) {
        System.out.println(translate("kk, s*** *www*", new String[] { "suka", "kk", "swwws" }));
        System.out.println(translate("a**? *c*. **e,", new String[] { "ace", "acd", "abd" }));
        System.out.println(translate("m** ***e **s l*****", new String[] { "name", "myy", "legion", "iss" }));
        System.out.println(translate("*** **** **s *****n, f** **e *r* m***!",
            new String[] { "mmy", "name", "iss", "legion", "for", "wwe", "are", "many" }));
        System.out.println(translate("", new String[] { "ace", "acd", "abd" }));

    }

    public static List<Character> characters = Arrays.asList('!', '?', '.', ',');

    public static String translate(String speech, String[] vocabulary) {
        if (speech.equals("")) {
            return "";
        }
        HashMap<Integer, String> map = new HashMap<>();
        String[] s = speech.split(" ");
        String answer = "";
        for (int i = 0; i < s.length; i++) {
            map.put(i, s[i]);
        }
        Map<Integer, String> result = vocab(map, Arrays.stream(vocabulary).collect(Collectors.toList()), 0);
        for (int i = 0; i < result.size(); i++) {
            answer += " " + result.get(i);
        }
        return answer.trim();
    }

    public static Map<Integer, String> vocab(HashMap<Integer, String> map, List<String> vocabulary, int countOfChanges) {

        for (int i = 0; i < vocabulary.size(); i++) {
            String vocabWord = vocabulary.get(i);
            int count = 0;
            int place = -1;
            for (int j = 0; j < map.size(); j++) {
                String mapWord = map.get(j);
                if (characters.contains(map.get(j).charAt(map.get(j).length() - 1))) {
                    mapWord = mapWord.substring(0, mapWord.length() - 1);
                }
                if (vocabWord.length() == mapWord.length() && wordTest(mapWord, vocabWord)) {
                    count++;
                    place = j;
                }
            }
            if (count == 1) {
                countOfChanges++;
                if (characters.contains(map.get(place).charAt(map.get(place).length() - 1))) {
                    vocabWord += map.get(place).charAt(map.get(place).length() - 1);
                }
                map.put(place, vocabWord);
                vocabulary.remove(i);
            }
        }
        if (countOfChanges != map.size()) {
            vocab(map, vocabulary, countOfChanges);
        }
        return map;
    }

    public static boolean wordTest(String word, String vocabWord) {
        boolean flag = true;
        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) != '*' && word.charAt(i) != vocabWord.charAt(i)) {
                flag = false;
            }
        }
        return flag;
    }

}
