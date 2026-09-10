package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class X70 implements Iterator {
    private Iterator<Map.Entry<Comparable<Object>, Object>> lazyOverflowIterator;
    private boolean nextCalledBeforeRemove;
    private int pos;
    final /* synthetic */ Z70 this$0;

    private X70(Z70 z70) {
        this.this$0 = z70;
        this.pos = -1;
    }

    private Iterator<Map.Entry<Comparable<Object>, Object>> getOverflowIterator() {
        if (this.lazyOverflowIterator == null) {
            this.lazyOverflowIterator = this.this$0.overflowEntries.entrySet().iterator();
        }
        return this.lazyOverflowIterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.pos + 1 >= this.this$0.entryList.size()) {
            return !this.this$0.overflowEntries.isEmpty() && getOverflowIterator().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public Map.Entry<Comparable<Object>, Object> next() {
        this.nextCalledBeforeRemove = true;
        int i = this.pos + 1;
        this.pos = i;
        return i < this.this$0.entryList.size() ? (Map.Entry) this.this$0.entryList.get(this.pos) : getOverflowIterator().next();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.nextCalledBeforeRemove) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.nextCalledBeforeRemove = false;
        this.this$0.checkMutable();
        if (this.pos >= this.this$0.entryList.size()) {
            getOverflowIterator().remove();
            return;
        }
        Z70 z70 = this.this$0;
        int i = this.pos;
        this.pos = i - 1;
        z70.removeArrayEntryAt(i);
    }

    public /* synthetic */ X70(Z70 z70, Q70 q70) {
        this(z70);
    }
}
