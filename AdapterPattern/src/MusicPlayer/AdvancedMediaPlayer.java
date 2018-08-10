package MusicPlayer;

interface AdvancedMediaPlayer {
    void playMKV(String file) ;
    void playMP4(String file) ;
}

class VLC implements AdvancedMediaPlayer{

    @Override
    public void playMKV(String file) {
        System.out.println("VLC Playing : "+ file);
    }

    @Override
    public void playMP4(String file) {
        //
    }
}

class Quicktime implements AdvancedMediaPlayer{

    @Override
    public void playMKV(String file) {
        //
    }

    @Override
    public void playMP4(String file) {
        System.out.println("QuickTime Playing : "+ file);
    }
}
