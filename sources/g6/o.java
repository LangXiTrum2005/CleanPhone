package g6;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w6.g f41660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f41661b;

    public o(w6.g gVar, Executor executor) {
        this.f41660a = gVar;
        this.f41661b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f41660a.equals(((o) obj).f41660a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41660a.hashCode();
    }
}
