
import java.util.HashMap;

/**
 * OOPSBannerApp UC5 – Advanced OOP Concepts Implementation
 *
 * This class demonstrates advanced Object-Oriented Programming concepts
 * through the creation and display of an ASCII art banner.
 *
 * It extends UC4 by using a HashMap to store and reuse character patterns
 * in a modular and efficient way.
 *
 * @author Gautam Arya
 * @version 5.0
 */
public class OOPSBannerAppUC5 {
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        });

        charMap.put('P', new String[]{
                "******   ",
                "**    ** ",
                "**     **",
                "**    ** ",
                "******   ",
                "**       ",
                "**       ",
                "**       ",
                "**       "
        });

        charMap.put('S', new String[]{
                "   ***** ",
                " **      ",
                "**       ",
                " **      ",
                "   ***   ",
                "      ** ",
                "       **",
                "      ** ",
                " ***** ",
        });

        return charMap;
    }

    public static void displayBanner(String message,
                                     HashMap<Character, String[]> charMap) {

        // All patterns assumed to have equal height
        int patternHeight = charMap.get(message.charAt(0)).length;

        // Loop through each row
        for (int row = 0; row < patternHeight; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            // Loop through each character in the message
            for (char ch : message.toCharArray()) {
                lineBuilder.append(charMap.get(ch)[row]).append("  ");
            }

            System.out.println(lineBuilder);
        }
    }


    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";

        displayBanner(message, charMap);
    }
}
