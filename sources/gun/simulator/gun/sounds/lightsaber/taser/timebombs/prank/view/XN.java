package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class XN implements InterfaceC2538Kb {
    public static final YN f = new YN(new WN());
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final Nd0 l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3965a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    static {
        int i2 = Ug0.f3833a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
        l = new Nd0(26);
    }

    public XN(WN wn) {
        this.f3965a = wn.f3918a;
        this.b = wn.b;
        this.c = wn.c;
        this.d = wn.d;
        this.e = wn.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XN)) {
            return false;
        }
        XN xn = (XN) obj;
        return this.f3965a == xn.f3965a && this.b == xn.b && this.c == xn.c && this.d == xn.d && this.e == xn.e;
    }

    public final int hashCode() {
        long j2 = this.f3965a;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long j3 = this.b;
        return ((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        YN yn = f;
        long j2 = yn.f3965a;
        long j3 = this.f3965a;
        if (j3 != j2) {
            bundle.putLong(g, j3);
        }
        long j4 = yn.b;
        long j5 = this.b;
        if (j5 != j4) {
            bundle.putLong(h, j5);
        }
        boolean z = yn.c;
        boolean z2 = this.c;
        if (z2 != z) {
            bundle.putBoolean(i, z2);
        }
        boolean z3 = yn.d;
        boolean z4 = this.d;
        if (z4 != z3) {
            bundle.putBoolean(j, z4);
        }
        boolean z5 = yn.e;
        boolean z6 = this.e;
        if (z6 != z5) {
            bundle.putBoolean(k, z6);
        }
        return bundle;
    }
}
