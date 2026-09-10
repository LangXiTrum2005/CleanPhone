package androidx.collection;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/IndexBasedArrayIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class IndexBasedArrayIterator<T> implements Iterator<T>, KMutableIterator {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f3741Y;
    public boolean Z;

    public IndexBasedArrayIterator(int i2) {
        this.X = i2;
    }

    public abstract Object a(int i2);

    public abstract void c(int i2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3741Y < this.X;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a(this.f3741Y);
        this.f3741Y++;
        this.Z = true;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.Z) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i2 = this.f3741Y - 1;
        this.f3741Y = i2;
        c(i2);
        this.X--;
        this.Z = false;
    }
}
