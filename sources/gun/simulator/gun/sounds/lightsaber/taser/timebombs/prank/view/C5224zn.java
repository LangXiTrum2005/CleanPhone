package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5224zn implements InterfaceC4177nt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4619sw f5342a;

    public C5224zn(C4619sw c4619sw) {
        this.f5342a = c4619sw;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) {
        return interfaceC4265ot.skip(Integer.MAX_VALUE) == -1 ? -1 : 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final boolean b(InterfaceC4265ot interfaceC4265ot) {
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void d(InterfaceC4353pt interfaceC4353pt) {
        InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(0, 3);
        interfaceC4353pt.a(new C2946Zu(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET));
        interfaceC4353pt.endTracks();
        C4619sw c4619sw = this.f5342a;
        C4531rw c4531rwA = c4619sw.a();
        c4531rwA.k = "text/x-unknown";
        c4531rwA.h = c4619sw.l;
        interfaceC4326pd0Track.e(new C4619sw(c4531rwA));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void release() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void seek(long j, long j2) {
    }
}
