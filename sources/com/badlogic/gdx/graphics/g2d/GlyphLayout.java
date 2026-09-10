package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Colors;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.FloatArray;
import com.badlogic.gdx.utils.IntArray;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.Pool;
import com.badlogic.gdx.utils.Pools;

/* JADX INFO: loaded from: classes.dex */
public class GlyphLayout implements Pool.Poolable {
    private static final float epsilon = 1.0E-4f;
    public int glyphCount;
    public float height;
    public float width;
    private static final Pool<GlyphRun> glyphRunPool = Pools.get(GlyphRun.class);
    private static final IntArray colorStack = new IntArray(4);
    public final Array<GlyphRun> runs = new Array<>(1);
    public final IntArray colors = new IntArray(2);

    public static class GlyphRun implements Pool.Poolable {
        public float width;
        public float x;
        public float y;
        public Array<BitmapFont.Glyph> glyphs = new Array<>();
        public FloatArray xAdvances = new FloatArray();

        public void appendRun(GlyphRun glyphRun) {
            this.glyphs.addAll(glyphRun.glyphs);
            if (this.xAdvances.notEmpty()) {
                this.xAdvances.size--;
            }
            this.xAdvances.addAll(glyphRun.xAdvances);
        }

        @Override // com.badlogic.gdx.utils.Pool.Poolable
        public void reset() {
            this.glyphs.clear();
            this.xAdvances.clear();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(this.glyphs.size + 32);
            Array<BitmapFont.Glyph> array = this.glyphs;
            int i = array.size;
            for (int i2 = 0; i2 < i; i2++) {
                sb.append((char) array.get(i2).id);
            }
            sb.append(", ");
            sb.append(this.x);
            sb.append(", ");
            sb.append(this.y);
            sb.append(", ");
            sb.append(this.width);
            return sb.toString();
        }
    }

    public GlyphLayout() {
    }

    private void alignRuns(float f, int i) {
        if ((i & 8) == 0) {
            boolean z = (i & 1) != 0;
            Array<GlyphRun> array = this.runs;
            GlyphRun[] glyphRunArr = array.items;
            int i2 = array.size;
            for (int i3 = 0; i3 < i2; i3++) {
                GlyphRun glyphRun = glyphRunArr[i3];
                float f2 = glyphRun.x;
                float f3 = f - glyphRun.width;
                if (z) {
                    f3 *= 0.5f;
                }
                glyphRun.x = f2 + f3;
            }
        }
    }

