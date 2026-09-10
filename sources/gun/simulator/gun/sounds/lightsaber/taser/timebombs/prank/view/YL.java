package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class YL implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2985aM f4015a;
    public final int b;

    public YL(C2985aM c2985aM, int i) {
        AbstractC2995aW.q(c2985aM, "map");
        this.f4015a = c2985aM;
        this.b = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC2995aW.i(entry.getKey(), getKey()) && AbstractC2995aW.i(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4015a.f4119a[this.b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f4015a.b;
        AbstractC2995aW.n(objArr);
        return objArr[this.b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C2985aM c2985aM = this.f4015a;
        c2985aM.b();
        Object[] objArr = c2985aM.b;
        if (objArr == null) {
            int length = c2985aM.f4119a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
            objArr = new Object[length];
            c2985aM.b = objArr;
        }
        int i = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
