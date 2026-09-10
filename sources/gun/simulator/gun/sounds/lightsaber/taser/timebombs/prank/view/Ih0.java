package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class Ih0 implements InterfaceC2538Kb {
    public static final Ih0 e = new Ih0(0, 1.0f, 0, 0);
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3234a;
    public final int b;
    public final int c;
    public final float d;

    static {
        int i2 = Ug0.f3833a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
    }

    public Ih0(int i2, float f2, int i3, int i4) {
        this.f3234a = i2;
        this.b = i3;
        this.c = i4;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ih0)) {
            return false;
        }
        Ih0 ih0 = (Ih0) obj;
        return this.f3234a == ih0.f3234a && this.b == ih0.b && this.c == ih0.c && this.d == ih0.d;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((EnumC4719u30.AD_RESPONSE_TIMED_OUT_VALUE + this.f3234a) * 31) + this.b) * 31) + this.c) * 31);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f, this.f3234a);
        bundle.putInt(g, this.b);
        bundle.putInt(h, this.c);
        bundle.putFloat(i, this.d);
        return bundle;
    }
}
