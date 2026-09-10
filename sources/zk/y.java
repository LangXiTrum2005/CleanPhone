package zk;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yl.b f55007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f55008b;

    public y(yl.b classId, List list) {
        kotlin.jvm.internal.n.f(classId, "classId");
        this.f55007a = classId;
        this.f55008b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.n.a(this.f55007a, yVar.f55007a) && kotlin.jvm.internal.n.a(this.f55008b, yVar.f55008b);
    }

    public final int hashCode() {
        return this.f55008b.hashCode() + (this.f55007a.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.f55007a + ", typeParametersCount=" + this.f55008b + ')';
    }
}
