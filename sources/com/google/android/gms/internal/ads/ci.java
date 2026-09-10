package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ci {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gg f13168a = new gg();

    static {
        String str = uu0.f20901a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public abstract int a();

    public abstract ih b(int i10, ih ihVar, long j10);

    public abstract int c();

    public abstract ug d(int i10, ug ugVar, boolean z10);

    public abstract int e(Object obj);

    public final boolean equals(Object obj) {
        int iJ;
        if (this != obj) {
            if (obj instanceof ci) {
                ci ciVar = (ci) obj;
                if (ciVar.a() == a() && ciVar.c() == c()) {
                    ih ihVar = new ih();
                    ug ugVar = new ug();
                    ih ihVar2 = new ih();
                    ug ugVar2 = new ug();
                    for (int i10 = 0; i10 < a(); i10++) {
                        if (b(i10, ihVar, 0L).equals(ciVar.b(i10, ihVar2, 0L))) {
                        }
                    }
                    for (int i11 = 0; i11 < c(); i11++) {
                        if (d(i11, ugVar, true).equals(ciVar.d(i11, ugVar2, true))) {
                        }
                    }
                    int iK = k(true);
                    if (iK == ciVar.k(true) && (iJ = j(true)) == ciVar.j(true)) {
                        while (iK != iJ) {
                            int iH = h(iK, 0, true);
                            if (iH == ciVar.h(iK, 0, true)) {
                                iK = iH;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract Object f(int i10);

    public final boolean g() {
        return a() == 0;
    }

    public int h(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == j(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == j(z10) ? k(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        int i10;
        ih ihVar = new ih();
        ug ugVar = new ug();
        int iA = a() + 217;
        int i11 = 0;
        while (true) {
            i10 = iA * 31;
            if (i11 >= a()) {
                break;
            }
            iA = i10 + b(i11, ihVar, 0L).hashCode();
            i11++;
        }
        int iC = c() + i10;
        for (int i12 = 0; i12 < c(); i12++) {
            iC = (iC * 31) + d(i12, ugVar, true).hashCode();
        }
        int iK = k(true);
        while (iK != -1) {
            iC = (iC * 31) + iK;
            iK = h(iK, 0, true);
        }
        return iC;
    }

    public int i(int i10) {
        if (i10 == k(false)) {
            return -1;
        }
        return i10 - 1;
    }

    public int j(boolean z10) {
        if (g()) {
            return -1;
        }
        return a() - 1;
    }

    public int k(boolean z10) {
        return g() ? -1 : 0;
    }

    public final int l(int i10, ug ugVar, ih ihVar, int i11, boolean z10) {
        int i12 = d(i10, ugVar, false).f20772c;
        if (b(i12, ihVar, 0L).l != i10) {
            return i10 + 1;
        }
        int iH = h(i12, i11, z10);
        if (iH == -1) {
            return -1;
        }
        return b(iH, ihVar, 0L).f15754k;
    }

    public final Pair m(ih ihVar, ug ugVar, int i10, long j10) {
        Pair pairN = n(ihVar, ugVar, i10, j10, 0L);
        pairN.getClass();
        return pairN;
    }

    public final Pair n(ih ihVar, ug ugVar, int i10, long j10, long j11) {
        ps1.f0(i10, a());
        b(i10, ihVar, j11);
        if (j10 == C.TIME_UNSET) {
            ihVar.getClass();
            j10 = 0;
        }
        int i11 = ihVar.f15754k;
        d(i11, ugVar, false);
        while (i11 < ihVar.l) {
            ugVar.getClass();
            if (j10 == 0) {
                break;
            }
            int i12 = i11 + 1;
            d(i12, ugVar, false).getClass();
            if (j10 < 0) {
                break;
            }
            i11 = i12;
        }
        d(i11, ugVar, true);
        ugVar.getClass();
        long j12 = ugVar.f20773d;
        if (j12 != C.TIME_UNSET) {
            j10 = Math.min(j10, j12 - 1);
        }
        long jMax = Math.max(0L, j10);
        Object obj = ugVar.f20771b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public ug o(Object obj, ug ugVar) {
        return d(e(obj), ugVar, true);
    }
}
