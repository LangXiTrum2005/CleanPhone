package rl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49644a;

    public o(String str) {
        this.f49644a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && kotlin.jvm.internal.n.a(this.f49644a, ((o) obj).f49644a);
    }

    public final int hashCode() {
        return this.f49644a.hashCode();
    }

    public final String toString() {
        return wi.d.k(new StringBuilder("MemberSignature(signature="), this.f49644a, ')');
    }
}
