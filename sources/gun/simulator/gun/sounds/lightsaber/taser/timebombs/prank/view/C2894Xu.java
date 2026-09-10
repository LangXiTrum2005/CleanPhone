package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Xu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2894Xu implements InterfaceC4047mS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3036av f3998a;
    public C3491g4 b;
    public long c;
    public long d;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4047mS
    public final O30 createSeekMap() {
        FW.s(this.c != -1);
        return new C2946Zu(this.f3998a, this.c, 0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4047mS
    public final long l(InterfaceC4265ot interfaceC4265ot) {
        long j = this.d;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.d = -1L;
        return j2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4047mS
    public final void startSeek(long j) {
        long[] jArr = (long[]) this.b.b;
        this.d = jArr[Ug0.f(jArr, j, true)];
    }
}
