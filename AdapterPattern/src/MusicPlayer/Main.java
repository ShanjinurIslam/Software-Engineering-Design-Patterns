package MusicPlayer;

public class Main {
    public static void main(String args[]){
        WindowsMediaPlayer windowsMediaPlayer = new WindowsMediaPlayer() ;
        windowsMediaPlayer.play("MKV" , "titanic.mkv");
        windowsMediaPlayer.play("mp3" , "despacito.mp3");
        windowsMediaPlayer.play("MP4" , "AppleAd.mp4");


    }
}
