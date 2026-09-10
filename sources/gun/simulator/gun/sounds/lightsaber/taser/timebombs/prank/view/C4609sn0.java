package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4609sn0 extends Xn0 {
    public static final C4609sn0 e = new C4609sn0(1);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Xn0
    public final void e(boolean z) {
        Iterator it = Collections.unmodifiableCollection(Fn0.c.f3088a).iterator();
        while (it.hasNext()) {
            ((C3026an0) it.next()).e.i(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Xn0
    public final boolean f() {
        Iterator it = Collections.unmodifiableCollection(Fn0.c.b).iterator();
        while (it.hasNext()) {
            View view = (View) ((C3026an0) it.next()).d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
