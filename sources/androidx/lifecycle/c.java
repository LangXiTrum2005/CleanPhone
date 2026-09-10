package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f4529b;

    public c(int i10, Method method) {
        this.f4528a = i10;
        this.f4529b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f4528a == cVar.f4528a && this.f4529b.getName().equals(cVar.f4529b.getName());
    }

    public final int hashCode() {
        return this.f4529b.getName().hashCode() + (this.f4528a * 31);
    }
}
