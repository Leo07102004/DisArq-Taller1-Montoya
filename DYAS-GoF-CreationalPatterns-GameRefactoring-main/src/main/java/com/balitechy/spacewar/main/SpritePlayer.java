package com.balitechy.spacewar.main;

//import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class SpritePlayer implements VisualPlayer {
	
	private double x;
	private double y;
	
	private double velX;
	private double velY;
	
	private BufferedImage image;
	private Game game;
	
	public SpritePlayer(Game game, double x, double y){
		this.x = x;
		this.y = y;
		this.game = game;
		this.image = game.getSprites().getImage(219, 304, WIDTH, HEIGHT);
	}

	@Override
	public void render(Graphics g){
		//g.setColor(Color.white);
		g.drawImage(image, (int) x, (int) y, null);
	}

	@Override
	public void tick(){
		x += velX;
		y += velY;
		
		if(x <= 0)
			x = 0;
		if(x >= (Game.WIDTH * Game.SCALE) - WIDTH)
			x = (Game.WIDTH * Game.SCALE) - WIDTH;
		if(y <= 0)
			y = 0;
		if(y >= (Game.HEIGHT * Game.SCALE) - HEIGHT)
			y = (Game.HEIGHT * Game.SCALE) - HEIGHT;
	}
	
	@Override
	public void shoot(){
        game.getBullets().addBullet(game.getStyles().createBullet(game, x + (WIDTH / 2) - 5, y - 18));
	}

	@Override
	public void setVelX(double velX) {
		this.velX = velX;
	}

	@Override
	public void setVelY(double velY) {
		this.velY = velY;
	}
	
}
