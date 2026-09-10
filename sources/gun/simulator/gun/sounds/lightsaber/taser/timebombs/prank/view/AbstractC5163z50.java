package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.z50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5163z50 extends AbstractC2995aW {
    public static LinkedHashSet G0(Set set, Set set2) {
        AbstractC2995aW.q(set, "<this>");
        AbstractC2995aW.q(set2, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC3375el.N(set.size() + Integer.valueOf(set2.size()).intValue()));
        linkedHashSet.addAll(set);
        AbstractC2801Uf.a0(set2, linkedHashSet);
        return linkedHashSet;
    }
}
