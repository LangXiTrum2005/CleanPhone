package tj;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends WeakReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50798a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Object instance) {
        this(instance, null);
        kotlin.jvm.internal.n.f(instance, "instance");
    }

    public final boolean equals(Object obj) {
        T t10 = get();
        if (t10 != 0) {
            return (obj instanceof b) && ((b) obj).get() == t10;
        }
        return obj == this;
    }

    public final int hashCode() {
        return this.f50798a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object instance, ReferenceQueue referenceQueue) {
        super(instance, referenceQueue);
        kotlin.jvm.internal.n.f(instance, "instance");
        this.f50798a = System.identityHashCode(instance);
    }
}
