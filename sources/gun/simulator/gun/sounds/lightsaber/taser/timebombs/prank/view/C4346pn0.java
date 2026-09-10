package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4346pn0 extends Xn0 {
    public static final C4346pn0 e = new C4346pn0(0);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Xn0
    public final void e(boolean z) {
        Iterator it = Collections.unmodifiableCollection(Cn0.c.f2942a).iterator();
        while (it.hasNext()) {
            W2 w2 = ((C3203cn0) it.next()).e;
            if (w2.b.get() != 0) {
                CD.b.a(w2.f(), "setState", z ? "foregrounded" : "backgrounded", w2.f3906a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Xn0
    public final boolean f() {
        Iterator it = Collections.unmodifiableCollection(Cn0.c.b).iterator();
        while (it.hasNext()) {
            View view = (View) ((C3203cn0) it.next()).d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
