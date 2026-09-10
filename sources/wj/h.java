package wj;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f53286a;

    public /* synthetic */ h(Object obj) {
        this.f53286a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof g) {
            return ((g) obj).f53285a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return kotlin.jvm.internal.n.a(this.f53286a, ((h) obj).f53286a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f53286a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f53286a;
        if (obj instanceof g) {
            return ((g) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
