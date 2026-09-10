package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public abstract class T4 extends AbstractC3405f5 {
    public float[] c;

    public T4(int i, String[] strArr, int i2) {
        super(i, strArr);
        float[] fArr = new float[(i2 * 18) + i];
        this.c = fArr;
        fArr[i - 1] = 1.0f;
    }

    public final float f(int i, float f, int i2, int i3) {
        float[] fArr = this.c;
        float f2 = fArr[i3];
        float[] fArr2 = this.b;
        if (f2 > f) {
            float f3 = fArr2[i];
            float f4 = fArr2[i + i2];
            return AbstractC5044xl.w(fArr[i3 + 1], f4, (f - f3) / (f2 - f3), f4);
        }
        int i4 = i3 + 18;
        for (int i5 = i3 + 2; i5 < i4; i5 += 2) {
            float f5 = fArr[i5];
            if (f5 >= f) {
                float f6 = fArr[i5 - 2];
                float f7 = fArr[i5 - 1];
                return AbstractC5044xl.w(fArr[i5 + 1], f7, (f - f6) / (f5 - f6), f7);
            }
        }
        int iC = c() + i;
        float f8 = fArr[i3 + 16];
        float f9 = fArr[i3 + 17];
        return AbstractC5044xl.w(fArr2[iC + i2], f9, (f - f8) / (fArr2[iC] - f8), f9);
    }

    public void g(int i, int i2, int i3, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float[] fArr = this.c;
        int iB = (i * 18) + b();
        if (i3 == 0) {
            fArr[i2] = iB + 2;
        }
        float f9 = ((f - (f3 * 2.0f)) + f5) * 0.03f;
        float f10 = ((f2 - (f4 * 2.0f)) + f6) * 0.03f;
        float f11 = ((((f3 - f5) * 3.0f) - f) + f7) * 0.006f;
        float f12 = ((((f4 - f6) * 3.0f) - f2) + f8) * 0.006f;
        float f13 = (f9 * 2.0f) + f11;
        float f14 = (2.0f * f10) + f12;
        float fW = (f11 * 0.16666667f) + AbstractC5044xl.w(f3, f, 0.3f, f9);
        float fW2 = (0.16666667f * f12) + AbstractC5044xl.w(f4, f2, 0.3f, f10);
        float f15 = f + fW;
        float f16 = f2 + fW2;
        int i4 = iB + 18;
        while (iB < i4) {
            fArr[iB] = f15;
            fArr[iB + 1] = f16;
            fW += f13;
            fW2 += f14;
            f13 += f11;
            f14 += f12;
            f15 += fW;
            f16 += fW2;
            iB += 2;
        }
    }

    public final void h(int i) {
        this.c[i] = 1.0f;
    }

    public final void i(int i) {
        int iB = (i * 18) + b();
        float[] fArr = this.c;
        if (fArr.length > iB) {
            float[] fArr2 = new float[iB];
            AbstractC2340Cl.i(0, iB, fArr, fArr2);
            this.c = fArr2;
        }
    }
}
