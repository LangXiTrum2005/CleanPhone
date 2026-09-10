package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.jvm.internal.impl.types.TypeAttribute;

/* JADX INFO: loaded from: classes7.dex */
public final class OneElementArrayMap<T> extends ArrayMap<T> {
    public final TypeAttribute X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f44618Y;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {
        public boolean X = true;

        public AnonymousClass1() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.X;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.X) {
                throw new NoSuchElementException();
            }
            this.X = false;
            return OneElementArrayMap.this.X;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public OneElementArrayMap(int i2, TypeAttribute typeAttribute) {
        this.X = typeAttribute;
        this.f44618Y = i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final int a() {
        return 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final void c(int i2, TypeAttribute typeAttribute) {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final Object get(int i2) {
        if (i2 == this.f44618Y) {
            return this.X;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public final Iterator iterator() {
        return new AnonymousClass1();
    }
}
