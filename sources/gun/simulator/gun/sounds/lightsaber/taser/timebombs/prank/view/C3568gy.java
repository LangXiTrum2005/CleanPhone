package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3568gy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f4439a;

    public C3568gy() {
        this.f4439a = new ConcurrentHashMap(1);
    }

    public final Object a(D40 d40, AF af) {
        C3887ke c3887ke = BF.f2862a;
        AbstractC2995aW.q(d40, "descriptor");
        Map map = this.f4439a;
        Map map2 = (Map) map.get(d40);
        Object obj = map2 != null ? map2.get(c3887ke) : null;
        Object obj2 = obj != null ? obj : null;
        if (obj2 != null) {
            return obj2;
        }
        Object objInvoke = af.invoke();
        Object concurrentHashMap = map.get(d40);
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap(1);
            map.put(d40, concurrentHashMap);
        }
        ((Map) concurrentHashMap).put(c3887ke, objInvoke);
        return objInvoke;
    }

    public C3568gy(C4165nl c4165nl) {
        this.f4439a = Collections.unmodifiableMap(new HashMap(c4165nl.f4758a));
    }
}
