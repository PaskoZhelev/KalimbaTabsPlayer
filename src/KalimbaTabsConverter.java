
public class KalimbaTabsConverter {

    public static String convertTabDigitToKalimbaSamplePath(final String tabDigit){
        final String kalimbaTabSample = Constants.KALIMBA_TABS_SOUNDS_MAP.get(tabDigit);
        return Constants.KALIMBA_SAMPLES_PREFIX + kalimbaTabSample + Constants.KALIMBA_SAMPLES_SUFFIX;
    }
}
