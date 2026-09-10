package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class Z6 implements InterfaceC2538Kb {
    public static final Z6 g = new Z6(0, 0, 1, 1, 0);
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4055a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public NN f;

    static {
        int i2 = Ug0.f3833a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
    }

    public Z6(int i2, int i3, int i4, int i5, int i6) {
        this.f4055a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
    }

    public final NN a() {
        if (this.f == null) {
            this.f = new NN(this, 0);
        }
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Z6.class != obj.getClass()) {
            return false;
        }
        Z6 z6 = (Z6) obj;
        return this.f4055a == z6.f4055a && this.b == z6.b && this.c == z6.c && this.d == z6.d && this.e == z6.e;
    }

    public final int hashCode() {
        return ((((((((527 + this.f4055a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(h, this.f4055a);
        bundle.putInt(i, this.b);
        bundle.putInt(j, this.c);
        bundle.putInt(k, this.d);
        bundle.putInt(l, this.e);
        return bundle;
    }
}
