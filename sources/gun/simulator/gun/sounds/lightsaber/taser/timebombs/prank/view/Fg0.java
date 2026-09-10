package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Fg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3079a;
    public final InterfaceC4326pd0[] b;

    public Fg0(List list) {
        this.f3079a = list;
        this.b = new InterfaceC4326pd0[list.size()];
    }

    public final void a(long j, JT jt) {
        if (jt.a() < 9) {
            return;
        }
        int iF = jt.f();
        int iF2 = jt.f();
        int iT = jt.t();
        if (iF == 434 && iF2 == 1195456820 && iT == 3) {
            AbstractC2845Vx.R(j, jt, this.b);
        }
    }

    public final void b(InterfaceC4353pt interfaceC4353pt, C4416qe0 c4416qe0) {
        int i = 0;
        while (true) {
            InterfaceC4326pd0[] interfaceC4326pd0Arr = this.b;
            if (i >= interfaceC4326pd0Arr.length) {
                return;
            }
            c4416qe0.a();
            c4416qe0.b();
            InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(c4416qe0.d, 3);
            C4619sw c4619sw = (C4619sw) this.f3079a.get(i);
            String str = c4619sw.l;
            FW.i(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption mime type provided: " + str);
            C4531rw c4531rw = new C4531rw();
            c4416qe0.b();
            c4531rw.f4954a = c4416qe0.e;
            c4531rw.k = str;
            c4531rw.d = c4619sw.d;
            c4531rw.c = c4619sw.c;
            c4531rw.C = c4619sw.D;
            c4531rw.m = c4619sw.n;
            interfaceC4326pd0Track.e(new C4619sw(c4531rw));
            interfaceC4326pd0Arr[i] = interfaceC4326pd0Track;
            i++;
        }
    }
}
