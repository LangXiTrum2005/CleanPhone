package tk;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f51086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51087b;

    public w1(ClassLoader classLoader) {
        this.f51086a = new WeakReference(classLoader);
        this.f51087b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w1) && this.f51086a.get() == ((w1) obj).f51086a.get();
    }

    public final int hashCode() {
        return this.f51087b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f51086a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
