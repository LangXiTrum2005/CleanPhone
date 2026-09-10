package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3559gp implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4434a;
    public final long b;
    public final List c;
    public final /* synthetic */ C3821jp d;

    public C3559gp(C3821jp c3821jp, String str, long j, ArrayList arrayList, long[] jArr) {
        AbstractC2995aW.q(c3821jp, "this$0");
        AbstractC2995aW.q(str, "key");
        AbstractC2995aW.q(jArr, "lengths");
        this.d = c3821jp;
        this.f4434a = str;
        this.b = j;
        this.c = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            Vg0.c((InterfaceC3588h80) it.next());
        }
    }
}
