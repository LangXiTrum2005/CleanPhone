package gintrap;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AbstractListIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010*\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\b!\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"Lgintrap/attabal;", "E", "", "", "index", "size", "<init>", "(II)V", "", "hasNext", "()Z", "hasPrevious", "nextIndex", "()I", "previousIndex", "", "saneness", "()V", "wireman", "kowloon", "I", "marial", "competently", "(I)V", "arytenoidectomy", "beachfront", "impromptu", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class attabal<E> implements ListIterator<E>, unready.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public int index;

    public attabal(int i, int i2) {
        this.index = i;
        this.size = i2;
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final void competently(int i) {
        this.index = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.index < this.size;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.index > 0;
    }

    public final void impromptu(int i) {
        this.size = i;
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.index;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.index - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void saneness() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void wireman() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }
}
