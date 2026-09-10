package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5117yd0 implements InterfaceC2538Kb {
    public static final C5117yd0 b;
    public static final String c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AC f5285a;

    static {
        C5086yC c5086yC = AC.b;
        b = new C5117yd0(C3965lY.e);
        int i = Ug0.f3833a;
        c = Integer.toString(0, 36);
    }

    public C5117yd0(AC ac) {
        this.f5285a = AC.j(ac);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            AC ac = this.f5285a;
            if (i2 >= ac.size()) {
                return false;
            }
            C5029xd0 c5029xd0 = (C5029xd0) ac.get(i2);
            if (c5029xd0.b() && c5029xd0.a() == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5117yd0.class != obj.getClass()) {
            return false;
        }
        return this.f5285a.equals(((C5117yd0) obj).f5285a);
    }

    public final int hashCode() {
        return this.f5285a.hashCode();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(c, FW.g0(this.f5285a));
        return bundle;
    }
}
