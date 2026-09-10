package com.google.android.exoplayer2.source.hls;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2497Im;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2769Sz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2808Um;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2911Yl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3341eO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3467fn;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3491g4;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3693iO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3730in;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4710tz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G7;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2484Hz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2951Zz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3296dq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4341pl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5098yO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qm0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class HlsMediaSource$Factory implements InterfaceC5098yO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2497Im f805a;
    public C2808Um f = new C2808Um();
    public final Qm0 c = new Qm0(29);
    public final C2911Yl d = C3730in.o;
    public final C3467fn b = InterfaceC2484Hz.f3195a;
    public G7 g = new G7();
    public final C4710tz e = new C4710tz(28);
    public final int i = 1;
    public final long j = C.TIME_UNSET;
    public final boolean h = true;

    public HlsMediaSource$Factory(InterfaceC4341pl interfaceC4341pl) {
        this.f805a = new C2497Im(interfaceC4341pl);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5098yO
    public final InterfaceC5098yO a(C2808Um c2808Um) {
        FW.p(c2808Um, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f = c2808Um;
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5098yO
    public final InterfaceC5098yO b(G7 g7) {
        FW.p(g7, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.g = g7;
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5098yO
    public final G9 c(C3693iO c3693iO) {
        C3341eO c3341eO = c3693iO.b;
        c3341eO.getClass();
        InterfaceC2951Zz c3491g4 = this.c;
        List list = c3341eO.d;
        if (!list.isEmpty()) {
            c3491g4 = new C3491g4(11, c3491g4, list);
        }
        C3467fn c3467fn = this.b;
        InterfaceC3296dq interfaceC3296dqB = this.f.b(c3693iO);
        G7 g7 = this.g;
        this.d.getClass();
        C3730in c3730in = new C3730in(this.f805a, g7, c3491g4);
        boolean z = this.h;
        int i = this.i;
        return new C2769Sz(c3693iO, this.f805a, c3467fn, this.e, interfaceC3296dqB, g7, c3730in, this.j, z, i);
    }
}
