package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.DoubleIterator;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/internal/ArrayDoubleIterator;", "Lkotlin/collections/DoubleIterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ArrayDoubleIterator extends DoubleIterator {
    public int X;

    @Override // kotlin.collections.DoubleIterator
    public final double a() {
        try {
            this.X++;
            throw null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.X--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }
}
