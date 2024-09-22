package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class SpriteBullet implements VisualBullet{
	
	private double x;
	private double y;
	private BufferedImage image;
	
	public SpriteBullet(Game game, double x, double y){
		this.x = x;
		this.y = y;
		image = game.getSprites().getImage(35, 52, WIDTH, HEIGHT);
	}

	@Override
	public void render(Graphics g){
		g.drawImage(image, (int) x, (int) y, null);
	}
	
	@Override
	public void tick(){
		y -= 5;
	}
	
	@Override
	public double getY(){
		return y;
	}
}
