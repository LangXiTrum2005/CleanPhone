package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class oi1 extends ff1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lj1 f18280a;

    public oi1(lj1 lj1Var) {
        this.f18280a = lj1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final boolean a() {
        return ((wm1) this.f18280a.f17037c).B() != on1.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oi1)) {
            return false;
        }
        lj1 lj1Var = ((oi1) obj).f18280a;
        lj1 lj1Var2 = this.f18280a;
        wm1 wm1Var = (wm1) lj1Var2.f17037c;
        wm1 wm1Var2 = (wm1) lj1Var2.f17037c;
        on1 on1VarB = wm1Var.B();
        wm1 wm1Var3 = (wm1) lj1Var.f17037c;
        wm1 wm1Var4 = (wm1) lj1Var.f17037c;
        return on1VarB.equals(wm1Var3.B()) && wm1Var2.z().equals(wm1Var4.z()) && wm1Var2.A().equals(wm1Var4.A());
    }

    public final int hashCode() {
        lj1 lj1Var = this.f18280a;
        return Objects.hash((wm1) lj1Var.f17037c, (zq1) lj1Var.f17036b);
    }

    public final String toString() {
        String str;
        lj1 lj1Var = this.f18280a;
        String strZ = ((wm1) lj1Var.f17037c).z();
        int iOrdinal = ((wm1) lj1Var.f17037c).B().ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return l1.d.h("(typeUrl=", strZ, ", outputPrefixType=", str, ")");
    }
}
