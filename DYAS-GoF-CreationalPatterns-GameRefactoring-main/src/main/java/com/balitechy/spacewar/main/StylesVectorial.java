package com.balitechy.spacewar.main;

public class StylesVectorial extends Styles {
    
    @Override
    public VisualPlayer createPlayer(Game game, double x, double y) {
        return new VectorialPlayer(game, x, y);
    }

    @Override
    public VisualBullet createBullet(Game game, double x, double y) {
        return new VectorialBullet(game, x, y);
    }

    @Override
    public VisualBackgroundRenderer createBackgroundRenderer() {
        return new VectorialBackgroundRenderer();
    }
}
