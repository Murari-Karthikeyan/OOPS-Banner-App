public class OOPSBannerApp {

    public static void main(String[] args) {
        printBanner();
    }

    static void printBanner() {

        String[] O = {
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        };

        String[] P = {
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        };

        String[] S = {
                " SSS ",
                "S    ",
                " SSS ",
                "    S",
                " SSS "
        };

        // Rendering OOPS manually using character arrays
        for (int i = 0; i < O.length; i++) {
            System.out.println(
                    O[i] + " " +
                            O[i] + " " +
                            P[i] + " " +
                            S[i]
            );
        }
    }
}
