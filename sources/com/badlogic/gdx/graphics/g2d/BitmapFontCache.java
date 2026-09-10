package com.badlogic.gdx.graphics.g2d;

import androidx.core.view.ViewCompat;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.IntArray;
import com.badlogic.gdx.utils.NumberUtils;
import com.badlogic.gdx.utils.Pools;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class BitmapFontCache {
    private static final Color tempColor = new Color(1.0f, 1.0f, 1.0f, 1.0f);
    private final Color color;
    private float currentTint;
    private final BitmapFont font;
    private int glyphCount;
    private int[] idx;
    private boolean integer;
    private final Array<GlyphLayout> layouts;
    private IntArray[] pageGlyphIndices;
    private float[][] pageVertices;
    private final Array<GlyphLayout> pooledLayouts;
    private int[] tempGlyphCount;
    private float x;
    private float y;

    public BitmapFontCache(BitmapFont bitmapFont) {
        this(bitmapFont, bitmapFont.usesIntegerPositions());
    }

    private void addGlyph(BitmapFont.Glyph glyph, float f, float f2, float f3) {
        BitmapFont.BitmapFontData bitmapFontData = this.font.data;
        float f4 = bitmapFontData.scaleX;
        float f5 = bitmapFontData.scaleY;
        float fRound = (glyph.xoffset * f4) + f;
        float fRound2 = (glyph.yoffset * f5) + f2;
        float fRound3 = glyph.width * f4;
        float fRound4 = glyph.height * f5;
        float f6 = glyph.u;
        float f7 = glyph.u2;
        float f8 = glyph.v;
        float f9 = glyph.v2;
        if (this.integer) {
            fRound = Math.round(fRound);
            fRound2 = Math.round(fRound2);
            fRound3 = Math.round(fRound3);
            fRound4 = Math.round(fRound4);
        }
        float f10 = fRound3 + fRound;
        float f11 = fRound4 + fRound2;
        int i = glyph.page;
        int[] iArr = this.idx;
        int i2 = iArr[i];
        iArr[i] = i2 + 20;
        IntArray[] intArrayArr = this.pageGlyphIndices;
        if (intArrayArr != null) {
            IntArray intArray = intArrayArr[i];
            int i3 = this.glyphCount;
            this.glyphCount = i3 + 1;
            intArray.add(i3);
        }
        float[] fArr = this.pageVertices[i];
        fArr[i2] = fRound;
        fArr[i2 + 1] = fRound2;
        fArr[i2 + 2] = f3;
        fArr[i2 + 3] = f6;
        fArr[i2 + 4] = f8;
        fArr[i2 + 5] = fRound;
        fArr[i2 + 6] = f11;
        fArr[i2 + 7] = f3;
        fArr[i2 + 8] = f6;
        fArr[i2 + 9] = f9;
        fArr[i2 + 10] = f10;
        fArr[i2 + 11] = f11;
        fArr[i2 + 12] = f3;
        fArr[i2 + 13] = f7;
        fArr[i2 + 14] = f9;
        fArr[i2 + 15] = f10;
        fArr[i2 + 16] = fRound2;
        fArr[i2 + 17] = f3;
        fArr[i2 + 18] = f7;
        fArr[i2 + 19] = f8;
    }

    private void addToCache(GlyphLayout glyphLayout, float f, float f2) {
        int i = glyphLayout.runs.size;
        if (i == 0) {
            return;
        }
        int length = this.pageVertices.length;
        int i2 = this.font.regions.size;
        if (length < i2) {
            setPageCount(i2);
        }
        this.layouts.add(glyphLayout);
        requireGlyphs(glyphLayout);
        IntArray intArray = glyphLayout.colors;
        float fIntToFloatColor = 0.0f;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            GlyphLayout.GlyphRun glyphRun = glyphLayout.runs.get(i6);
            Array<BitmapFont.Glyph> array = glyphRun.glyphs;
            BitmapFont.Glyph[] glyphArr = array.items;
            float[] fArr = glyphRun.xAdvances.items;
            float f3 = f + glyphRun.x;
            float f4 = f2 + glyphRun.y;
            int i7 = array.size;
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i4 + 1;
                if (i4 == i3) {
                    fIntToFloatColor = NumberUtils.intToFloatColor(intArray.get(i5 + 1));
                    i5 += 2;
                    i3 = i5 < intArray.size ? intArray.get(i5) : -1;
                }
                f3 += fArr[i8];
                addGlyph(glyphArr[i8], f3, f4, fIntToFloatColor);
                i8++;
                i4 = i9;
            }
        }
        this.currentTint = Color.WHITE_FLOAT_BITS;
    }

    private void requireGlyphs(GlyphLayout glyphLayout) {
        if (this.pageVertices.length == 1) {
            requirePageGlyphs(0, glyphLayout.glyphCount);
            return;
        }
        int[] iArr = this.tempGlyphCount;
        Arrays.fill(iArr, 0);
        int i = glyphLayout.runs.size;
        for (int i2 = 0; i2 < i; i2++) {
            Array<BitmapFont.Glyph> array = glyphLayout.runs.get(i2).glyphs;
            BitmapFont.Glyph[] glyphArr = array.items;
            int i3 = array.size;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = glyphArr[i4].page;
                iArr[i5] = iArr[i5] + 1;
            }
        }
        int length = iArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            requirePageGlyphs(i6, iArr[i6]);
        }
    }

    private void requirePageGlyphs(int i, int i2) {
        IntArray[] intArrayArr = this.pageGlyphIndices;
        if (intArrayArr != null) {
            IntArray intArray = intArrayArr[i];
            if (i2 > intArray.items.length) {
                intArray.ensureCapacity(i2 - intArray.size);
            }
        }
        int i3 = this.idx[i];
        int i4 = (i2 * 20) + i3;
        float[][] fArr = this.pageVertices;
        float[] fArr2 = fArr[i];
        if (fArr2 == null) {
            fArr[i] = new float[i4];
        } else if (fArr2.length < i4) {
            float[] fArr3 = new float[i4];
            System.arraycopy(fArr2, 0, fArr3, 0, i3);
            this.pageVertices[i] = fArr3;
        }
    }

    private void setPageCount(int i) {
        float[][] fArr = new float[i][];
        float[][] fArr2 = this.pageVertices;
        int i2 = 0;
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        this.pageVertices = fArr;
        int[] iArr = new int[i];
        int[] iArr2 = this.idx;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.idx = iArr;
        IntArray[] intArrayArr = new IntArray[i];
        IntArray[] intArrayArr2 = this.pageGlyphIndices;
        if (intArrayArr2 != null) {
            int length = intArrayArr2.length;
            System.arraycopy(intArrayArr2, 0, intArrayArr, 0, intArrayArr2.length);
            i2 = length;
        }
        while (i2 < i) {
            intArrayArr[i2] = new IntArray();
            i2++;
        }
        this.pageGlyphIndices = intArrayArr;
        this.tempGlyphCount = new int[i];
    }

    public GlyphLayout addText(CharSequence charSequence, float f, float f2) {
        return addText(charSequence, f, f2, 0, charSequence.length(), 0.0f, 8, false, null);
    }

    public void clear() {
        this.x = 0.0f;
        this.y = 0.0f;
        Pools.freeAll(this.pooledLayouts, true);
        this.pooledLayouts.clear();
        this.layouts.clear();
        int length = this.idx.length;
        for (int i = 0; i < length; i++) {
            IntArray[] intArrayArr = this.pageGlyphIndices;
            if (intArrayArr != null) {
                intArrayArr[i].clear();
            }
            this.idx[i] = 0;
        }
    }

    public void draw(Batch batch) {
        Array<TextureRegion> regions = this.font.getRegions();
        int length = this.pageVertices.length;
        for (int i = 0; i < length; i++) {
            if (this.idx[i] > 0) {
                batch.draw(regions.get(i).getTexture(), this.pageVertices[i], 0, this.idx[i]);
            }
        }
    }

    public Color getColor() {
        return this.color;
    }

    public BitmapFont getFont() {
        return this.font;
    }

    public Array<GlyphLayout> getLayouts() {
        return this.layouts;
    }

    public int getVertexCount(int i) {
        return this.idx[i];
    }

    public float[] getVertices() {
        return getVertices(0);
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void setAlphas(float f) {
        int i = ((int) (f * 254.0f)) << 24;
        int length = this.pageVertices.length;
        float f2 = 0.0f;
        float fIntToFloatColor = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            float[] fArr = this.pageVertices[i2];
            int i3 = this.idx[i2];
            for (int i4 = 2; i4 < i3; i4 += 5) {
                float f3 = fArr[i4];
                if (f3 != f2 || i4 == 2) {
                    fIntToFloatColor = NumberUtils.intToFloatColor((NumberUtils.floatToIntColor(f3) & ViewCompat.MEASURED_SIZE_MASK) | i);
                    fArr[i4] = fIntToFloatColor;
                    f2 = f3;
                } else {
                    fArr[i4] = fIntToFloatColor;
                }
            }
        }
    }

    public void setColor(Color color) {
        this.color.set(color);
    }

    public void setColors(float f) {
        int length = this.pageVertices.length;
        for (int i = 0; i < length; i++) {
            float[] fArr = this.pageVertices[i];
            int i2 = this.idx[i];
            for (int i3 = 2; i3 < i2; i3 += 5) {
                fArr[i3] = f;
            }
        }
    }

    public void setPosition(float f, float f2) {
        translate(f - this.x, f2 - this.y);
    }

    public GlyphLayout setText(CharSequence charSequence, float f, float f2) {
        clear();
        return addText(charSequence, f, f2, 0, charSequence.length(), 0.0f, 8, false);
    }

    public void setUseIntegerPositions(boolean z) {
        this.integer = z;
    }

    public void tint(Color color) {
        BitmapFontCache bitmapFontCache = this;
        float floatBits = color.toFloatBits();
        if (bitmapFontCache.currentTint == floatBits) {
            return;
        }
        bitmapFontCache.currentTint = floatBits;
        float[][] fArr = bitmapFontCache.pageVertices;
        Color color2 = tempColor;
        int[] iArr = bitmapFontCache.tempGlyphCount;
        Arrays.fill(iArr, 0);
        int i = bitmapFontCache.layouts.size;
        int i2 = 0;
        while (i2 < i) {
            GlyphLayout glyphLayout = bitmapFontCache.layouts.get(i2);
            IntArray intArray = glyphLayout.colors;
            int i3 = glyphLayout.runs.size;
            float floatBits2 = 0.0f;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                Array<BitmapFont.Glyph> array = glyphLayout.runs.get(i7).glyphs;
                BitmapFont.Glyph[] glyphArr = array.items;
                int i8 = array.size;
                int i9 = 0;
                while (i9 < i8) {
                    int i10 = i5 + 1;
                    if (i5 == i4) {
                        Color.abgr8888ToColor(color2, intArray.get(i6 + 1));
                        floatBits2 = color2.mul(color).toFloatBits();
                        i6 += 2;
                        i4 = i6 < intArray.size ? intArray.get(i6) : -1;
                    }
                    Color color3 = color2;
                    int i11 = glyphArr[i9].page;
                    int i12 = iArr[i11];
                    int i13 = i12 * 20;
                    iArr[i11] = i12 + 1;
                    float[] fArr2 = fArr[i11];
                    fArr2[i13 + 2] = floatBits2;
                    fArr2[i13 + 7] = floatBits2;
                    fArr2[i13 + 12] = floatBits2;
                    fArr2[i13 + 17] = floatBits2;
                    i9++;
                    i5 = i10;
                    color2 = color3;
                }
            }
            i2++;
            bitmapFontCache = this;
        }
    }

    public void translate(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            return;
        }
        if (this.integer) {
            f = Math.round(f);
            f2 = Math.round(f2);
        }
        this.x += f;
        this.y += f2;
        float[][] fArr = this.pageVertices;
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float[] fArr2 = fArr[i];
            int i2 = this.idx[i];
            for (int i3 = 0; i3 < i2; i3 += 5) {
                fArr2[i3] = fArr2[i3] + f;
                int i4 = i3 + 1;
                fArr2[i4] = fArr2[i4] + f2;
            }
        }
    }

    public boolean usesIntegerPositions() {
        return this.integer;
    }

    public BitmapFontCache(BitmapFont bitmapFont, boolean z) {
        this.layouts = new Array<>(1);
        this.pooledLayouts = new Array<>(0);
        this.color = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.font = bitmapFont;
        this.integer = z;
        int i = bitmapFont.regions.size;
        if (i == 0) {
            throw new IllegalArgumentException("The specified font must contain at least one texture page.");
        }
        this.pageVertices = new float[i][];
        this.idx = new int[i];
        if (i > 1) {
            IntArray[] intArrayArr = new IntArray[i];
            this.pageGlyphIndices = intArrayArr;
            int length = intArrayArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.pageGlyphIndices[i2] = new IntArray();
            }
        }
        this.tempGlyphCount = new int[i];
    }

    public GlyphLayout addText(CharSequence charSequence, float f, float f2, float f3, int i, boolean z) {
        return addText(charSequence, f, f2, 0, charSequence.length(), f3, i, z, null);
    }

    public float[] getVertices(int i) {
        return this.pageVertices[i];
    }

    public void setColor(float f, float f2, float f3, float f4) {
        this.color.set(f, f2, f3, f4);
    }

    public GlyphLayout addText(CharSequence charSequence, float f, float f2, int i, int i2, float f3, int i3, boolean z) {
        return addText(charSequence, f, f2, i, i2, f3, i3, z, null);
    }

    public GlyphLayout setText(CharSequence charSequence, float f, float f2, float f3, int i, boolean z) {
        clear();
        return addText(charSequence, f, f2, 0, charSequence.length(), f3, i, z);
    }

    public GlyphLayout addText(CharSequence charSequence, float f, float f2, int i, int i2, float f3, int i3, boolean z, String str) {
        GlyphLayout glyphLayout = (GlyphLayout) Pools.obtain(GlyphLayout.class);
        this.pooledLayouts.add(glyphLayout);
        glyphLayout.setText(this.font, charSequence, i, i2, this.color, f3, i3, z, str);
        addText(glyphLayout, f, f2);
        return glyphLayout;
    }

    public void setColors(Color color) {
        setColors(color.toFloatBits());
    }

    public GlyphLayout setText(CharSequence charSequence, float f, float f2, int i, int i2, float f3, int i3, boolean z) {
        clear();
        return addText(charSequence, f, f2, i, i2, f3, i3, z);
    }

    public void draw(Batch batch, int i, int i2) {
        if (this.pageVertices.length == 1) {
            batch.draw(this.font.getRegion().getTexture(), this.pageVertices[0], i * 20, (i2 - i) * 20);
            return;
        }
        Array<TextureRegion> regions = this.font.getRegions();
        int length = this.pageVertices.length;
        for (int i3 = 0; i3 < length; i3++) {
            IntArray intArray = this.pageGlyphIndices[i3];
            int i4 = intArray.size;
            int i5 = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = intArray.get(i7);
                if (i8 >= i2) {
                    break;
                }
                if (i5 == -1 && i8 >= i) {
                    i5 = i7;
                }
                if (i8 >= i) {
                    i6++;
                }
            }
            if (i5 != -1 && i6 != 0) {
                batch.draw(regions.get(i3).getTexture(), this.pageVertices[i3], i5 * 20, i6 * 20);
            }
        }
    }

    public void setColors(float f, float f2, float f3, float f4) {
        int i = ((int) (f2 * 255.0f)) << 8;
        int i2 = (int) (f * 255.0f);
        setColors(NumberUtils.intToFloatColor(i2 | i | (((int) (f3 * 255.0f)) << 16) | (((int) (f4 * 255.0f)) << 24)));
    }

    public void setColors(Color color, int i, int i2) {
        setColors(color.toFloatBits(), i, i2);
    }

    public GlyphLayout setText(CharSequence charSequence, float f, float f2, int i, int i2, float f3, int i3, boolean z, String str) {
        clear();
        return addText(charSequence, f, f2, i, i2, f3, i3, z, str);
    }

    public void addText(GlyphLayout glyphLayout, float f, float f2) {
        addToCache(glyphLayout, f, f2 + this.font.data.ascent);
    }

    public void setColors(float f, int i, int i2) {
        float[][] fArr = this.pageVertices;
        if (fArr.length == 1) {
            float[] fArr2 = fArr[0];
            int iMin = Math.min(i2 * 20, this.idx[0]);
            for (int i3 = (i * 20) + 2; i3 < iMin; i3 += 5) {
                fArr2[i3] = f;
            }
            return;
        }
        int length = fArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            float[] fArr3 = this.pageVertices[i4];
            IntArray intArray = this.pageGlyphIndices[i4];
            int i5 = intArray.size;
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = intArray.items[i6];
                if (i7 >= i2) {
                    break;
                }
                if (i7 >= i) {
                    int i8 = i6 * 20;
                    fArr3[i8 + 2] = f;
                    fArr3[i8 + 7] = f;
                    fArr3[i8 + 12] = f;
                    fArr3[i8 + 17] = f;
                }
            }
        }
    }

    public void setText(GlyphLayout glyphLayout, float f, float f2) {
        clear();
        addText(glyphLayout, f, f2);
    }

    public void draw(Batch batch, float f) {
        if (f == 1.0f) {
            draw(batch);
            return;
        }
        Color color = getColor();
        float f2 = color.f202a;
        color.f202a = f * f2;
        setColors(color);
        draw(batch);
        color.f202a = f2;
        setColors(color);
    }
}
