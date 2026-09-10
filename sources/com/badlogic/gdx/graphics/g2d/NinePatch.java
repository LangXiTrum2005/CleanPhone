package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class NinePatch {
    public static final int BOTTOM_CENTER = 7;
    public static final int BOTTOM_LEFT = 6;
    public static final int BOTTOM_RIGHT = 8;
    public static final int MIDDLE_CENTER = 4;
    public static final int MIDDLE_LEFT = 3;
    public static final int MIDDLE_RIGHT = 5;
    public static final int TOP_CENTER = 1;
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 2;
    private static final Color tmpDrawColor = new Color();
    private int bottomCenter;
    private float bottomHeight;
    private int bottomLeft;
    private int bottomRight;
    private final Color color;
    private int idx;
    private float leftWidth;
    private int middleCenter;
    private float middleHeight;
    private int middleLeft;
    private int middleRight;
    private float middleWidth;
    private float padBottom;
    private float padLeft;
    private float padRight;
    private float padTop;
    private float rightWidth;
    private Texture texture;
    private int topCenter;
    private float topHeight;
    private int topLeft;
    private int topRight;
    private float[] vertices;

    public NinePatch(Texture texture, int i, int i2, int i3, int i4) {
        this(new TextureRegion(texture), i, i2, i3, i4);
    }

    private int add(TextureRegion textureRegion, boolean z, boolean z2) {
        Texture texture = this.texture;
        if (texture == null) {
            this.texture = textureRegion.getTexture();
        } else if (texture != textureRegion.getTexture()) {
            throw new IllegalArgumentException("All regions must be from the same texture.");
        }
        float f = textureRegion.u;
        float f2 = textureRegion.v2;
        float f3 = textureRegion.u2;
        float f4 = textureRegion.v;
        Texture.TextureFilter magFilter = this.texture.getMagFilter();
        Texture.TextureFilter textureFilter = Texture.TextureFilter.Linear;
        if (magFilter == textureFilter || this.texture.getMinFilter() == textureFilter) {
            if (z) {
                float width = 0.5f / this.texture.getWidth();
                f += width;
                f3 -= width;
            }
            if (z2) {
                float height = 0.5f / this.texture.getHeight();
                f2 -= height;
                f4 += height;
            }
        }
        float[] fArr = this.vertices;
        int i = this.idx;
        fArr[i + 3] = f;
        fArr[i + 4] = f2;
        fArr[i + 8] = f;
        fArr[i + 9] = f4;
        fArr[i + 13] = f3;
        fArr[i + 14] = f4;
        fArr[i + 18] = f3;
        fArr[i + 19] = f2;
        this.idx = i + 20;
        return i;
    }

    private void load(TextureRegion[] textureRegionArr) {
        TextureRegion textureRegion = textureRegionArr[6];
        if (textureRegion != null) {
            this.bottomLeft = add(textureRegion, false, false);
            this.leftWidth = textureRegionArr[6].getRegionWidth();
            this.bottomHeight = textureRegionArr[6].getRegionHeight();
        } else {
            this.bottomLeft = -1;
        }
        TextureRegion textureRegion2 = textureRegionArr[7];
        if (textureRegion2 != null) {
            this.bottomCenter = add(textureRegion2, (textureRegionArr[6] == null && textureRegionArr[8] == null) ? false : true, false);
            this.middleWidth = Math.max(this.middleWidth, textureRegionArr[7].getRegionWidth());
            this.bottomHeight = Math.max(this.bottomHeight, textureRegionArr[7].getRegionHeight());
        } else {
            this.bottomCenter = -1;
        }
        TextureRegion textureRegion3 = textureRegionArr[8];
        if (textureRegion3 != null) {
            this.bottomRight = add(textureRegion3, false, false);
            this.rightWidth = Math.max(this.rightWidth, textureRegionArr[8].getRegionWidth());
            this.bottomHeight = Math.max(this.bottomHeight, textureRegionArr[8].getRegionHeight());
        } else {
            this.bottomRight = -1;
        }
        TextureRegion textureRegion4 = textureRegionArr[3];
        if (textureRegion4 != null) {
            this.middleLeft = add(textureRegion4, false, (textureRegionArr[0] == null && textureRegionArr[6] == null) ? false : true);
            this.leftWidth = Math.max(this.leftWidth, textureRegionArr[3].getRegionWidth());
            this.middleHeight = Math.max(this.middleHeight, textureRegionArr[3].getRegionHeight());
        } else {
            this.middleLeft = -1;
        }
        TextureRegion textureRegion5 = textureRegionArr[4];
        if (textureRegion5 != null) {
            this.middleCenter = add(textureRegion5, (textureRegionArr[3] == null && textureRegionArr[5] == null) ? false : true, (textureRegionArr[1] == null && textureRegionArr[7] == null) ? false : true);
            this.middleWidth = Math.max(this.middleWidth, textureRegionArr[4].getRegionWidth());
            this.middleHeight = Math.max(this.middleHeight, textureRegionArr[4].getRegionHeight());
        } else {
            this.middleCenter = -1;
        }
        TextureRegion textureRegion6 = textureRegionArr[5];
        if (textureRegion6 != null) {
            this.middleRight = add(textureRegion6, false, (textureRegionArr[2] == null && textureRegionArr[8] == null) ? false : true);
            this.rightWidth = Math.max(this.rightWidth, textureRegionArr[5].getRegionWidth());
            this.middleHeight = Math.max(this.middleHeight, textureRegionArr[5].getRegionHeight());
        } else {
            this.middleRight = -1;
        }
        TextureRegion textureRegion7 = textureRegionArr[0];
        if (textureRegion7 != null) {
            this.topLeft = add(textureRegion7, false, false);
            this.leftWidth = Math.max(this.leftWidth, textureRegionArr[0].getRegionWidth());
            this.topHeight = Math.max(this.topHeight, textureRegionArr[0].getRegionHeight());
        } else {
            this.topLeft = -1;
        }
        TextureRegion textureRegion8 = textureRegionArr[1];
        if (textureRegion8 != null) {
            this.topCenter = add(textureRegion8, (textureRegionArr[0] == null && textureRegionArr[2] == null) ? false : true, false);
            this.middleWidth = Math.max(this.middleWidth, textureRegionArr[1].getRegionWidth());
            this.topHeight = Math.max(this.topHeight, textureRegionArr[1].getRegionHeight());
        } else {
            this.topCenter = -1;
        }
        TextureRegion textureRegion9 = textureRegionArr[2];
        if (textureRegion9 != null) {
            this.topRight = add(textureRegion9, false, false);
            this.rightWidth = Math.max(this.rightWidth, textureRegionArr[2].getRegionWidth());
            this.topHeight = Math.max(this.topHeight, textureRegionArr[2].getRegionHeight());
        } else {
            this.topRight = -1;
        }
        int i = this.idx;
        float[] fArr = this.vertices;
        if (i < fArr.length) {
            float[] fArr2 = new float[i];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.vertices = fArr2;
        }
    }

    private void prepareVertices(Batch batch, float f, float f2, float f3, float f4) {
        float f5 = this.leftWidth;
        float f6 = f + f5;
        float f7 = this.bottomHeight;
        float f8 = f2 + f7;
        float f9 = this.rightWidth;
        float f10 = (f3 - f9) - f5;
        float f11 = this.topHeight;
        float f12 = (f4 - f11) - f7;
        float f13 = (f + f3) - f9;
        float f14 = (f2 + f4) - f11;
        float floatBits = tmpDrawColor.set(this.color).mul(batch.getColor()).toFloatBits();
        int i = this.bottomLeft;
        if (i != -1) {
            set(i, f, f2, this.leftWidth, this.bottomHeight, floatBits);
        }
        int i2 = this.bottomCenter;
        if (i2 != -1) {
            set(i2, f6, f2, f10, this.bottomHeight, floatBits);
        }
        int i3 = this.bottomRight;
        if (i3 != -1) {
            set(i3, f13, f2, this.rightWidth, this.bottomHeight, floatBits);
        }
        int i4 = this.middleLeft;
        if (i4 != -1) {
            set(i4, f, f8, this.leftWidth, f12, floatBits);
        }
        int i5 = this.middleCenter;
        if (i5 != -1) {
            set(i5, f6, f8, f10, f12, floatBits);
        }
        int i6 = this.middleRight;
        if (i6 != -1) {
            set(i6, f13, f8, this.rightWidth, f12, floatBits);
        }
        int i7 = this.topLeft;
        if (i7 != -1) {
            set(i7, f, f14, this.leftWidth, this.topHeight, floatBits);
        }
        int i8 = this.topCenter;
        if (i8 != -1) {
            set(i8, f6, f14, f10, this.topHeight, floatBits);
        }
        int i9 = this.topRight;
        if (i9 != -1) {
            set(i9, f13, f14, this.rightWidth, this.topHeight, floatBits);
        }
    }

    private void set(int i, float f, float f2, float f3, float f4, float f5) {
        float f6 = f3 + f;
        float f7 = f4 + f2;
        float[] fArr = this.vertices;
        fArr[i] = f;
        fArr[i + 1] = f2;
        fArr[i + 2] = f5;
        fArr[i + 5] = f;
        fArr[i + 6] = f7;
        fArr[i + 7] = f5;
        fArr[i + 10] = f6;
        fArr[i + 11] = f7;
        fArr[i + 12] = f5;
        fArr[i + 15] = f6;
        fArr[i + 16] = f2;
        fArr[i + 17] = f5;
    }

    public void draw(Batch batch, float f, float f2, float f3, float f4) {
        prepareVertices(batch, f, f2, f3, f4);
        batch.draw(this.texture, this.vertices, 0, this.idx);
    }

    public float getBottomHeight() {
        return this.bottomHeight;
    }

    public Color getColor() {
        return this.color;
    }

    public float getLeftWidth() {
        return this.leftWidth;
    }

    public float getMiddleHeight() {
        return this.middleHeight;
    }

    public float getMiddleWidth() {
        return this.middleWidth;
    }

    public float getPadBottom() {
        float f = this.padBottom;
        return f == -1.0f ? getBottomHeight() : f;
    }

    public float getPadLeft() {
        float f = this.padLeft;
        return f == -1.0f ? getLeftWidth() : f;
    }

    public float getPadRight() {
        float f = this.padRight;
        return f == -1.0f ? getRightWidth() : f;
    }

    public float getPadTop() {
        float f = this.padTop;
        return f == -1.0f ? getTopHeight() : f;
    }

    public float getRightWidth() {
        return this.rightWidth;
    }

    public Texture getTexture() {
        return this.texture;
    }

    public float getTopHeight() {
        return this.topHeight;
    }

    public float getTotalHeight() {
        return this.topHeight + this.middleHeight + this.bottomHeight;
    }

    public float getTotalWidth() {
        return this.leftWidth + this.middleWidth + this.rightWidth;
    }

    public void scale(float f, float f2) {
        this.leftWidth *= f;
        this.rightWidth *= f;
        this.topHeight *= f2;
        this.bottomHeight *= f2;
        this.middleWidth *= f;
        this.middleHeight *= f2;
        float f3 = this.padLeft;
        if (f3 != -1.0f) {
            this.padLeft = f3 * f;
        }
        float f4 = this.padRight;
        if (f4 != -1.0f) {
            this.padRight = f4 * f;
        }
        float f5 = this.padTop;
        if (f5 != -1.0f) {
            this.padTop = f5 * f2;
        }
        float f6 = this.padBottom;
        if (f6 != -1.0f) {
            this.padBottom = f6 * f2;
        }
    }

    public void setBottomHeight(float f) {
        this.bottomHeight = f;
    }

    public void setColor(Color color) {
        this.color.set(color);
    }

    public void setLeftWidth(float f) {
        this.leftWidth = f;
    }

    public void setMiddleHeight(float f) {
        this.middleHeight = f;
    }

    public void setMiddleWidth(float f) {
        this.middleWidth = f;
    }

    public void setPadBottom(float f) {
        this.padBottom = f;
    }

    public void setPadLeft(float f) {
        this.padLeft = f;
    }

    public void setPadRight(float f) {
        this.padRight = f;
    }

    public void setPadTop(float f) {
        this.padTop = f;
    }

    public void setPadding(float f, float f2, float f3, float f4) {
        this.padLeft = f;
        this.padRight = f2;
        this.padTop = f3;
        this.padBottom = f4;
    }

    public void setRightWidth(float f) {
        this.rightWidth = f;
    }

    public void setTopHeight(float f) {
        this.topHeight = f;
    }

    public NinePatch(TextureRegion textureRegion, int i, int i2, int i3, int i4) {
        this.vertices = new float[180];
        this.color = new Color(Color.WHITE);
        this.padLeft = -1.0f;
        this.padRight = -1.0f;
        this.padTop = -1.0f;
        this.padBottom = -1.0f;
        if (textureRegion == null) {
            throw new IllegalArgumentException("region cannot be null.");
        }
        int regionWidth = (textureRegion.getRegionWidth() - i) - i2;
        int regionHeight = (textureRegion.getRegionHeight() - i3) - i4;
        TextureRegion[] textureRegionArr = new TextureRegion[9];
        if (i3 > 0) {
            if (i > 0) {
                textureRegionArr[0] = new TextureRegion(textureRegion, 0, 0, i, i3);
            }
            if (regionWidth > 0) {
                textureRegionArr[1] = new TextureRegion(textureRegion, i, 0, regionWidth, i3);
            }
            if (i2 > 0) {
                textureRegionArr[2] = new TextureRegion(textureRegion, i + regionWidth, 0, i2, i3);
            }
        }
        if (regionHeight > 0) {
            if (i > 0) {
                textureRegionArr[3] = new TextureRegion(textureRegion, 0, i3, i, regionHeight);
            }
            if (regionWidth > 0) {
                textureRegionArr[4] = new TextureRegion(textureRegion, i, i3, regionWidth, regionHeight);
            }
            if (i2 > 0) {
                textureRegionArr[5] = new TextureRegion(textureRegion, i + regionWidth, i3, i2, regionHeight);
            }
        }
        if (i4 > 0) {
            if (i > 0) {
                textureRegionArr[6] = new TextureRegion(textureRegion, 0, i3 + regionHeight, i, i4);
            }
            if (regionWidth > 0) {
                textureRegionArr[7] = new TextureRegion(textureRegion, i, i3 + regionHeight, regionWidth, i4);
            }
            if (i2 > 0) {
                textureRegionArr[8] = new TextureRegion(textureRegion, i + regionWidth, i3 + regionHeight, i2, i4);
            }
        }
        if (i == 0 && regionWidth == 0) {
            textureRegionArr[1] = textureRegionArr[2];
            textureRegionArr[4] = textureRegionArr[5];
            textureRegionArr[7] = textureRegionArr[8];
            textureRegionArr[2] = null;
            textureRegionArr[5] = null;
            textureRegionArr[8] = null;
        }
        if (i3 == 0 && regionHeight == 0) {
            textureRegionArr[3] = textureRegionArr[6];
            textureRegionArr[4] = textureRegionArr[7];
            textureRegionArr[5] = textureRegionArr[8];
            textureRegionArr[6] = null;
            textureRegionArr[7] = null;
            textureRegionArr[8] = null;
        }
        load(textureRegionArr);
    }

    public void draw(Batch batch, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        prepareVertices(batch, f, f2, f5, f6);
        float f10 = f + f3;
        float f11 = f2 + f4;
        int i = this.idx;
        float[] fArr = this.vertices;
        if (f9 != 0.0f) {
            for (int i2 = 0; i2 < i; i2 += 5) {
                float f12 = (fArr[i2] - f10) * f7;
                int i3 = i2 + 1;
                float f13 = (fArr[i3] - f11) * f8;
                float fCosDeg = MathUtils.cosDeg(f9);
                float fSinDeg = MathUtils.sinDeg(f9);
                fArr[i2] = ((fCosDeg * f12) - (fSinDeg * f13)) + f10;
                fArr[i3] = AbstractC5044xl.d(fCosDeg, f13, fSinDeg * f12, f11);
            }
        } else if (f7 != 1.0f || f8 != 1.0f) {
            for (int i4 = 0; i4 < i; i4 += 5) {
                fArr[i4] = AbstractC5044xl.w(fArr[i4], f10, f7, f10);
                int i5 = i4 + 1;
                fArr[i5] = AbstractC5044xl.w(fArr[i5], f11, f8, f11);
            }
        }
        batch.draw(this.texture, fArr, 0, i);
    }

    public NinePatch(Texture texture, Color color) {
        this(texture);
        setColor(color);
    }

    public NinePatch(Texture texture) {
        this(new TextureRegion(texture));
    }

    public NinePatch(TextureRegion textureRegion, Color color) {
        this(textureRegion);
        setColor(color);
    }

    public NinePatch(TextureRegion textureRegion) {
        this.vertices = new float[180];
        this.color = new Color(Color.WHITE);
        this.padLeft = -1.0f;
        this.padRight = -1.0f;
        this.padTop = -1.0f;
        this.padBottom = -1.0f;
        load(new TextureRegion[]{null, null, null, null, textureRegion, null, null, null, null});
    }

    public NinePatch(TextureRegion... textureRegionArr) {
        TextureRegion textureRegion;
        TextureRegion textureRegion2;
        TextureRegion textureRegion3;
        TextureRegion textureRegion4;
        TextureRegion textureRegion5;
        TextureRegion textureRegion6;
        TextureRegion textureRegion7;
        TextureRegion textureRegion8;
        this.vertices = new float[180];
        this.color = new Color(Color.WHITE);
        this.padLeft = -1.0f;
        this.padRight = -1.0f;
        this.padTop = -1.0f;
        this.padBottom = -1.0f;
        if (textureRegionArr != null && textureRegionArr.length == 9) {
            load(textureRegionArr);
            TextureRegion textureRegion9 = textureRegionArr[0];
            if ((textureRegion9 != null && textureRegion9.getRegionWidth() != this.leftWidth) || (((textureRegion = textureRegionArr[3]) != null && textureRegion.getRegionWidth() != this.leftWidth) || ((textureRegion2 = textureRegionArr[6]) != null && textureRegion2.getRegionWidth() != this.leftWidth))) {
                throw new GdxRuntimeException("Left side patches must have the same width");
            }
            TextureRegion textureRegion10 = textureRegionArr[2];
            if ((textureRegion10 != null && textureRegion10.getRegionWidth() != this.rightWidth) || (((textureRegion3 = textureRegionArr[5]) != null && textureRegion3.getRegionWidth() != this.rightWidth) || ((textureRegion4 = textureRegionArr[8]) != null && textureRegion4.getRegionWidth() != this.rightWidth))) {
                throw new GdxRuntimeException("Right side patches must have the same width");
            }
            TextureRegion textureRegion11 = textureRegionArr[6];
            if ((textureRegion11 != null && textureRegion11.getRegionHeight() != this.bottomHeight) || (((textureRegion5 = textureRegionArr[7]) != null && textureRegion5.getRegionHeight() != this.bottomHeight) || ((textureRegion6 = textureRegionArr[8]) != null && textureRegion6.getRegionHeight() != this.bottomHeight))) {
                throw new GdxRuntimeException("Bottom side patches must have the same height");
            }
            TextureRegion textureRegion12 = textureRegionArr[0];
            if ((textureRegion12 != null && textureRegion12.getRegionHeight() != this.topHeight) || (((textureRegion7 = textureRegionArr[1]) != null && textureRegion7.getRegionHeight() != this.topHeight) || ((textureRegion8 = textureRegionArr[2]) != null && textureRegion8.getRegionHeight() != this.topHeight))) {
                throw new GdxRuntimeException("Top side patches must have the same height");
            }
            return;
        }
        throw new IllegalArgumentException("NinePatch needs nine TextureRegions");
    }

    public NinePatch(NinePatch ninePatch) {
        this(ninePatch, ninePatch.color);
    }

    public NinePatch(NinePatch ninePatch, Color color) {
        this.vertices = new float[180];
        Color color2 = new Color(Color.WHITE);
        this.color = color2;
        this.padLeft = -1.0f;
        this.padRight = -1.0f;
        this.padTop = -1.0f;
        this.padBottom = -1.0f;
        this.texture = ninePatch.texture;
        this.bottomLeft = ninePatch.bottomLeft;
        this.bottomCenter = ninePatch.bottomCenter;
        this.bottomRight = ninePatch.bottomRight;
        this.middleLeft = ninePatch.middleLeft;
        this.middleCenter = ninePatch.middleCenter;
        this.middleRight = ninePatch.middleRight;
        this.topLeft = ninePatch.topLeft;
        this.topCenter = ninePatch.topCenter;
        this.topRight = ninePatch.topRight;
        this.leftWidth = ninePatch.leftWidth;
        this.rightWidth = ninePatch.rightWidth;
        this.middleWidth = ninePatch.middleWidth;
        this.middleHeight = ninePatch.middleHeight;
        this.topHeight = ninePatch.topHeight;
        this.bottomHeight = ninePatch.bottomHeight;
        this.padLeft = ninePatch.padLeft;
        this.padTop = ninePatch.padTop;
        this.padBottom = ninePatch.padBottom;
        this.padRight = ninePatch.padRight;
        float[] fArr = new float[ninePatch.vertices.length];
        this.vertices = fArr;
        float[] fArr2 = ninePatch.vertices;
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        this.idx = ninePatch.idx;
        color2.set(color);
    }
}
