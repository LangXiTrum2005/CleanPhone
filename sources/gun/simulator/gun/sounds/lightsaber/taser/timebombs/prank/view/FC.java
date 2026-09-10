package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FC implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient C4141nY f3057a;
    public transient C4229oY b;
    public transient C4317pY c;

    public static EC a() {
        return new EC(4);
    }

    public static FC b(Map map) {
        if ((map instanceof FC) && !(map instanceof SortedMap)) {
            FC fc = (FC) map;
            fc.getClass();
            return fc;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        boolean z = setEntrySet instanceof Collection;
        EC ec = new EC(z ? setEntrySet.size() : 4);
        if (z) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = ec.f3014a;
            if (size > objArr.length) {
                ec.f3014a = Arrays.copyOf(objArr, AbstractC2995aW.y(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            ec.b(entry.getKey(), entry.getValue());
        }
        return ec.a();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final KC entrySet() {
        C4141nY c4141nY = this.f3057a;
        if (c4141nY != null) {
            return c4141nY;
        }
        C4405qY c4405qY = (C4405qY) this;
        C4141nY c4141nY2 = new C4141nY(c4405qY, c4405qY.e, c4405qY.f);
        this.f3057a = c4141nY2;
        return c4141nY2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final KC keySet() {
        C4229oY c4229oY = this.b;
        if (c4229oY != null) {
            return c4229oY;
        }
        C4405qY c4405qY = (C4405qY) this;
        C4229oY c4229oY2 = new C4229oY(c4405qY, new C4317pY(c4405qY.e, 0, c4405qY.f));
        this.b = c4229oY2;
        return c4229oY2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return FW.D(this, obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final AbstractC4822vC values() {
        C4317pY c4317pY = this.c;
        if (c4317pY != null) {
            return c4317pY;
        }
        C4405qY c4405qY = (C4405qY) this;
        C4317pY c4317pY2 = new C4317pY(c4405qY.e, 1, c4405qY.f);
        this.c = c4317pY2;
        return c4317pY2;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC2995aW.R(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((C4405qY) this).size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i = ((C4405qY) this).f;
        FW.n(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
