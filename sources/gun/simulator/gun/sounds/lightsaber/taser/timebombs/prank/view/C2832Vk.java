package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2832Vk implements InterfaceC3059b80, PI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2936Zk f3889a;

    public final void a() {
        long j;
        C2936Zk c2936Zk = this.f3889a;
        synchronized (AbstractC3147c80.b) {
            try {
                j = AbstractC3147c80.c ? AbstractC3147c80.d : com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            } catch (Throwable th) {
                throw th;
            }
        }
        c2936Zk.L = j;
        c2936Zk.x(true);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PI
    public final void maybeThrowError() throws IOException {
        C2936Zk c2936Zk = this.f3889a;
        c2936Zk.A.maybeThrowError();
        C3124bu c3124bu = c2936Zk.C;
        if (c3124bu != null) {
            throw c3124bu;
        }
    }
}
