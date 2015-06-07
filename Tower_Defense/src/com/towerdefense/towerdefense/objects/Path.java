package com.towerdefense.towerdefense.objects;

import com.towerdefense.towerdefense.GlobalVariables;

import java.awt.*;

public class Path extends Ground{
public static int GROUND_TYPE = 2;
public static Rectangle SPRITE_RECTANGLE = new Rectangle(0, 0, 32, 32);
//public static boolean CONSTRUCTIBLE = false;
//public static boolean WALKABLE = false;
//public static boolean SPAWNABLE = false;

    public Path(int x, int y) {
        super(x, y, GROUND_TYPE);

        this.setImage(GlobalVariables.getSprite().getSubimage(SPRITE_RECTANGLE.x, SPRITE_RECTANGLE.y, SPRITE_RECTANGLE.width, SPRITE_RECTANGLE.height));
    }
}
