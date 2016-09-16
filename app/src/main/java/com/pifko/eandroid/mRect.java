package com.pifko.eandroid;

import android.graphics.Canvas;
import android.graphics.Paint;


/**
 * Created by User on 16.09.2016.
 */
public class mRect extends mBasic {

    //private int x, y, width, height;
    private mPoint p1, p2;

    public mRect(mPoint p1, mPoint p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    void update() {
        p1.update();
        p2.update();
    }

    @Override
    boolean isSelected(float f, float g) {
        return false;
    }

    @Override
    void draw(Canvas c, Paint p) {
        c.drawRect(p1.x, p1.y, p2.x, p2.y, p);
    }

    public mPoint getP1() {
        return p1;
    }

    public void setP1(mPoint p1) {
        this.p1 = p1;
    }

    public mPoint getP2() {
        return p2;
    }

    public void setP2(mPoint p2) {
        this.p2 = p2;
    }
}
