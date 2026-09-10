package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4975x extends O implements Serializable {
    public transient Map d;
    public transient int e;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3255dQ
    public final Map a() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        Map mapC = c();
        this.c = mapC;
        return mapC;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3255dQ
    public final void clear() {
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.d.clear();
        this.e = 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O
    public final Iterator e() {
        return new C5063y(this, 1);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O
    public final Iterator f() {
        return new C5063y(this, 0);
    }

    public final Collection g() {
        return new N(this, 0);
    }

    public final boolean h(Double d, Integer num) {
        Collection collection = (Collection) this.d.get(d);
        if (collection != null) {
            if (!collection.add(num)) {
                return false;
            }
            this.e++;
            return true;
        }
        List list = (List) ((C3695iQ) this).f.get();
        if (!list.add(num)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.e++;
        this.d.put(d, list);
        return true;
    }

    public final Collection i() {
        Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        Collection collectionG = g();
        this.b = collectionG;
        return collectionG;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3255dQ
    public final int size() {
        return this.e;
    }
}
