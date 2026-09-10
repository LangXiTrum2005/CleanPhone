package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.md0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4062md0 implements InterfaceC2538Kb {
    public static final C4062md0 d = new C4062md0(new C3974ld0[0]);
    public static final String e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4703a;
    public final C3965lY b;
    public int c;

    static {
        int i = Ug0.f3833a;
        e = Integer.toString(0, 36);
    }

    public C4062md0(C3974ld0... c3974ld0Arr) {
        this.b = AC.k(c3974ld0Arr);
        this.f4703a = c3974ld0Arr.length;
        int i = 0;
        while (true) {
            C3965lY c3965lY = this.b;
            if (i >= c3965lY.size()) {
                return;
            }
            int i2 = i + 1;
            for (int i3 = i2; i3 < c3965lY.size(); i3++) {
                if (((C3974ld0) c3965lY.get(i)).equals(c3965lY.get(i3))) {
                    AbstractC4038mJ.d("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final C3974ld0 a(int i) {
        return (C3974ld0) this.b.get(i);
    }

    public final int b(C3974ld0 c3974ld0) {
        int iIndexOf = this.b.indexOf(c3974ld0);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4062md0.class != obj.getClass()) {
            return false;
        }
        C4062md0 c4062md0 = (C4062md0) obj;
        return this.f4703a == c4062md0.f4703a && this.b.equals(c4062md0.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(e, FW.g0(this.b));
        return bundle;
    }
}
