package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class MT implements LI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3405a;
    public final C4868vl b;
    public final int c;
    public final B90 d;
    public final LT e;
    public volatile Object f;

    public MT(InterfaceC4429ql interfaceC4429ql, Uri uri, int i, LT lt) {
        Map mapEmptyMap = Collections.emptyMap();
        FW.u(uri, "The uri must be set.");
        C4868vl c4868vl = new C4868vl(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1, null);
        this.d = new B90(interfaceC4429ql);
        this.b = c4868vl;
        this.c = i;
        this.e = lt;
        this.f3405a = FI.f3063a.getAndIncrement();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LI
    public final void load() {
        this.d.b = 0L;
        C4692tl c4692tl = new C4692tl(this.d, this.b);
        try {
            c4692tl.h();
            Uri uri = this.d.f2861a.getUri();
            uri.getClass();
            this.f = this.e.l(uri, c4692tl);
        } finally {
            Ug0.h(c4692tl);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LI
    public final void cancelLoad() {
    }
}
