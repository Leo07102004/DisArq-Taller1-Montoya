package com.balitechy.spacewar.main;

public class StylesVectorialColorful extends Styles {
    @Override
    public VisualPlayer createPlayer(Game game, double x, double y) {
        return new ColorfulVectorialPlayer(game, x, y);
    }

    @Override
    public VisualBullet createBullet(Game game, double x, double y) {
        return new ColorfulVectorialBullet(game, x, y);
    }

    @Override
    public VisualBackgroundRenderer createBackgroundRenderer() {
        return new ColorfulVectorialBackgroundRenderer();
    }
}