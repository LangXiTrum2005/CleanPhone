package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2421Fo implements InterfaceC2538Kb {
    public static final String d;
    public static final String e;
    public static final String f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3089a;
    public final int b;
    public final int c;

    static {
        int i = Ug0.f3833a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
    }

    public C2421Fo(int i, int i2, int i3) {
        this.f3089a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2421Fo)) {
            return false;
        }
        C2421Fo c2421Fo = (C2421Fo) obj;
        return this.f3089a == c2421Fo.f3089a && this.b == c2421Fo.b && this.c == c2421Fo.c;
    }

    public final int hashCode() {
        return ((((527 + this.f3089a) * 31) + this.b) * 31) + this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f3089a);
        bundle.putInt(e, this.b);
        bundle.putInt(f, this.c);
        return bundle;
    }
}
