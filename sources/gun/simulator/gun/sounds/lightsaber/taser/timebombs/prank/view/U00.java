package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class U00 implements InterfaceC4353pt, JI, U20, Q00, P00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y00 f3804a;

    public U00(Y00 y00) {
        this.f3804a = y00;
    }

    public final void b(long j, AC ac) {
        Y00 y00;
        ArrayList arrayList = new ArrayList(ac.size());
        for (int i = 0; i < ac.size(); i++) {
            String path = ((C3748j10) ac.get(i)).c.getPath();
            FW.o(path);
            arrayList.add(path);
        }
        int i2 = 0;
        while (true) {
            y00 = this.f3804a;
            if (i2 >= y00.f.size()) {
                break;
            }
            if (!arrayList.contains(((V00) y00.f.get(i2)).a().getPath())) {
                y00.g.f();
                if (Y00.h(y00)) {
                    y00.q = true;
                    y00.n = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                    y00.m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                    y00.o = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                }
            }
            i2++;
        }
        for (int i3 = 0; i3 < ac.size(); i3++) {
            C3748j10 c3748j10 = (C3748j10) ac.get(i3);
            C5065y00 c5065y00M = Y00.m(y00, c3748j10.c);
            if (c5065y00M != null) {
                long j2 = c3748j10.f4531a;
                c5065y00M.c(j2);
                c5065y00M.b(c3748j10.b);
                if (Y00.h(y00) && y00.n == y00.m) {
                    c5065y00M.a(j, j2);
                }
            }
        }
        if (!Y00.h(y00)) {
            if (y00.o == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || !y00.v) {
                return;
            }
            y00.seekToUs(y00.o);
            y00.o = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            return;
        }
        if (y00.n == y00.m) {
            y00.n = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            y00.m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        } else {
            y00.n = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            y00.seekToUs(y00.m);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final void c(LI li, long j, long j2) {
        C5065y00 c5065y00 = (C5065y00) li;
        Y00 y00 = this.f3804a;
        if (y00.getBufferedPositionUs() == 0) {
            if (y00.v) {
                return;
            }
            Y00.t(y00);
            y00.v = true;
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = y00.e;
            if (i >= arrayList.size()) {
                return;
            }
            W00 w00 = (W00) arrayList.get(i);
            if (w00.f3903a.b == c5065y00) {
                w00.c();
                return;
            }
            i++;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final /* bridge */ /* synthetic */ void d(LI li, long j, long j2, boolean z) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final C2868Wu e(LI li, long j, long j2, IOException iOException, int i) {
        C5065y00 c5065y00 = (C5065y00) li;
        Y00 y00 = this.f3804a;
        if (!y00.s) {
            y00.k = iOException;
        } else if (iOException.getCause() instanceof BindException) {
            int i2 = y00.u;
            y00.u = i2 + 1;
            if (i2 < 3) {
                return OI.d;
            }
        } else {
            y00.l = new C3124bu(c5065y00.b.b.toString(), iOException);
        }
        return OI.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4353pt
    public final void endTracks() {
        Y00 y00 = this.f3804a;
        y00.b.post(new T00(y00, 0));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U20
    public final void f() {
        Y00 y00 = this.f3804a;
        y00.b.post(new T00(y00, 1));
    }

    public final void g(String str, IOException iOException) {
        this.f3804a.k = iOException == null ? new IOException(str) : new IOException(str, iOException);
    }

    public final void h(C3662i10 c3662i10, C3965lY c3965lY) {
        int i = 0;
        while (true) {
            int size = c3965lY.size();
            Y00 y00 = this.f3804a;
            if (i >= size) {
                y00.g.g(c3662i10);
                return;
            }
            W00 w00 = new W00(y00, (C2956a10) c3965lY.get(i), i, y00.h);
            y00.e.add(w00);
            w00.d();
            i++;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4353pt
    public final InterfaceC4326pd0 track(int i, int i2) {
        W00 w00 = (W00) this.f3804a.e.get(i);
        w00.getClass();
        return w00.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4353pt
    public final void a(O30 o30) {
    }
}
