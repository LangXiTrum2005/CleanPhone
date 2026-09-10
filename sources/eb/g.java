package eb;

import jb.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends va.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1 f39983b;

    public g(String str, s1 s1Var) {
        this.f39982a = str;
        this.f39983b = s1Var;
    }

    @Override // va.i
    public final boolean a() {
        return this.f39983b != s1.RAW;
    }

    public final String toString() {
        String str;
        int iOrdinal = this.f39983b.ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return l1.d.h("(typeUrl=", this.f39982a, ", outputPrefixType=", str, ")");
    }
}
