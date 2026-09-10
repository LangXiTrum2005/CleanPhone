package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class np1 extends ek1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f17883g = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigInteger f17885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mp1 f17886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lp1 f17887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lp1 f17888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17889f;

    public np1(int i10, BigInteger bigInteger, mp1 mp1Var, lp1 lp1Var, lp1 lp1Var2, int i11) {
        this.f17884a = i10;
        this.f17885b = bigInteger;
        this.f17886c = mp1Var;
        this.f17887d = lp1Var;
        this.f17888e = lp1Var2;
        this.f17889f = i11;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final boolean a() {
        return this.f17886c != mp1.f17511e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof np1)) {
            return false;
        }
        np1 np1Var = (np1) obj;
        return np1Var.f17884a == this.f17884a && Objects.equals(np1Var.f17885b, this.f17885b) && Objects.equals(np1Var.f17886c, this.f17886c) && Objects.equals(np1Var.f17887d, this.f17887d) && Objects.equals(np1Var.f17888e, this.f17888e) && np1Var.f17889f == this.f17889f;
    }

    public final int hashCode() {
        return Objects.hash(np1.class, Integer.valueOf(this.f17884a), this.f17885b, this.f17886c, this.f17887d, this.f17888e, Integer.valueOf(this.f17889f));
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f17886c);
        String strValueOf2 = String.valueOf(this.f17887d);
        String strValueOf3 = String.valueOf(this.f17888e);
        String strValueOf4 = String.valueOf(this.f17885b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i10 = this.f17889f;
        int length4 = String.valueOf(i10).length();
        int length5 = strValueOf4.length();
        int i11 = this.f17884a;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i11).length() + 13);
        d5.u.r(sb2, "RSA SSA PSS Parameters (variant: ", strValueOf, ", signature hashType: ", strValueOf2);
        sb2.append(", mgf1 hashType: ");
        sb2.append(strValueOf3);
        sb2.append(", saltLengthBytes: ");
        sb2.append(i10);
        sb2.append(", publicExponent: ");
        sb2.append(strValueOf4);
        sb2.append(", and ");
        sb2.append(i11);
        sb2.append("-bit modulus)");
        return sb2.toString();
    }
}
