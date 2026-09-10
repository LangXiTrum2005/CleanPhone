package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ii0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15757b;

    public ii0(long j10, int i10) {
        this.f15756a = j10;
        this.f15757b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ii0) {
            ii0 ii0Var = (ii0) obj;
            if (this.f15756a == ii0Var.f15756a && this.f15757b == ii0Var.f15757b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f15756a;
        return this.f15757b ^ ((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j10 = this.f15756a;
        int length = String.valueOf(j10).length();
        int i10 = this.f15757b;
        StringBuilder sb2 = new StringBuilder(length + 34 + String.valueOf(i10).length() + 1);
        q4.a.r(sb2, "OnDeviceStorageKey{id=", j10, ", eventType=");
        return l1.d.i(sb2, i10, "}");
    }
}
