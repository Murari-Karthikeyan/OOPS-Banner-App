public class OOPSBannerApp {

    public static void main(String[] args) {
        printBanner();
    }

    static void printBanner() {
        for (String line : new String[]{
                " OOO   OOO  PPPP   SSS ",
                "O   O O   O P   P S    ",
                "O   O O   O PPPP   SSS ",
                "O   O O   O P         ",
                " OOO   OOO  P      SSS"
        }) {
            System.out.println(line);
        }
    }
}
