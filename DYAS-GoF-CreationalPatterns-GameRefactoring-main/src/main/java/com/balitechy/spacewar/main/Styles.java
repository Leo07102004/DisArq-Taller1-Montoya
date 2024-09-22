package com.balitechy.spacewar.main;

public abstract class Styles {
    public abstract VisualPlayer createPlayer(Game game, double x, double y);
    public abstract VisualBullet createBullet(Game game, double x, double y);
    public abstract VisualBackgroundRenderer createBackgroundRenderer();
}
