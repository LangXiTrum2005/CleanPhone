package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class Z60 extends G9 {
    public final C4868vl h;
    public final InterfaceC4341pl i;
    public final C4619sw j;
    public final long k = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public final G7 l;
    public final boolean m;
    public final S60 n;
    public final C3693iO o;
    public Bd0 p;

    public Z60(String str, C3517gO c3517gO, InterfaceC4341pl interfaceC4341pl, G7 g7, boolean z, Object obj) {
        C3341eO c3341eO;
        this.i = interfaceC4341pl;
        this.l = g7;
        this.m = z;
        WN wn = new WN();
        ZN zn = new ZN();
        List listEmptyList = Collections.emptyList();
        C3965lY c3965lY = C3965lY.e;
        C3429fO c3429fO = C3429fO.d;
        Uri uri = Uri.EMPTY;
        String string = c3517gO.f4413a.toString();
        string.getClass();
        AC acJ = AC.j(AC.p(c3517gO));
        FW.s(zn.b == null || zn.f4068a != null);
        if (uri != null) {
            c3341eO = new C3341eO(uri, null, zn.f4068a != null ? new C2987aO(zn) : null, listEmptyList, null, acJ, obj);
        } else {
            c3341eO = null;
        }
        C3693iO c3693iO = new C3693iO(string, new YN(wn), c3341eO, new C3164cO(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f), C3955lO.I, c3429fO);
        this.o = c3693iO;
        C4531rw c4531rw = new C4531rw();
        String str2 = c3517gO.b;
        c4531rw.k = str2 == null ? "text/x-unknown" : str2;
        c4531rw.c = c3517gO.c;
        c4531rw.d = c3517gO.d;
        c4531rw.e = c3517gO.e;
        c4531rw.b = c3517gO.f;
        String str3 = c3517gO.g;
        c4531rw.f4954a = str3 == null ? str : str3;
        this.j = new C4619sw(c4531rw);
        Map mapEmptyMap = Collections.emptyMap();
        Uri uri2 = c3517gO.f4413a;
        FW.u(uri2, "The uri must be set.");
        this.h = new C4868vl(uri2, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1, null);
        this.n = new S60(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, true, false, c3693iO);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final InterfaceC4395qO b(C5186zO c5186zO, C2833Vl c2833Vl, long j) {
        Bd0 bd0 = this.p;
        DO doA = a(c5186zO);
        return new X60(this.h, this.i, bd0, this.j, this.k, this.l, doA, this.m);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final C3693iO k() {
        return this.o;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void o(Bd0 bd0) {
        this.p = bd0;
        p(this.n);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void q(InterfaceC4395qO interfaceC4395qO) {
        ((X60) interfaceC4395qO).i.e(null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void m() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void s() {
    }
}
