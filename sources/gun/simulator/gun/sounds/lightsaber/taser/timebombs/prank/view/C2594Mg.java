package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2594Mg extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3415a;
    public final /* synthetic */ C2698Qg b;

    public /* synthetic */ C2594Mg(C2698Qg c2698Qg, int i) {
        this.f3415a = i;
        this.b = c2698Qg;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f3415a;
        C2698Qg c2698Qg = this.b;
        switch (i) {
            case 0:
                c2698Qg.clear();
                break;
            default:
                c2698Qg.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.f3415a;
        C2698Qg c2698Qg = this.b;
        switch (i) {
            case 0:
                Map mapC = c2698Qg.c();
                if (mapC != null) {
                    return mapC.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iF = c2698Qg.f(entry.getKey());
                    if (iF != -1 && FW.B(c2698Qg.l()[iF], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return c2698Qg.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f3415a;
        C2698Qg c2698Qg = this.b;
        switch (i) {
            case 0:
                Map mapC = c2698Qg.c();
                return mapC != null ? mapC.entrySet().iterator() : new C2569Lg(c2698Qg, 1);
            default:
                Map mapC2 = c2698Qg.c();
                return mapC2 != null ? mapC2.keySet().iterator() : new C2569Lg(c2698Qg, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.f3415a;
        C2698Qg c2698Qg = this.b;
        switch (i) {
            case 0:
                Map mapC = c2698Qg.c();
                if (mapC != null) {
                    return mapC.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (c2698Qg.h()) {
                    return false;
                }
                int iD = c2698Qg.d();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = c2698Qg.f3614a;
                Objects.requireNonNull(obj2);
                int iT = FW.T(key, value, iD, obj2, c2698Qg.j(), c2698Qg.k(), c2698Qg.l());
                if (iT == -1) {
                    return false;
                }
                c2698Qg.g(iT, iD);
                c2698Qg.f--;
                c2698Qg.e += 32;
                return true;
            default:
                Map mapC2 = c2698Qg.c();
                if (mapC2 != null) {
                    return mapC2.keySet().remove(obj);
                }
                return c2698Qg.i(obj) != C2698Qg.j;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.f3415a;
        C2698Qg c2698Qg = this.b;
        switch (i) {
            case 0:
                break;
        }
        return c2698Qg.size();
    }
}
