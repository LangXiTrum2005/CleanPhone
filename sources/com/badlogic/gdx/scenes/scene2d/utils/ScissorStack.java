package com.badlogic.gdx.scenes.scene2d.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.HdpiUtils;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Null;

/* JADX INFO: loaded from: classes.dex */
public class ScissorStack {
    private static Array<Rectangle> scissors = new Array<>();
    static Vector3 tmp = new Vector3();
    static final Rectangle viewport = new Rectangle();

    public static void calculateScissors(Camera camera, Matrix4 matrix4, Rectangle rectangle, Rectangle rectangle2) {
        calculateScissors(camera, 0.0f, 0.0f, Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), matrix4, rectangle, rectangle2);
    }

    private static void fix(Rectangle rectangle) {
        rectangle.x = Math.round(rectangle.x);
        rectangle.y = Math.round(rectangle.y);
        rectangle.width = Math.round(rectangle.width);
        float fRound = Math.round(rectangle.height);
        rectangle.height = fRound;
        float f = rectangle.width;
        if (f < 0.0f) {
            float f2 = -f;
            rectangle.width = f2;
            rectangle.x -= f2;
        }
        if (fRound < 0.0f) {
            float f3 = -fRound;
            rectangle.height = f3;
            rectangle.y -= f3;
        }
    }

    public static Rectangle getViewport() {
        Array<Rectangle> array = scissors;
        if (array.size == 0) {
            Rectangle rectangle = viewport;
            rectangle.set(0.0f, 0.0f, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
            return rectangle;
        }
        Rectangle rectanglePeek = array.peek();
        Rectangle rectangle2 = viewport;
        rectangle2.set(rectanglePeek);
        return rectangle2;
    }

    @Null
    public static Rectangle peekScissors() {
        Array<Rectangle> array = scissors;
        if (array.size == 0) {
            return null;
        }
        return array.peek();
    }

    public static Rectangle popScissors() {
        Rectangle rectanglePop = scissors.pop();
        Array<Rectangle> array = scissors;
        if (array.size == 0) {
            Gdx.gl.glDisable(GL20.GL_SCISSOR_TEST);
        } else {
            Rectangle rectanglePeek = array.peek();
            HdpiUtils.glScissor((int) rectanglePeek.x, (int) rectanglePeek.y, (int) rectanglePeek.width, (int) rectanglePeek.height);
        }
        return rectanglePop;
    }

    public static boolean pushScissors(Rectangle rectangle) {
        fix(rectangle);
        Array<Rectangle> array = scissors;
        int i = array.size;
        if (i != 0) {
            Rectangle rectangle2 = array.get(i - 1);
            float fMax = Math.max(rectangle2.x, rectangle.x);
            float fMin = Math.min(rectangle2.x + rectangle2.width, rectangle.x + rectangle.width) - fMax;
            if (fMin < 1.0f) {
                return false;
            }
            float fMax2 = Math.max(rectangle2.y, rectangle.y);
            float fMin2 = Math.min(rectangle2.y + rectangle2.height, rectangle.y + rectangle.height) - fMax2;
            if (fMin2 < 1.0f) {
                return false;
            }
            rectangle.x = fMax;
            rectangle.y = fMax2;
            rectangle.width = fMin;
            rectangle.height = Math.max(1.0f, fMin2);
        } else {
            if (rectangle.width < 1.0f || rectangle.height < 1.0f) {
                return false;
            }
            Gdx.gl.glEnable(GL20.GL_SCISSOR_TEST);
        }
        scissors.add(rectangle);
        HdpiUtils.glScissor((int) rectangle.x, (int) rectangle.y, (int) rectangle.width, (int) rectangle.height);
        return true;
    }

    public static void calculateScissors(Camera camera, float f, float f2, float f3, float f4, Matrix4 matrix4, Rectangle rectangle, Rectangle rectangle2) {
        tmp.set(rectangle.x, rectangle.y, 0.0f);
        tmp.mul(matrix4);
        camera.project(tmp, f, f2, f3, f4);
        Vector3 vector3 = tmp;
        rectangle2.x = vector3.x;
        rectangle2.y = vector3.y;
        vector3.set(rectangle.x + rectangle.width, rectangle.y + rectangle.height, 0.0f);
        tmp.mul(matrix4);
        camera.project(tmp, f, f2, f3, f4);
        Vector3 vector4 = tmp;
        rectangle2.width = vector4.x - rectangle2.x;
        rectangle2.height = vector4.y - rectangle2.y;
    }
}
