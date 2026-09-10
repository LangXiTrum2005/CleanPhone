package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Xa0 implements InterfaceC4827vH {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f3976a = Collections.newSetFromMap(new WeakHashMap());

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4827vH
    public final void onDestroy() {
        Iterator it = Tg0.e(this.f3976a).iterator();
        while (it.hasNext()) {
            ((Wa0) it.next()).onDestroy();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4827vH
    public final void onStart() {
        Iterator it = Tg0.e(this.f3976a).iterator();
        while (it.hasNext()) {
            ((Wa0) it.next()).onStart();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4827vH
    public final void onStop() {
        Iterator it = Tg0.e(this.f3976a).iterator();
        while (it.hasNext()) {
            ((Wa0) it.next()).onStop();
        }
    }
}
