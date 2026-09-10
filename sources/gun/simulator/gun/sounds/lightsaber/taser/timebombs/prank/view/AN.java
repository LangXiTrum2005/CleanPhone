package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class AN implements FN, InterfaceC4441qt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4619sw f2814a;

    public /* synthetic */ AN(C4619sw c4619sw) {
        this.f2814a = c4619sw;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FN
    public final int a(Object obj) {
        C4745uN c4745uN = (C4745uN) obj;
        c4745uN.getClass();
        C4619sw c4619sw = this.f2814a;
        String str = c4619sw.l;
        String str2 = c4745uN.b;
        return ((str2.equals(str) || str2.equals(GN.b(c4619sw))) && c4745uN.c(c4619sw, false)) ? 1 : 0;
    }

    public final InterfaceC4177nt[] b() {
        InterfaceC4177nt[] interfaceC4177ntArr = new InterfaceC4177nt[1];
        C2443Gk c2443Gk = InterfaceC4759ua0.f5085a;
        C4619sw c4619sw = this.f2814a;
        interfaceC4177ntArr[0] = c2443Gk.f(c4619sw) ? new C4847va0(c2443Gk.d(c4619sw), c4619sw) : new C5224zn(c4619sw);
        return interfaceC4177ntArr;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4441qt
    public final InterfaceC4177nt[] d(Uri uri, Map map) {
        return b();
    }
}
