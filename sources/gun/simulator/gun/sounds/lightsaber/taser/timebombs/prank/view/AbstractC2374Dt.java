package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.util.Pools;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Dt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2374Dt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4710tz f2995a = new C4710tz(21);

    public static C2296At a(int i, InterfaceC5232zt interfaceC5232zt) {
        return new C2296At(new Pools.SynchronizedPool(i), interfaceC5232zt, f2995a);
    }
}
