
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class DefaultPlayManager {

    public static void main(String[] args) throws IOException, InterruptedException {
        //final String musicFileName = "narutoBlueBird";
        //final String musicFileName = "narutoGaaraTheme";
        final String musicFileName = "test";
        File file = new File(Constants.MUSIC_ASSETS_PREFIX + musicFileName + Constants.MUSIC_ASSETS_SUFFIX);

        BufferedReader br = new BufferedReader(new FileReader(file));
        MusicPlayer musicPlayer = new MusicPlayer();

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            line = line.trim();

            if(line.isBlank())
            {
                continue;
            }
            String[] splittedLine = line.split(" ");
            for (String tabDigit : splittedLine) {
                // if multiple sounds need to be played
                // in the same time
                if(tabDigit.contains("+")) {
                    handleMultipleSounds(tabDigit, musicPlayer);
                } else {
                    musicPlayer.playSound(KalimbaTabsConverter.convertTabDigitToKalimbaSamplePath(tabDigit));
                }
            }
            musicPlayer.playSoundWithDelay(Constants.DELAY_SOUND_1_SEC_PATH, 600);
        }
    }

    private static void handleMultipleSounds(final String tabDigit, final MusicPlayer musicPlayer) {
        String[] splittedSounds = tabDigit.split("\\+");
        List<String> convertedKalimbaSamplePaths = new ArrayList<>();
        for (String splittedSound :
                splittedSounds) {
            convertedKalimbaSamplePaths.add(KalimbaTabsConverter.convertTabDigitToKalimbaSamplePath(splittedSound));
        }

        musicPlayer.playMultipleSounds(convertedKalimbaSamplePaths);
    }
}
