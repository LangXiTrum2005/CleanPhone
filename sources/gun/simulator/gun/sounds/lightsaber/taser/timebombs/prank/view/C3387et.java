package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.et, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3387et extends AbstractC5023xa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ InterfaceC4583sa0 g;

    public C3387et(InterfaceC4583sa0 interfaceC4583sa0, int i) {
        this.f = i;
        this.g = interfaceC4583sa0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2703Ql
    public final void e() {
        switch (this.f) {
            case 0:
                ArrayDeque arrayDeque = ((C3563gt) this.g).c;
                FW.s(arrayDeque.size() < 2);
                FW.h(!arrayDeque.contains(this));
                this.b = 0;
                this.d = null;
                arrayDeque.addFirst(this);
                return;
            default:
                R60 r60 = (R60) this.g;
                synchronized (r60.b) {
                    this.b = 0;
                    this.d = null;
                    int i = r60.h;
                    r60.h = i + 1;
                    r60.f[i] = this;
                    if (!r60.c.isEmpty() && r60.h > 0) {
                        r60.b.notify();
                    }
                    break;
                }
                return;
        }
    }
}
