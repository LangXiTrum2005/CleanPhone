package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/ranges/UIntProgressionIterator;", "", "Lkotlin/UInt;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class UIntProgressionIterator implements Iterator<UInt>, KMappedMarker {
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f43347Y;
    public final int Z;
    public int e0;

    public UIntProgressionIterator(int i2, int i3) {
        this.X = i2;
        boolean z2 = false;
        if (i3 <= 0 ? Integer.compare(Integer.MAX_VALUE, Integer.MIN_VALUE ^ i2) >= 0 : Integer.compare(Integer.MAX_VALUE, Integer.MIN_VALUE ^ i2) <= 0) {
            z2 = true;
        }
        this.f43347Y = z2;
        this.Z = i3;
        this.e0 = z2 ? -1 : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f43347Y;
    }

    @Override // java.util.Iterator
    public final UInt next() {
        int i2 = this.e0;
        if (i2 != this.X) {
            this.e0 = this.Z + i2;
        } else {
            if (!this.f43347Y) {
                throw new NoSuchElementException();
            }
            this.f43347Y = false;
        }
        return new UInt(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
