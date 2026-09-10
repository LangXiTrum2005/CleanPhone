package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.BooleanIterator;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/internal/ArrayBooleanIterator;", "Lkotlin/collections/BooleanIterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ArrayBooleanIterator extends BooleanIterator {
    public int X;

    @Override // kotlin.collections.BooleanIterator
    public final boolean a() {
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
