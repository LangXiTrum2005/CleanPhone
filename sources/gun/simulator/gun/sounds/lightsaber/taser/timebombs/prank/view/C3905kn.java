package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3905kn extends AbstractC4707tw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f4615a;

    public C3905kn(Map map) {
        this.f4615a = map;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f4615a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((C4899w50) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (obj.equals(((Map.Entry) it.next()).getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4707tw, java.util.Map
    public final Set entrySet() {
        return AbstractC2995aW.B(super.entrySet(), new Aa0(3));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && FW.D(this, obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f4615a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC2995aW.R(entrySet());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4707tw, java.util.Map
    public final boolean isEmpty() {
        if (super.isEmpty()) {
            return true;
        }
        return super.size() == 1 && this.f4615a.containsKey(null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4707tw, java.util.Map
    public final Set keySet() {
        return AbstractC2995aW.B(super.keySet(), new Aa0(2));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4707tw, java.util.Map
    public final int size() {
        return super.size() - (this.f4615a.containsKey(null) ? 1 : 0);
    }
}
