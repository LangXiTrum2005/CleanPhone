package w0;

import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52738a;

    public d(String name) {
        n.f(name, "name");
        this.f52738a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return n.a(this.f52738a, ((d) obj).f52738a);
    }

    public final int hashCode() {
        return this.f52738a.hashCode();
    }

    public final String toString() {
        return this.f52738a;
    }
}
