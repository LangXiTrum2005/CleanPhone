package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vj1 extends ek1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final af1 f21191c;

    public vj1(int i10, int i11, af1 af1Var) {
        this.f21189a = i10;
        this.f21190b = i11;
        this.f21191c = af1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final boolean a() {
        return this.f21191c != af1.f12024r;
    }

    public final int b() {
        af1 af1Var = af1.f12024r;
        int i10 = this.f21190b;
        af1 af1Var2 = this.f21191c;
        if (af1Var2 == af1Var) {
            return i10;
        }
        if (af1Var2 == af1.f12021o || af1Var2 == af1.f12022p || af1Var2 == af1.f12023q) {
            return i10 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vj1)) {
            return false;
        }
        vj1 vj1Var = (vj1) obj;
        return vj1Var.f21189a == this.f21189a && vj1Var.b() == b() && vj1Var.f21191c == this.f21191c;
    }

    public final int hashCode() {
        return Objects.hash(vj1.class, Integer.valueOf(this.f21189a), Integer.valueOf(this.f21190b), this.f21191c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f21191c);
        int length = strValueOf.length();
        int i10 = this.f21190b;
        int length2 = String.valueOf(i10).length();
        int i11 = this.f21189a;
        StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.h(length, 32, length2, 16, String.valueOf(i11).length()) + 10);
        sb2.append("AES-CMAC Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i10);
        return com.applovin.impl.ca.m(sb2, "-byte tags, and ", i11, "-byte key)");
    }
}
