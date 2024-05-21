package org.example.game;

import org.example.music.GameMusic;

import java.util.Scanner;

public abstract class AbstractHintProvider {
    protected int remainHint;

    public AbstractHintProvider() {
        this.remainHint = 1;
    }

    public boolean canProvideHint() {
        return remainHint > 0;
    }

    public abstract void provideHint(Scanner scanner, GameMusic song);

    public void reset() {
        this.remainHint = 1;
    }
}