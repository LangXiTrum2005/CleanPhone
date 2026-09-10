package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uf1 extends mf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tf1 f20768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sf1 f20769f;

    public uf1(int i10, int i11, int i12, int i13, tf1 tf1Var, sf1 sf1Var) {
        this.f20764a = i10;
        this.f20765b = i11;
        this.f20766c = i12;
        this.f20767d = i13;
        this.f20768e = tf1Var;
        this.f20769f = sf1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final boolean a() {
        return this.f20768e != tf1.f20364e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uf1)) {
            return false;
        }
        uf1 uf1Var = (uf1) obj;
        return uf1Var.f20764a == this.f20764a && uf1Var.f20765b == this.f20765b && uf1Var.f20766c == this.f20766c && uf1Var.f20767d == this.f20767d && uf1Var.f20768e == this.f20768e && uf1Var.f20769f == this.f20769f;
    }

    public final int hashCode() {
        return Objects.hash(uf1.class, Integer.valueOf(this.f20764a), Integer.valueOf(this.f20765b), Integer.valueOf(this.f20766c), Integer.valueOf(this.f20767d), this.f20768e, this.f20769f);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f20768e);
        String strValueOf2 = String.valueOf(this.f20769f);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i10 = this.f20766c;
        int length3 = String.valueOf(i10).length();
        int i11 = this.f20767d;
        int length4 = String.valueOf(i11).length();
        int i12 = this.f20764a;
        int length5 = String.valueOf(i12).length();
        int i13 = this.f20765b;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i13).length() + 15);
        d5.u.r(sb2, "AesCtrHmacAead Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        l1.d.p(sb2, ", ", i10, "-byte IV, and ", i11);
        l1.d.p(sb2, "-byte tags, and ", i12, "-byte AES key, and ", i13);
        sb2.append("-byte HMAC key)");
        return sb2.toString();
    }
}
