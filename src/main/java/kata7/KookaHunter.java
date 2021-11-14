package kata7;

public class KookaHunter {

    public static void main(String[] args) {
        System.out.println(kookaCounter("hahahahaHaHaHahahah"));
    }

    public static int kookaCounter(final String laughing) {
        if(laughing == null || laughing.equals("")){
            return 0;
        }
        int count = 1;
        char startChar = laughing.charAt(0);
        char[] chars = laughing.toCharArray();
        for (int i = 0; i < chars.length ; i += 2) {
             if(startChar != chars[i]){
                 count++;
                 startChar = chars[i];
             }
        }
        return count;
    }

}
