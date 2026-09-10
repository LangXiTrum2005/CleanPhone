package androidx.compose.runtime.snapshots;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotStateList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010%\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010 ¨\u0006&"}, d2 = {"Landroidx/compose/runtime/snapshots/restrictive;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "list", "", "offset", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;I)V", "", "hasPrevious", "()Z", "nextIndex", "()I", "previous", "()Ljava/lang/Object;", "previousIndex", "element", "", "add", "(Ljava/lang/Object;)V", "hasNext", "next", "remove", "()V", "set", "saneness", "kowloon", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "arytenoidectomy", "I", "index", "monoploid", "lastRequested", "polloi", "structure", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class restrictive<T> implements ListIterator<T>, unready.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public int index;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final SnapshotStateList<T> list;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public int lastRequested = -1;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public int structure;

    public restrictive(SnapshotStateList<T> snapshotStateList, int i) {
        this.list = snapshotStateList;
        this.index = i - 1;
        this.structure = cord.impromptu(snapshotStateList);
    }

    @Override // java.util.ListIterator
    public void add(T element) {
        saneness();
        this.list.add(this.index + 1, element);
        this.lastRequested = -1;
        this.index++;
        this.structure = cord.impromptu(this.list);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.index < this.list.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.index >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        saneness();
        int i = this.index + 1;
        this.lastRequested = i;
        cord.impassible(i, this.list.size());
        T t = this.list.get(i);
        this.index = i;
        return t;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.index + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        saneness();
        cord.impassible(this.index, this.list.size());
        int i = this.index;
        this.lastRequested = i;
        T t = this.list.get(i);
        this.index--;
        return t;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.index;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        saneness();
        this.list.remove(this.lastRequested);
        this.index--;
        this.lastRequested = -1;
        this.structure = cord.impromptu(this.list);
    }

    public final void saneness() {
        if (cord.impromptu(this.list) != this.structure) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public void set(T element) {
        saneness();
        int i = this.lastRequested;
        if (i < 0) {
            cord.taiyuan();
            throw new KotlinNothingValueException();
        }
        this.list.set(i, element);
        this.structure = cord.impromptu(this.list);
    }
}