    private void calculateWidths(BitmapFont.BitmapFontData bitmapFontData) {
        Array<GlyphRun> array = this.runs;
        GlyphRun[] glyphRunArr = array.items;
        int i = array.size;
        float fMax = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            GlyphRun glyphRun = glyphRunArr[i2];
            float[] fArr = glyphRun.xAdvances.items;
            float f = glyphRun.x + fArr[0];
            Array<BitmapFont.Glyph> array2 = glyphRun.glyphs;
            BitmapFont.Glyph[] glyphArr = array2.items;
            int i3 = array2.size;
            int i4 = 0;
            float fMax2 = 0.0f;
            while (i4 < i3) {
                fMax2 = Math.max(fMax2, getGlyphWidth(glyphArr[i4], bitmapFontData) + f);
                i4++;
                f += fArr[i4];
            }
            float fMax3 = Math.max(f, fMax2);
            float f2 = glyphRun.x;
            float f3 = fMax3 - f2;
            glyphRun.width = f3;
            fMax = Math.max(fMax, f2 + f3);
        }
        this.width = fMax;
    }

    private float getGlyphWidth(BitmapFont.Glyph glyph, BitmapFont.BitmapFontData bitmapFontData) {
        int i;
        if (glyph.fixedWidth) {
            i = glyph.xadvance;
        } else {
            i = glyph.xoffset + glyph.width;
        }
        return (i * bitmapFontData.scaleX) - bitmapFontData.padRight;
    }

    private float getLineOffset(Array<BitmapFont.Glyph> array, BitmapFont.BitmapFontData bitmapFontData) {
        BitmapFont.Glyph glyphFirst = array.first();
        return (glyphFirst.fixedWidth ? 0.0f : (-glyphFirst.xoffset) * bitmapFontData.scaleX) - bitmapFontData.padLeft;
    }

    private int parseColorMarkup(CharSequence charSequence, int i, int i2) {
        if (i == i2) {
            return -1;
        }
        char cCharAt = charSequence.charAt(i);
        int i3 = 0;
        if (cCharAt != '#') {
            if (cCharAt == '[') {
                return -2;
            }
            if (cCharAt == ']') {
                IntArray intArray = colorStack;
                if (intArray.size > 1) {
                    intArray.pop();
                }
                return 0;
            }
            for (int i4 = i + 1; i4 < i2; i4++) {
                if (charSequence.charAt(i4) == ']') {
                    Color color = Colors.get(charSequence.subSequence(i, i4).toString());
                    if (color == null) {
                        return -1;
                    }
                    colorStack.add(color.toIntBits());
                    return i4 - i;
                }
            }
            return -1;
        }
        for (int i5 = i + 1; i5 < i2; i5++) {
            char cCharAt2 = charSequence.charAt(i5);
            if (cCharAt2 == ']') {
                if (i5 < i + 2 || i5 > i + 9) {
                    break;
                    break;
                }
                int i6 = i5 - i;
                if (i6 < 8) {
                    i3 = (i3 << ((9 - i6) << 2)) | 255;
                }
                colorStack.add(Integer.reverseBytes(i3));
                return i6;
            }
            int i7 = (i3 << 4) + cCharAt2;
            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                i3 = i7 - 48;
            } else if (cCharAt2 >= 'A' && cCharAt2 <= 'F') {
                i3 = i7 - 55;
            } else {
                if (cCharAt2 < 'a' || cCharAt2 > 'f') {
                    break;
                }
                i3 = i7 - 87;
            }
        }
        return -1;
    }

    private void setLastGlyphXAdvance(BitmapFont.BitmapFontData bitmapFontData, GlyphRun glyphRun) {
        BitmapFont.Glyph glyphPeek = glyphRun.glyphs.peek();
        if (glyphPeek.fixedWidth) {
            return;
        }
        FloatArray floatArray = glyphRun.xAdvances;
        floatArray.items[floatArray.size - 1] = getGlyphWidth(glyphPeek, bitmapFontData);
    }

    private void truncate(BitmapFont.BitmapFontData bitmapFontData, GlyphRun glyphRun, float f, String str) {
        int i = glyphRun.glyphs.size;
        GlyphRun glyphRunObtain = glyphRunPool.obtain();
        bitmapFontData.getGlyphs(glyphRunObtain, str, 0, str.length(), null);
        float f2 = 0.0f;
        if (glyphRunObtain.xAdvances.size > 0) {
            setLastGlyphXAdvance(bitmapFontData, glyphRunObtain);
            FloatArray floatArray = glyphRunObtain.xAdvances;
            float[] fArr = floatArray.items;
            int i2 = floatArray.size;
            for (int i3 = 1; i3 < i2; i3++) {
                f2 += fArr[i3];
            }
        }
        float f3 = f - f2;
        float f4 = glyphRun.x;
        float[] fArr2 = glyphRun.xAdvances.items;
        int i4 = 0;
        while (i4 < glyphRun.xAdvances.size) {
            f4 += fArr2[i4];
            if (f4 > f3) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 > 1) {
            glyphRun.glyphs.truncate(i4 - 1);
            glyphRun.xAdvances.truncate(i4);
            setLastGlyphXAdvance(bitmapFontData, glyphRun);
            FloatArray floatArray2 = glyphRunObtain.xAdvances;
            int i5 = floatArray2.size;
            if (i5 > 0) {
                glyphRun.xAdvances.addAll(floatArray2, 1, i5 - 1);
            }
        } else {
            glyphRun.glyphs.clear();
            glyphRun.xAdvances.clear();
            glyphRun.xAdvances.addAll(glyphRunObtain.xAdvances);
        }
        int i6 = i - glyphRun.glyphs.size;
        if (i6 > 0) {
            this.glyphCount -= i6;
            if (bitmapFontData.markupEnabled) {
                while (true) {
                    IntArray intArray = this.colors;
                    int i7 = intArray.size;
                    if (i7 <= 2 || intArray.get(i7 - 2) < this.glyphCount) {
                        break;
                    }
                    this.colors.size -= 2;
                }
            }
        }
        glyphRun.glyphs.addAll(glyphRunObtain.glyphs);
        this.glyphCount = str.length() + this.glyphCount;
        glyphRunPool.free(glyphRunObtain);
    }

    private GlyphRun wrap(BitmapFont.BitmapFontData bitmapFontData, GlyphRun glyphRun, int i) {
        GlyphRun glyphRunObtain;
        int i2;
        Array<BitmapFont.Glyph> array = glyphRun.glyphs;
        int i3 = array.size;
        FloatArray floatArray = glyphRun.xAdvances;
        int i4 = i;
        while (i4 > 0 && bitmapFontData.isWhitespace((char) array.get(i4 - 1).id)) {
            i4--;
        }
        while (i < i3 && bitmapFontData.isWhitespace((char) array.get(i).id)) {
            i++;
        }
        if (i < i3) {
            glyphRunObtain = glyphRunPool.obtain();
            Array<BitmapFont.Glyph> array2 = glyphRunObtain.glyphs;
            array2.addAll(array, 0, i4);
            array.removeRange(0, i - 1);
            glyphRun.glyphs = array2;
            glyphRunObtain.glyphs = array;
            FloatArray floatArray2 = glyphRunObtain.xAdvances;
            floatArray2.addAll(floatArray, 0, i4 + 1);
            floatArray.removeRange(1, i);
            floatArray.items[0] = getLineOffset(array, bitmapFontData);
            glyphRun.xAdvances = floatArray2;
            glyphRunObtain.xAdvances = floatArray;
            int i5 = glyphRun.glyphs.size;
            int i6 = glyphRunObtain.glyphs.size;
            int i7 = (i3 - i5) - i6;
            int i8 = this.glyphCount - i7;
            this.glyphCount = i8;
            if (bitmapFontData.markupEnabled && i7 > 0) {
                int i9 = i8 - i6;
                for (int i10 = this.colors.size - 2; i10 >= 2; i10 -= 2) {
                    int i11 = this.colors.get(i10);
                    if (i11 <= i9) {
                        break;
                    }
                    this.colors.set(i10, i11 - i7);
                }
            }
        } else {
            array.truncate(i4);
            floatArray.truncate(i4 + 1);
            int i12 = i - i4;
            if (i12 > 0) {
                this.glyphCount -= i12;
                if (bitmapFontData.markupEnabled) {
                    IntArray intArray = this.colors;
                    if (intArray.get(intArray.size - 2) > this.glyphCount) {
                        int iPeek = this.colors.peek();
                        while (true) {
                            IntArray intArray2 = this.colors;
                            int i13 = intArray2.get(intArray2.size - 2);
                            i2 = this.glyphCount;
                            if (i13 <= i2) {
                                break;
                            }
                            this.colors.size -= 2;
                        }
                        IntArray intArray3 = this.colors;
                        intArray3.set(intArray3.size - 2, i2);
                        IntArray intArray4 = this.colors;
                        intArray4.set(intArray4.size - 1, iPeek);
                    }
                }
            }
            glyphRunObtain = null;
        }
        if (i4 == 0) {
            glyphRunPool.free(glyphRun);
            this.runs.pop();
        } else {
            setLastGlyphXAdvance(bitmapFontData, glyphRun);
        }
        return glyphRunObtain;
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
        glyphRunPool.freeAll(this.runs);
        this.runs.clear();
        this.colors.clear();
        this.glyphCount = 0;
        this.width = 0.0f;
        this.height = 0.0f;
    }

    public void setText(BitmapFont bitmapFont, CharSequence charSequence) {
        setText(bitmapFont, charSequence, 0, charSequence.length(), bitmapFont.getColor(), 0.0f, 8, false, null);
    }

    public String toString() {
        if (this.runs.size == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append(this.width);
        sb.append('x');
        sb.append(this.height);
        sb.append('\n');
        int i = this.runs.size;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(this.runs.get(i2).toString());
            sb.append('\n');
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public void setText(BitmapFont bitmapFont, CharSequence charSequence, Color color, float f, int i, boolean z) {
        setText(bitmapFont, charSequence, 0, charSequence.length(), color, f, i, z, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:102:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:52:0x0103  */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116  */
    /* JADX WARN: Code duplicated, block: B:58:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x0133  */
    /* JADX WARN: Code duplicated, block: B:66:0x013a  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e4 A[EDGE_INSN: B:96:0x01e4->B:97:0x01ea BREAK  A[LOOP:1: B:72:0x0154->B:95:0x01e0], PHI: r2 r22
  0x01e4: PHI (r2v7 com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun) = 
  (r2v6 com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun)
  (r2v6 com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun)
  (r2v8 com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun)
  (r2v6 com.badlogic.gdx.graphics.g2d.GlyphLayout$GlyphRun)
 binds: [B:65:0x0138, B:67:0x013e, B:115:0x01e4, B:70:0x0144] A[DONT_GENERATE, DONT_INLINE]
  0x01e4: PHI (r22v1 float) = (r22v0 float), (r22v0 float), (r22v2 float), (r22v0 float) binds: [B:65:0x0138, B:67:0x013e, B:115:0x01e4, B:70:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x01ec  */
    public void setText(BitmapFont bitmapFont, CharSequence charSequence, int i, int i2, Color color, float f, int i3, boolean z, @Null String str) {
        int i4;
        int iPeek;
        int i5;
        boolean z2;
        boolean z3;
        Pool<GlyphRun> pool;
        int i6;
        GlyphRun glyphRun;
        int i7;
        int i8;
        float f2;
        float f3;
        GlyphRun glyphRun2;
        int i9;
        float fFirst;
        int i10;
        int i11;
        CharSequence charSequence2 = charSequence;
        int i12 = i2;
        reset();
        BitmapFont.BitmapFontData bitmapFontData = bitmapFont.data;
        int i13 = i;
        if (i13 == i12) {
            this.height = bitmapFontData.capHeight;
            return;
        }
        float fMax = z ? Math.max(f, bitmapFontData.spaceXadvance * 3.0f) : f;
        boolean z4 = z || str != null;
        int intBits = color.toIntBits();
        this.colors.add(0, intBits);
        boolean z5 = bitmapFontData.markupEnabled;
        if (z5) {
            colorStack.add(intBits);
        }
        float f4 = bitmapFontData.down;
        int i14 = i13;
        int i15 = intBits;
        BitmapFont.Glyph glyphPeek = null;
        GlyphRun glyphRun3 = null;
        float f5 = 0.0f;
        boolean z6 = false;
        loop0: while (true) {
            if (i13 != i12) {
                int i16 = i13 + 1;
                char cCharAt = charSequence2.charAt(i13);
                int i17 = intBits;
                if (cCharAt != '\n') {
                    if (cCharAt == '[' && z5) {
                        int colorMarkup = parseColorMarkup(charSequence2, i16, i12);
                        if (colorMarkup >= 0) {
                            int i18 = colorMarkup + 1 + i16;
                            if (i18 == i12) {
                                iPeek = i17;
                                i5 = i13;
                                i4 = i18;
                            } else {
                                iPeek = colorStack.peek();
                                i5 = i13;
                                z3 = z6;
                                z2 = false;
                                i4 = i18;
                            }
                        } else {
                            if (colorMarkup == -2) {
                                i13 += 2;
                            }
                            intBits = i17;
                        }
                    }
                    i13 = i16;
                    intBits = i17;
                } else {
                    iPeek = i17;
                    z3 = z6;
                    z2 = true;
                    i4 = i16;
                    i5 = i13;
                }
                pool = glyphRunPool;
                GlyphRun glyphRunObtain = pool.obtain();
                i6 = iPeek;
                glyphRunObtain.x = 0.0f;
                glyphRunObtain.y = f5;
                glyphRun = glyphRunObtain;
                i7 = i15;
                i8 = i14;
                f2 = f5;
                f3 = f4;
                bitmapFontData.getGlyphs(glyphRun, charSequence, i14, i5, glyphPeek);
                this.glyphCount += glyphRun.glyphs.size;
                int i19 = 2;
                if (i6 != i7) {
                    IntArray intArray = this.colors;
                    i10 = intArray.get(intArray.size - 2);
                    i11 = this.glyphCount;
                    if (i10 == i11) {
                        IntArray intArray2 = this.colors;
                        intArray2.set(intArray2.size - 1, i6);
                    } else {
                        this.colors.add(i11);
                        this.colors.add(i6);
                    }
                    i15 = i6;
                } else {
                    i15 = i7;
                }
                if (glyphRun.glyphs.size == 0) {
                    pool.free(glyphRun);
                    glyphRun2 = glyphRun3;
                    if (glyphRun2 == null) {
                        glyphRun3 = glyphRun2;
                    }
                    if (z2) {
                        if (i5 == i8) {
                            f2 = (f3 * bitmapFontData.blankLineScale) + f2;
                        } else {
                            f2 += f3;
                        }
                        glyphPeek = null;
                        glyphRun3 = null;
                    }
                    charSequence2 = charSequence;
                    i12 = i2;
                    intBits = i6;
                    i13 = i4;
                    i14 = i13;
                    z6 = z3;
                    f5 = f2;
                    f4 = f3;
                } else {
                    glyphRun2 = glyphRun3;
                    if (glyphRun2 == null) {
                        this.runs.add(glyphRun);
                    } else {
                        glyphRun2.appendRun(glyphRun);
                        pool.free(glyphRun);
                    }
                    if (z2 && !z3) {
                        glyphPeek = glyphRun.glyphs.peek();
                    } else {
                        setLastGlyphXAdvance(bitmapFontData, glyphRun);
                        glyphPeek = null;
                    }
                    if (z4 && glyphRun.glyphs.size != 0 && (z2 || z3)) {
                        float fFirst2 = glyphRun.xAdvances.get(1) + glyphRun.xAdvances.first();
                        while (true) {
                            if (i19 >= glyphRun.xAdvances.size) {
                                glyphRun3 = glyphRun;
                                break;
                            }
                            int i20 = i19 - 1;
                            if ((getGlyphWidth(glyphRun.glyphs.get(i20), bitmapFontData) + fFirst2) - 1.0E-4f <= fMax) {
                                fFirst = fFirst2 + glyphRun.xAdvances.items[i19];
                                i9 = 1;
                            } else {
                                if (str != null) {
                                    truncate(bitmapFontData, glyphRun, fMax, str);
                                    f5 = f2;
                                    break loop0;
                                }
                                int wrapIndex = bitmapFontData.getWrapIndex(glyphRun.glyphs, i19);
                                if ((wrapIndex != 0 || glyphRun.x != 0.0f) && wrapIndex < glyphRun.glyphs.size) {
                                    i20 = wrapIndex;
                                }
                                GlyphRun glyphRunWrap = wrap(bitmapFontData, glyphRun, i20);
                                if (glyphRunWrap == null) {
                                    glyphRun3 = glyphRunWrap;
                                    break;
                                }
                                this.runs.add(glyphRunWrap);
                                float f6 = f2 + f3;
                                glyphRunWrap.x = 0.0f;
                                glyphRunWrap.y = f6;
                                i9 = 1;
                                fFirst = glyphRunWrap.xAdvances.get(1) + glyphRunWrap.xAdvances.first();
                                f2 = f6;
                                glyphRun = glyphRunWrap;
                                i19 = 1;
                            }
                            i19 += i9;
                            fFirst2 = fFirst;
                        }
                    } else {
                        glyphRun3 = glyphRun;
                        break;
                    }
                    if (z2) {
                        if (i5 == i8) {
                            f2 = (f3 * bitmapFontData.blankLineScale) + f2;
                        } else {
                            f2 += f3;
                        }
                        glyphPeek = null;
                        glyphRun3 = null;
                    }
                    charSequence2 = charSequence;
                    i12 = i2;
                    intBits = i6;
                    i13 = i4;
                    i14 = i13;
                    z6 = z3;
                    f5 = f2;
                    f4 = f3;
                }
                glyphRun = glyphRun2;
                if (z2) {
                    setLastGlyphXAdvance(bitmapFontData, glyphRun);
                    glyphPeek = null;
                } else {
                    setLastGlyphXAdvance(bitmapFontData, glyphRun);
                    glyphPeek = null;
                }
                if (z4) {
                    glyphRun3 = glyphRun;
                    break;
                } else {
                    glyphRun3 = glyphRun;
                    break;
                }
                if (z2) {
                    if (i5 == i8) {
                        f2 = (f3 * bitmapFontData.blankLineScale) + f2;
                    } else {
                        f2 += f3;
                    }
                    glyphPeek = null;
                    glyphRun3 = null;
                }
                charSequence2 = charSequence;
                i12 = i2;
                intBits = i6;
                i13 = i4;
                i14 = i13;
                z6 = z3;
                f5 = f2;
                f4 = f3;
            } else {
                if (i14 == i12) {
                    break;
                }
                i4 = i13;
                iPeek = intBits;
                i5 = i12;
            }
            z3 = true;
            z2 = false;
            pool = glyphRunPool;
            GlyphRun glyphRunObtain2 = pool.obtain();
            i6 = iPeek;
            glyphRunObtain2.x = 0.0f;
            glyphRunObtain2.y = f5;
            glyphRun = glyphRunObtain2;
            i7 = i15;
            i8 = i14;
            f2 = f5;
            f3 = f4;
            bitmapFontData.getGlyphs(glyphRun, charSequence, i14, i5, glyphPeek);
            this.glyphCount += glyphRun.glyphs.size;
            int i110 = 2;
            if (i6 != i7) {
                IntArray intArray3 = this.colors;
                i10 = intArray3.get(intArray3.size - 2);
                i11 = this.glyphCount;
                if (i10 == i11) {
                    IntArray intArray4 = this.colors;
                    intArray4.set(intArray4.size - 1, i6);
                } else {
                    this.colors.add(i11);
                    this.colors.add(i6);
                }
                i15 = i6;
            } else {
                i15 = i7;
            }
            if (glyphRun.glyphs.size == 0) {
                pool.free(glyphRun);
                glyphRun2 = glyphRun3;
                if (glyphRun2 == null) {
                    glyphRun3 = glyphRun2;
                }
                if (z2) {
                    if (i5 == i8) {
                        f2 = (f3 * bitmapFontData.blankLineScale) + f2;
                    } else {
                        f2 += f3;
                    }
                    glyphPeek = null;
                    glyphRun3 = null;
                }
                charSequence2 = charSequence;
                i12 = i2;
                intBits = i6;
                i13 = i4;
                i14 = i13;
                z6 = z3;
                f5 = f2;
                f4 = f3;
            } else {
                glyphRun2 = glyphRun3;
                if (glyphRun2 == null) {
                    this.runs.add(glyphRun);
                } else {
                    glyphRun2.appendRun(glyphRun);
                    pool.free(glyphRun);
                }
                if (z2) {
                    setLastGlyphXAdvance(bitmapFontData, glyphRun);
                    glyphPeek = null;
                } else {
                    setLastGlyphXAdvance(bitmapFontData, glyphRun);
                    glyphPeek = null;
                }
                if (z4) {
                    glyphRun3 = glyphRun;
                    break;
                } else {
                    glyphRun3 = glyphRun;
                    break;
                }
                if (z2) {
                    if (i5 == i8) {
                        f2 = (f3 * bitmapFontData.blankLineScale) + f2;
                    } else {
                        f2 += f3;
                    }
                    glyphPeek = null;
                    glyphRun3 = null;
                }
                charSequence2 = charSequence;
                i12 = i2;
                intBits = i6;
                i13 = i4;
                i14 = i13;
                z6 = z3;
                f5 = f2;
                f4 = f3;
            }
            glyphRun = glyphRun2;
            if (z2) {
                setLastGlyphXAdvance(bitmapFontData, glyphRun);
                glyphPeek = null;
            } else {
                setLastGlyphXAdvance(bitmapFontData, glyphRun);
                glyphPeek = null;
            }
            if (z4) {
                glyphRun3 = glyphRun;
                break;
            } else {
                glyphRun3 = glyphRun;
                break;
            }
            if (z2) {
                if (i5 == i8) {
                    f2 = (f3 * bitmapFontData.blankLineScale) + f2;
                } else {
                    f2 += f3;
                }
                glyphPeek = null;
                glyphRun3 = null;
            }
            charSequence2 = charSequence;
            i12 = i2;
            intBits = i6;
            i13 = i4;
            i14 = i13;
            z6 = z3;
            f5 = f2;
            f4 = f3;
        }
        this.height = Math.abs(f5) + bitmapFontData.capHeight;
        calculateWidths(bitmapFontData);
        alignRuns(fMax, i3);
        if (z5) {
            colorStack.clear();
        }
    }

    public GlyphLayout(BitmapFont bitmapFont, CharSequence charSequence) {
        setText(bitmapFont, charSequence);
    }

    public GlyphLayout(BitmapFont bitmapFont, CharSequence charSequence, Color color, float f, int i, boolean z) {
        setText(bitmapFont, charSequence, color, f, i, z);
    }

    public GlyphLayout(BitmapFont bitmapFont, CharSequence charSequence, int i, int i2, Color color, float f, int i3, boolean z, String str) {
        setText(bitmapFont, charSequence, i, i2, color, f, i3, z, str);
    }
}
