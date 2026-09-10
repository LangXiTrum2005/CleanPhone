package co;

import java.util.NoSuchElementException;
import p002kotlin.Metadata;
import p002kotlin.collections.kattegat;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"Lco/wireman;", "Lkotlin/collections/kattegat;", "", "first", "last", "step", "<init>", "(III)V", "", "hasNext", "()Z", "nextInt", "()I", "kowloon", "I", "getStep", "arytenoidectomy", "finalElement", "monoploid", "Z", "polloi", "next", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class wireman extends kattegat {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final int finalElement;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final int step;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public boolean hasNext;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public int next;

    public wireman(int i, int i2, int i3) {
        this.step = i3;
        this.finalElement = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.hasNext = z;
        this.next = z ? i : i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // p002kotlin.collections.kattegat
    public int nextInt() {
        int i = this.next;
        if (i != this.finalElement) {
            this.next = this.step + i;
            return i;
        }
        if (!this.hasNext) {
            throw new NoSuchElementException();
        }
        this.hasNext = false;
        return i;
    }
}
