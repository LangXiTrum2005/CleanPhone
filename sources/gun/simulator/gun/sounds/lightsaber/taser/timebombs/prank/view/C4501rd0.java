package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4501rd0 implements InterfaceC2538Kb {
    public static final String c;
    public static final String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3974ld0 f4938a;
    public final AC b;

    static {
        int i = Ug0.f3833a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public C4501rd0(C3974ld0 c3974ld0, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c3974ld0.f4655a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f4938a = c3974ld0;
        this.b = AC.j(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4501rd0.class != obj.getClass()) {
            return false;
        }
        C4501rd0 c4501rd0 = (C4501rd0) obj;
        return this.f4938a.equals(c4501rd0.f4938a) && this.b.equals(c4501rd0.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.f4938a.hashCode();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(c, this.f4938a.toBundle());
        bundle.putIntArray(d, AbstractC2995aW.z0(this.b));
        return bundle;
    }
}
