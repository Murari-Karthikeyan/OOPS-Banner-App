import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {
        printBanner("OOPS");
    }

    static void printBanner(String word) {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        });

        patterns.put('P', new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        });

        patterns.put('S', new String[]{
                " SSS ",
                "S    ",
                " SSS ",
                "    S",
                " SSS "
        });

        int height = 5;

        for (int row = 0; row < height; row++) {
            for (char ch : word.toCharArray()) {
                System.out.print(patterns.get(ch)[row] + " ");
            }
            System.out.println();
        }
    }
}
