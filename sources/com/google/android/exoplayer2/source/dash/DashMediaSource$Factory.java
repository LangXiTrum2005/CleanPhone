package com.google.android.exoplayer2.source.dash;

import androidx.work.WorkRequest;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2497Im;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2728Rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2808Um;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2936Zk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3341eO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3491g4;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3693iO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4710tz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G7;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3296dq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4341pl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5098yO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DashMediaSource$Factory implements InterfaceC5098yO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2497Im f804a;
    public final InterfaceC4341pl b;
    public C2808Um c = new C2808Um();
    public G7 e = new G7();
    public final long f = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
    public final C4710tz d = new C4710tz(28);

    public DashMediaSource$Factory(InterfaceC4341pl interfaceC4341pl) {
        this.f804a = new C2497Im(interfaceC4341pl);
        this.b = interfaceC4341pl;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5098yO
    public final InterfaceC5098yO a(C2808Um c2808Um) {
        FW.p(c2808Um, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.c = c2808Um;
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5098yO
    public final InterfaceC5098yO b(G7 g7) {
        FW.p(g7, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.e = g7;
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5098yO
    public final G9 c(C3693iO c3693iO) {
        C3341eO c3341eO = c3693iO.b;
        c3341eO.getClass();
        C2728Rk c2728Rk = new C2728Rk();
        List list = c3341eO.d;
        LT c3491g4 = !list.isEmpty() ? new C3491g4(9, c2728Rk, list) : c2728Rk;
        InterfaceC3296dq interfaceC3296dqB = this.c.b(c3693iO);
        G7 g7 = this.e;
        return new C2936Zk(c3693iO, this.b, c3491g4, this.f804a, this.d, interfaceC3296dqB, g7, this.f);
    }
}
