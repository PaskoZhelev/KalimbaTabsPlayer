import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MusicPlayer {

    public void playSound(final String soundPath) {
        playFile(soundPath, Constants.DEFAULT_BETWEEN_SAMPLES_DELAY);
    }

    private void playFile(final String filePath, final long delay) {
        try {
            File musicPath = new File(filePath);

            if(musicPath.exists()) {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();

                //JOptionPane.showMessageDialog(null, "Press OK to stop the music");
                TimeUnit.MILLISECONDS.sleep(delay);
                clip.stop();
            } else {
                System.out.println("Cannot find the file");
            }

        } catch(final Exception ex) {
            ex.printStackTrace();
        }
    }

    public void playMultipleSounds(final List<String> sounds) {
        try {
            final List<Clip> clips = new ArrayList<>();
            for (String sound :
                    sounds) {
                File musicPath = new File(sound);

                if(musicPath.exists()) {
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicPath);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInputStream);

                    clips.add(clip);
                } else {
                    System.out.println("Cannot find the file");
                }
            }

            for (Clip clip :
                    clips) {
                clip.start();
            }

            TimeUnit.MILLISECONDS.sleep(Constants.DEFAULT_BETWEEN_SAMPLES_DELAY);

        } catch(final Exception ex) {
            ex.printStackTrace();
        }
    }
}
