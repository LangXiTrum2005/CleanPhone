package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IntProgressionIterator extends IntIterator {
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f43344Y;
    public boolean Z;
    public int e0;

    public IntProgressionIterator(int i2, int i3, int i4) {
        this.X = i4;
        this.f43344Y = i3;
        boolean z2 = false;
        if (i4 <= 0 ? i2 >= i3 : i2 <= i3) {
            z2 = true;
        }
        this.Z = z2;
        this.e0 = z2 ? i2 : i3;
    }

    @Override // kotlin.collections.IntIterator
    public final int a() {
        int i2 = this.e0;
        if (i2 != this.f43344Y) {
            this.e0 = this.X + i2;
            return i2;
        }
        if (!this.Z) {
            throw new NoSuchElementException();
        }
        this.Z = false;
        return i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Z;
    }
}
