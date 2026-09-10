package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f42 implements o42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h42 f14212b;

    public f42(h42 h42Var, int i10) {
        this.f14212b = h42Var;
        this.f14211a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x005b  */
    @Override // com.google.android.gms.internal.ads.o42
    public final int a(long j10) {
        boolean z10;
        int iH;
        h42 h42Var = this.f14212b;
        int i10 = this.f14211a;
        if (h42Var.m()) {
            return 0;
        }
        h42Var.k(i10);
        n42 n42Var = h42Var.f15141s[i10];
        boolean z11 = h42Var.M;
        synchronized (n42Var) {
            int i11 = n42Var.f17661r;
            int iJ = n42Var.j(i11);
            int i12 = n42Var.f17661r;
            int i13 = n42Var.f17658o;
            z10 = true;
            if ((i12 != i13) && j10 >= n42Var.f17656m[iJ]) {
                if (j10 <= n42Var.f17665v || !z11) {
                    iH = n42Var.h(iJ, i13 - i11, j10, true);
                    if (iH == -1) {
                    }
                } else {
                    iH = i13 - i11;
                }
            }
            iH = 0;
        }
        synchronized (n42Var) {
            if (iH >= 0) {
                try {
                    if (n42Var.f17661r + iH > n42Var.f17658o) {
                        z10 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                z10 = false;
            }
            ps1.v(z10);
            n42Var.f17661r += iH;
        }
        if (iH != 0) {
            return iH;
        }
        h42Var.l(i10);
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d9 A[DONT_GENERATE] */
    @Override // com.google.android.gms.internal.ads.o42
    public final int b(f81 f81Var, tx1 tx1Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        g22 g22Var;
        int i12;
        boolean z12;
        int i13;
        h42 h42Var = this.f14212b;
        int i14 = this.f14211a;
        if (h42Var.m()) {
            return -3;
        }
        h42Var.k(i14);
        n42 n42Var = h42Var.f15141s[i14];
        boolean z13 = h42Var.M;
        n42Var.getClass();
        boolean z14 = (i10 & 2) != 0;
        b2.d0 d0Var = n42Var.f17646b;
        synchronized (n42Var) {
            try {
                int i15 = n42Var.f17659p;
                int i16 = n42Var.f17661r;
                int i17 = i15 + i16;
                int i18 = n42Var.f17666w;
                if (i18 == -1 || i17 < i18) {
                    z10 = true;
                    z11 = false;
                } else {
                    z10 = true;
                    z11 = true;
                }
                i11 = -4;
                if (i16 != n42Var.f17658o ? z10 : false) {
                    if (((i18 != -1 || (i13 = n42Var.f17667x) == -1 || i15 + i16 < i13) ? false : z10) || z11) {
                        if (!z13) {
                            g22Var = n42Var.B;
                            if (g22Var != null) {
                            }
                            i12 = -3;
                        }
                        tx1Var.f22444b = 4;
                        tx1Var.f20524f = Long.MIN_VALUE;
                        i12 = -4;
                    } else {
                        g22 g22Var2 = ((m42) n42Var.f17647c.d(i17)).f17245a;
                        if (!z14 && g22Var2 == n42Var.f17650f) {
                            int iJ = n42Var.j(n42Var.f17661r);
                            if (n42Var.f17651g != null) {
                                int i19 = n42Var.l[iJ];
                                z12 = false;
                            } else {
                                z12 = z10;
                            }
                            if (z12) {
                                int i20 = n42Var.l[iJ];
                                tx1Var.f22444b = i20;
                                if (n42Var.f17661r == n42Var.f17658o - 1 && (z13 || n42Var.f17668y)) {
                                    tx1Var.f22444b = 536870912 | i20;
                                }
                                tx1Var.f20524f = n42Var.f17656m[iJ];
                                d0Var.f5246c = n42Var.f17655k[iJ];
                                d0Var.f5245b = n42Var.f17654j[iJ];
                                d0Var.f5247d = n42Var.f17657n[iJ];
                                i12 = -4;
                            } else {
                                i12 = -3;
                            }
                        }
                        n42Var.a(g22Var2, f81Var);
                        i12 = -5;
                    }
                } else {
                    if (!z13 && !n42Var.f17668y && !z11) {
                        g22Var = n42Var.B;
                        if (g22Var != null || (!z14 && g22Var == n42Var.f17650f)) {
                            i12 = -3;
                        } else {
                            n42Var.a(g22Var, f81Var);
                            i12 = -5;
                        }
                    }
                    tx1Var.f22444b = 4;
                    tx1Var.f20524f = Long.MIN_VALUE;
                    i12 = -4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i12 != -4) {
            i11 = i12;
        } else if (!tx1Var.f(4)) {
            int i21 = i10 & 1;
            if ((i10 & 4) == 0) {
                if (i21 != 0) {
                    k42 k42Var = n42Var.f17645a;
                    k42.c((c7) k42Var.f16315e, tx1Var, d0Var, (np0) k42Var.f16313c);
                } else {
                    k42 k42Var2 = n42Var.f17645a;
                    k42Var2.f16315e = k42.c((c7) k42Var2.f16315e, tx1Var, d0Var, (np0) k42Var2.f16313c);
                    n42Var.f17661r++;
                }
            } else if (i21 == 0) {
                n42Var.f17661r++;
            }
        }
        if (i11 == -3) {
            h42Var.l(i14);
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.o42
    public final boolean zza() {
        h42 h42Var = this.f14212b;
        return !h42Var.m() && h42Var.f15141s[this.f14211a].m(h42Var.M);
    }

    @Override // com.google.android.gms.internal.ads.o42
    public final void zzb() throws IOException {
        IOException iOException;
        int i10 = this.f14211a;
        h42 h42Var = this.f14212b;
        z61 z61Var = h42Var.f15141s[i10].f17651g;
        if (z61Var != null) {
            throw ((a22) z61Var.f22523a);
        }
        int i11 = h42Var.C == 7 ? 6 : 3;
        vu0 vu0Var = h42Var.f15133j;
        IOException iOException2 = (IOException) vu0Var.f21276d;
        if (iOException2 != null) {
            throw iOException2;
        }
        c0 c0Var = (c0) vu0Var.f21275c;
        if (c0Var != null && (iOException = c0Var.f12951c) != null && c0Var.f12952d > i11) {
            throw iOException;
        }
    }
}
