package com.pifko.eandroid;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by User on 16.09.2016.
 */
public class mLine extends mBasic {

    private mPoint p1, p2;

    public mLine(int x1, int y1, int x2, int y2){
        p1 = new mPoint(x1,y1);
        p2 = new mPoint(x2,y2);
        this.type = mBasic.TYPE_LINE;

    }

    public mLine(mPoint p1, mPoint p2){
        this.p1 = p1;
        this.p2 = p2;
        this.type = mBasic.TYPE_LINE;
    }

    @Override
    void update() {
        p1.update();
        p2.update();

    }

    boolean isSelected(float x, float y){
        return false;
    }

    void draw(Canvas c, Paint p){
        c.drawLine(p1.x,p1.y,p2.x,p2.y,p);
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
