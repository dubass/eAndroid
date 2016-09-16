package com.pifko.eandroid;


import android.graphics.Canvas;
import android.graphics.Paint;
/**
 * Created by User on 16.09.2016.
 */
public class mPoint extends mBasic {

    float x, y;

    float axX = 1, axY = 1;

    float dx = 0, dy = 0;

    public mPoint(int x, int y){
        this.x=x;
        this.y=y;
        this.type = mBasic.TYPE_POINT;
    }

    public void update(){
        this.x += this.dx;
        this.y += this.dy;
        this.dx *= this.axX;
        this.dy *= this.axY;
    }

    boolean isSelected(float x, float y){
        if(this.x == x && this.y == y){
            return true;
        }else{
            return false;
        }
    }

    void draw(Canvas c, Paint p){
        c.drawPoint(x,y,p);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getAxX() {
        return axX;
    }

    public void setAxX(float axX) {
        this.axX = axX;
    }

    public float getAxY() {
        return axY;
    }

    public void setAxY(float axY) {
        this.axY = axY;
    }

    public float getDx() {
        return dx;
    }

    public void setDx(float dx) {
        this.dx = dx;
    }

    public float getDy() {
        return dy;
    }

    public void setDy(float dy) {
        this.dy = dy;
    }
}
