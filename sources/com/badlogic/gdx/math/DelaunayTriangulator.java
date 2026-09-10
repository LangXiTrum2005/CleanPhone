package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.BooleanArray;
import com.badlogic.gdx.utils.FloatArray;
import com.badlogic.gdx.utils.IntArray;
import com.badlogic.gdx.utils.ShortArray;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class DelaunayTriangulator {
    private static final int COMPLETE = 1;
    private static final float EPSILON = 1.0E-6f;
    private static final int INCOMPLETE = 2;
    private static final int INSIDE = 0;
    private float[] sortedPoints;
    private final IntArray quicksortStack = new IntArray();
    private final ShortArray triangles = new ShortArray(false, 16);
    private final ShortArray originalIndices = new ShortArray(false, 0);
    private final IntArray edges = new IntArray();
    private final BooleanArray complete = new BooleanArray(false, 16);
    private final float[] superTriangle = new float[6];
    private final Vector2 centroid = new Vector2();

    private int circumCircle(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9;
        float fW;
        float f10;
        float fAbs = Math.abs(f4 - f6);
        float fAbs2 = Math.abs(f6 - f8);
        if (fAbs >= 1.0E-6f) {
            float f11 = (-(f5 - f3)) / (f6 - f4);
            float f12 = (f3 + f5) / 2.0f;
            float f13 = (f4 + f6) / 2.0f;
            if (fAbs2 < 1.0E-6f) {
                f9 = (f7 + f5) / 2.0f;
                fW = AbstractC5044xl.w(f9, f12, f11, f13);
            } else {
                float f14 = (-(f7 - f5)) / (f8 - f6);
                f9 = ((((f11 * f12) - (((f7 + f5) / 2.0f) * f14)) + ((f8 + f6) / 2.0f)) - f13) / (f11 - f14);
                fW = AbstractC5044xl.w(f9, f12, f11, f13);
            }
            f10 = f9;
        } else {
            if (fAbs2 < 1.0E-6f) {
                return 2;
            }
            f10 = (f3 + f5) / 2.0f;
            fW = AbstractC5044xl.w(f10, (f7 + f5) / 2.0f, (-(f7 - f5)) / (f8 - f6), (f8 + f6) / 2.0f);
        }
        float f15 = f5 - f10;
        float f16 = f6 - fW;
        float f17 = (f16 * f16) + (f15 * f15);
        float f18 = f - f10;
        float f19 = f18 * f18;
        float f20 = f2 - fW;
        if (((f20 * f20) + f19) - f17 <= 1.0E-6f) {
            return 0;
        }
        return (f <= f10 || f19 <= f17) ? 2 : 1;
    }

    private int quicksortPartition(float[] fArr, int i, int i2, short[] sArr) {
        float f;
        float f2 = fArr[i];
        int i3 = i + 2;
        while (i3 < i2) {
            while (i3 < i2 && fArr[i3] <= f2) {
                i3 += 2;
            }
            while (true) {
                f = fArr[i2];
                if (f <= f2) {
                    break;
                }
                i2 -= 2;
            }
            if (i3 < i2) {
                float f3 = fArr[i3];
                fArr[i3] = f;
                fArr[i2] = f3;
                int i4 = i3 + 1;
                float f4 = fArr[i4];
                int i5 = i2 + 1;
                fArr[i4] = fArr[i5];
                fArr[i5] = f4;
                int i6 = i3 / 2;
                short s = sArr[i6];
                int i7 = i2 / 2;
                sArr[i6] = sArr[i7];
                sArr[i7] = s;
            }
        }
        float f5 = fArr[i2];
        if (f2 > f5) {
            fArr[i] = f5;
            fArr[i2] = f2;
            int i8 = i + 1;
            float f6 = fArr[i8];
            int i9 = i2 + 1;
            fArr[i8] = fArr[i9];
            fArr[i9] = f6;
            int i10 = i / 2;
            short s2 = sArr[i10];
            int i11 = i2 / 2;
            sArr[i10] = sArr[i11];
            sArr[i11] = s2;
        }
        return i2;
    }

    private void sort(float[] fArr, int i) {
        int i2 = i / 2;
        this.originalIndices.clear();
        this.originalIndices.ensureCapacity(i2);
        short[] sArr = this.originalIndices.items;
        for (short s = 0; s < i2; s = (short) (s + 1)) {
            sArr[s] = s;
        }
        IntArray intArray = this.quicksortStack;
        intArray.add(0);
        intArray.add(i - 2);
        while (intArray.size > 0) {
            int iPop = intArray.pop();
            int iPop2 = intArray.pop();
            if (iPop > iPop2) {
                int iQuicksortPartition = quicksortPartition(fArr, iPop2, iPop, sArr);
                int i3 = iQuicksortPartition - iPop2;
                int i4 = iPop - iQuicksortPartition;
                if (i3 > i4) {
                    intArray.add(iPop2);
                    intArray.add(iQuicksortPartition - 2);
                }
                intArray.add(iQuicksortPartition + 2);
                intArray.add(iPop);
                if (i4 >= i3) {
                    intArray.add(iPop2);
                    intArray.add(iQuicksortPartition - 2);
                }
            }
        }
    }

    public ShortArray computeTriangles(FloatArray floatArray, boolean z) {
        return computeTriangles(floatArray.items, 0, floatArray.size, z);
    }

    public void trim(ShortArray shortArray, float[] fArr, float[] fArr2, int i, int i2) {
        short[] sArr = shortArray.items;
        for (int i3 = shortArray.size - 1; i3 >= 0; i3 -= 3) {
            int i4 = i3 - 2;
            int i5 = sArr[i4] * 2;
            int i6 = i3 - 1;
            int i7 = sArr[i6] * 2;
            int i8 = sArr[i3] * 2;
            GeometryUtils.triangleCentroid(fArr[i5], fArr[i5 + 1], fArr[i7], fArr[i7 + 1], fArr[i8], fArr[i8 + 1], this.centroid);
            Vector2 vector2 = this.centroid;
            if (!Intersector.isPointInPolygon(fArr2, i, i2, vector2.x, vector2.y)) {
                shortArray.removeIndex(i3);
                shortArray.removeIndex(i6);
                shortArray.removeIndex(i4);
            }
        }
    }

    public ShortArray computeTriangles(float[] fArr, boolean z) {
        return computeTriangles(fArr, 0, fArr.length, z);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01ab  */
    public ShortArray computeTriangles(float[] fArr, int i, int i2, boolean z) {
        float[] fArr2;
        int i3;
        int i4;
        int i5;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float[] fArr3;
        int i6;
        int i7;
        boolean[] zArr;
        short[] sArr;
        int i8;
        IntArray intArray;
        float[] fArr4;
        ShortArray shortArray;
        BooleanArray booleanArray;
        if (i2 <= 32767) {
            ShortArray shortArray2 = this.triangles;
            shortArray2.clear();
            if (i2 < 6) {
                return shortArray2;
            }
            shortArray2.ensureCapacity(i2);
            if (z) {
                fArr2 = fArr;
                i3 = i;
            } else {
                float[] fArr5 = this.sortedPoints;
                if (fArr5 == null || fArr5.length < i2) {
                    this.sortedPoints = new float[i2];
                }
                System.arraycopy(fArr, i, this.sortedPoints, 0, i2);
                float[] fArr6 = this.sortedPoints;
                sort(fArr6, i2);
                fArr2 = fArr6;
                i3 = 0;
            }
            int i9 = i3 + i2;
            float f7 = fArr2[0];
            int i10 = 1;
            float f8 = fArr2[1];
            float f9 = f7;
            float f10 = f8;
            for (int i11 = i3 + 2; i11 < i9; i11 += 2) {
                float f11 = fArr2[i11];
                if (f11 < f9) {
                    f9 = f11;
                }
                if (f11 > f7) {
                    f7 = f11;
                }
                float f12 = fArr2[i11 + 1];
                if (f12 < f8) {
                    f8 = f12;
                }
                if (f12 > f10) {
                    f10 = f12;
                }
            }
            float f13 = f7 - f9;
            float f14 = f10 - f8;
            if (f13 <= f14) {
                f13 = f14;
            }
            float f15 = f13 * 20.0f;
            float f16 = (f7 + f9) / 2.0f;
            float f17 = (f10 + f8) / 2.0f;
            float[] fArr7 = this.superTriangle;
            fArr7[0] = f16 - f15;
            float f18 = f17 - f15;
            fArr7[1] = f18;
            fArr7[2] = f16;
            fArr7[3] = f17 + f15;
            fArr7[4] = f16 + f15;
            fArr7[5] = f18;
            IntArray intArray2 = this.edges;
            intArray2.ensureCapacity(i2 / 2);
            BooleanArray booleanArray2 = this.complete;
            booleanArray2.clear();
            booleanArray2.ensureCapacity(i2);
            shortArray2.add(i9);
            shortArray2.add(i9 + 2);
            shortArray2.add(i9 + 4);
            booleanArray2.add(false);
            int i12 = i3;
            while (i12 < i9) {
                float f19 = fArr2[i12];
                float f20 = fArr2[i12 + 1];
                short[] sArr2 = shortArray2.items;
                boolean[] zArr2 = booleanArray2.items;
                int i13 = shortArray2.size - i10;
                while (i13 >= 0) {
                    int i14 = i13 / 3;
                    if (zArr2[i14]) {
                        zArr = zArr2;
                        sArr = sArr2;
                        i8 = i12;
                        booleanArray = booleanArray2;
                        fArr4 = fArr7;
                        shortArray = shortArray2;
                        fArr3 = fArr2;
                        i5 = i3;
                        i6 = i9;
                        i7 = i13;
                        intArray = intArray2;
                    } else {
                        int i15 = i13 - 2;
                        short s = sArr2[i15];
                        short s2 = sArr2[i13 - 1];
                        i5 = i3;
                        short s3 = sArr2[i13];
                        if (s >= i9) {
                            int i16 = s - i9;
                            float f21 = fArr7[i16];
                            f2 = fArr7[i16 + 1];
                            f = f21;
                        } else {
                            f = fArr2[s];
                            f2 = fArr2[s + 1];
                        }
                        if (s2 >= i9) {
                            int i17 = s2 - i9;
                            float f22 = fArr7[i17];
                            f4 = fArr7[i17 + 1];
                            f3 = f22;
                        } else {
                            f3 = fArr2[s2];
                            f4 = fArr2[s2 + 1];
                        }
                        if (s3 >= i9) {
                            int i18 = s3 - i9;
                            float f23 = fArr7[i18];
                            f6 = fArr7[i18 + 1];
                            f5 = f23;
                        } else {
                            f5 = fArr2[s3];
                            f6 = fArr2[s3 + 1];
                        }
                        fArr3 = fArr2;
                        i6 = i9;
                        i7 = i13;
                        zArr = zArr2;
                        float f24 = f;
                        sArr = sArr2;
                        i8 = i12;
                        BooleanArray booleanArray3 = booleanArray2;
                        ShortArray shortArray3 = shortArray2;
                        intArray = intArray2;
                        float f25 = f5;
                        fArr4 = fArr7;
                        int iCircumCircle = circumCircle(f19, f20, f24, f2, f3, f4, f25, f6);
                        if (iCircumCircle != 0) {
                            if (iCircumCircle == 1) {
                                zArr[i14] = true;
                            }
                            shortArray = shortArray3;
                            booleanArray = booleanArray3;
                        } else {
                            intArray.add(s, s2, s2, s3);
                            intArray.add(s3, s);
                            shortArray = shortArray3;
                            shortArray.removeRange(i15, i7);
                            booleanArray = booleanArray3;
                            booleanArray.removeIndex(i14);
                        }
                    }
                    i13 = i7 - 3;
                    i3 = i5;
                    booleanArray2 = booleanArray;
                    intArray2 = intArray;
                    sArr2 = sArr;
                    fArr7 = fArr4;
                    fArr2 = fArr3;
                    i9 = i6;
                    zArr2 = zArr;
                    i12 = i8;
                    shortArray2 = shortArray;
                }
                int i19 = i12;
                BooleanArray booleanArray4 = booleanArray2;
                float[] fArr8 = fArr7;
                ShortArray shortArray4 = shortArray2;
                float[] fArr9 = fArr2;
                int i20 = i3;
                int i21 = i9;
                IntArray intArray3 = intArray2;
                int[] iArr = intArray3.items;
                int i22 = intArray3.size;
                int i23 = 0;
                while (i23 < i22) {
                    int i24 = iArr[i23];
                    if (i24 == -1) {
                        i4 = i19;
                    } else {
                        int i25 = i23 + 1;
                        int i26 = iArr[i25];
                        boolean z2 = false;
                        for (int i27 = i23 + 2; i27 < i22; i27 += 2) {
                            if (i24 == iArr[i27 + 1] && i26 == iArr[i27]) {
                                iArr[i27] = -1;
                                z2 = true;
                            }
                        }
                        if (z2) {
                            i4 = i19;
                        } else {
                            shortArray4.add(i24);
                            shortArray4.add(iArr[i25]);
                            i4 = i19;
                            shortArray4.add(i4);
                            booleanArray4.add(false);
                        }
                    }
                    i23 += 2;
                    i19 = i4;
                }
                intArray3.clear();
                i3 = i20;
                booleanArray2 = booleanArray4;
                i12 = i19 + 2;
                intArray2 = intArray3;
                fArr7 = fArr8;
                fArr2 = fArr9;
                i9 = i21;
                i10 = 1;
                shortArray2 = shortArray4;
            }
            ShortArray shortArray5 = shortArray2;
            int i28 = i3;
            int i29 = i9;
            short[] sArr3 = shortArray5.items;
            int i30 = shortArray5.size - 1;
            while (i30 >= 0) {
                int i31 = i29;
                if (sArr3[i30] >= i31 || sArr3[i30 - 1] >= i31 || sArr3[i30 - 2] >= i31) {
                    shortArray5.removeIndex(i30);
                    shortArray5.removeIndex(i30 - 1);
                    shortArray5.removeIndex(i30 - 2);
                }
                i30 -= 3;
                i29 = i31;
            }
            if (!z) {
                short[] sArr4 = this.originalIndices.items;
                int i32 = shortArray5.size;
                for (int i33 = 0; i33 < i32; i33++) {
                    sArr3[i33] = (short) (sArr4[sArr3[i33] / 2] * 2);
                }
            }
            if (i28 == 0) {
                int i34 = shortArray5.size;
                for (int i35 = 0; i35 < i34; i35++) {
                    sArr3[i35] = (short) (sArr3[i35] / 2);
                }
            } else {
                int i36 = shortArray5.size;
                for (int i37 = 0; i37 < i36; i37++) {
                    sArr3[i37] = (short) ((sArr3[i37] - i28) / 2);
                }
            }
            return shortArray5;
        }
        throw new IllegalArgumentException("count must be <= 32767");
    }
}
