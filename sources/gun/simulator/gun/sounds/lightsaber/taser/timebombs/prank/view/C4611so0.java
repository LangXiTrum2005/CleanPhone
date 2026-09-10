package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.so0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4611so0 {
    public static final C4611so0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f5000a;
    public boolean b;
    public boolean c;

    static {
        C4611so0 c4611so0 = new C4611so0();
        c4611so0.b = false;
        c4611so0.c = false;
        d = c4611so0;
    }

    public final void a(boolean z, boolean z2) {
        if ((z2 || z) == (this.c || this.b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(Hn0.c.f3186a).iterator();
        while (it.hasNext()) {
            V2 v2 = ((Jm0) it.next()).e;
            boolean z3 = z2 || z;
            if (v2.n()) {
                C4003lv.b.a(v2.q(), "setDeviceLockState", z3 ? "locked" : "unlocked");
            }
        }
    }
}
