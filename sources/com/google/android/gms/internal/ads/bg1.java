package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bg1 extends mf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final af1 f12776b;

    public bg1(int i10, af1 af1Var) {
        this.f12775a = i10;
        this.f12776b = af1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final boolean a() {
        return this.f12776b != af1.f12015h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bg1)) {
            return false;
        }
        bg1 bg1Var = (bg1) obj;
        return bg1Var.f12775a == this.f12775a && bg1Var.f12776b == this.f12776b;
    }

    public final int hashCode() {
        return Objects.hash(bg1.class, Integer.valueOf(this.f12775a), 12, 16, this.f12776b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f12776b);
        int length = strValueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i10 = this.f12775a;
        StringBuilder sb2 = new StringBuilder(l1.d.r(com.applovin.impl.ca.h(length, 30, length2, 10, length3), 15, String.valueOf(i10).length(), 10));
        sb2.append("AesGcm Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", 12-byte IV, 16-byte tag, and ");
        sb2.append(i10);
        sb2.append("-byte key)");
        return sb2.toString();
    }
}
