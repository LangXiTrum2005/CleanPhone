package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.y90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5083y90 extends W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5266a = AtomicReferenceFieldUpdater.newUpdater(C5083y90.class, Object.class, "_state");
    private volatile Object _state;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W
    public final boolean a(V v) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5266a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, AbstractC4995x90.f5211a);
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W
    public final InterfaceC2857Wj[] b(V v) {
        f5266a.set(this, null);
        return AbstractC2871Wx.b;
    }
}
