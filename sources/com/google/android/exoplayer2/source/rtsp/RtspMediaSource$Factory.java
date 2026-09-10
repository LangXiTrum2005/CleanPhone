package com.google.android.exoplayer2.source.rtsp;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2808Um;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2868Wu;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3693iO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G7;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5098yO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Z00;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class RtspMediaSource$Factory implements InterfaceC5098yO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f806a = 8000;
    public final String b = "ExoPlayerLib/2.18.5";
    public final SocketFactory c = SocketFactory.getDefault();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5098yO
    public final G9 c(C3693iO c3693iO) {
        c3693iO.b.getClass();
        return new Z00(c3693iO, new C2868Wu(this.f806a, 3), this.b, this.c);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5098yO
    public final InterfaceC5098yO a(C2808Um c2808Um) {
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5098yO
    public final InterfaceC5098yO b(G7 g7) {
        return this;
    }
}
