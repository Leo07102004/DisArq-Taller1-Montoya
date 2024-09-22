package com.balitechy.spacewar.main;

public class StylesSprite extends Styles{
    @Override
    public VisualPlayer createPlayer(Game game, double x, double y) {
        return new SpritePlayer(game, x, y);
    }

    @Override
    public VisualBullet createBullet(Game game, double x, double y) {
        return new SpriteBullet(game, x, y);
    }

    @Override
    public VisualBackgroundRenderer createBackgroundRenderer() {
        return new SpriteBackgroundRenderer();
    }
}