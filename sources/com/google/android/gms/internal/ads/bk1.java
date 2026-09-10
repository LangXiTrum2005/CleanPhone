package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bk1 extends ek1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ak1 f12816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zj1 f12817d;

    public bk1(int i10, int i11, ak1 ak1Var, zj1 zj1Var) {
        this.f12814a = i10;
        this.f12815b = i11;
        this.f12816c = ak1Var;
        this.f12817d = zj1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final boolean a() {
        return this.f12816c != ak1.f12056e;
    }

    public final int b() {
        ak1 ak1Var = ak1.f12056e;
        int i10 = this.f12815b;
        ak1 ak1Var2 = this.f12816c;
        if (ak1Var2 == ak1Var) {
            return i10;
        }
        if (ak1Var2 == ak1.f12053b || ak1Var2 == ak1.f12054c || ak1Var2 == ak1.f12055d) {
            return i10 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bk1)) {
            return false;
        }
        bk1 bk1Var = (bk1) obj;
        return bk1Var.f12814a == this.f12814a && bk1Var.b() == b() && bk1Var.f12816c == this.f12816c && bk1Var.f12817d == this.f12817d;
    }

    public final int hashCode() {
        return Objects.hash(bk1.class, Integer.valueOf(this.f12814a), Integer.valueOf(this.f12815b), this.f12816c, this.f12817d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f12816c);
        String strValueOf2 = String.valueOf(this.f12817d);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i10 = this.f12815b;
        int length3 = String.valueOf(i10).length();
        int i11 = this.f12814a;
        StringBuilder sb2 = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i11).length() + 10);
        d5.u.r(sb2, "HMAC Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        l1.d.p(sb2, ", ", i10, "-byte tags, and ", i11);
        sb2.append("-byte key)");
        return sb2.toString();
    }
}
