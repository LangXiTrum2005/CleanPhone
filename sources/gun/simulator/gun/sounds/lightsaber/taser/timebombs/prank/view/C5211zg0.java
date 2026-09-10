package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.SystemClock;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5211zg0 implements InterfaceC2438Gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5336a;

    public final long a() {
        switch (this.f5336a) {
            case 0:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }
}
