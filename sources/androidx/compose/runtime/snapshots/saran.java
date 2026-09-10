package androidx.compose.runtime.snapshots;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.Unit;

/* JADX INFO: compiled from: SnapshotStateSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010 \u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u001fR*\u0010\u000f\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b!\u0010\u001c\u0012\u0004\b$\u0010\u000b\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u001fR\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006-"}, d2 = {"Landroidx/compose/runtime/snapshots/saran;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "set", "", "iterator", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateSet;Ljava/util/Iterator;)V", "", "wireman", "()V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "remove", "saneness", "kowloon", "Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "getSet", "()Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "arytenoidectomy", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "monoploid", "Ljava/lang/Object;", "getCurrent", "setCurrent", "(Ljava/lang/Object;)V", "current", "polloi", "getNext", "setNext", "getNext$annotations", "", "molybdenite", "I", "getModification", "()I", "setModification", "(I)V", "modification", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class saran<T> implements Iterator<T>, unready.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final Iterator<T> iterator;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final SnapshotStateSet<T> set;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public int modification;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public T current;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public T next;

    /* JADX WARN: Multi-variable type inference failed */
    public saran(SnapshotStateSet<T> snapshotStateSet, Iterator<? extends T> it) {
        this.set = snapshotStateSet;
        this.iterator = it;
        this.modification = kattegat.dern(snapshotStateSet);
        saneness();
    }

    private final void wireman() {
        if (kattegat.dern(this.set) != this.modification) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.next != null;
    }

    @Override // java.util.Iterator
    public T next() {
        wireman();
        saneness();
        T t = this.current;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public void remove() {
        wireman();
        T t = this.current;
        if (t == null) {
            throw new IllegalStateException();
        }
        this.set.remove(t);
        this.current = null;
        Unit unit = Unit.f29295attabal;
        this.modification = kattegat.dern(this.set);
    }

    public final void saneness() {
        this.current = this.next;
        this.next = this.iterator.hasNext() ? this.iterator.next() : null;
    }
}
