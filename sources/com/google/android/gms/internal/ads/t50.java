package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t50 implements x50, j1.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f20182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f20183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f20184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f20185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f20186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f20187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f20188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f20189h;

    public t50(t60 t60Var) {
        this.f20189h = t60Var;
        int i10 = t60Var.f20206h;
        this.f20182a = new float[i10];
        int i11 = i10 * t60Var.f20200b;
        this.f20183b = new float[i11];
        this.f20184c = new float[i11];
        this.f20185d = new float[i11];
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void A(int i10, int i11) {
        for (int i12 = 0; i12 < ((t60) this.f20189h).f20200b * i11; i12++) {
            this.f20183b[i10 + i12] = 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void B(int i10, ByteBuffer byteBuffer) {
        t60 t60Var = (t60) this.f20189h;
        byteBuffer.asFloatBuffer().put(this.f20184c, 0, t60Var.f20200b * i10);
        byteBuffer.position((i10 * 4 * t60Var.f20200b) + byteBuffer.position());
    }

    public float[] C(float[] fArr, int i10, int i11) {
        int length = fArr.length;
        int i12 = ((t60) this.f20189h).f20200b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? fArr : Arrays.copyOf(fArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public int D(float[] fArr, int i10, int i11, int i12) {
        int i13 = ((t60) this.f20189h).f20200b * i10;
        double d10 = 1.0d;
        int i14 = 0;
        double d11 = 0.0d;
        int i15 = 255;
        int i16 = i11;
        while (i16 <= i12) {
            double dAbs = 0.0d;
            for (int i17 = 0; i17 < i16; i17++) {
                dAbs += (double) Math.abs(fArr[i13 + i17] - fArr[(i13 + i16) + i17]);
            }
            int i18 = i13;
            double d12 = i16;
            if (((double) i14) * dAbs < d10 * d12) {
                i14 = i16;
                d10 = dAbs;
            }
            if (((double) i15) * dAbs > d12 * d11) {
                i15 = i16;
                d11 = dAbs;
            }
            i16++;
            i13 = i18;
        }
        this.f20186e = d10 / ((double) i14);
        this.f20187f = d11 / ((double) i15);
        return i14;
    }

    public int E(float[] fArr, int i10, int i11, int i12) {
        int i13 = 255;
        int i14 = 0;
        double d10 = 0.0d;
        double d11 = 1.0d;
        int i15 = i11;
        while (true) {
            double d12 = i13;
            double d13 = i14;
            if (i15 > i12) {
                this.f20186e = d11 / d13;
                this.f20187f = d10 / d12;
                return i14;
            }
            int i16 = 0;
            double dAbs = 0.0d;
            while (i16 < i15) {
                int i17 = ((t60) this.f20189h).f20200b * i10;
                dAbs += (double) Math.abs(fArr[i17 + i16] - fArr[(i17 + i15) + i16]);
                i16++;
                i13 = i13;
            }
            int i18 = i13;
            double d14 = d13 * dAbs;
            double d15 = i15;
            double d16 = d11 * d15;
            if (d14 < d16) {
                d11 = dAbs;
            }
            if (d14 < d16) {
                i14 = i15;
            }
            double d17 = d12 * dAbs;
            double d18 = d15 * d10;
            if (d17 > d18) {
                d10 = dAbs;
            }
            i13 = d17 > d18 ? i15 : i18;
            i15++;
        }
    }

    public float[] F(float[] fArr, int i10, int i11) {
        t60 t60Var = (t60) this.f20189h;
        int length = fArr.length;
        int i12 = t60Var.f20200b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? fArr : Arrays.copyOf(fArr, (((i13 * 3) / 2) + i11) * i12);
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void a(int i10) {
        this.f20183b = F(this.f20183b, ((t60) this.f20189h).f20207i, i10);
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void b(int i10) {
        this.f20184c = F(this.f20184c, ((t60) this.f20189h).f20208j, i10);
    }

    @Override // j1.m
    public void c(int i10, ByteBuffer byteBuffer) {
        FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f20183b;
        t60 t60Var = (t60) this.f20189h;
        floatBufferAsFloatBuffer.get(fArr, t60Var.f20207i * t60Var.f20200b, i10 / 4);
        byteBuffer.position(byteBuffer.position() + i10);
    }

    @Override // j1.m
    public void d(int i10, ByteBuffer byteBuffer) {
        FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f20184c;
        t60 t60Var = (t60) this.f20189h;
        floatBufferAsFloatBuffer.put(fArr, 0, t60Var.f20200b * i10);
        byteBuffer.position((i10 * 4 * t60Var.f20200b) + byteBuffer.position());
    }

    @Override // j1.m
    public void e(int i10, int i11) {
        for (int i12 = 0; i12 < ((t60) this.f20189h).f20200b * i11; i12++) {
            this.f20183b[i10 + i12] = 0.0f;
        }
    }

    @Override // j1.m
    public void f(int i10, int i11) {
        t60 t60Var = (t60) this.f20189h;
        int i12 = t60Var.f20206h / i11;
        int i13 = t60Var.f20200b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            double d10 = 0.0d;
            for (int i17 = 0; i17 < i14; i17++) {
                d10 += (double) this.f20183b[(i16 * i14) + i15 + i17];
            }
            this.f20182a[i16] = (float) (d10 / ((double) i14));
        }
    }

    @Override // j1.m
    public void flush() {
        this.f20188g = 0.0d;
        this.f20186e = 0.0d;
        this.f20187f = 0.0d;
    }

    @Override // j1.m
    public int g(int i10, int i11, int i12) {
        return D(this.f20183b, i10, i11, i12);
    }

    @Override // j1.m
    public void h(int i10) {
        this.f20184c = C(this.f20184c, ((t60) this.f20189h).f20208j, i10);
    }

    @Override // j1.m
    public boolean i() {
        double d10 = this.f20186e;
        return d10 != 0.0d && ((t60) this.f20189h).f20212o != 0 && this.f20187f <= d10 * 3.0d && d10 * 2.0d > this.f20188g * 3.0d;
    }

    @Override // j1.m
    public void j(int i10, int i11, int i12, int i13, int i14) {
        float[] fArr = this.f20184c;
        float[] fArr2 = this.f20183b;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                fArr[i16] = ((fArr2[i17] * i19) + (fArr2[i18] * (i10 - i19))) / i10;
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void k(int i10, int i11) {
        int i12;
        int i13 = 0;
        while (true) {
            t60 t60Var = (t60) this.f20189h;
            if (i13 >= t60Var.f20206h / i11) {
                return;
            }
            double d10 = 0.0d;
            int i14 = 0;
            while (true) {
                int i15 = t60Var.f20200b;
                i12 = i15 * i11;
                if (i14 < i12) {
                    d10 += (double) this.f20183b[(i12 * i13) + (i15 * i10) + i14];
                    i14++;
                }
            }
            this.f20182a[i13] = (float) (d10 / ((double) i12));
            i13++;
        }
    }

    @Override // j1.m
    public void l(int i10) {
        this.f20183b = C(this.f20183b, ((t60) this.f20189h).f20207i, i10);
    }

    @Override // com.google.android.gms.internal.ads.x50
    public int m(int i10, int i11) {
        return E(this.f20182a, 0, i10, i11);
    }

    @Override // j1.m
    public int n(int i10, int i11) {
        return D(this.f20182a, 0, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.x50
    public int o(int i10, int i11, int i12) {
        return E(this.f20183b, i10, i11, i12);
    }

    @Override // j1.m
    public void p(int i10, long j10, long j11) {
        int i11 = 0;
        while (true) {
            t60 t60Var = (t60) this.f20189h;
            int i12 = t60Var.f20200b;
            if (i11 >= i12) {
                return;
            }
            float[] fArr = this.f20184c;
            int i13 = (t60Var.f20208j * i12) + i11;
            float[] fArr2 = this.f20185d;
            int i14 = (i10 * i12) + i11;
            float f10 = fArr2[i14];
            float f11 = fArr2[i14 + i12];
            long j12 = ((long) t60Var.f20210m) * j10;
            int i15 = t60Var.l;
            long j13 = ((long) (i15 + 1)) * j11;
            long j14 = j13 - j12;
            long j15 = j13 - (((long) i15) * j11);
            fArr[i13] = (((j15 - j14) * f11) + (j14 * f10)) / j15;
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void q(int i10, long j10, long j11) {
        int i11 = 0;
        while (true) {
            t60 t60Var = (t60) this.f20189h;
            int i12 = t60Var.f20200b;
            if (i11 >= i12) {
                return;
            }
            float[] fArr = this.f20184c;
            int i13 = t60Var.f20208j;
            float[] fArr2 = this.f20185d;
            int i14 = (i10 * i12) + i11;
            float f10 = fArr2[i14];
            float f11 = fArr2[i14 + i12];
            long j12 = ((long) t60Var.f20210m) * j10;
            int i15 = t60Var.l;
            long j13 = ((long) (i15 + 1)) * j11;
            long j14 = j13 - j12;
            long j15 = j13 - (((long) i15) * j11);
            fArr[(i13 * i12) + i11] = ((j14 * f10) + ((j15 - j14) * f11)) / j15;
            i11++;
        }
    }

    @Override // j1.m
    public void r() {
        this.f20188g = this.f20186e;
    }

    @Override // j1.m
    public Object s() {
        return this.f20183b;
    }

    @Override // j1.m
    public Object t() {
        return this.f20184c;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void u(int i10) {
        this.f20185d = F(this.f20185d, ((t60) this.f20189h).f20209k, i10);
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void v(int i10, int i11, int i12, int i13, int i14) {
        float[] fArr = this.f20184c;
        float[] fArr2 = this.f20183b;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i13 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i12 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                fArr[i18] = ((fArr2[i17] * i19) + (fArr2[i16] * (i10 - i19))) / i10;
                i18 += i11;
                i16 += i11;
                i17 += i11;
            }
        }
    }

    @Override // j1.m
    public Object w() {
        return this.f20185d;
    }

    @Override // j1.m
    public void x(int i10) {
        this.f20185d = C(this.f20185d, ((t60) this.f20189h).f20209k, i10);
    }

    @Override // j1.m
    public int y() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void z(int i10, ByteBuffer byteBuffer) {
        t60 t60Var = (t60) this.f20189h;
        byteBuffer.asFloatBuffer().get(this.f20183b, t60Var.f20207i * t60Var.f20200b, i10 / 4);
        byteBuffer.position(byteBuffer.position() + i10);
    }

    @Override // com.google.android.gms.internal.ads.x50
    public int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public boolean zzc() {
        double d10 = this.f20186e;
        return d10 != 0.0d && ((t60) this.f20189h).f20212o != 0 && this.f20187f <= d10 * 3.0d && d10 + d10 > this.f20188g * 3.0d;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void zzg() {
        this.f20188g = 0.0d;
        this.f20186e = 0.0d;
        this.f20187f = 0.0d;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void zzi() {
        this.f20188g = this.f20186e;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public /* synthetic */ Object zzp() {
        return this.f20185d;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public /* synthetic */ Object zzq() {
        return this.f20184c;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public /* synthetic */ Object zzr() {
        return this.f20183b;
    }

    public t50(t60 t60Var, boolean z10) {
        this.f20189h = t60Var;
        int i10 = t60Var.f20206h;
        this.f20182a = new float[i10];
        int i11 = i10 * t60Var.f20200b;
        this.f20183b = new float[i11];
        this.f20184c = new float[i11];
        this.f20185d = new float[i11];
    }
}
