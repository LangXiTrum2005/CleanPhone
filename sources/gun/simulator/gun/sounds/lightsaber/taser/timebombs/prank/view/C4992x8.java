package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.x8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4992x8 extends GE {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(C4992x8.class, Object.class, "_disposer");
    private volatile Object _disposer;
    public final InterfaceC2772Tc e;
    public InterfaceC4612sp f;
    public final /* synthetic */ C5168z8 g;

    public C4992x8(C5168z8 c5168z8, C2798Uc c2798Uc) {
        this.g = c5168z8;
        this.e = c2798Uc;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return C5033xf0.f5238a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GE
    public final void j(Throwable th) {
        InterfaceC2772Tc interfaceC2772Tc = this.e;
        if (th != null) {
            SE seD = interfaceC2772Tc.d(th);
            if (seD != null) {
                interfaceC2772Tc.v(seD);
                C5080y8 c5080y8 = (C5080y8) h.get(this);
                if (c5080y8 != null) {
                    c5080y8.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C5168z8.b;
        C5168z8 c5168z8 = this.g;
        if (atomicIntegerFieldUpdater.decrementAndGet(c5168z8) == 0) {
            InterfaceC3732io[] interfaceC3732ioArr = c5168z8.f5316a;
            ArrayList arrayList = new ArrayList(interfaceC3732ioArr.length);
            for (InterfaceC3732io interfaceC3732io : interfaceC3732ioArr) {
                arrayList.add(interfaceC3732io.h());
            }
            interfaceC2772Tc.resumeWith(arrayList);
        }
    }
}
