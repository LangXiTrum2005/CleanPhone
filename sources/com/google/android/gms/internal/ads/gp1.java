package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gp1 extends ek1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BigInteger f14925e = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigInteger f14927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fp1 f14928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ep1 f14929d;

    public gp1(int i10, BigInteger bigInteger, fp1 fp1Var, ep1 ep1Var) {
        this.f14926a = i10;
        this.f14927b = bigInteger;
        this.f14928c = fp1Var;
        this.f14929d = ep1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final boolean a() {
        return this.f14928c != fp1.f14504e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gp1)) {
            return false;
        }
        gp1 gp1Var = (gp1) obj;
        return gp1Var.f14926a == this.f14926a && Objects.equals(gp1Var.f14927b, this.f14927b) && gp1Var.f14928c == this.f14928c && gp1Var.f14929d == this.f14929d;
    }

    public final int hashCode() {
        return Objects.hash(gp1.class, Integer.valueOf(this.f14926a), this.f14927b, this.f14928c, this.f14929d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f14928c);
        String strValueOf2 = String.valueOf(this.f14929d);
        String strValueOf3 = String.valueOf(this.f14927b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i10 = this.f14926a;
        StringBuilder sb2 = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i10).length() + 13);
        d5.u.r(sb2, "RSA SSA PKCS1 Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        sb2.append(", publicExponent: ");
        sb2.append(strValueOf3);
        sb2.append(", and ");
        sb2.append(i10);
        sb2.append("-bit modulus)");
        return sb2.toString();
    }
}
