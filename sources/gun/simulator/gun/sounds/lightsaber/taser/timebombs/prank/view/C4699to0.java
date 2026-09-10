package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.to0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4699to0 {
    public static final C4699to0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f5052a;
    public boolean b;
    public boolean c;

    static {
        C4699to0 c4699to0 = new C4699to0();
        c4699to0.b = false;
        c4699to0.c = false;
        d = c4699to0;
    }

    public final void a(boolean z, boolean z2) {
        if ((z2 || z) == (this.c || this.b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(Cn0.c.f2942a).iterator();
        while (it.hasNext()) {
            W2 w2 = ((C3203cn0) it.next()).e;
            boolean z3 = z2 || z;
            if (w2.b.get() != 0) {
                CD.b.a(w2.f(), "setDeviceLockState", z3 ? "locked" : "unlocked");
            }
        }
    }
}
