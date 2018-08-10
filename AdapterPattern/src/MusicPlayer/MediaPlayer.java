package MusicPlayer;

interface MediaPlayer {
    void play(String type,String file) ;
}

class MediaAdapter implements MediaPlayer{

    private AdvancedMediaPlayer advancedMediaPlayer ;

    @Override
    public void play(String type, String file) {
        if(type.equalsIgnoreCase("MKV")){
            advancedMediaPlayer = new VLC() ;
            advancedMediaPlayer.playMKV(file);
        }

        if(type.equalsIgnoreCase("MP4")){
            advancedMediaPlayer = new Quicktime() ;
            advancedMediaPlayer.playMP4(file);
        }
    }
}

class WindowsMediaPlayer implements MediaPlayer{
    MediaAdapter adapter ;
    WindowsMediaPlayer(){
        adapter = new MediaAdapter() ;
    }
    @Override
    public void play(String type, String file) {
        if(type.equalsIgnoreCase("mp3")){
            System.out.println("WMP : "+file);
        }
        else{
            adapter.play(type,file);
        }
    }
}
