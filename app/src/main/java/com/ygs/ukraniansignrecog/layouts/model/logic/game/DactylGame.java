package com.ygs.ukraniansignrecog.layouts.model.logic.game;

public interface DactylGame extends Game {
    void onDactylRecognizedSuccess();
    void onDactylRecognizedFailure();
}
