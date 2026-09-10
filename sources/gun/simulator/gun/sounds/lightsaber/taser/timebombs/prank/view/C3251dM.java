package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3251dM implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4267a;
    public final Object b;

    public C3251dM(Object obj, Object obj2) {
        this.f4267a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3251dM)) {
            return false;
        }
        C3251dM c3251dM = (C3251dM) obj;
        return AbstractC2995aW.i(this.f4267a, c3251dM.f4267a) && AbstractC2995aW.i(this.b, c3251dM.b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4267a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f4267a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f4267a + ", value=" + this.b + ')';
    }
}
