package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.jvm.internal.impl.types.TypeAttribute;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ArrayMap<T> implements Iterable<T>, KMappedMarker {
    public abstract int a();

    public abstract void c(int i2, TypeAttribute typeAttribute);

    public abstract Object get(int i2);

    @Override // java.lang.Iterable
    public Iterator iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
