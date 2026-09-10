package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Comparator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Sg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2750Sg extends AbstractC2802Ug {
    public static AbstractC2802Ug g(int i) {
        if (i < 0) {
            return AbstractC2802Ug.b;
        }
        return i > 0 ? AbstractC2802Ug.c : AbstractC2802Ug.f3832a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2802Ug
    public final AbstractC2802Ug a(int i, int i2) {
        int i3;
        if (i < i2) {
            i3 = -1;
        } else {
            i3 = i > i2 ? 1 : 0;
        }
        return g(i3);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2802Ug
    public final AbstractC2802Ug b(long j, long j2) {
        int i;
        if (j < j2) {
            i = -1;
        } else {
            i = j > j2 ? 1 : 0;
        }
        return g(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2802Ug
    public final AbstractC2802Ug c(Object obj, Object obj2, Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2802Ug
    public final AbstractC2802Ug d(boolean z, boolean z2) {
        int i;
        if (z == z2) {
            i = 0;
        } else {
            i = z ? 1 : -1;
        }
        return g(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2802Ug
    public final AbstractC2802Ug e(boolean z, boolean z2) {
        int i;
        if (z2 == z) {
            i = 0;
        } else {
            i = z2 ? 1 : -1;
        }
        return g(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2802Ug
    public final int f() {
        return 0;
    }
}
