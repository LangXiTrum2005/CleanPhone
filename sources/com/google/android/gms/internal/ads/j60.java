package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j60 implements x50, j1.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f15997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f15998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f15999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f16000h;

    public j60(t60 t60Var) {
        this.f16000h = t60Var;
        int i10 = t60Var.f20206h;
        this.f15996d = new short[i10];
        int i11 = i10 * t60Var.f20200b;
        this.f15997e = new short[i11];
        this.f15998f = new short[i11];
        this.f15999g = new short[i11];
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void A(int i10, int i11) {
        for (int i12 = 0; i12 < ((t60) this.f16000h).f20200b * i11; i12++) {
            ((short[]) this.f15997e)[i10 + i12] = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void B(int i10, ByteBuffer byteBuffer) {
        t60 t60Var = (t60) this.f16000h;
        byteBuffer.asShortBuffer().put((short[]) this.f15998f, 0, t60Var.f20200b * i10);
        byteBuffer.position(((i10 + i10) * t60Var.f20200b) + byteBuffer.position());
    }

    public short[] C(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = ((t60) this.f16000h).f20200b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public int D(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * ((t60) this.f16000h).f20200b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f15993a = i15 / i16;
        this.f15994b = i17 / i14;
        return i16;
    }

    public int E(short[] sArr, int i10, int i11, int i12) {
        int i13 = 1;
        int i14 = 255;
        int i15 = 0;
        int i16 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i17 = 0; i17 < i11; i17++) {
                int i18 = ((t60) this.f16000h).f20200b * i10;
                iAbs += Math.abs(sArr[i18 + i17] - sArr[(i18 + i11) + i17]);
            }
            int i19 = iAbs * i15;
            int i20 = i13 * i11;
            if (i19 < i20) {
                i13 = iAbs;
            }
            if (i19 < i20) {
                i15 = i11;
            }
            int i21 = iAbs * i14;
            int i22 = i16 * i11;
            if (i21 > i22) {
                i16 = iAbs;
            }
            if (i21 > i22) {
                i14 = i11;
            }
            i11++;
        }
        this.f15993a = i13 / i15;
        this.f15994b = i16 / i14;
        return i15;
    }

    public short[] F(short[] sArr, int i10, int i11) {
        t60 t60Var = (t60) this.f16000h;
        int length = sArr.length;
        int i12 = t60Var.f20200b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void a(int i10) {
        this.f15997e = F((short[]) this.f15997e, ((t60) this.f16000h).f20207i, i10);
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void b(int i10) {
        this.f15998f = F((short[]) this.f15998f, ((t60) this.f16000h).f20208j, i10);
    }

    @Override // j1.m
    public void c(int i10, ByteBuffer byteBuffer) {
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.f15997e;
        t60 t60Var = (t60) this.f16000h;
        shortBufferAsShortBuffer.get(sArr, t60Var.f20207i * t60Var.f20200b, i10 / 2);
        byteBuffer.position(byteBuffer.position() + i10);
    }

    @Override // j1.m
    public void d(int i10, ByteBuffer byteBuffer) {
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.f15998f;
        t60 t60Var = (t60) this.f16000h;
        shortBufferAsShortBuffer.put(sArr, 0, t60Var.f20200b * i10);
        byteBuffer.position((i10 * 2 * t60Var.f20200b) + byteBuffer.position());
    }

    @Override // j1.m
    public void e(int i10, int i11) {
        for (int i12 = 0; i12 < ((t60) this.f16000h).f20200b * i11; i12++) {
            ((short[]) this.f15997e)[i10 + i12] = 0;
        }
    }

    @Override // j1.m
    public void f(int i10, int i11) {
        short[] sArr = (short[]) this.f15997e;
        t60 t60Var = (t60) this.f16000h;
        int i12 = t60Var.f20206h / i11;
        int i13 = t60Var.f20200b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            ((short[]) this.f15996d)[i16] = (short) (i17 / i14);
        }
    }

    @Override // j1.m
    public void flush() {
        this.f15995c = 0;
        this.f15993a = 0;
        this.f15994b = 0;
    }

    @Override // j1.m
    public int g(int i10, int i11, int i12) {
        return D((short[]) this.f15997e, i10, i11, i12);
    }

    @Override // j1.m
    public void h(int i10) {
        this.f15998f = C((short[]) this.f15998f, ((t60) this.f16000h).f20208j, i10);
    }

    @Override // j1.m
    public boolean i() {
        int i10 = this.f15993a;
        return i10 != 0 && ((t60) this.f16000h).f20212o != 0 && this.f15994b <= i10 * 3 && i10 * 2 > this.f15995c * 3;
    }

    @Override // j1.m
    public void j(int i10, int i11, int i12, int i13, int i14) {
        short[] sArr = (short[]) this.f15998f;
        short[] sArr2 = (short[]) this.f15997e;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) d5.u.d(sArr2[i17], i19, (i10 - i19) * sArr2[i18], i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void k(int i10, int i11) {
        int i12;
        short[] sArr = (short[]) this.f15997e;
        int i13 = 0;
        while (true) {
            t60 t60Var = (t60) this.f16000h;
            if (i13 >= t60Var.f20206h / i11) {
                return;
            }
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int i16 = t60Var.f20200b;
                i12 = i16 * i11;
                if (i14 < i12) {
                    i15 += sArr[(i12 * i13) + (i16 * i10) + i14];
                    i14++;
                }
            }
            ((short[]) this.f15996d)[i13] = (short) (i15 / i12);
            i13++;
        }
    }

    @Override // j1.m
    public void l(int i10) {
        this.f15997e = C((short[]) this.f15997e, ((t60) this.f16000h).f20207i, i10);
    }

    @Override // com.google.android.gms.internal.ads.x50
    public int m(int i10, int i11) {
        return E((short[]) this.f15996d, 0, i10, i11);
    }

    @Override // j1.m
    public int n(int i10, int i11) {
        return D((short[]) this.f15996d, 0, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.x50
    public int o(int i10, int i11, int i12) {
        return E((short[]) this.f15997e, i10, i11, i12);
    }

    @Override // j1.m
    public void p(int i10, long j10, long j11) {
        int i11 = 0;
        while (true) {
            t60 t60Var = (t60) this.f16000h;
            int i12 = t60Var.f20200b;
            if (i11 >= i12) {
                return;
            }
            short[] sArr = (short[]) this.f15998f;
            int i13 = (t60Var.f20208j * i12) + i11;
            short[] sArr2 = (short[]) this.f15999g;
            int i14 = (i10 * i12) + i11;
            short s10 = sArr2[i14];
            short s11 = sArr2[i14 + i12];
            long j12 = ((long) t60Var.f20210m) * j10;
            int i15 = t60Var.l;
            long j13 = ((long) (i15 + 1)) * j11;
            long j14 = j13 - j12;
            long j15 = j13 - (((long) i15) * j11);
            sArr[i13] = (short) ((((j15 - j14) * ((long) s11)) + (((long) s10) * j14)) / j15);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void q(int i10, long j10, long j11) {
        int i11 = 0;
        while (true) {
            t60 t60Var = (t60) this.f16000h;
            int i12 = t60Var.f20200b;
            if (i11 >= i12) {
                return;
            }
            short[] sArr = (short[]) this.f15998f;
            int i13 = t60Var.f20208j;
            short[] sArr2 = (short[]) this.f15999g;
            int i14 = (i10 * i12) + i11;
            short s10 = sArr2[i14];
            short s11 = sArr2[i14 + i12];
            long j12 = ((long) t60Var.f20210m) * j10;
            int i15 = t60Var.l;
            long j13 = ((long) i15) * j11;
            long j14 = ((long) (i15 + 1)) * j11;
            int i16 = i11;
            long j15 = j14 - j13;
            long j16 = j14 - j12;
            sArr[(i13 * i12) + i16] = (short) ((((j15 - j16) * ((long) s11)) + (j16 * ((long) s10))) / j15);
            i11 = i16 + 1;
        }
    }

    @Override // j1.m
    public void r() {
        this.f15995c = this.f15993a;
    }

    @Override // j1.m
    public Object s() {
        return (short[]) this.f15997e;
    }

    @Override // j1.m
    public Object t() {
        return (short[]) this.f15998f;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void u(int i10) {
        this.f15999g = F((short[]) this.f15999g, ((t60) this.f16000h).f20209k, i10);
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void v(int i10, int i11, int i12, int i13, int i14) {
        short[] sArr = (short[]) this.f15998f;
        short[] sArr2 = (short[]) this.f15997e;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i13 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i12 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i18] = (short) d5.u.d(sArr2[i17], i19, (i10 - i19) * sArr2[i16], i10);
                i18 += i11;
                i16 += i11;
                i17 += i11;
            }
        }
    }

    @Override // j1.m
    public Object w() {
        return (short[]) this.f15999g;
    }

    @Override // j1.m
    public void x(int i10) {
        this.f15999g = C((short[]) this.f15999g, ((t60) this.f16000h).f20209k, i10);
    }

    @Override // j1.m
    public int y() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void z(int i10, ByteBuffer byteBuffer) {
        t60 t60Var = (t60) this.f16000h;
        byteBuffer.asShortBuffer().get((short[]) this.f15997e, t60Var.f20207i * t60Var.f20200b, i10 / 2);
        byteBuffer.position(byteBuffer.position() + i10);
    }

    @Override // com.google.android.gms.internal.ads.x50
    public int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public boolean zzc() {
        int i10 = this.f15993a;
        return i10 != 0 && ((t60) this.f16000h).f20212o != 0 && this.f15994b <= i10 * 3 && i10 + i10 > this.f15995c * 3;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void zzg() {
        this.f15995c = 0;
        this.f15993a = 0;
        this.f15994b = 0;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public void zzi() {
        this.f15995c = this.f15993a;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public /* synthetic */ Object zzp() {
        return (short[]) this.f15999g;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public /* synthetic */ Object zzq() {
        return (short[]) this.f15998f;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public /* synthetic */ Object zzr() {
        return (short[]) this.f15997e;
    }

    public j60(rc.d dVar) {
        this.f15996d = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new d5.a(false));
        this.f15997e = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new d5.a(true));
        String str = d5.x.f38710a;
        this.f15998f = new d5.w();
        this.f15999g = new fd.b(10);
        this.f16000h = new am.e(3);
        this.f15993a = 4;
        this.f15994b = Integer.MAX_VALUE;
        this.f15995c = 20;
    }

    public j60(t60 t60Var, boolean z10) {
        this.f16000h = t60Var;
        int i10 = t60Var.f20206h;
        this.f15996d = new short[i10];
        int i11 = i10 * t60Var.f20200b;
        this.f15997e = new short[i11];
        this.f15998f = new short[i11];
        this.f15999g = new short[i11];
    }
}
