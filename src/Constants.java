import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static final String MUSIC_ASSETS_PREFIX = "assets/music/";
    public static final String MUSIC_ASSETS_SUFFIX = ".txt";
    public static final String KALIMBA_SAMPLES_PREFIX = "assets/kalimbaSamples/";
    public static final String KALIMBA_SAMPLES_SUFFIX = ".wav";
    public static final String DELAY_SOUND_1_SEC_PATH = "assets/kalimbaSamples/delay_1_sec.wav";
    public static final String DELAY_SOUND_2_SEC_PATH = "assets/kalimbaSamples/delay_2_sec.wav";
    public static final String DELAY_SOUND_3_SEC_PATH = "assets/kalimbaSamples/delay_3_sec.wav";

    public static final long DEFAULT_BETWEEN_SAMPLES_DELAY = 200;
    public static final long DEFAULT_BETWEEN_TAB_LINES_DELAY = 0;

    public static final Map<String, String> KALIMBA_TABS_SOUNDS_MAP = new HashMap<String, String>() {{
        put("2°°", "D6");
        put("7°", "B5");
        put("5°", "G5");
        put("3°", "E5");
        put("1°", "C5");
        put("6", "A4");
        put("4", "F4");
        put("2", "D4");
        put("1", "C4");
        put("3", "E4");
        put("5", "G4");
        put("7", "B4");
        put("2°", "D5");
        put("4°", "F5");
        put("6°", "A5");
        put("1°°", "C6");
        put("3°°", "E6");
        put("4#", "Gb4");
        put("4#°", "Gb4");
    }};

    public static final Map<String, String> KALIMBA_NUM_TO_LETTER_MAP = new HashMap<String, String>() {{
        put("1", "C");
        put("2", "D");
        put("3", "E");
        put("4", "F");
        put("5", "G");
        put("6", "A");
        put("7", "B");
    }};

    public static final Map<String, String> KALIMBA_LETTER_TO_NUM_MAP = new HashMap<String, String>() {{
        put("C", "1");
        put("D", "2");
        put("E", "3");
        put("F", "4");
        put("G", "5");
        put("A", "6");
        put("B", "7");
        put("c", "1");
        put("d", "2");
        put("e", "3");
        put("f", "4");
        put("g", "5");
        put("a", "6");
        put("b", "7");
    }};
}
