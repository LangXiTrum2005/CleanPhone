package kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/RingBuffer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {
    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i2) {
        AbstractList.Companion companion = AbstractList.INSTANCE;
        int size = size();
        companion.getClass();
        AbstractList.Companion.b(i2, size);
        int i3 = i2 % 0;
        throw null;
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public final int getZ() {
        return 0;
    }

    @Override // kotlin.collections.AbstractList, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new AbstractIterator<Object>() { // from class: kotlin.collections.RingBuffer.iterator.1
            public int Z;
            public int e0 = 0;

            {
                this.Z = RingBuffer.this.size();
            }

            @Override // kotlin.collections.AbstractIterator
            public final void a() {
                if (this.Z != 0) {
                    throw null;
                }
                this.X = 2;
            }
        };
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.f(array, "array");
        if (array.length < size()) {
            array = Arrays.copyOf(array, size());
            Intrinsics.e(array, "copyOf(...)");
        }
        int size = size();
        if (size > 0) {
            throw null;
        }
        if (size < array.length) {
            array[size] = null;
        }
        return array;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
