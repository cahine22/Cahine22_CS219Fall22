package HW5;

public class exercise66 {

    public static boolean canSpell(String word, String tiles) {
        for (int i = 0; i < tiles.length(); i++) {
            char tiles_letter = tiles.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                char word_letter = word.charAt(j);
                if (word_letter == tiles_letter) {
                    word = word.substring(0, word.indexOf(word_letter))
                            + word.substring(word.indexOf(word_letter) + 1);
                }
            }
        }
        if(word.length() == 0){
                return true;}

        return false;

    }

    public static void main(String[] args) {
        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(!canSpell("hippo", "haxobapsrito"));
        System.out.println(canSpell("caroline", "jhicjoreajfwoplden"));
        System.out.println(canSpell("computerscience", "jkkfwocmuesineoptrcece"));
        System.out.println(!canSpell("america", "jfrwpgvkmsmjgiedca"));




        // Student: add more test cases
    }
}
