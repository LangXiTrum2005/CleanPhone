package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OU implements JU, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RU f3505a;

    public OU(RU ru) {
        this.f3505a = ru;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void d(IU iu) {
        boolean zA = iu.a(4, 5);
        RU ru = this.f3505a;
        if (zA) {
            ru.i();
        }
        if (iu.a(4, 5, 7)) {
            ru.j();
        }
        C3125bv c3125bv = iu.f3218a;
        if (c3125bv.f4194a.get(8)) {
            ru.k();
        }
        if (c3125bv.f4194a.get(9)) {
            ru.l();
        }
        if (iu.a(8, 9, 11, 0, 13)) {
            ru.h();
        }
        if (iu.a(11, 0)) {
            ru.m();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RU ru = this.f3505a;
        LU lu = ru.G;
        if (lu == null) {
            return;
        }
        if (ru.d == view) {
            ((K9) lu).f();
            return;
        }
        if (ru.c == view) {
            ((K9) lu).h();
            return;
        }
        if (ru.g == view) {
            if (((C2736Rs) lu).w() != 4) {
                K9 k9 = (K9) lu;
                C2736Rs c2736Rs = (C2736Rs) k9;
                c2736Rs.Q();
                k9.g(12, c2736Rs.u);
                return;
            }
            return;
        }
        if (ru.h == view) {
            K9 k10 = (K9) lu;
            C2736Rs c2736Rs2 = (C2736Rs) k10;
            c2736Rs2.Q();
            k10.g(11, -c2736Rs2.t);
            return;
        }
        if (ru.e == view) {
            RU.b(lu);
            return;
        }
        if (ru.f == view) {
            ((C2736Rs) ((K9) lu)).J(false);
            return;
        }
        if (ru.i == view) {
            C2736Rs c2736Rs3 = (C2736Rs) lu;
            c2736Rs3.Q();
            int i = c2736Rs3.E;
            int i2 = ru.N;
            for (int i3 = 1; i3 <= 2; i3++) {
                int i4 = (i + i3) % 3;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2 || (i2 & 2) == 0) {
                        }
                    } else if ((i2 & 1) == 0) {
                    }
                }
                i = i4;
            }
            c2736Rs3.K(i);
            return;
        }
        if (ru.j == view) {
            C2736Rs c2736Rs4 = (C2736Rs) lu;
            c2736Rs4.Q();
            boolean z = !c2736Rs4.F;
            c2736Rs4.Q();
            if (c2736Rs4.F != z) {
                c2736Rs4.F = z;
                Qa0 qa0 = c2736Rs4.k.h;
                qa0.getClass();
                Pa0 pa0B = Qa0.b();
                pa0B.f3557a = qa0.f3608a.obtainMessage(12, z ? 1 : 0, 0);
                pa0B.b();
                C2425Fs c2425Fs = new C2425Fs(z, 0);
                EI ei = c2736Rs4.l;
                ei.c(9, c2425Fs);
                c2736Rs4.M();
                ei.b();
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void onSeekProcessed() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void A(C2321Bs c2321Bs) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void C(C2421Fo c2421Fo) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void F(C5117yd0 c5117yd0) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void H(boolean z) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void a(Ih0 ih0) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void b(int i) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void g(int i) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void h(C2469Hk c2469Hk) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void i(Metadata metadata) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void l(int i) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void m(C3955lO c3955lO) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void n(C2321Bs c2321Bs) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void o(boolean z) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void onRepeatModeChanged(int i) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void p(HU hu) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void t(boolean z) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void w(EU eu) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void B(C3693iO c3693iO, int i) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void k(int i, boolean z) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void q(int i, int i2) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void v(int i, boolean z) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void y(int i, KU ku, KU ku2) {
    }
}
