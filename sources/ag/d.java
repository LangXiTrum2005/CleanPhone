package ag;

import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2.e f3567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3568b;

    public d(f2.e chunk, int i10) {
        n.f(chunk, "chunk");
        this.f3567a = chunk;
        this.f3568b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return n.a(this.f3567a, dVar.f3567a) && this.f3568b == dVar.f3568b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3568b) + (this.f3567a.hashCode() * 31);
    }

    public final String toString() {
        return "ReaderData(chunk=" + this.f3567a + ", id=" + this.f3568b + ")";
    }
}
