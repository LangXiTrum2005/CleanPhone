package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class W70 implements Map.Entry, Comparable {
    private final Comparable<Object> key;
    final /* synthetic */ Z70 this$0;
    private Object value;

    public W70(Z70 z70, Map.Entry<Comparable<Object>, Object> entry) {
        this(z70, entry.getKey(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return equals(this.key, entry.getKey()) && equals(this.value, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Comparable<Object> comparable = this.key;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.value;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        this.this$0.checkMutable();
        Object obj2 = this.value;
        this.value = obj;
        return obj2;
    }

    public String toString() {
        return this.key + "=" + this.value;
    }

    public W70(Z70 z70, Comparable<Object> comparable, Object obj) {
        this.this$0 = z70;
        this.key = comparable;
        this.value = obj;
    }

    @Override // java.lang.Comparable
    public int compareTo(W70 w70) {
        return getKey().compareTo(w70.getKey());
    }

    @Override // java.util.Map.Entry
    public Comparable<Object> getKey() {
        return this.key;
    }

    private boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
