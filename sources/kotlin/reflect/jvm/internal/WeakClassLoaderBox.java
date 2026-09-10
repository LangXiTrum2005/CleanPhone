package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;", "", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class WeakClassLoaderBox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f43422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43423b;

    public WeakClassLoaderBox(ClassLoader classLoader) {
        this.f43422a = new WeakReference(classLoader);
        this.f43423b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WeakClassLoaderBox) && this.f43422a.get() == ((WeakClassLoaderBox) obj).f43422a.get();
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getF43423b() {
        return this.f43423b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f43422a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
