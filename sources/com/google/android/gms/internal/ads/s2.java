package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19776i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f19777j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f19778k;
    public final Object l;

    public s2(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, md0 md0Var, s8 s8Var) {
        this.f19768a = i10;
        this.f19769b = i11;
        this.f19770c = i12;
        this.f19771d = i13;
        this.f19772e = i14;
        this.f19773f = g(i14);
        this.f19774g = i15;
        this.f19775h = i16;
        this.f19776i = h(i16);
        this.f19777j = j10;
        this.f19778k = md0Var;
        this.l = s8Var;
    }

    public static int a(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return i10 != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static int g(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static int h(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return i10 != 32 ? -1 : 7;
        }
        return 6;
    }

    public long b() {
        long j10 = this.f19777j;
        return j10 == 0 ? C.TIME_UNSET : (j10 * 1000000) / ((long) this.f19772e);
    }

    public i1.p c(byte[] bArr, i1.c0 c0Var) {
        bArr[4] = -128;
        int i10 = this.f19771d;
        if (i10 <= 0) {
            i10 = -1;
        }
        i1.c0 c0Var2 = (i1.c0) this.l;
        if (c0Var2 != null) {
            c0Var = c0Var2.b(c0Var);
        }
        i1.o oVar = new i1.o();
        oVar.f42600m = i1.d0.n(MimeTypes.AUDIO_FLAC);
        oVar.f42601n = i10;
        oVar.E = this.f19774g;
        oVar.F = this.f19772e;
        String str = l1.y.f44830a;
        oVar.G = l1.y.C(this.f19775h, ByteOrder.LITTLE_ENDIAN);
        oVar.f42603p = Collections.singletonList(bArr);
        oVar.f42599k = c0Var;
        return new i1.p(oVar);
    }

    public long e() {
        long j10 = this.f19777j;
        return j10 == 0 ? C.TIME_UNSET : (j10 * 1000000) / ((long) this.f19772e);
    }

    public g22 f(byte[] bArr, s8 s8Var) {
        bArr[4] = -128;
        s8 s8Var2 = (s8) this.l;
        if (s8Var2 != null) {
            s8Var = s8Var2.b(s8Var);
        }
        i12 i12Var = new i12();
        i12Var.e(MimeTypes.AUDIO_FLAC);
        int i10 = this.f19771d;
        if (i10 <= 0) {
            i10 = -1;
        }
        i12Var.f15512o = i10;
        i12Var.F = this.f19774g;
        i12Var.H = this.f19772e;
        i12Var.I = uu0.b(this.f19775h, ByteOrder.LITTLE_ENDIAN);
        i12Var.f15514q = Collections.singletonList(bArr);
        i12Var.f15509k = s8Var;
        return new g22(i12Var);
    }

    public s2(byte[] bArr, int i10, int i11) {
        switch (i11) {
            case 1:
                xd1 xd1Var = new xd1(bArr, bArr.length);
                xd1Var.q(i10 * 8);
                this.f19768a = xd1Var.i(16);
                this.f19769b = xd1Var.i(16);
                this.f19770c = xd1Var.i(24);
                this.f19771d = xd1Var.i(24);
                int i12 = xd1Var.i(20);
                this.f19772e = i12;
                this.f19773f = d(i12);
                this.f19774g = xd1Var.i(3) + 1;
                int i13 = xd1Var.i(5) + 1;
                this.f19775h = i13;
                this.f19776i = a(i13);
                this.f19777j = xd1Var.k(36);
                this.f19778k = null;
                this.l = null;
                break;
            default:
                gp0 gp0Var = new gp0(bArr, bArr.length);
                gp0Var.d(i10 * 8);
                this.f19768a = gp0Var.h(16);
                this.f19769b = gp0Var.h(16);
                this.f19770c = gp0Var.h(24);
                this.f19771d = gp0Var.h(24);
                int iH = gp0Var.h(20);
                this.f19772e = iH;
                this.f19773f = g(iH);
                this.f19774g = gp0Var.h(3) + 1;
                int iH2 = gp0Var.h(5) + 1;
                this.f19775h = iH2;
                this.f19776i = h(iH2);
                this.f19777j = gp0Var.i(36);
                this.f19778k = null;
                this.l = null;
                break;
        }
    }

    public s2(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, m5.k kVar, i1.c0 c0Var) {
        this.f19768a = i10;
        this.f19769b = i11;
        this.f19770c = i12;
        this.f19771d = i13;
        this.f19772e = i14;
        this.f19773f = d(i14);
        this.f19774g = i15;
        this.f19775h = i16;
        this.f19776i = a(i16);
        this.f19777j = j10;
        this.f19778k = kVar;
        this.l = c0Var;
    }
}
