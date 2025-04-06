package com.example.structural.adpater;

public class Demo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new WAVPlayerAdapter();
        audioPlayer.play("wav", "song.wav");
    }
}
