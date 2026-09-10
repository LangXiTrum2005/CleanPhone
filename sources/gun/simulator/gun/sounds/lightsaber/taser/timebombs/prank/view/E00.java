package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class E00 implements K00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J00 f3000a;
    public InterfaceC4326pd0 b;
    public long d;
    public boolean f;
    public boolean g;
    public long c = -1;
    public int e = -1;

    public E00(J00 j00) {
        this.f3000a = j00;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void a(InterfaceC4353pt interfaceC4353pt, int i) {
        InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(i, 1);
        this.b = interfaceC4326pd0Track;
        interfaceC4326pd0Track.e(this.f3000a.c);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void b(long j) {
        this.c = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void c(int i, long j, JT jt, boolean z) {
        FW.t(this.b);
        if (!this.f) {
            int i2 = jt.b;
            FW.i(jt.c > 18, "ID Header has insufficient data");
            FW.i(jt.r(8, AbstractC2333Ce.c).equals("OpusHead"), "ID Header missing");
            FW.i(jt.t() == 1, "version number must always be 1");
            jt.E(i2);
            ArrayList arrayListL = AbstractC2340Cl.l(jt.f3266a);
            C4531rw c4531rwA = this.f3000a.c.a();
            c4531rwA.m = arrayListL;
            this.b.e(new C4619sw(c4531rwA));
            this.f = true;
        } else if (this.g) {
            if (i != G00.a(this.e)) {
                int i3 = Ug0.f3833a;
                Locale locale = Locale.US;
                AbstractC4038mJ.f();
            }
            int iA = jt.a();
            this.b.d(iA, jt);
            this.b.a(FW.i0(this.d, j, this.c, 48000), 1, iA, 0, null);
        } else {
            FW.i(jt.c >= 8, "Comment Header has insufficient data");
            FW.i(jt.r(8, AbstractC2333Ce.c).equals("OpusTags"), "Comment Header should follow ID Header");
            this.g = true;
        }
        this.e = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void seek(long j, long j2) {
        this.c = j;
        this.d = j2;
    }
}
