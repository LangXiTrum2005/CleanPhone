package com.badlogic.gdx.scenes.scene2d.utils;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Align;

/* JADX INFO: loaded from: classes.dex */
public class TiledDrawable extends TextureRegionDrawable {
    private int align;
    private final Color color;
    private float scale;

    public TiledDrawable() {
        this.color = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.scale = 1.0f;
        this.align = 12;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable, com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable, com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public void draw(Batch batch, float f, float f2, float f3, float f4) {
        float packedColor = batch.getPackedColor();
        batch.setColor(batch.getColor().mul(this.color));
        draw(batch, getRegion(), f, f2, f3, f4, this.scale, this.align);
        batch.setPackedColor(packedColor);
    }

    public int getAlign() {
        return this.align;
    }

    public Color getColor() {
        return this.color;
    }

    public float getScale() {
        return this.scale;
    }

    public void setAlign(int i) {
        this.align = i;
    }

    public void setScale(float f) {
        this.scale = f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
    public TiledDrawable tint(Color color) {
        TiledDrawable tiledDrawable = new TiledDrawable(this);
        tiledDrawable.color.set(color);
        tiledDrawable.setLeftWidth(getLeftWidth());
        tiledDrawable.setRightWidth(getRightWidth());
        tiledDrawable.setTopHeight(getTopHeight());
        tiledDrawable.setBottomHeight(getBottomHeight());
        return tiledDrawable;
    }

    public TiledDrawable(TextureRegion textureRegion) {
        super(textureRegion);
        this.color = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.scale = 1.0f;
        this.align = 12;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0304  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:40:0x0121  */
    /* JADX WARN: Code duplicated, block: B:42:0x0124 A[LOOP:5: B:41:0x0122->B:42:0x0124, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0144  */
    /* JADX WARN: Code duplicated, block: B:46:0x015d  */
    /* JADX WARN: Code duplicated, block: B:49:0x016d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0198  */
    /* JADX WARN: Code duplicated, block: B:56:0x019d A[LOOP:0: B:55:0x019b->B:56:0x019d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x01da  */
    /* JADX WARN: Code duplicated, block: B:68:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:71:0x0209  */
    /* JADX WARN: Code duplicated, block: B:73:0x0210 A[LOOP:2: B:72:0x020e->B:73:0x0210, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0248  */
    /* JADX WARN: Code duplicated, block: B:82:0x0275  */
    /* JADX WARN: Code duplicated, block: B:84:0x0278 A[LOOP:4: B:83:0x0276->B:84:0x0278, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x0293  */
    /* JADX WARN: Code duplicated, block: B:88:0x0299  */
    /* JADX WARN: Code duplicated, block: B:90:0x029f  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:96:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e8 A[LOOP:3: B:97:0x02e6->B:98:0x02e8, LOOP_END] */
    public static void draw(Batch batch, TextureRegion textureRegion, float f, float f2, float f3, float f4, float f5, int i) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        int i2;
        float f12;
        float f13;
        float f14;
        float f15;
        int i3;
        float f16;
        float f17;
        float f18;
        int i4;
        float f19;
        float f20;
        float f21;
        int i5;
        float f22;
        float f23;
        int i6;
        int i7;
        float f24;
        float f25;
        float f26;
        int i8;
        float f27;
        int i9;
        float regionWidth = textureRegion.getRegionWidth() * f5;
        float regionHeight = textureRegion.getRegionHeight() * f5;
        Texture texture = textureRegion.getTexture();
        float width = texture.getWidth() * f5;
        float height = texture.getHeight() * f5;
        float u = textureRegion.getU();
        float v = textureRegion.getV();
        float u2 = textureRegion.getU2();
        float v2 = textureRegion.getV2();
        float f28 = f3 / regionWidth;
        int i10 = (int) f28;
        if (Align.isLeft(i)) {
            i10 = i10;
            f7 = f3 - (i10 * regionWidth);
            f6 = 0.0f;
        } else {
            if (Align.isRight(i)) {
                f6 = f3 - (i10 * regionWidth);
            } else if (i10 != 0) {
                if (i10 % 2 != 1) {
                    i10--;
                }
                i10 = i10;
                f6 = (f3 - (i10 * regionWidth)) * 0.5f;
                f7 = f6;
            } else {
                f6 = 0.0f;
            }
            f7 = 0.0f;
        }
        float f29 = f4 / regionHeight;
        int i11 = (int) f29;
        if (!Align.isTop(i)) {
            if (Align.isBottom(i)) {
                i11 = i11;
                f9 = f4 - (i11 * regionHeight);
                f8 = 0.0f;
            } else if (i11 != 0) {
                if (i11 % 2 != 1) {
                    i11--;
                }
                i11 = i11;
                f8 = (f4 - (i11 * regionHeight)) * 0.5f;
                f9 = f8;
            } else {
                f8 = 0.0f;
            }
            if (f6 > 0.0f) {
                f27 = u2 - (f6 / width);
                if (f8 > 0.0f) {
                    batch.draw(texture, f, f2, f6, f8, f27, (f8 / height) + v, u2, v);
                    f10 = f2 + f8;
                } else {
                    f10 = f2;
                }
                if (i11 == 0 || !Align.isCenterVertical(i)) {
                    for (i9 = 0; i9 < i11; i9++) {
                        batch.draw(texture, f, f10, f6, regionHeight, f27, v2, u2, v);
                        f10 += regionHeight;
                    }
                } else {
                    float f30 = (1.0f - f29) * (v2 - v) * 0.5f;
                    batch.draw(texture, f, f10, f6, f4, f27, v2 - f30, u2, v + f30);
                    f10 += f4;
                }
                if (f9 > 0.0f) {
                    batch.draw(texture, f, f10, f6, f9, f27, v2, u2, v2 - (f9 / height));
                }
            } else {
                f29 = f29;
                regionWidth = regionWidth;
                width = width;
                i11 = i11;
                i10 = i10;
                f10 = f2;
            }
            if (f8 > 0.0f) {
                f24 = f + f6;
                f25 = (f8 / height) + v;
                if (i10 == 0 || !Align.isCenterHorizontal(i)) {
                    f26 = f24;
                    for (i8 = 0; i8 < i10; i8++) {
                        batch.draw(texture, f26, f2, regionWidth, f8, u, f25, u2, v);
                        f26 += regionWidth;
                    }
                } else {
                    float f31 = (1.0f - f28) * (u2 - u) * 0.5f;
                    batch.draw(texture, f24, f2, f3, f8, u + f31, f25, u2 - f31, v);
                }
                f10 = f2;
            }
            f11 = f + f6;
            if (i10 == 0 || !Align.isCenterHorizontal(i)) {
                i2 = i10;
                f12 = u;
                f13 = u2;
                f14 = regionWidth;
            } else {
                float f32 = (1.0f - f28) * (u2 - u) * 0.5f;
                f14 = f3;
                f12 = u + f32;
                f13 = u2 - f32;
                i2 = 1;
            }
            if (i11 == 0 || !Align.isCenterVertical(i)) {
                f15 = regionHeight;
                i3 = i11;
                f16 = v;
                f17 = v2;
            } else {
                float f33 = (1.0f - f29) * (v2 - v) * 0.5f;
                f15 = f4;
                f17 = v2 - f33;
                f16 = v + f33;
                i3 = 1;
            }
            f18 = f11;
            i4 = 0;
            while (i4 < i2) {
                f10 = f2 + f8;
                i7 = 0;
                while (i7 < i3) {
                    batch.draw(texture, f18, f10, f14, f15, f12, f17, f13, f16);
                    f10 += f15;
                    i7++;
                    i4 = i4;
                    i3 = i3;
                    i2 = i2;
                }
                f18 += f14;
                i4++;
            }
            if (f9 > 0.0f) {
                f23 = v2 - (f9 / height);
                if (i10 == 0 || !Align.isCenterHorizontal(i)) {
                    for (i6 = 0; i6 < i10; i6++) {
                        batch.draw(texture, f11, f10, regionWidth, f9, u, v2, u2, f23);
                        f11 += regionWidth;
                    }
                } else {
                    float f34 = (1.0f - f28) * (u2 - u) * 0.5f;
                    batch.draw(texture, f11, f10, f3, f9, u + f34, v2, u2 - f34, f23);
                    f11 += f3;
                }
            } else {
                f11 = f18;
            }
            if (f7 > 0.0f) {
                f19 = (f7 / width) + u;
                if (f8 > 0.0f) {
                    batch.draw(texture, f11, f2, f7, f8, u, (f8 / height) + v, f19, v);
                    f20 = f2 + f8;
                } else {
                    f20 = f2;
                }
                if (i11 == 0 || !Align.isCenterVertical(i)) {
                    f21 = f20;
                    for (i5 = 0; i5 < i11; i5++) {
                        batch.draw(texture, f11, f21, f7, regionHeight, u, v2, f19, v);
                        f21 += regionHeight;
                    }
                    f22 = f21;
                } else {
                    float f35 = (1.0f - f29) * (v2 - v) * 0.5f;
                    batch.draw(texture, f11, f20, f7, f4, u, v2 - f35, f19, v + f35);
                    f22 = f20 + f4;
                }
                if (f9 > 0.0f) {
                    batch.draw(texture, f11, f22, f7, f9, u, v2, f19, v2 - (f9 / height));
                }
            }
        }
        f8 = f4 - (i11 * regionHeight);
        f9 = 0.0f;
        if (f6 > 0.0f) {
            f27 = u2 - (f6 / width);
            if (f8 > 0.0f) {
                batch.draw(texture, f, f2, f6, f8, f27, (f8 / height) + v, u2, v);
                f10 = f2 + f8;
            } else {
                f10 = f2;
            }
            if (i11 == 0) {
                while (i9 < i11) {
                    batch.draw(texture, f, f10, f6, regionHeight, f27, v2, u2, v);
                    f10 += regionHeight;
                }
            } else {
                while (i9 < i11) {
                    batch.draw(texture, f, f10, f6, regionHeight, f27, v2, u2, v);
                    f10 += regionHeight;
                }
            }
            if (f9 > 0.0f) {
                batch.draw(texture, f, f10, f6, f9, f27, v2, u2, v2 - (f9 / height));
            }
        } else {
            f29 = f29;
            regionWidth = regionWidth;
            width = width;
            i11 = i11;
            i10 = i10;
            f10 = f2;
        }
        if (f8 > 0.0f) {
            f24 = f + f6;
            f25 = (f8 / height) + v;
            if (i10 == 0) {
                f26 = f24;
                while (i8 < i10) {
                    batch.draw(texture, f26, f2, regionWidth, f8, u, f25, u2, v);
                    f26 += regionWidth;
                }
            } else {
                f26 = f24;
                while (i8 < i10) {
                    batch.draw(texture, f26, f2, regionWidth, f8, u, f25, u2, v);
                    f26 += regionWidth;
                }
            }
            f10 = f2;
        }
        f11 = f + f6;
        if (i10 == 0) {
            i2 = i10;
            f12 = u;
            f13 = u2;
            f14 = regionWidth;
        } else {
            i2 = i10;
            f12 = u;
            f13 = u2;
            f14 = regionWidth;
        }
        if (i11 == 0) {
            f15 = regionHeight;
            i3 = i11;
            f16 = v;
            f17 = v2;
        } else {
            f15 = regionHeight;
            i3 = i11;
            f16 = v;
            f17 = v2;
        }
        f18 = f11;
        i4 = 0;
        while (i4 < i2) {
            f10 = f2 + f8;
            i7 = 0;
            while (i7 < i3) {
                batch.draw(texture, f18, f10, f14, f15, f12, f17, f13, f16);
                f10 += f15;
                i7++;
                i4 = i4;
                i3 = i3;
                i2 = i2;
            }
            f18 += f14;
            i4++;
        }
        if (f9 > 0.0f) {
            f23 = v2 - (f9 / height);
            if (i10 == 0) {
                while (i6 < i10) {
                    batch.draw(texture, f11, f10, regionWidth, f9, u, v2, u2, f23);
                    f11 += regionWidth;
                }
            } else {
                while (i6 < i10) {
                    batch.draw(texture, f11, f10, regionWidth, f9, u, v2, u2, f23);
                    f11 += regionWidth;
                }
            }
        } else {
            f11 = f18;
        }
        if (f7 > 0.0f) {
            f19 = (f7 / width) + u;
            if (f8 > 0.0f) {
                batch.draw(texture, f11, f2, f7, f8, u, (f8 / height) + v, f19, v);
                f20 = f2 + f8;
            } else {
                f20 = f2;
            }
            if (i11 == 0) {
                f21 = f20;
                while (i5 < i11) {
                    batch.draw(texture, f11, f21, f7, regionHeight, u, v2, f19, v);
                    f21 += regionHeight;
                }
                f22 = f21;
            } else {
                f21 = f20;
                while (i5 < i11) {
                    batch.draw(texture, f11, f21, f7, regionHeight, u, v2, f19, v);
                    f21 += regionHeight;
                }
                f22 = f21;
            }
            if (f9 > 0.0f) {
                batch.draw(texture, f11, f22, f7, f9, u, v2, f19, v2 - (f9 / height));
            }
        }
    }

    public TiledDrawable(TextureRegionDrawable textureRegionDrawable) {
        super(textureRegionDrawable);
        this.color = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.scale = 1.0f;
        this.align = 12;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable, com.badlogic.gdx.scenes.scene2d.utils.TransformDrawable
    public void draw(Batch batch, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        throw new UnsupportedOperationException();
    }
}
