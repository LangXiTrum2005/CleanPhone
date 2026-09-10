package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.FloatArray;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3806jh0 extends AbstractC3413f9 {
    public static int h;
    public final int c;
    public AbstractC3413f9 d;
    public int[] e;
    public float[] f;
    public int g;

    public AbstractC3806jh0(String str) {
        int i;
        super(str);
        synchronized (AbstractC3806jh0.class) {
            i = h;
            h = i + 1;
        }
        this.c = i;
        this.d = this;
    }

    public void i(N70 n70, int i, int i2, float[] fArr, int i3, int i4) {
        int i5 = ((i2 >> 1) * i4) + i3;
        FloatArray floatArray = n70.g;
        float[] fArr2 = this.f;
        int[] iArr = this.e;
        C3443fb c3443fb = n70.b;
        if (iArr == null) {
            if (floatArray.size > 0) {
                fArr2 = floatArray.items;
            }
            float f = c3443fb.u;
            float f2 = c3443fb.x;
            float f3 = c3443fb.s;
            float f4 = c3443fb.t;
            float f5 = c3443fb.v;
            float f6 = c3443fb.w;
            int i6 = i;
            int i7 = i3;
            while (i7 < i5) {
                float f7 = fArr2[i6];
                float f8 = fArr2[i6 + 1];
                fArr[i7] = AbstractC5044xl.d(f8, f4, f7 * f3, f);
                fArr[i7 + 1] = AbstractC5044xl.d(f8, f6, f7 * f5, f2);
                i6 += 2;
                i7 += i4;
            }
            return;
        }
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10 += 2) {
            int i11 = iArr[i8];
            i8 += i11 + 1;
            i9 += i11;
        }
        Object[] objArr = c3443fb.b.b.items;
        if (floatArray.size == 0) {
            int i12 = i9 * 3;
            int i13 = i3;
            while (i13 < i5) {
                int i14 = i8 + 1;
                int i15 = iArr[i8] + i14;
                float fB = 0.0f;
                float fB2 = 0.0f;
                while (i14 < i15) {
                    C3443fb c3443fb2 = (C3443fb) objArr[iArr[i14]];
                    float f9 = fArr2[i12];
                    float f10 = fArr2[i12 + 1];
                    float f11 = fArr2[i12 + 2];
                    fB = AbstractC3950lJ.B((c3443fb2.t * f10) + (c3443fb2.s * f9), c3443fb2.u, f11, fB);
                    fB2 = AbstractC3950lJ.B((f10 * c3443fb2.w) + (f9 * c3443fb2.v), c3443fb2.x, f11, fB2);
                    i14++;
                    i12 += 3;
                }
                fArr[i13] = fB;
                fArr[i13 + 1] = fB2;
                i13 += i4;
                i8 = i14;
            }
            return;
        }
        float[] fArr3 = floatArray.items;
        int i16 = i9 * 3;
        int i17 = i9 << 1;
        int i18 = i8;
        int i19 = i17;
        int i20 = i16;
        int i21 = i3;
        while (i21 < i5) {
            int i22 = i18 + 1;
            int i23 = iArr[i18] + i22;
            float fB3 = 0.0f;
            float fB4 = 0.0f;
            while (i22 < i23) {
                C3443fb c3443fb3 = (C3443fb) objArr[iArr[i22]];
                float f12 = fArr2[i20] + fArr3[i19];
                float f13 = fArr2[i20 + 1] + fArr3[i19 + 1];
                float f14 = fArr2[i20 + 2];
                float[] fArr4 = fArr3;
                fB3 = AbstractC3950lJ.B((c3443fb3.t * f13) + (c3443fb3.s * f12), c3443fb3.u, f14, fB3);
                fB4 = AbstractC3950lJ.B((f13 * c3443fb3.w) + (f12 * c3443fb3.v), c3443fb3.x, f14, fB4);
                i22++;
                i20 += 3;
                i19 += 2;
                fArr3 = fArr4;
                objArr = objArr;
            }
            fArr[i21] = fB3;
            fArr[i21 + 1] = fB4;
            i21 += i4;
            fArr3 = fArr3;
            i18 = i22;
        }
    }
}
