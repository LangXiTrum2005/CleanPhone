package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2697Qf extends AbstractC2671Pf {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        AbstractC2995aW.q(collection, "<this>");
        return collection.iterator();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        AbstractC2995aW.q(collection, "<this>");
        return collection.size();
    }
}
