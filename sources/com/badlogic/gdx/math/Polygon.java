package com.badlogic.gdx.math;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class Polygon implements Shape2D {
    private Rectangle bounds;
    private boolean dirty;
    private float[] localVertices;
    private float originX;
    private float originY;
    private float rotation;
    private float scaleX;
    private float scaleY;
    private float[] worldVertices;
    private float x;
    private float y;

    public Polygon() {
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dirty = true;
        this.localVertices = new float[0];
    }

    public float area() {
        float[] transformedVertices = getTransformedVertices();
        return GeometryUtils.polygonArea(transformedVertices, 0, transformedVertices.length);
    }

    @Override // com.badlogic.gdx.math.Shape2D
    public boolean contains(float f, float f2) {
        float[] transformedVertices = getTransformedVertices();
        int length = transformedVertices.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f3 = transformedVertices[i];
            float f4 = transformedVertices[i + 1];
            int i3 = i + 2;
            float f5 = transformedVertices[i3 % length];
            float f6 = transformedVertices[(i + 3) % length];
            if (((f4 <= f2 && f2 < f6) || (f6 <= f2 && f2 < f4)) && f < AbstractC5044xl.w(f2, f4, (f5 - f3) / (f6 - f4), f3)) {
                i2++;
            }
            i = i3;
        }
        return (i2 & 1) == 1;
    }

    public void dirty() {
        this.dirty = true;
    }

    public Rectangle getBoundingRectangle() {
        float[] transformedVertices = getTransformedVertices();
        float f = transformedVertices[0];
        float f2 = transformedVertices[1];
        int length = transformedVertices.length;
        float f3 = f2;
        float f4 = f3;
        float f5 = f;
        for (int i = 2; i < length; i += 2) {
            float f6 = transformedVertices[i];
            if (f > f6) {
                f = f6;
            }
            float f7 = transformedVertices[i + 1];
            if (f3 > f7) {
                f3 = f7;
            }
            if (f5 < f6) {
                f5 = f6;
            }
            if (f4 < f7) {
                f4 = f7;
            }
        }
        if (this.bounds == null) {
            this.bounds = new Rectangle();
        }
        Rectangle rectangle = this.bounds;
        rectangle.x = f;
        rectangle.y = f3;
        rectangle.width = f5 - f;
        rectangle.height = f4 - f3;
        return rectangle;
    }

    public Vector2 getCentroid(Vector2 vector2) {
        float[] transformedVertices = getTransformedVertices();
        return GeometryUtils.polygonCentroid(transformedVertices, 0, transformedVertices.length, vector2);
    }

    public float getOriginX() {
        return this.originX;
    }

    public float getOriginY() {
        return this.originY;
    }

    public float getRotation() {
        return this.rotation;
    }

    public float getScaleX() {
        return this.scaleX;
    }

    public float getScaleY() {
        return this.scaleY;
    }

    public float[] getTransformedVertices() {
        if (!this.dirty) {
            return this.worldVertices;
        }
        this.dirty = false;
        float[] fArr = this.localVertices;
        float[] fArr2 = this.worldVertices;
        if (fArr2 == null || fArr2.length != fArr.length) {
            this.worldVertices = new float[fArr.length];
        }
        float[] fArr3 = this.worldVertices;
        float f = this.x;
        float f2 = this.y;
        float f3 = this.originX;
        float f4 = this.originY;
        float f5 = this.scaleX;
        float f6 = this.scaleY;
        boolean z = (f5 == 1.0f && f6 == 1.0f) ? false : true;
        float f7 = this.rotation;
        float fCosDeg = MathUtils.cosDeg(f7);
        float fSinDeg = MathUtils.sinDeg(f7);
        int length = fArr.length;
        for (int i = 0; i < length; i += 2) {
            float f8 = fArr[i] - f3;
            int i2 = i + 1;
            float f9 = fArr[i2] - f4;
            if (z) {
                f8 *= f5;
                f9 *= f6;
            }
            if (f7 != 0.0f) {
                float f10 = (fCosDeg * f8) - (fSinDeg * f9);
                f9 = (f9 * fCosDeg) + (f8 * fSinDeg);
                f8 = f10;
            }
            fArr3[i] = f8 + f + f3;
            fArr3[i2] = f2 + f9 + f4;
        }
        return fArr3;
    }

    public Vector2 getVertex(int i, Vector2 vector2) {
        if (i < 0 || i > getVertexCount()) {
            throw new IllegalArgumentException(AbstractC5044xl.g("the vertex ", i, " doesn't exist"));
        }
        float[] transformedVertices = getTransformedVertices();
        int i2 = i * 2;
        return vector2.set(transformedVertices[i2], transformedVertices[i2 + 1]);
    }

    public int getVertexCount() {
        return this.localVertices.length / 2;
    }

    public float[] getVertices() {
        return this.localVertices;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void resetTransformations() {
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.originX = 0.0f;
        this.originY = 0.0f;
        this.x = 0.0f;
        this.y = 0.0f;
        this.rotation = 0.0f;
        this.dirty = true;
    }

    public void rotate(float f) {
        this.rotation += f;
        this.dirty = true;
    }

    public void scale(float f) {
        this.scaleX += f;
        this.scaleY += f;
        this.dirty = true;
    }

    public void setOrigin(float f, float f2) {
        this.originX = f;
        this.originY = f2;
        this.dirty = true;
    }

    public void setPosition(float f, float f2) {
        this.x = f;
        this.y = f2;
        this.dirty = true;
    }

    public void setRotation(float f) {
        this.rotation = f;
        this.dirty = true;
    }

    public void setScale(float f, float f2) {
        this.scaleX = f;
        this.scaleY = f2;
        this.dirty = true;
    }

    public void setVertex(int i, float f, float f2) {
        if (i >= 0) {
            float[] fArr = this.localVertices;
            if (i <= (fArr.length / 2) - 1) {
                int i2 = i * 2;
                fArr[i2] = f;
                fArr[i2 + 1] = f2;
                this.dirty = true;
                return;
            }
        }
        throw new IllegalArgumentException(AbstractC5044xl.g("the vertex ", i, " doesn't exist"));
    }

    public void setVertices(float[] fArr) {
        if (fArr.length < 6) {
            throw new IllegalArgumentException("polygons must contain at least 3 points.");
        }
        this.localVertices = fArr;
        this.dirty = true;
    }

    public void translate(float f, float f2) {
        this.x += f;
        this.y += f2;
        this.dirty = true;
    }

    public Polygon(float[] fArr) {
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dirty = true;
        if (fArr.length >= 6) {
            this.localVertices = fArr;
            return;
        }
        throw new IllegalArgumentException("polygons must contain at least 3 points.");
    }

    @Override // com.badlogic.gdx.math.Shape2D
    public boolean contains(Vector2 vector2) {
        return contains(vector2.x, vector2.y);
    }
}
