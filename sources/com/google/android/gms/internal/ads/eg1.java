package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class eg1 extends mf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf1 f13967b;

    public eg1(int i10, sf1 sf1Var) {
        this.f13966a = i10;
        this.f13967b = sf1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final boolean a() {
        return this.f13967b != sf1.f19960j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eg1)) {
            return false;
        }
        eg1 eg1Var = (eg1) obj;
        return eg1Var.f13966a == this.f13966a && eg1Var.f13967b == this.f13967b;
    }

    public final int hashCode() {
        return Objects.hash(eg1.class, Integer.valueOf(this.f13966a), this.f13967b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f13967b);
        int length = strValueOf.length();
        int i10 = this.f13966a;
        StringBuilder sb2 = new StringBuilder(length + 33 + String.valueOf(i10).length() + 10);
        sb2.append("AesGcmSiv Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("-byte key)");
        return sb2.toString();
    }
}
