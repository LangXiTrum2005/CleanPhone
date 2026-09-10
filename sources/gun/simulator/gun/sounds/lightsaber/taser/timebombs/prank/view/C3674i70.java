package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.i70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3674i70 implements InterfaceC4161nj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4288p70 f4489a;

    public C3674i70(C4288p70 c4288p70) {
        this.f4489a = c4288p70;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4161nj
    public final void a(boolean z) {
        ArrayList arrayList;
        Tg0.a();
        synchronized (this.f4489a) {
            arrayList = new ArrayList((Set) this.f4489a.b);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC4161nj) it.next()).a(z);
        }
    }
}
