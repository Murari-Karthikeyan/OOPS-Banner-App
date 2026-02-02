public class OOPSBannerApp {
    public static void main(String[] args) {

        String[] banner = {
                " OOO   OOO  PPPP   SSS ",
                "O   O O   O P   P S    ",
                "O   O O   O PPPP   SSS ",
                "O   O O   O P         ",
                " OOO   OOO  P      SSS"
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
