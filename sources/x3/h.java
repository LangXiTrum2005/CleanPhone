package x3;

import com.google.android.gms.internal.auth.o;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f53599e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b latestEvent) {
        super(20);
        n.f(latestEvent, "latestEvent");
        this.f53599e = latestEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && h.class == obj.getClass() && n.a(this.f53599e, ((h) obj).f53599e);
    }

    @Override // com.google.android.gms.internal.auth.o
    public final int hashCode() {
        return this.f53599e.hashCode() - 31;
    }

    @Override // com.google.android.gms.internal.auth.o
    public final String toString() {
        return "InProgress(latestEvent=" + this.f53599e + ", direction=-1)";
    }
}
