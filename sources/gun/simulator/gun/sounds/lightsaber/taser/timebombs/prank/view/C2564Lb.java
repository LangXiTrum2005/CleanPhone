package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2564Lb implements InterfaceC4326pd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3359a;
    public final C4619sw b;
    public final C4262oq c = new C4262oq();
    public C4619sw d;
    public InterfaceC4326pd0 e;
    public long f;

    public C2564Lb(int i, int i2, C4619sw c4619sw) {
        this.f3359a = i2;
        this.b = c4619sw;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final void a(long j, int i, int i2, int i3, C4238od0 c4238od0) {
        long j2 = this.f;
        if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j >= j2) {
            this.e = this.c;
        }
        InterfaceC4326pd0 interfaceC4326pd0 = this.e;
        int i4 = Ug0.f3833a;
        interfaceC4326pd0.a(j, i, i2, i3, c4238od0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final void b(int i, JT jt) {
        InterfaceC4326pd0 interfaceC4326pd0 = this.e;
        int i2 = Ug0.f3833a;
        interfaceC4326pd0.d(i, jt);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final int c(InterfaceC3813jl interfaceC3813jl, int i, boolean z) {
        return f(interfaceC3813jl, i, z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final /* synthetic */ void d(int i, JT jt) {
        AbstractC3950lJ.a(this, jt, i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final void e(C4619sw c4619sw) {
        C4619sw c4619sw2 = this.b;
        if (c4619sw2 != null) {
            c4619sw = c4619sw.e(c4619sw2);
        }
        this.d = c4619sw;
        InterfaceC4326pd0 interfaceC4326pd0 = this.e;
        int i = Ug0.f3833a;
        interfaceC4326pd0.e(c4619sw);
    }

    public final int f(InterfaceC3813jl interfaceC3813jl, int i, boolean z) {
        InterfaceC4326pd0 interfaceC4326pd0 = this.e;
        int i2 = Ug0.f3833a;
        return interfaceC4326pd0.c(interfaceC3813jl, i, z);
    }
}
