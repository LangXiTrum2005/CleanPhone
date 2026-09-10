package wj;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f53285a;

    public g(Throwable exception) {
        kotlin.jvm.internal.n.f(exception, "exception");
        this.f53285a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return kotlin.jvm.internal.n.a(this.f53285a, ((g) obj).f53285a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f53285a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f53285a + ')';
    }
}
