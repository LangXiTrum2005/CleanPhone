package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class R70 implements Iterator {
    private Iterator<Map.Entry<Comparable<Object>, Object>> lazyOverflowIterator;
    private int pos;
    final /* synthetic */ Z70 this$0;

    private R70(Z70 z70) {
        this.this$0 = z70;
        this.pos = z70.entryList.size();
    }

    private Iterator<Map.Entry<Comparable<Object>, Object>> getOverflowIterator() {
        if (this.lazyOverflowIterator == null) {
            this.lazyOverflowIterator = this.this$0.overflowEntriesDescending.entrySet().iterator();
        }
        return this.lazyOverflowIterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i = this.pos;
        return (i > 0 && i <= this.this$0.entryList.size()) || getOverflowIterator().hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public Map.Entry<Comparable<Object>, Object> next() {
        if (getOverflowIterator().hasNext()) {
            return getOverflowIterator().next();
        }
        List list = this.this$0.entryList;
        int i = this.pos - 1;
        this.pos = i;
        return (Map.Entry) list.get(i);
    }

    public /* synthetic */ R70(Z70 z70, Q70 q70) {
        this(z70);
    }
}
