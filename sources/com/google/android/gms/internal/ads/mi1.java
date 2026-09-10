package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mi1 extends ff1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final on1 f17453b;

    public mi1(String str, on1 on1Var) {
        this.f17452a = str;
        this.f17453b = on1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final boolean a() {
        return this.f17453b != on1.RAW;
    }

    public final String toString() {
        String str;
        int iOrdinal = this.f17453b.ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return l1.d.h("(typeUrl=", this.f17452a, ", outputPrefixType=", str, ")");
    }
}
