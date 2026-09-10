package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class B extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient C5151z f2847a;
    public transient C2672Pg b;
    public final transient Map c;
    public final /* synthetic */ AbstractC4975x d;

    public B(AbstractC4975x abstractC4975x, Map map) {
        this.d = abstractC4975x;
        this.c = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Set entrySet() {
        C5151z c5151z = this.f2847a;
        if (c5151z != null) {
            return c5151z;
        }
        C5151z c5151z2 = new C5151z(this);
        this.f2847a = c5151z2;
        return c5151z2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Collection values() {
        C2672Pg c2672Pg = this.b;
        if (c2672Pg != null) {
            return c2672Pg;
        }
        C2672Pg c2672Pg2 = new C2672Pg(this);
        this.b = c2672Pg2;
        return c2672Pg2;
    }

    public final C4910wC c(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        AbstractC4975x abstractC4975x = this.d;
        abstractC4975x.getClass();
        List list = (List) collection;
        return new C4910wC(key, list instanceof RandomAccess ? new G(abstractC4975x, key, list, null) : new L(abstractC4975x, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        AbstractC4975x abstractC4975x = this.d;
        if (this.c == abstractC4975x.d) {
            abstractC4975x.clear();
            return;
        }
        A a2 = new A(this);
        while (a2.hasNext()) {
            a2.next();
            a2.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        AbstractC4975x abstractC4975x = this.d;
        abstractC4975x.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new G(abstractC4975x, obj, list, null) : new L(abstractC4975x, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        AbstractC4975x abstractC4975x = this.d;
        Set set = abstractC4975x.f3486a;
        if (set != null) {
            return set;
        }
        Set setD = abstractC4975x.d();
        abstractC4975x.f3486a = setD;
        return setD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.c.remove(obj);
        if (collection == null) {
            return null;
        }
        AbstractC4975x abstractC4975x = this.d;
        List list = (List) ((C3695iQ) abstractC4975x).f.get();
        list.addAll(collection);
        abstractC4975x.e -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.c.toString();
    }
}
