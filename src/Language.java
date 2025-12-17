/*public class Language {

    static final String ARABIC_VOICE = "Mehdi22k";
    static final String ENGLISH_VOICE = "Heather22k";
    private static String lang;

    public static void setLang(String chose) throws InputException {
        MessagesLocalization.setLanguage(chose);

        if (chose.equals("1")) {
            lang = "ARABIC";
        } else if (chose.equals("2")) {
            lang = "ENGLISH";
        }
    }

    public static String getLang() {
        return lang;
    }

    public static String ChoseLang() {
        if ("ARABIC".equals(lang)) return ARABIC_VOICE;
        return ENGLISH_VOICE;
    }

}

*/

public class Language {

    private static final String ARABIC_VOICE = "Mehdi22k";
    private static final String ENGLISH_VOICE = "Heather22k";

    private static String currentVoice = ARABIC_VOICE;

    public static void setArabic() {
        currentVoice = ARABIC_VOICE;
    }

    public static void setEnglish() {
        currentVoice = ENGLISH_VOICE;
    }

    public static String ChoseLang() {
        return currentVoice;
    }
}
