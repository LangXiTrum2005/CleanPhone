package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yf1 extends mf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xf1 f22230c;

    public yf1(int i10, int i11, xf1 xf1Var) {
        this.f22228a = i10;
        this.f22229b = i11;
        this.f22230c = xf1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final boolean a() {
        return this.f22230c != xf1.f21854e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yf1)) {
            return false;
        }
        yf1 yf1Var = (yf1) obj;
        return yf1Var.f22228a == this.f22228a && yf1Var.f22229b == this.f22229b && yf1Var.f22230c == this.f22230c;
    }

    public final int hashCode() {
        return Objects.hash(yf1.class, Integer.valueOf(this.f22228a), Integer.valueOf(this.f22229b), 16, this.f22230c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f22230c);
        int length = strValueOf.length();
        int i10 = this.f22229b;
        int length2 = String.valueOf(i10).length();
        int length3 = String.valueOf(16).length();
        int i11 = this.f22228a;
        StringBuilder sb2 = new StringBuilder(l1.d.r(com.applovin.impl.ca.h(length, 30, length2, 10, length3), 15, String.valueOf(i11).length(), 10));
        sb2.append("AesEax Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i10);
        return com.applovin.impl.ca.m(sb2, "-byte IV, 16-byte tag, and ", i11, "-byte key)");
    }
}
