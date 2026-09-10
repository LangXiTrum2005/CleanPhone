package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.app.NotificationCompat;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class LX {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3355a;
    public final long b;
    public final C4234ob0 c;
    public final C3734ip d;
    public final ConcurrentLinkedQueue e;

    public LX(C4497rb0 c4497rb0, TimeUnit timeUnit) {
        AbstractC2995aW.q(c4497rb0, "taskRunner");
        AbstractC2995aW.q(timeUnit, "timeUnit");
        this.f3355a = 5;
        this.b = timeUnit.toNanos(5L);
        this.c = c4497rb0.f();
        this.d = new C3734ip(1, this, AbstractC2995aW.v0(" ConnectionPool", Vg0.g));
        this.e = new ConcurrentLinkedQueue();
    }

    public final boolean a(C3048b3 c3048b3, IX ix, List list, boolean z) {
        AbstractC2995aW.q(c3048b3, "address");
        AbstractC2995aW.q(ix, NotificationCompat.CATEGORY_CALL);
        for (KX kx : this.e) {
            AbstractC2995aW.p(kx, "connection");
            synchronized (kx) {
                if (z) {
                    if (kx.g == null) {
                        continue;
                    }
                }
                if (kx.i(c3048b3, list)) {
                    ix.b(kx);
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(KX kx, long j) {
        byte[] bArr = Vg0.f3884a;
        ArrayList arrayList = kx.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + kx.b.f4578a.i + " was leaked. Did you forget to close a response body?";
                C5104yU c5104yU = C5104yU.f5278a;
                C5104yU.f5278a.j(((GX) reference).f3126a, str);
                arrayList.remove(i);
                kx.j = true;
                if (arrayList.isEmpty()) {
                    kx.q = j - this.b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
