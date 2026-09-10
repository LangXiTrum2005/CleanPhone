package eb;

import java.util.Objects;
import jb.a1;
import jb.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends va.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f39989a;

    public i(d0 d0Var) {
        this.f39989a = d0Var;
    }

    @Override // va.i
    public final boolean a() {
        return ((a1) this.f39989a.f39977c).C() != s1.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        d0 d0Var = ((i) obj).f39989a;
        d0 d0Var2 = this.f39989a;
        s1 s1VarC = ((a1) d0Var2.f39977c).C();
        a1 a1Var = (a1) d0Var.f39977c;
        a1 a1Var2 = (a1) d0Var.f39977c;
        return s1VarC.equals(a1Var.C()) && ((a1) d0Var2.f39977c).D().equals(a1Var2.D()) && ((a1) d0Var2.f39977c).E().equals(a1Var2.E());
    }

    public final int hashCode() {
        d0 d0Var = this.f39989a;
        return Objects.hash((a1) d0Var.f39977c, (lb.a) d0Var.f39976b);
    }

    public final String toString() {
        String str;
        d0 d0Var = this.f39989a;
        String strD = ((a1) d0Var.f39977c).D();
        int iOrdinal = ((a1) d0Var.f39977c).C().ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return l1.d.h("(typeUrl=", strD, ", outputPrefixType=", str, ")");
    }
}
