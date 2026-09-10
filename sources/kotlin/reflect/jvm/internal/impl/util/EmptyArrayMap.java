package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.jvm.internal.impl.types.TypeAttribute;

/* JADX INFO: loaded from: classes7.dex */
public final class EmptyArrayMap extends ArrayMap {
    public static final EmptyArrayMap X = new EmptyArrayMap();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator, KMappedMarker {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final int a() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final void c(int i2, TypeAttribute typeAttribute) {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public final Iterator iterator() {
        return new AnonymousClass1();
    }
}
