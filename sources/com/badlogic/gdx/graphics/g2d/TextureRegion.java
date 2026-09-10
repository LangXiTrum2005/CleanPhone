package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.graphics.Texture;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class TextureRegion {
    int regionHeight;
    int regionWidth;
    Texture texture;
    float u;
    float u2;
    float v;
    float v2;

    public TextureRegion() {
    }

    public void flip(boolean z, boolean z2) {
        if (z) {
            float f = this.u;
            this.u = this.u2;
            this.u2 = f;
        }
        if (z2) {
            float f2 = this.v;
            this.v = this.v2;
            this.v2 = f2;
        }
    }

    public int getRegionHeight() {
        return this.regionHeight;
    }

    public int getRegionWidth() {
        return this.regionWidth;
    }

    public int getRegionX() {
        return Math.round(this.u * this.texture.getWidth());
    }

    public int getRegionY() {
        return Math.round(this.v * this.texture.getHeight());
    }

    public Texture getTexture() {
        return this.texture;
    }

    public float getU() {
        return this.u;
    }

    public float getU2() {
        return this.u2;
    }

    public float getV() {
        return this.v;
    }

    public float getV2() {
        return this.v2;
    }

    public boolean isFlipX() {
        return this.u > this.u2;
    }

    public boolean isFlipY() {
        return this.v > this.v2;
    }

    public void scroll(float f, float f2) {
        if (f != 0.0f) {
            float width = (this.u2 - this.u) * this.texture.getWidth();
            float f3 = (this.u + f) % 1.0f;
            this.u = f3;
            this.u2 = (width / this.texture.getWidth()) + f3;
        }
        if (f2 != 0.0f) {
            float height = (this.v2 - this.v) * this.texture.getHeight();
            float f4 = (this.v + f2) % 1.0f;
            this.v = f4;
            this.v2 = (height / this.texture.getHeight()) + f4;
        }
    }

    public void setRegion(Texture texture) {
        this.texture = texture;
        setRegion(0, 0, texture.getWidth(), texture.getHeight());
    }

    public void setRegionHeight(int i) {
        if (isFlipY()) {
            setV((i / this.texture.getHeight()) + this.v2);
        } else {
            setV2((i / this.texture.getHeight()) + this.v);
        }
    }

    public void setRegionWidth(int i) {
        if (isFlipX()) {
            setU((i / this.texture.getWidth()) + this.u2);
        } else {
            setU2((i / this.texture.getWidth()) + this.u);
        }
    }

    public void setRegionX(int i) {
        setU(i / this.texture.getWidth());
    }

    public void setRegionY(int i) {
        setV(i / this.texture.getHeight());
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public void setU(float f) {
        this.u = f;
        this.regionWidth = Math.round(Math.abs(this.u2 - f) * this.texture.getWidth());
    }

    public void setU2(float f) {
        this.u2 = f;
        this.regionWidth = Math.round(Math.abs(f - this.u) * this.texture.getWidth());
    }

    public void setV(float f) {
        this.v = f;
        this.regionHeight = Math.round(Math.abs(this.v2 - f) * this.texture.getHeight());
    }

    public void setV2(float f) {
        this.v2 = f;
        this.regionHeight = Math.round(Math.abs(f - this.v) * this.texture.getHeight());
    }

    public TextureRegion[][] split(int i, int i2) {
        int regionX = getRegionX();
        int regionY = getRegionY();
        int i3 = this.regionWidth;
        int i4 = this.regionHeight / i2;
        int i5 = i3 / i;
        TextureRegion[][] textureRegionArr = (TextureRegion[][]) Array.newInstance((Class<?>) TextureRegion.class, i4, i5);
        int i6 = regionY;
        int i7 = 0;
        while (i7 < i4) {
            int i8 = regionX;
            int i9 = 0;
            while (i9 < i5) {
                textureRegionArr[i7][i9] = new TextureRegion(this.texture, i8, i6, i, i2);
                i9++;
                i8 += i;
            }
            i7++;
            i6 += i2;
        }
        return textureRegionArr;
    }

    public TextureRegion(Texture texture) {
        if (texture == null) {
            throw new IllegalArgumentException("texture cannot be null.");
        }
        this.texture = texture;
        setRegion(0, 0, texture.getWidth(), texture.getHeight());
    }

    public void setRegion(int i, int i2, int i3, int i4) {
        float width = 1.0f / this.texture.getWidth();
        float height = 1.0f / this.texture.getHeight();
        setRegion(i * width, i2 * height, (i + i3) * width, (i2 + i4) * height);
        this.regionWidth = Math.abs(i3);
        this.regionHeight = Math.abs(i4);
    }

    public TextureRegion(Texture texture, int i, int i2) {
        this.texture = texture;
        setRegion(0, 0, i, i2);
    }

    public void setRegion(float f, float f2, float f3, float f4) {
        int width = this.texture.getWidth();
        int height = this.texture.getHeight();
        float f5 = width;
        this.regionWidth = Math.round(Math.abs(f3 - f) * f5);
        float f6 = height;
        int iRound = Math.round(Math.abs(f4 - f2) * f6);
        this.regionHeight = iRound;
        if (this.regionWidth == 1 && iRound == 1) {
            float f7 = 0.25f / f5;
            f += f7;
            f3 -= f7;
            float f8 = 0.25f / f6;
            f2 += f8;
            f4 -= f8;
        }
        this.u = f;
        this.v = f2;
        this.u2 = f3;
        this.v2 = f4;
    }

    public TextureRegion(Texture texture, int i, int i2, int i3, int i4) {
        this.texture = texture;
        setRegion(i, i2, i3, i4);
    }

    public static TextureRegion[][] split(Texture texture, int i, int i2) {
        return new TextureRegion(texture).split(i, i2);
    }

    public TextureRegion(Texture texture, float f, float f2, float f3, float f4) {
        this.texture = texture;
        setRegion(f, f2, f3, f4);
    }

    public TextureRegion(TextureRegion textureRegion) {
        setRegion(textureRegion);
    }

    public void setRegion(TextureRegion textureRegion) {
        this.texture = textureRegion.texture;
        setRegion(textureRegion.u, textureRegion.v, textureRegion.u2, textureRegion.v2);
    }

    public TextureRegion(TextureRegion textureRegion, int i, int i2, int i3, int i4) {
        setRegion(textureRegion, i, i2, i3, i4);
    }

    public void setRegion(TextureRegion textureRegion, int i, int i2, int i3, int i4) {
        this.texture = textureRegion.texture;
        setRegion(textureRegion.getRegionX() + i, textureRegion.getRegionY() + i2, i3, i4);
    }
}
