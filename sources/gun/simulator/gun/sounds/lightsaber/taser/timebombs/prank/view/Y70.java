package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class Y70 extends AbstractSet {
    final /* synthetic */ Z70 this$0;

    private Y70(Z70 z70) {
        this.this$0 = z70;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.this$0.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.this$0.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Comparable<Object>, Object>> iterator() {
        return new X70(this.this$0, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.this$0.remove(entry.getKey());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.this$0.size();
    }

    public /* synthetic */ Y70(Z70 z70, Q70 q70) {
        this(z70);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Map.Entry<Comparable<Object>, Object> entry) {
        if (contains(entry)) {
            return false;
        }
        this.this$0.put(entry.getKey(), entry.getValue());
        return true;
    }
}
