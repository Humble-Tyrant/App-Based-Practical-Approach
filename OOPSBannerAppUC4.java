public class OOPSBannerAppUC4 {
    static class CharacterPatternMap {
        private final String[] patternO ={
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
        private final String[] patternP ={
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
        private final String[] patternS ={
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

        public String[] getPattern(char ch) {
            if (ch == 'O') return patternO;
            if (ch == 'P') return patternP;
            if (ch == 'S') return patternS;
            return null;
        }
    }
    public static void main(String[] args) {
        //OOPSBannerAppUC4 app = new OOPSBannerAppUC4();
        CharacterPatternMap map = new CharacterPatternMap();
        String[] oPattern=map.getPattern('O');
        String[] pPattern=map.getPattern('P');
        String[] sPattern=map.getPattern('S');

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
