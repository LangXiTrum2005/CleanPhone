package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class W00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V00 f3903a;
    public final OI b;
    public final V20 c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ Y00 f;

    public W00(Y00 y00, C2956a10 c2956a10, int i, InterfaceC4889w00 interfaceC4889w00) {
        this.f = y00;
        this.f3903a = new V00(y00, c2956a10, i, interfaceC4889w00);
        this.b = new OI(AbstractC3950lJ.p("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper ", i));
        V20 v20 = new V20(y00.f4002a, null, null);
        this.c = v20;
        v20.f = y00.c;
    }

    public final void c() {
        if (this.d) {
            return;
        }
        this.f3903a.b.h = true;
        this.d = true;
        Y00 y00 = this.f;
        y00.p = true;
        int i = 0;
        while (true) {
            ArrayList arrayList = y00.e;
            if (i >= arrayList.size()) {
                return;
            }
            y00.p = ((W00) arrayList.get(i)).d & y00.p;
            i++;
        }
    }

    public final void d() {
        this.b.f(this.f3903a.b, this.f.c, 0);
    }
}
