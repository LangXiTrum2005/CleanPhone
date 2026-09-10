package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class O implements InterfaceC3255dQ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Set f3486a;
    public transient Collection b;
    public transient Map c;

    public boolean b(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map c();

    public abstract Set d();

    public abstract Iterator e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC3255dQ) {
            return a().equals(((InterfaceC3255dQ) obj).a());
        }
        return false;
    }

    public abstract Iterator f();

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3255dQ
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) a().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final String toString() {
        return a().toString();
    }
}
