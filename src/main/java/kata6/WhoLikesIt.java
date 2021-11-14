package kata6;

public class WhoLikesIt {

    public static void main(String[] args) {

    }

    public static String whoLikesIt(String... names) {
        String result = "";
        switch (names.length){
            case 0:
                result = "no one likes this";
                break;
            case 1:
                result = names[0] + " likes this";
                break;
            case 2:
                result = names[0] + "and " + names[1] + "likes this";
                break;
            case 3:
                result = names[0] + ", " + names[1] + "and " + names[2] + "like this";
                break;
            default:
                result = names[0] + ", " + names[1] + "and " + (names.length - 2) + "like this";
        }
        return result;
    }

}
