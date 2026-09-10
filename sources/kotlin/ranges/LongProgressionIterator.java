package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.LongIterator;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/LongProgressionIterator;", "Lkotlin/collections/LongIterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LongProgressionIterator extends LongIterator {
    public final long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long f43345Y;
    public boolean Z;
    public long e0;

    public LongProgressionIterator(long j, long j2) {
        this.X = j2;
        this.f43345Y = j;
        boolean z2 = false;
        if (j2 <= 0 ? 1 >= j : 1 <= j) {
            z2 = true;
        }
        this.Z = z2;
        this.e0 = z2 ? 1L : j;
    }

    @Override // kotlin.collections.LongIterator
    public final long a() {
        long j = this.e0;
        if (j != this.f43345Y) {
            this.e0 = this.X + j;
            return j;
        }
        if (!this.Z) {
            throw new NoSuchElementException();
        }
        this.Z = false;
        return j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Z;
    }
}
