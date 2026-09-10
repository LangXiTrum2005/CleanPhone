package ads_mobile_sdk;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e53 implements Iterator, unready.attabal {
    public final /* synthetic */ Iterator a;
    public final /* synthetic */ Iterator b;

    public e53(Iterator it) {
        this.b = it;
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return new g53((Map.Entry) this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
