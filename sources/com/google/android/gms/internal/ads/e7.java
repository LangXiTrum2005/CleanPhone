package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e7 implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o2 f13862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k7 f13863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13864c;

    static {
        int i10 = rb0.f19511o;
    }

    public final boolean a(n2 n2Var) {
        h7 h7Var = new h7(0);
        if (h7Var.d(n2Var, true) && (h7Var.f15187a & 2) == 2) {
            int iMin = Math.min(h7Var.f15191e, 8);
            np0 np0Var = new np0(iMin);
            n2Var.v(np0Var.f17880a, 0, iMin);
            np0Var.E(0);
            if (np0Var.B() >= 5 && np0Var.K() == 127 && np0Var.P() == 1179402563) {
                this.f13863b = new d7(0);
                return true;
            }
            np0Var.E(0);
            try {
                if (zw1.m(1, np0Var, true)) {
                    this.f13863b = new l7(0);
                    return true;
                }
            } catch (ab unused) {
            }
            np0Var.E(0);
            if (j7.i(np0Var, j7.f16004o)) {
                this.f13863b = new j7(0);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean d(n2 n2Var) {
        try {
            return a(n2Var);
        } catch (ab unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void e(long j10, long j11) {
        k7 k7Var = this.f13863b;
        if (k7Var != null) {
            g7 g7Var = (g7) k7Var.f16355i;
            h7 h7Var = (h7) g7Var.f14780d;
            h7Var.f15187a = 0;
            h7Var.f15188b = 0L;
            h7Var.f15189c = 0;
            h7Var.f15190d = 0;
            h7Var.f15191e = 0;
            ((np0) g7Var.f14781e).y(0);
            g7Var.f14777a = -1;
            g7Var.f14779c = false;
            if (j10 == 0) {
                k7Var.e(!k7Var.f16353g);
                return;
            }
            if (k7Var.f16350d != 0) {
                long j12 = (((long) k7Var.f16351e) * j11) / 1000000;
                k7Var.f16347a = j12;
                i7 i7Var = (i7) k7Var.l;
                String str = uu0.f20901a;
                i7Var.f(j12);
                k7Var.f16350d = 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0188 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x0189  */
    @Override // com.google.android.gms.internal.ads.m2
    public final int f(n2 n2Var, q2 q2Var) throws ab {
        byte[] bArr;
        this.f13862a.getClass();
        if (this.f13863b == null) {
            if (!a(n2Var)) {
                throw ab.a(null, "Failed to determine bitstream type");
            }
            n2Var.zzl();
        }
        if (!this.f13864c) {
            h3 h3VarE = this.f13862a.e(0, 1);
            this.f13862a.zzv();
            k7 k7Var = this.f13863b;
            k7Var.f16357k = this.f13862a;
            k7Var.f16356j = h3VarE;
            k7Var.e(true);
            this.f13864c = true;
        }
        k7 k7Var2 = this.f13863b;
        g7 g7Var = (g7) k7Var2.f16355i;
        ((h3) k7Var2.f16356j).getClass();
        String str = uu0.f20901a;
        int i10 = k7Var2.f16350d;
        if (i10 != 0) {
            if (i10 == 1) {
                n2Var.zzf((int) k7Var2.f16348b);
                k7Var2.f16350d = 2;
                return 0;
            }
            if (i10 != 2) {
                return -1;
            }
            long jD = ((i7) k7Var2.l).d(n2Var);
            if (jD >= 0) {
                q2Var.f18888a = jD;
                return 1;
            }
            if (jD < -1) {
                k7Var2.h(-(jD + 2));
            }
            if (!k7Var2.f16353g) {
                a3 a3VarZzc = ((i7) k7Var2.l).zzc();
                a3VarZzc.getClass();
                ((o2) k7Var2.f16357k).o(a3VarZzc);
                h3 h3Var = (h3) k7Var2.f16356j;
                a3VarZzc.zza();
                h3Var.getClass();
                k7Var2.f16353g = true;
            }
            if (k7Var2.f16352f <= 0 && !g7Var.c(n2Var)) {
                k7Var2.f16350d = 3;
                return -1;
            }
            k7Var2.f16352f = 0L;
            np0 np0Var = (np0) g7Var.f14781e;
            long jF = k7Var2.f(np0Var);
            if (jF >= 0) {
                long j10 = k7Var2.f16349c;
                if (j10 + jF >= k7Var2.f16347a) {
                    long j11 = (j10 * 1000000) / ((long) k7Var2.f16351e);
                    ((h3) k7Var2.f16356j).b(np0Var.f17882c, np0Var);
                    ((h3) k7Var2.f16356j).c(j11, 1, np0Var.f17882c, 0, null);
                    k7Var2.f16347a = -1L;
                }
            }
            k7Var2.f16349c += jF;
            return 0;
        }
        while (true) {
            boolean zC = g7Var.c(n2Var);
            np0 np0Var2 = (np0) g7Var.f14781e;
            if (!zC) {
                k7Var2.f16350d = 3;
                return -1;
            }
            long jZzn = n2Var.zzn();
            long j12 = k7Var2.f16348b;
            k7Var2.f16352f = jZzn - j12;
            if (!k7Var2.g(np0Var2, j12, (md0) k7Var2.f16358m)) {
                g22 g22Var = (g22) ((md0) k7Var2.f16358m).f17399b;
                k7Var2.f16351e = g22Var.I;
                if (!k7Var2.f16354h) {
                    ((h3) k7Var2.f16356j).f(g22Var);
                    k7Var2.f16354h = true;
                }
                c7 c7Var = (c7) ((md0) k7Var2.f16358m).f17400c;
                if (c7Var == null) {
                    if (n2Var.zzo() == -1) {
                        k7Var2.l = new s6(17);
                    } else {
                        h7 h7Var = (h7) g7Var.f14780d;
                        k7Var2.l = new b7(k7Var2, k7Var2.f16348b, n2Var.zzo(), h7Var.f15190d + h7Var.f15191e, h7Var.f15188b, (h7Var.f15187a & 4) != 0);
                    }
                    k7Var2.f16350d = 2;
                    bArr = np0Var2.f17880a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    np0Var2.z(np0Var2.f17882c, Arrays.copyOf(bArr, Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, np0Var2.f17882c)));
                    return 0;
                }
                k7Var2.l = c7Var;
                k7Var2.f16350d = 2;
                bArr = np0Var2.f17880a;
                if (bArr.length == 65025) {
                    return 0;
                }
                np0Var2.z(np0Var2.f17882c, Arrays.copyOf(bArr, Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, np0Var2.f17882c)));
                return 0;
            }
            k7Var2.f16348b = n2Var.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void g(o2 o2Var) {
        this.f13862a = o2Var;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void zzf() {
    }
}
