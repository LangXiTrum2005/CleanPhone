package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractArrayMapOwner<K, V> implements Iterable<V>, KMappedMarker {

    public static abstract class AbstractArrayMapAccessor<K, V, T extends V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KClass f44602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44603b;

        public AbstractArrayMapAccessor(KClass kClass, int i2) {
            this.f44602a = kClass;
            this.f44603b = i2;
        }
    }

    public abstract ArrayMap a();

    public final boolean isEmpty() {
        return ((AttributeArrayOwner) this).X.a() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return a().iterator();
    }
}
