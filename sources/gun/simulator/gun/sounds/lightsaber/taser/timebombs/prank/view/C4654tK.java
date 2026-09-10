package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4654tK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5030a = new LinkedHashMap(100, 0.75f, true);
    public final long b;
    public long c;

    public C4654tK(long j) {
        this.b = j;
    }

    public final synchronized Object a(Object obj) {
        C4566sK c4566sK;
        c4566sK = (C4566sK) this.f5030a.get(obj);
        return c4566sK != null ? c4566sK.f4973a : null;
    }

    public int b(Object obj) {
        return 1;
    }

    public final synchronized Object d(Object obj, Object obj2) {
        int iB = b(obj2);
        long j = iB;
        if (j >= this.b) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.c += j;
        }
        C4566sK c4566sK = (C4566sK) this.f5030a.put(obj, obj2 == null ? null : new C4566sK(obj2, iB));
        if (c4566sK != null) {
            this.c -= (long) c4566sK.b;
            if (!c4566sK.f4973a.equals(obj2)) {
                c(obj, c4566sK.f4973a);
            }
        }
        e(this.b);
        return c4566sK != null ? c4566sK.f4973a : null;
    }

    public final synchronized void e(long j) {
        while (this.c > j) {
            Iterator it = this.f5030a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C4566sK c4566sK = (C4566sK) entry.getValue();
            this.c -= (long) c4566sK.b;
            Object key = entry.getKey();
            it.remove();
            c(key, c4566sK.f4973a);
        }
    }

    public void c(Object obj, Object obj2) {
    }
}
