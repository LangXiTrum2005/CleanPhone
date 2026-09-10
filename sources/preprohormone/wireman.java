package preprohormone;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PersistentOrderedSetIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lpreprohormone/wireman;", "E", "", "", "nextElement", "", "Lpreprohormone/attabal;", "map", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "", "saneness", "()V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "kowloon", "Ljava/lang/Object;", "arytenoidectomy", "Ljava/util/Map;", "getMap$runtime", "()Ljava/util/Map;", "", "monoploid", "I", "wireman", "()I", "marial", "(I)V", "index", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class wireman<E> implements Iterator<E>, unready.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final Map<E, attabal> map;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public Object nextElement;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public int index;

    public wireman(Object obj, Map<E, attabal> map) {
        this.nextElement = obj;
        this.map = map;
    }

    private final void saneness() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.map.size();
    }

    public final void marial(int i) {
        this.index = i;
    }

    @Override // java.util.Iterator
    public E next() {
        saneness();
        E e = (E) this.nextElement;
        this.index++;
        attabal attabalVar = this.map.get(e);
        if (attabalVar != null) {
            this.nextElement = attabalVar.getNext();
            return e;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final int getIndex() {
        return this.index;
    }
}
