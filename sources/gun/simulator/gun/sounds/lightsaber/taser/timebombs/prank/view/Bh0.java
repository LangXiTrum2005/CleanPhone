package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.exoplayer2.ui.PlayerView;

/* JADX INFO: loaded from: classes4.dex */
public final class Bh0 implements InterfaceC3579h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ch0 f2885a;

    public Bh0(Ch0 ch0) {
        this.f2885a = ch0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3579h4
    public final void b(C3693iO c3693iO) {
        C2736Rs c2736Rs;
        if (c3693iO == null || !c3693iO.f4499a.equals("LoopMediaId")) {
            return;
        }
        Ch0 ch0 = this.f2885a;
        C2736Rs c2736Rs2 = ch0.c;
        c2736Rs2.Q();
        if (c2736Rs2.E != 0 || (c2736Rs = ch0.c) == null) {
            return;
        }
        c2736Rs.K(1);
        ch0.b = true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3579h4
    public final void i(int i) {
        if (i == 4) {
            Ch0 ch0 = this.f2885a;
            if (ch0.h) {
                ch0.h = false;
                C3285dk c3285dk = ch0.i;
                C3355eb c3355eb = (C3355eb) c3285dk.b;
                C2770Ta c2770Ta = (C2770Ta) c3285dk.c;
                AbstractC2995aW.q(c3355eb, "this$0");
                AbstractC2995aW.q(c2770Ta, "this$1");
                if (c3355eb.b.getSwitchBoomBrokenScreen()) {
                    return;
                }
                c3355eb.E = false;
                PlayerView playerView = c2770Ta.d;
                if (playerView != null) {
                    AbstractC2340Cl.D(playerView);
                }
                Ch0 ch0A = Ch0.a(c3355eb.f4847a);
                C2736Rs c2736Rs = ch0A.c;
                if (c2736Rs != null) {
                    c2736Rs.J(false);
                    ch0A.c.e(0, 0L, false);
                }
                c2770Ta.a();
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3579h4
    public final /* synthetic */ void a(Ih0 ih0) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3579h4
    public final /* synthetic */ void d(C3779jO c3779jO) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3579h4
    public final /* synthetic */ void g(CU cu) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3579h4
    public final /* synthetic */ void h(C2599Ml c2599Ml) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3579h4
    public final /* synthetic */ void onPositionDiscontinuity(int i) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3579h4
    public final /* synthetic */ void c(LU lu, C3491g4 c3491g4) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3579h4
    public final /* synthetic */ void e(C3403f4 c3403f4, C3779jO c3779jO) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3579h4
    public final /* synthetic */ void f(C3403f4 c3403f4, int i, long j) {
    }
}
