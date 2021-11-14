package kata6;

import java.util.List;

public class CountTheSmileyFaces {

    public static int countSmileys(List<String> arr) {

        return (int) arr.stream().filter(s -> {
            if(s.length() == 2){
                return s.contains(":)") || s.contains(":D") || s.contains(";)") || s.contains(";D");
            } s.substring(s.length()-3);
            return s.equals(";-)")||
                s.equals(";-D")||
                s.equals(";~)")||
                s.equals(";~D")||
                s.equals(":-)")||
                s.equals(":~)")||
                s.equals(":-D")||
                s.equals(":~D");
        }).count();
        //
        //   return (int) arr.stream()
        //        .filter(e -> e.matches("[:;][-~]?[\\)D]"))
        //        .count();

    }

}
