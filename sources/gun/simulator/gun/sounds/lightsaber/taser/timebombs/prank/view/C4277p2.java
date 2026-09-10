package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4277p2 extends OF {
    public static final C4277p2 INSTANCE = new C4277p2();

    private C4277p2() {
        super(WD.d(new T5(W90.f3912a, 0)));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OF
    public AbstractC4122nF transformDeserialize(AbstractC4122nF abstractC4122nF) {
        AbstractC2995aW.q(abstractC4122nF, "element");
        FF ff = abstractC4122nF instanceof FF ? (FF) abstractC4122nF : null;
        if (ff == null) {
            AbstractC4496rb.o("JsonObject", abstractC4122nF);
            throw null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ff.f3060a.entrySet()) {
            if (!AbstractC2995aW.i((String) entry.getKey(), "moat")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new FF(linkedHashMap);
    }
}
