package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/ranges/ULongProgressionIterator;", "", "Lkotlin/ULong;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ULongProgressionIterator implements Iterator<ULong>, KMappedMarker {
    public final long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f43349Y;
    public final long Z;
    public long e0;

    public ULongProgressionIterator(long j, long j2) {
        this.X = j;
        boolean z2 = false;
        if (j2 <= 0 ? Long.compare(Long.MAX_VALUE, Long.MIN_VALUE ^ j) >= 0 : Long.compare(Long.MAX_VALUE, Long.MIN_VALUE ^ j) <= 0) {
            z2 = true;
        }
        this.f43349Y = z2;
        this.Z = j2;
        this.e0 = z2 ? -1L : j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f43349Y;
    }

    @Override // java.util.Iterator
    public final ULong next() {
        long j = this.e0;
        if (j != this.X) {
            this.e0 = this.Z + j;
        } else {
            if (!this.f43349Y) {
                throw new NoSuchElementException();
            }
            this.f43349Y = false;
        }
        return new ULong(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
