package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.t4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4632t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f5013a = new CopyOnWriteArraySet();
    public static final Map b;

    static {
        Map linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Package r2 = C4838vS.class.getPackage();
        String name = r2 == null ? null : r2.getName();
        if (name != null) {
            linkedHashMap2.put(name, "OkHttp");
        }
        linkedHashMap2.put(C4838vS.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap2.put(AbstractC4644tA.class.getName(), "okhttp.Http2");
        linkedHashMap2.put(C4497rb0.class.getName(), "okhttp.TaskRunner");
        linkedHashMap2.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap2.size();
        if (size != 0) {
            linkedHashMap = size != 1 ? new LinkedHashMap(linkedHashMap2) : AbstractC3375el.c0(linkedHashMap2);
        } else {
            linkedHashMap = C2838Vq.f3896a;
        }
        b = linkedHashMap;
    }
}
