package com.example.structural.adpater;

// 适配器类
public class WAVPlayerAdapter implements AudioPlayer {
    private WAVPlayer wavPlayer;

    public WAVPlayerAdapter() {
        this.wavPlayer = new WAVPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("wav")) {
            wavPlayer.playWav(fileName);
        }
    }
}
