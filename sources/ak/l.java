package ak;

import java.io.Serializable;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements k, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f3620a = new l();
    private static final long serialVersionUID = 0;

    private final Object readResolve() {
        return f3620a;
    }

    @Override // ak.k
    public final i get(j key) {
        n.f(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // ak.k
    public final k minusKey(j key) {
        n.f(key, "key");
        return this;
    }

    @Override // ak.k
    public final k plus(k context) {
        n.f(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // ak.k
    public final Object fold(Object obj, jk.c cVar) {
        return obj;
    }
}
