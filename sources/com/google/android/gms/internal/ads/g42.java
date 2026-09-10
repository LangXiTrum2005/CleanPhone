package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14759b;

    public g42(int i10, boolean z10) {
        this.f14758a = i10;
        this.f14759b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g42.class != obj.getClass()) {
            return false;
        }
        g42 g42Var = (g42) obj;
        return this.f14758a == g42Var.f14758a && this.f14759b == g42Var.f14759b;
    }

    public final int hashCode() {
        return (this.f14758a * 31) + (this.f14759b ? 1 : 0);
    }
}
