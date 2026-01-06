/**
 * OOPSBannerAppUC2
 * This class demonstrates the creation of an ASCII art banner
 * using programming principles. It displays the word "OOPS"
 * in a visual format using asterisks (*) and spaces.
 *
 * @author Gautam Arya
 * @version 2.0
 */
public class OOPSBannerAppUC2 {
    public static void main(String[] args) {

        // Define each letter as a 1D String array (rows)
        String[] O = {
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

        String[] P = {
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

        String[] S = {
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

        // Combine letters row by row using String.join()
        String[] banner = new String[O.length];
        for (int i = 0; i < O.length; i++) {
            banner[i] = String.join("   ", O[i], O[i], P[i], S[i]);
        }

        // Print the banner using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
