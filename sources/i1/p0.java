package i1;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f42656a = new m0();

    static {
        l1.y.G(0);
        l1.y.G(1);
        l1.y.G(2);
    }

    public int a(boolean z10) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i10, n0 n0Var, o0 o0Var, int i11, boolean z10) {
        int i12 = f(i10, n0Var, false).f42584c;
        if (m(i12, o0Var, 0L).f42629o != i10) {
            return i10 + 1;
        }
        int iE = e(i12, i11, z10);
        if (iE == -1) {
            return -1;
        }
        return m(iE, o0Var, 0L).f42628n;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == c(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == c(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof p0) {
                p0 p0Var = (p0) obj;
                if (p0Var.o() == o() && p0Var.h() == h()) {
                    o0 o0Var = new o0();
                    n0 n0Var = new n0();
                    o0 o0Var2 = new o0();
                    n0 n0Var2 = new n0();
                    for (int i10 = 0; i10 < o(); i10++) {
                        if (m(i10, o0Var, 0L).equals(p0Var.m(i10, o0Var2, 0L))) {
                        }
                    }
                    for (int i11 = 0; i11 < h(); i11++) {
                        if (f(i11, n0Var, true).equals(p0Var.f(i11, n0Var2, true))) {
                        }
                    }
                    int iA = a(true);
                    if (iA == p0Var.a(true) && (iC = c(true)) == p0Var.c(true)) {
                        while (iA != iC) {
                            int iE = e(iA, 0, true);
                            if (iE == p0Var.e(iA, 0, true)) {
                                iA = iE;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract n0 f(int i10, n0 n0Var, boolean z10);

    public n0 g(Object obj, n0 n0Var) {
        return f(b(obj), n0Var, true);
    }

    public abstract int h();

    public int hashCode() {
        o0 o0Var = new o0();
        n0 n0Var = new n0();
        int iO = o() + 217;
        for (int i10 = 0; i10 < o(); i10++) {
            iO = (iO * 31) + m(i10, o0Var, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i11 = 0; i11 < h(); i11++) {
            iH = (iH * 31) + f(i11, n0Var, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(o0 o0Var, n0 n0Var, int i10, long j10) {
        Pair pairJ = j(o0Var, n0Var, i10, j10, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(o0 o0Var, n0 n0Var, int i10, long j10, long j11) {
        go.k.m(i10, o());
        m(i10, o0Var, j11);
        if (j10 == C.TIME_UNSET) {
            j10 = o0Var.l;
            if (j10 == C.TIME_UNSET) {
                return null;
            }
        }
        int i11 = o0Var.f42628n;
        f(i11, n0Var, false);
        while (i11 < o0Var.f42629o && n0Var.f42586e != j10) {
            int i12 = i11 + 1;
            if (f(i12, n0Var, false).f42586e > j10) {
                break;
            }
            i11 = i12;
        }
        f(i11, n0Var, true);
        long jMin = j10 - n0Var.f42586e;
        long j12 = n0Var.f42585d;
        if (j12 != C.TIME_UNSET) {
            jMin = Math.min(jMin, j12 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = n0Var.f42583b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i10, int i11) {
        if (i11 == 0) {
            if (i10 == a(false)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(false) ? c(false) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i10);

    public abstract o0 m(int i10, o0 o0Var, long j10);

    public final void n(int i10, o0 o0Var) {
        m(i10, o0Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
