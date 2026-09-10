package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class KU implements InterfaceC2538Kb {
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3316a;
    public final int b;
    public final C3693iO c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        int i = Ug0.f3833a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
    }

    public KU(Object obj, int i, C3693iO c3693iO, Object obj2, int i2, long j2, long j3, int i3, int i4) {
        this.f3316a = obj;
        this.b = i;
        this.c = c3693iO;
        this.d = obj2;
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || KU.class != obj.getClass()) {
            return false;
        }
        KU ku = (KU) obj;
        return this.b == ku.b && this.e == ku.e && this.f == ku.f && this.g == ku.g && this.h == ku.h && this.i == ku.i && FW.B(this.f3316a, ku.f3316a) && FW.B(this.d, ku.d) && FW.B(this.c, ku.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3316a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i)});
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(j, this.b);
        C3693iO c3693iO = this.c;
        if (c3693iO != null) {
            bundle.putBundle(k, c3693iO.toBundle());
        }
        bundle.putInt(l, this.e);
        bundle.putLong(m, this.f);
        bundle.putLong(n, this.g);
        bundle.putInt(o, this.h);
        bundle.putInt(p, this.i);
        return bundle;
    }
}
