package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f20629c;

    public u5(float f10, int i10, int i11) {
        this.f20627a = i10;
        this.f20628b = i11;
        this.f20629c = f10;
    }

    public static /* synthetic */ u5 a(int i10) {
        int i11 = i10 >> 13;
        if (i11 == 0) {
            return null;
        }
        return new u5(((i10 & 511) * ((i10 & 512) != 0 ? -1 : 1)) / 10.0f, i11, (i10 >> 10) & 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return this.f20627a == u5Var.f20627a && this.f20628b == u5Var.f20628b && Float.compare(this.f20629c, u5Var.f20629c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f20629c) + (((this.f20627a * 31) + this.f20628b) * 31);
    }

    public final String toString() {
        int i10 = this.f20627a;
        int length = String.valueOf(i10).length();
        int i11 = this.f20628b;
        int length2 = String.valueOf(i11).length();
        float f10 = this.f20629c;
        StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.h(length, 28, length2, 7, String.valueOf(f10).length()) + 1);
        l1.d.p(sb2, "GainField{name=", i10, ", originator=", i11);
        sb2.append(", gain=");
        sb2.append(f10);
        sb2.append("}");
        return sb2.toString();
    }
}
