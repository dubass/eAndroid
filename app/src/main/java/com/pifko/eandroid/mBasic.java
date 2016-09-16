package com.pifko.eandroid;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by User on 16.09.2016.
 */
public abstract class mBasic {

    public int type;

    public static final int TYPE_POINT = 1;
    public static final int TYPE_LINE = 2;
    public static final int TYPE_POLYLINE = 3;
    public static final int TYPE_RECT = 4;
    public static final int TYPE_CIRCLE = 5;
    public static final int TYPE_SPRITE = 6;

    abstract void update();

    abstract boolean isSelected(float f, float g);

    abstract void draw(Canvas c, Paint p);

}
