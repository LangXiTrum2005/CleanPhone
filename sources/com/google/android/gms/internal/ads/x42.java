package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21746b;

    public x42(long j10, long j11) {
        this.f21745a = j10;
        this.f21746b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x42)) {
            return false;
        }
        x42 x42Var = (x42) obj;
        return this.f21745a == x42Var.f21745a && this.f21746b == x42Var.f21746b;
    }

    public final int hashCode() {
        return (((int) this.f21745a) * 31) + ((int) this.f21746b);
    }
}
