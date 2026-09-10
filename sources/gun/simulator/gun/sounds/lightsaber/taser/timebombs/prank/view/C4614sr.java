package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4614sr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3878kZ f5002a;
    public final Executor b;

    public C4614sr(InterfaceC3878kZ interfaceC3878kZ, Executor executor) {
        this.f5002a = interfaceC3878kZ;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4614sr) {
            return this.f5002a.equals(((C4614sr) obj).f5002a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5002a.hashCode();
    }
}
