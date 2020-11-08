import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static final String MUSIC_ASSETS_PREFIX = "assets/music/";
    public static final String MUSIC_ASSETS_SUFFIX = ".txt";
    public static final String KALIMBA_SAMPLES_PREFIX = "assets/kalimbaSamples/";
    public static final String KALIMBA_SAMPLES_SUFFIX = ".wav";

    public static final long DEFAULT_BETWEEN_SAMPLES_DELAY = 500;
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
    }};
}
