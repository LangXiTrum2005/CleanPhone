package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.util.ArrayList;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class Z00 extends G9 {
    public final C3693iO h;
    public final InterfaceC4889w00 i;
    public final String j;
    public final Uri k;
    public final SocketFactory l;
    public final boolean m;
    public long n;
    public boolean o;
    public boolean p;
    public boolean q;

    static {
        AbstractC2944Zs.a("goog.exo.rtsp");
    }

    public Z00(C3693iO c3693iO, C2868Wu c2868Wu, String str, SocketFactory socketFactory) {
        this.h = c3693iO;
        this.i = c2868Wu;
        this.j = str;
        C3341eO c3341eO = c3693iO.b;
        c3341eO.getClass();
        this.k = c3341eO.f4269a;
        this.l = socketFactory;
        this.m = false;
        this.n = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.q = true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final InterfaceC4395qO b(C5186zO c5186zO, C2833Vl c2833Vl, long j) {
        C4559sD c4559sD = new C4559sD(this);
        return new Y00(c2833Vl, this.i, this.k, c4559sD, this.j, this.l, this.m);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final C3693iO k() {
        return this.h;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void o(Bd0 bd0) {
        v();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void q(InterfaceC4395qO interfaceC4395qO) {
        Y00 y00 = (Y00) interfaceC4395qO;
        int i = 0;
        while (true) {
            ArrayList arrayList = y00.e;
            if (i >= arrayList.size()) {
                Ug0.h(y00.d);
                y00.r = true;
                return;
            }
            W00 w00 = (W00) arrayList.get(i);
            if (!w00.e) {
                w00.b.e(null);
                w00.c.B();
                w00.e = true;
            }
            i++;
        }
    }

    public final void v() {
        S60 s60 = new S60(this.n, this.o, this.p, this.h);
        Gc0 c3613hW = s60;
        if (this.q) {
            c3613hW = new C3613hW(s60, 1);
        }
        p(c3613hW);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void m() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void s() {
    }
}
