package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Gc0 implements InterfaceC2538Kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Dc0 f3128a = new Dc0();
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        int i = Ug0.f3833a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
        d = Integer.toString(2, 36);
    }

    public int a(boolean z) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i, Ec0 ec0, Fc0 fc0, int i2, boolean z) {
        int i3 = g(i, ec0, false).c;
        if (n(i3, fc0, 0L).p != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return n(iE, fc0, 0L).o;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        int iC;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gc0)) {
            return false;
        }
        Gc0 gc0 = (Gc0) obj;
        if (gc0.p() != p() || gc0.i() != i()) {
            return false;
        }
        Fc0 fc0 = new Fc0();
        Ec0 ec0 = new Ec0();
        Fc0 fc1 = new Fc0();
        Ec0 ec1 = new Ec0();
        for (int i = 0; i < p(); i++) {
            if (!n(i, fc0, 0L).equals(gc0.n(i, fc1, 0L))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < i(); i2++) {
            if (!g(i2, ec0, true).equals(gc0.g(i2, ec1, true))) {
                return false;
            }
        }
        int iA = a(true);
        if (iA != gc0.a(true) || (iC = c(true)) != gc0.c(true)) {
            return false;
        }
        while (iA != iC) {
            int iE = e(iA, 0, true);
            if (iE != gc0.e(iA, 0, true)) {
                return false;
            }
            iA = iE;
        }
        return true;
    }

    public final Ec0 f(int i, Ec0 ec0) {
        return g(i, ec0, false);
    }

    public abstract Ec0 g(int i, Ec0 ec0, boolean z);

    public Ec0 h(Object obj, Ec0 ec0) {
        return g(b(obj), ec0, true);
    }

    public final int hashCode() {
        Fc0 fc0 = new Fc0();
        Ec0 ec0 = new Ec0();
        int iP = p() + EnumC4719u30.AD_RESPONSE_TIMED_OUT_VALUE;
        for (int i = 0; i < p(); i++) {
            iP = (iP * 31) + n(i, fc0, 0L).hashCode();
        }
        int i2 = i() + (iP * 31);
        for (int i3 = 0; i3 < i(); i3++) {
            i2 = (i2 * 31) + g(i3, ec0, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            i2 = (i2 * 31) + iA;
            iA = e(iA, 0, true);
        }
        return i2;
    }

    public abstract int i();

    public final Pair j(Fc0 fc0, Ec0 ec0, int i, long j) {
        Pair pairK = k(fc0, ec0, i, j, 0L);
        pairK.getClass();
        return pairK;
    }

    public final Pair k(Fc0 fc0, Ec0 ec0, int i, long j, long j2) {
        FW.m(i, p());
        n(i, fc0, j2);
        if (j == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            j = fc0.m;
            if (j == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                return null;
            }
        }
        int i2 = fc0.o;
        g(i2, ec0, false);
        while (i2 < fc0.p && ec0.e != j) {
            int i3 = i2 + 1;
            if (g(i3, ec0, false).e > j) {
                break;
            }
            i2 = i3;
        }
        g(i2, ec0, true);
        long jMin = j - ec0.e;
        long j3 = ec0.d;
        if (j3 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = ec0.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int l(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i);

    public abstract Fc0 n(int i, Fc0 fc0, long j);

    public final void o(int i, Fc0 fc0) {
        n(i, fc0, 0L);
    }

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        ArrayList arrayList = new ArrayList();
        int iP = p();
        Fc0 fc0 = new Fc0();
        for (int i = 0; i < iP; i++) {
            arrayList.add(n(i, fc0, 0L).toBundle());
        }
        ArrayList arrayList2 = new ArrayList();
        int i2 = i();
        Ec0 ec0 = new Ec0();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList2.add(g(i3, ec0, false).toBundle());
        }
        int[] iArr = new int[iP];
        if (iP > 0) {
            iArr[0] = a(true);
        }
        for (int i4 = 1; i4 < iP; i4++) {
            iArr[i4] = e(iArr[i4 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        AbstractC2995aW.h0(bundle, b, new BinderC2486Ib(arrayList));
        AbstractC2995aW.h0(bundle, c, new BinderC2486Ib(arrayList2));
        bundle.putIntArray(d, iArr);
        return bundle;
    }
}
