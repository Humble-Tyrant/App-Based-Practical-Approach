/**
 * OOPSBannerApp
 *
 * This class displays the word "OOPS" as an ASCII art banner
 * using a modular approach. Each letter pattern is generated
 * using a separate method, following the Single Responsibility Principle.
 *
 * @author Gautam Arya
 * @version 3.0
 **/
public class OOPSBannerAppUC3 {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
                "******   ",
                "**    ** ",
                "**     **",
                "**    ** ",
                "******   ",
                "**       ",
                "**       ",
                "**       ",
                "**       "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[]{
                "   ***** ",
                " **      ",
                "**       ",
                " **      ",
                "   ***   ",
                "      ** ",
                "       **",
                "      ** ",
                " ***** ",
        };
    }

    // Main method to run the banner display
    public static void main(String[] args) {

        // Declare String arrays to hold patterns for each letter
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble and print the banner row by row
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                    oPattern[i] + "   " +
                            oPattern[i] + "   " +
                            pPattern[i] + "   " +
                            sPattern[i]
            );
        }
    }
}

