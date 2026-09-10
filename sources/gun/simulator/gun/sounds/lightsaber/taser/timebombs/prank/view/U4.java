package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.FloatArray;

/* JADX INFO: loaded from: classes2.dex */
public final class U4 extends T4 {
    public final int d;
    public final AbstractC3806jh0 e;
    public final float[][] f;

    /* JADX WARN: Illegal instructions before constructor call */
    public U4(int i, int i2, int i3, AbstractC3806jh0 abstractC3806jh0) {
        StringBuilder sbQ = AbstractC5044xl.q("12|", i3, "|");
        sbQ.append(abstractC3806jh0.c);
        super(i, new String[]{sbQ.toString()}, i2);
        this.d = i3;
        this.e = abstractC3806jh0;
        this.f = new float[i][];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3405f5
    public final void a(C4991x70 c4991x70, float f, float f2, Array array, float f3, int i, int i2) {
        float fW;
        N70 n70 = (N70) c4991x70.c.get(this.d);
        if (n70.b.A) {
            AbstractC3413f9 abstractC3413f9 = n70.e;
            if (abstractC3413f9 instanceof AbstractC3806jh0) {
                AbstractC3806jh0 abstractC3806jh0 = (AbstractC3806jh0) abstractC3413f9;
                if (abstractC3806jh0.d != this.e) {
                    return;
                }
                FloatArray floatArray = n70.g;
                int i3 = floatArray.size == 0 ? 1 : i;
                float[][] fArr = this.f;
                int i4 = 0;
                int length = fArr[0].length;
                float[] fArr2 = this.b;
                if (f2 < fArr2[0]) {
                    int iD = DM.D(i3);
                    if (iD == 0) {
                        floatArray.clear();
                        return;
                    }
                    if (iD != 1) {
                        return;
                    }
                    if (f3 == 1.0f) {
                        floatArray.clear();
                        return;
                    }
                    float[] size = floatArray.setSize(length);
                    if (abstractC3806jh0.e != null) {
                        float f4 = 1.0f - f3;
                        while (i4 < length) {
                            size[i4] = size[i4] * f4;
                            i4++;
                        }
                        return;
                    }
                    float[] fArr3 = abstractC3806jh0.f;
                    while (i4 < length) {
                        float f5 = size[i4];
                        size[i4] = AbstractC5044xl.w(fArr3[i4], f5, f3, f5);
                        i4++;
                    }
                    return;
                }
                float[] size2 = floatArray.setSize(length);
                if (f2 >= fArr2[fArr2.length - 1]) {
                    float[] fArr4 = fArr[fArr2.length - 1];
                    if (f3 == 1.0f) {
                        if (i3 != 4) {
                            AbstractC2340Cl.i(0, length, fArr4, size2);
                            return;
                        }
                        if (abstractC3806jh0.e != null) {
                            while (i4 < length) {
                                size2[i4] = size2[i4] + fArr4[i4];
                                i4++;
                            }
                            return;
                        } else {
                            float[] fArr5 = abstractC3806jh0.f;
                            while (i4 < length) {
                                size2[i4] = (fArr4[i4] - fArr5[i4]) + size2[i4];
                                i4++;
                            }
                            return;
                        }
                    }
                    int iD2 = DM.D(i3);
                    if (iD2 == 0) {
                        if (abstractC3806jh0.e != null) {
                            while (i4 < length) {
                                size2[i4] = fArr4[i4] * f3;
                                i4++;
                            }
                            return;
                        } else {
                            float[] fArr6 = abstractC3806jh0.f;
                            while (i4 < length) {
                                float f6 = fArr6[i4];
                                size2[i4] = AbstractC5044xl.w(fArr4[i4], f6, f3, f6);
                                i4++;
                            }
                            return;
                        }
                    }
                    if (iD2 == 1 || iD2 == 2) {
                        while (i4 < length) {
                            float f7 = size2[i4];
                            size2[i4] = AbstractC5044xl.w(fArr4[i4], f7, f3, f7);
                            i4++;
                        }
                        return;
                    }
                    if (iD2 != 3) {
                        return;
                    }
                    if (abstractC3806jh0.e != null) {
                        while (i4 < length) {
                            size2[i4] = (fArr4[i4] * f3) + size2[i4];
                            i4++;
                        }
                        return;
                    } else {
                        float[] fArr7 = abstractC3806jh0.f;
                        while (i4 < length) {
                            size2[i4] = AbstractC5044xl.w(fArr4[i4], fArr7[i4], f3, size2[i4]);
                            i4++;
                        }
                        return;
                    }
                }
                int iE = AbstractC3405f5.e(fArr2, f2);
                float[] fArr8 = this.c;
                int i5 = (int) fArr8[iE];
                if (i5 == 0) {
                    float f8 = fArr2[iE];
                    fW = (f2 - f8) / (fArr2[iE + 1] - f8);
                } else if (i5 != 1) {
                    float f9 = fArr8[i5 - 2];
                    if (f9 <= f2) {
                        int i6 = i5 + 16;
                        int i7 = i5;
                        while (true) {
                            if (i7 >= i6) {
                                float f10 = fArr8[i5 + 14];
                                float f11 = fArr8[i5 + 15];
                                fW = (((f2 - f10) * (1.0f - f11)) / (fArr2[iE + 1] - f10)) + f11;
                                break;
                            } else {
                                float f12 = fArr8[i7];
                                if (f12 >= f2) {
                                    float f13 = fArr8[i7 - 2];
                                    float f14 = fArr8[i7 - 1];
                                    fW = AbstractC5044xl.w(fArr8[i7 + 1], f14, (f2 - f13) / (f12 - f13), f14);
                                    break;
                                }
                                i7 += 2;
                            }
                        }
                    } else {
                        float f15 = fArr2[iE];
                        fW = ((f2 - f15) * fArr8[i5 - 1]) / (f9 - f15);
                    }
                } else {
                    fW = 0.0f;
                }
                float[] fArr9 = fArr[iE];
                float[] fArr10 = fArr[iE + 1];
                if (f3 == 1.0f) {
                    if (i3 != 4) {
                        for (int i8 = 0; i8 < length; i8++) {
                            float f16 = fArr9[i8];
                            size2[i8] = AbstractC5044xl.w(fArr10[i8], f16, fW, f16);
                        }
                        return;
                    }
                    if (abstractC3806jh0.e != null) {
                        for (int i9 = 0; i9 < length; i9++) {
                            float f17 = fArr9[i9];
                            size2[i9] = ((fArr10[i9] - f17) * fW) + f17 + size2[i9];
                        }
                        return;
                    }
                    float[] fArr11 = abstractC3806jh0.f;
                    for (int i10 = 0; i10 < length; i10++) {
                        float f18 = fArr9[i10];
                        size2[i10] = (AbstractC5044xl.w(fArr10[i10], f18, fW, f18) - fArr11[i10]) + size2[i10];
                    }
                    return;
                }
                int iD3 = DM.D(i3);
                if (iD3 == 0) {
                    if (abstractC3806jh0.e != null) {
                        for (int i11 = 0; i11 < length; i11++) {
                            float f19 = fArr9[i11];
                            size2[i11] = (((fArr10[i11] - f19) * fW) + f19) * f3;
                        }
                        return;
                    }
                    float[] fArr12 = abstractC3806jh0.f;
                    for (int i12 = 0; i12 < length; i12++) {
                        float f20 = fArr9[i12];
                        float f21 = fArr12[i12];
                        size2[i12] = (((((fArr10[i12] - f20) * fW) + f20) - f21) * f3) + f21;
                    }
                    return;
                }
                if (iD3 == 1 || iD3 == 2) {
                    for (int i13 = 0; i13 < length; i13++) {
                        float f22 = fArr9[i13];
                        float f23 = size2[i13];
                        size2[i13] = (((((fArr10[i13] - f22) * fW) + f22) - f23) * f3) + f23;
                    }
                    return;
                }
                if (iD3 != 3) {
                    return;
                }
                if (abstractC3806jh0.e != null) {
                    for (int i14 = 0; i14 < length; i14++) {
                        float f24 = fArr9[i14];
                        size2[i14] = ((((fArr10[i14] - f24) * fW) + f24) * f3) + size2[i14];
                    }
                    return;
                }
                float[] fArr13 = abstractC3806jh0.f;
                for (int i15 = 0; i15 < length; i15++) {
                    float f25 = fArr9[i15];
                    size2[i15] = AbstractC5044xl.w(AbstractC5044xl.w(fArr10[i15], f25, fW, f25), fArr13[i15], f3, size2[i15]);
                }
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3405f5
    public final int b() {
        return this.b.length;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.T4
    public final void g(int i, int i2, int i3, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float[] fArr = this.c;
        int length = (i * 18) + this.b.length;
        if (i3 == 0) {
            fArr[i2] = length + 2;
        }
        float f9 = ((f - (f3 * 2.0f)) + f5) * 0.03f;
        float f10 = (0.03f * f6) - (0.06f * f4);
        float f11 = ((((f3 - f5) * 3.0f) - f) + f7) * 0.006f;
        float f12 = ((f4 - f6) + 0.33333334f) * 0.018f;
        float f13 = (f9 * 2.0f) + f11;
        float f14 = (2.0f * f10) + f12;
        float fW = (f11 * 0.16666667f) + AbstractC5044xl.w(f3, f, 0.3f, f9);
        float f15 = (0.16666667f * f12) + (f4 * 0.3f) + f10;
        float f16 = f + fW;
        int i4 = length + 18;
        float f17 = f15;
        while (length < i4) {
            fArr[length] = f16;
            fArr[length + 1] = f15;
            fW += f13;
            f17 += f14;
            f13 += f11;
            f14 += f12;
            f16 += fW;
            f15 += f17;
            length += 2;
        }
    }
}
