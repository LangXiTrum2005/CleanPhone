package il;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f43114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f43115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f43116c = xj.w.f53867a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f43117d;

    public w(c0 c0Var, c0 c0Var2) {
        this.f43114a = c0Var;
        this.f43115b = c0Var2;
        r9.b.u(new al.l(this, 6));
        c0 c0Var3 = c0.IGNORE;
        this.f43117d = c0Var == c0Var3 && c0Var2 == c0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f43114a == wVar.f43114a && this.f43115b == wVar.f43115b && kotlin.jvm.internal.n.a(this.f43116c, wVar.f43116c);
    }

    public final int hashCode() {
        int iHashCode = this.f43114a.hashCode() * 31;
        c0 c0Var = this.f43115b;
        return this.f43116c.hashCode() + ((iHashCode + (c0Var == null ? 0 : c0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f43114a + ", migrationLevel=" + this.f43115b + ", userDefinedLevelForSpecificAnnotation=" + this.f43116c + ')';
    }
}
