package com.towerdefense.towerdefense.objects;

import com.towerdefense.towerdefense.GlobalVariables;

import java.awt.*;

public class Grass extends Ground {
	public static int GROUND_TYPE = 1;
	public static Rectangle SPRITE_RECTANGLE = new Rectangle(32, 0, 32, 32);
	//public static boolean CONSTRUCTIBLE = false;
	//public static boolean WALKABLE = false;
	//public static boolean SPAWNABLE = false;

	public Grass(int x, int y) {
		super(x, y, GROUND_TYPE);
		/*try {
			setImage(ImageIO.read(new File("res/images/terrain/herbe.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}*/

        this.setImage(GlobalVariables.getSprite().getSubimage(SPRITE_RECTANGLE.x, SPRITE_RECTANGLE.y, SPRITE_RECTANGLE.width, SPRITE_RECTANGLE.height));

        setType(GROUND_TYPE);
		//setConstructible(CONSTRUCTIBLE);
		//setWalkable(WALKABLE);
		//setSpawnable(SPAWNABLE);

	}

}