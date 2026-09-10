package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2442Gj implements InterfaceC4545s40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f3133a;

    public C2442Gj(InterfaceC4545s40 interfaceC4545s40) {
        this.f3133a = new AtomicReference(interfaceC4545s40);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40
    public final Iterator iterator() {
        InterfaceC4545s40 interfaceC4545s40 = (InterfaceC4545s40) this.f3133a.getAndSet(null);
        if (interfaceC4545s40 != null) {
            return interfaceC4545s40.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
