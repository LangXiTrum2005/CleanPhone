package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class V1 implements JS {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JS
    public final void a(int i) {
        ConcurrentHashMap concurrentHashMap = W1.f3904a;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry != null && entry.getValue() != null) {
                ((JS) entry.getValue()).a(i);
            }
        }
    }
}
