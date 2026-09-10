package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;

/* JADX INFO: loaded from: classes.dex */
public class Sprite extends TextureRegion {
    static final int SPRITE_SIZE = 20;
    static final int VERTEX_SIZE = 5;
    private Rectangle bounds;
    private final Color color;
    private boolean dirty;
    float height;
    private float originX;
    private float originY;
    private float packedColor;
    private float rotation;
    private float scaleX;
    private float scaleY;
    final float[] vertices;
    float width;
    private float x;
    private float y;

    public Sprite() {
        this.vertices = new float[20];
        this.color = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.packedColor = Color.WHITE_FLOAT_BITS;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dirty = true;
        setColor(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public void draw(Batch batch) {
        batch.draw(this.texture, getVertices(), 0, 20);
    }

    @Override // com.badlogic.gdx.graphics.g2d.TextureRegion
    public void flip(boolean z, boolean z2) {
        super.flip(z, z2);
        float[] fArr = this.vertices;
        if (z) {
            float f = fArr[3];
            fArr[3] = fArr[13];
            fArr[13] = f;
            float f2 = fArr[8];
            fArr[8] = fArr[18];
            fArr[18] = f2;
        }
        if (z2) {
            float f3 = fArr[4];
            fArr[4] = fArr[14];
            fArr[14] = f3;
            float f4 = fArr[9];
            fArr[9] = fArr[19];
            fArr[19] = f4;
        }
    }

    public Rectangle getBoundingRectangle() {
        float[] vertices = getVertices();
        float f = vertices[0];
        float f2 = vertices[1];
        float f3 = vertices[5];
        float f4 = f > f3 ? f3 : f;
        float f5 = vertices[10];
        if (f4 > f5) {
            f4 = f5;
        }
        float f6 = vertices[15];
        if (f4 > f6) {
            f4 = f6;
        }
        if (f < f3) {
            f = f3;
        }
        if (f >= f5) {
            f5 = f;
        }
        if (f5 >= f6) {
            f6 = f5;
        }
        float f7 = vertices[6];
        float f8 = f2 > f7 ? f7 : f2;
        float f9 = vertices[11];
        if (f8 > f9) {
            f8 = f9;
        }
        float f10 = vertices[16];
        if (f8 > f10) {
            f8 = f10;
        }
        if (f2 < f7) {
            f2 = f7;
        }
        if (f2 >= f9) {
            f9 = f2;
        }
        if (f9 >= f10) {
            f10 = f9;
        }
        if (this.bounds == null) {
            this.bounds = new Rectangle();
        }
        Rectangle rectangle = this.bounds;
        rectangle.x = f4;
        rectangle.y = f8;
        rectangle.width = f6 - f4;
        rectangle.height = f10 - f8;
        return rectangle;
    }

    public Color getColor() {
        return this.color;
    }

    public float getHeight() {
        return this.height;
    }

    public float getOriginX() {
        return this.originX;
    }

    public float getOriginY() {
        return this.originY;
    }

    public float getPackedColor() {
        return this.packedColor;
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

    public float[] getVertices() {
        if (this.dirty) {
            this.dirty = false;
            float[] fArr = this.vertices;
            float f = -this.originX;
            float f2 = -this.originY;
            float f3 = this.width + f;
            float f4 = this.height + f2;
            float f5 = this.x - f;
            float f6 = this.y - f2;
            float f7 = this.scaleX;
            if (f7 != 1.0f || this.scaleY != 1.0f) {
                f *= f7;
                float f8 = this.scaleY;
                f2 *= f8;
                f3 *= f7;
                f4 *= f8;
            }
            float f9 = this.rotation;
            if (f9 != 0.0f) {
                float fCosDeg = MathUtils.cosDeg(f9);
                float fSinDeg = MathUtils.sinDeg(this.rotation);
                float f10 = f * fCosDeg;
                float f11 = f * fSinDeg;
                float f12 = f2 * fCosDeg;
                float f13 = f3 * fCosDeg;
                float f14 = fCosDeg * f4;
                float f15 = f4 * fSinDeg;
                float f16 = (f10 - (f2 * fSinDeg)) + f5;
                float f17 = f12 + f11 + f6;
                fArr[0] = f16;
                fArr[1] = f17;
                float f18 = (f10 - f15) + f5;
                float f19 = f11 + f14 + f6;
                fArr[5] = f18;
                fArr[6] = f19;
                float f20 = (f13 - f15) + f5;
                float f21 = f14 + (f3 * fSinDeg) + f6;
                fArr[10] = f20;
                fArr[11] = f21;
                fArr[15] = (f20 - f18) + f16;
                fArr[16] = f21 - (f19 - f17);
            } else {
                float f22 = f + f5;
                float f23 = f2 + f6;
                float f24 = f3 + f5;
                float f25 = f4 + f6;
                fArr[0] = f22;
                fArr[1] = f23;
                fArr[5] = f22;
                fArr[6] = f25;
                fArr[10] = f24;
                fArr[11] = f25;
                fArr[15] = f24;
                fArr[16] = f23;
            }
        }
        return this.vertices;
    }

    public float getWidth() {
        return this.width;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void rotate(float f) {
        if (f == 0.0f) {
            return;
        }
        this.rotation += f;
        this.dirty = true;
    }

    public void rotate90(boolean z) {
        float[] fArr = this.vertices;
        if (z) {
            float f = fArr[4];
            fArr[4] = fArr[19];
            fArr[19] = fArr[14];
            fArr[14] = fArr[9];
            fArr[9] = f;
            float f2 = fArr[3];
            fArr[3] = fArr[18];
            fArr[18] = fArr[13];
            fArr[13] = fArr[8];
            fArr[8] = f2;
            return;
        }
        float f3 = fArr[4];
        fArr[4] = fArr[9];
        fArr[9] = fArr[14];
        fArr[14] = fArr[19];
        fArr[19] = f3;
        float f4 = fArr[3];
        fArr[3] = fArr[8];
        fArr[8] = fArr[13];
        fArr[13] = fArr[18];
        fArr[18] = f4;
    }

    public void scale(float f) {
        this.scaleX += f;
        this.scaleY += f;
        this.dirty = true;
    }

    @Override // com.badlogic.gdx.graphics.g2d.TextureRegion
    public void scroll(float f, float f2) {
        float[] fArr = this.vertices;
        if (f != 0.0f) {
            float f3 = (fArr[3] + f) % 1.0f;
            float width = (this.width / this.texture.getWidth()) + f3;
            this.u = f3;
            this.u2 = width;
            fArr[3] = f3;
            fArr[8] = f3;
            fArr[13] = width;
            fArr[18] = width;
        }
        if (f2 != 0.0f) {
            float f4 = (fArr[9] + f2) % 1.0f;
            float height = (this.height / this.texture.getHeight()) + f4;
            this.v = f4;
            this.v2 = height;
            fArr[4] = height;
            fArr[9] = f4;
            fArr[14] = f4;
            fArr[19] = height;
        }
    }

    public void set(Sprite sprite) {
        if (sprite == null) {
            throw new IllegalArgumentException("sprite cannot be null.");
        }
        System.arraycopy(sprite.vertices, 0, this.vertices, 0, 20);
        this.texture = sprite.texture;
        this.u = sprite.u;
        this.v = sprite.v;
        this.u2 = sprite.u2;
        this.v2 = sprite.v2;
        this.x = sprite.x;
        this.y = sprite.y;
        this.width = sprite.width;
        this.height = sprite.height;
        this.regionWidth = sprite.regionWidth;
        this.regionHeight = sprite.regionHeight;
        this.originX = sprite.originX;
        this.originY = sprite.originY;
        this.rotation = sprite.rotation;
        this.scaleX = sprite.scaleX;
        this.scaleY = sprite.scaleY;
        this.color.set(sprite.color);
        this.dirty = sprite.dirty;
    }

    public void setAlpha(float f) {
        Color color = this.color;
        if (color.f202a != f) {
            color.f202a = f;
            float floatBits = color.toFloatBits();
            this.packedColor = floatBits;
            float[] fArr = this.vertices;
            fArr[2] = floatBits;
            fArr[7] = floatBits;
            fArr[12] = floatBits;
            fArr[17] = floatBits;
        }
    }

    public void setBounds(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
        if (this.dirty) {
            return;
        }
        if (this.rotation != 0.0f || this.scaleX != 1.0f || this.scaleY != 1.0f) {
            this.dirty = true;
            return;
        }
        float f5 = f3 + f;
        float f6 = f4 + f2;
        float[] fArr = this.vertices;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[5] = f;
        fArr[6] = f6;
        fArr[10] = f5;
        fArr[11] = f6;
        fArr[15] = f5;
        fArr[16] = f2;
    }

    public void setCenter(float f, float f2) {
        setPosition(f - (this.width / 2.0f), f2 - (this.height / 2.0f));
    }

    public void setCenterX(float f) {
        setX(f - (this.width / 2.0f));
    }

    public void setCenterY(float f) {
        setY(f - (this.height / 2.0f));
    }

    public void setColor(Color color) {
        this.color.set(color);
        float floatBits = color.toFloatBits();
        this.packedColor = floatBits;
        float[] fArr = this.vertices;
        fArr[2] = floatBits;
        fArr[7] = floatBits;
        fArr[12] = floatBits;
        fArr[17] = floatBits;
    }

    public void setFlip(boolean z, boolean z2) {
        flip(isFlipX() != z, isFlipY() != z2);
    }

    public void setOrigin(float f, float f2) {
        this.originX = f;
        this.originY = f2;
        this.dirty = true;
    }

    public void setOriginBasedPosition(float f, float f2) {
        setPosition(f - this.originX, f2 - this.originY);
    }

    public void setOriginCenter() {
        this.originX = this.width / 2.0f;
        this.originY = this.height / 2.0f;
        this.dirty = true;
    }

    public void setPackedColor(float f) {
        float f2 = this.packedColor;
        if (f != f2 || (f == 0.0f && f2 == 0.0f && Float.floatToIntBits(f) != Float.floatToIntBits(this.packedColor))) {
            this.packedColor = f;
            Color.abgr8888ToColor(this.color, f);
            float[] fArr = this.vertices;
            fArr[2] = f;
            fArr[7] = f;
            fArr[12] = f;
            fArr[17] = f;
        }
    }

    public void setPosition(float f, float f2) {
        this.x = f;
        this.y = f2;
        if (this.dirty) {
            return;
        }
        if (this.rotation != 0.0f || this.scaleX != 1.0f || this.scaleY != 1.0f) {
            this.dirty = true;
            return;
        }
        float f3 = this.width + f;
        float f4 = this.height + f2;
        float[] fArr = this.vertices;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[5] = f;
        fArr[6] = f4;
        fArr[10] = f3;
        fArr[11] = f4;
        fArr[15] = f3;
        fArr[16] = f2;
    }

    @Override // com.badlogic.gdx.graphics.g2d.TextureRegion
    public void setRegion(float f, float f2, float f3, float f4) {
        super.setRegion(f, f2, f3, f4);
        float[] fArr = this.vertices;
        fArr[3] = f;
        fArr[4] = f4;
        fArr[8] = f;
        fArr[9] = f2;
        fArr[13] = f3;
        fArr[14] = f2;
        fArr[18] = f3;
        fArr[19] = f4;
    }

    public void setRotation(float f) {
        this.rotation = f;
        this.dirty = true;
    }

    public void setScale(float f) {
        this.scaleX = f;
        this.scaleY = f;
        this.dirty = true;
    }

    public void setSize(float f, float f2) {
        this.width = f;
        this.height = f2;
        if (this.dirty) {
            return;
        }
        if (this.rotation != 0.0f || this.scaleX != 1.0f || this.scaleY != 1.0f) {
            this.dirty = true;
            return;
        }
        float f3 = this.x;
        float f4 = f + f3;
        float f5 = this.y;
        float f6 = f2 + f5;
        float[] fArr = this.vertices;
        fArr[0] = f3;
        fArr[1] = f5;
        fArr[5] = f3;
        fArr[6] = f6;
        fArr[10] = f4;
        fArr[11] = f6;
        fArr[15] = f4;
        fArr[16] = f5;
    }

    @Override // com.badlogic.gdx.graphics.g2d.TextureRegion
    public void setU(float f) {
        super.setU(f);
        float[] fArr = this.vertices;
        fArr[3] = f;
        fArr[8] = f;
    }

    @Override // com.badlogic.gdx.graphics.g2d.TextureRegion
    public void setU2(float f) {
        super.setU2(f);
        float[] fArr = this.vertices;
        fArr[13] = f;
        fArr[18] = f;
    }

    @Override // com.badlogic.gdx.graphics.g2d.TextureRegion
    public void setV(float f) {
        super.setV(f);
        float[] fArr = this.vertices;
        fArr[9] = f;
        fArr[14] = f;
    }

    @Override // com.badlogic.gdx.graphics.g2d.TextureRegion
    public void setV2(float f) {
        super.setV2(f);
        float[] fArr = this.vertices;
        fArr[4] = f;
        fArr[19] = f;
    }

    public void setX(float f) {
        this.x = f;
        if (this.dirty) {
            return;
        }
        if (this.rotation != 0.0f || this.scaleX != 1.0f || this.scaleY != 1.0f) {
            this.dirty = true;
            return;
        }
        float f2 = this.width + f;
        float[] fArr = this.vertices;
        fArr[0] = f;
        fArr[5] = f;
        fArr[10] = f2;
        fArr[15] = f2;
    }

    public void setY(float f) {
        this.y = f;
        if (this.dirty) {
            return;
        }
        if (this.rotation != 0.0f || this.scaleX != 1.0f || this.scaleY != 1.0f) {
            this.dirty = true;
            return;
        }
        float f2 = this.height + f;
        float[] fArr = this.vertices;
        fArr[1] = f;
        fArr[6] = f2;
        fArr[11] = f2;
        fArr[16] = f;
    }

    public void translate(float f, float f2) {
        this.x += f;
        this.y += f2;
        if (this.dirty) {
            return;
        }
        if (this.rotation != 0.0f || this.scaleX != 1.0f || this.scaleY != 1.0f) {
            this.dirty = true;
            return;
        }
        float[] fArr = this.vertices;
        fArr[0] = fArr[0] + f;
        fArr[1] = fArr[1] + f2;
        fArr[5] = fArr[5] + f;
        fArr[6] = fArr[6] + f2;
        fArr[10] = fArr[10] + f;
        fArr[11] = fArr[11] + f2;
        fArr[15] = fArr[15] + f;
        fArr[16] = fArr[16] + f2;
    }

    public void translateX(float f) {
        this.x += f;
        if (this.dirty) {
            return;
        }
        if (this.rotation != 0.0f || this.scaleX != 1.0f || this.scaleY != 1.0f) {
            this.dirty = true;
            return;
        }
        float[] fArr = this.vertices;
        fArr[0] = fArr[0] + f;
        fArr[5] = fArr[5] + f;
        fArr[10] = fArr[10] + f;
        fArr[15] = fArr[15] + f;
    }

    public void translateY(float f) {
        this.y += f;
        if (this.dirty) {
            return;
        }
        if (this.rotation != 0.0f || this.scaleX != 1.0f || this.scaleY != 1.0f) {
            this.dirty = true;
            return;
        }
        float[] fArr = this.vertices;
        fArr[1] = fArr[1] + f;
        fArr[6] = fArr[6] + f;
        fArr[11] = fArr[11] + f;
        fArr[16] = fArr[16] + f;
    }

    public void draw(Batch batch, float f) {
        float f2 = getColor().f202a;
        setAlpha(f * f2);
        draw(batch);
        setAlpha(f2);
    }

    public void setScale(float f, float f2) {
        this.scaleX = f;
        this.scaleY = f2;
        this.dirty = true;
    }

    public Sprite(Texture texture) {
        this(texture, 0, 0, texture.getWidth(), texture.getHeight());
    }

    public void setColor(float f, float f2, float f3, float f4) {
        this.color.set(f, f2, f3, f4);
        float floatBits = this.color.toFloatBits();
        this.packedColor = floatBits;
        float[] fArr = this.vertices;
        fArr[2] = floatBits;
        fArr[7] = floatBits;
        fArr[12] = floatBits;
        fArr[17] = floatBits;
    }

    public Sprite(Texture texture, int i, int i2) {
        this(texture, 0, 0, i, i2);
    }

    public Sprite(Texture texture, int i, int i2, int i3, int i4) {
        this.vertices = new float[20];
        this.color = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.packedColor = Color.WHITE_FLOAT_BITS;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dirty = true;
        if (texture != null) {
            this.texture = texture;
            setRegion(i, i2, i3, i4);
            setColor(1.0f, 1.0f, 1.0f, 1.0f);
            setSize(Math.abs(i3), Math.abs(i4));
            setOrigin(this.width / 2.0f, this.height / 2.0f);
            return;
        }
        throw new IllegalArgumentException("texture cannot be null.");
    }

    public Sprite(TextureRegion textureRegion) {
        this.vertices = new float[20];
        this.color = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.packedColor = Color.WHITE_FLOAT_BITS;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dirty = true;
        setRegion(textureRegion);
        setColor(1.0f, 1.0f, 1.0f, 1.0f);
        setSize(textureRegion.getRegionWidth(), textureRegion.getRegionHeight());
        setOrigin(this.width / 2.0f, this.height / 2.0f);
    }

    public Sprite(TextureRegion textureRegion, int i, int i2, int i3, int i4) {
        this.vertices = new float[20];
        this.color = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.packedColor = Color.WHITE_FLOAT_BITS;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dirty = true;
        setRegion(textureRegion, i, i2, i3, i4);
        setColor(1.0f, 1.0f, 1.0f, 1.0f);
        setSize(Math.abs(i3), Math.abs(i4));
        setOrigin(this.width / 2.0f, this.height / 2.0f);
    }

    public Sprite(Sprite sprite) {
        this.vertices = new float[20];
        this.color = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.packedColor = Color.WHITE_FLOAT_BITS;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dirty = true;
        set(sprite);
    }
}
