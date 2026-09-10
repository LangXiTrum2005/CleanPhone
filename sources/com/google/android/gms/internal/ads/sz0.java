package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20091e;

    public sz0(String str, boolean z10, boolean z11, long j10, long j11) {
        this.f20087a = str;
        this.f20088b = z10;
        this.f20089c = z11;
        this.f20090d = j10;
        this.f20091e = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sz0)) {
            return false;
        }
        sz0 sz0Var = (sz0) obj;
        return this.f20087a.equals(sz0Var.f20087a) && this.f20088b == sz0Var.f20088b && this.f20089c == sz0Var.f20089c && this.f20090d == sz0Var.f20090d && this.f20091e == sz0Var.f20091e;
    }

    public final int hashCode() {
        return ((int) this.f20091e) ^ ((((((((((((this.f20087a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f20088b ? 1237 : 1231)) * 1000003) ^ (true != this.f20089c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f20090d)) * 1000003) ^ 1237) * 1000003);
    }

    public final String toString() {
        boolean z10 = this.f20088b;
        int length = String.valueOf(z10).length();
        boolean z11 = this.f20089c;
        int length2 = String.valueOf(z11).length();
        long j10 = this.f20090d;
        int length3 = String.valueOf(j10).length();
        long j11 = this.f20091e;
        int length4 = String.valueOf(j11).length();
        String str = this.f20087a;
        StringBuilder sb2 = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb2.append("AdShield2Options{clientVersion=");
        sb2.append(str);
        sb2.append(", shouldGetAdvertisingId=");
        sb2.append(z10);
        sb2.append(", isGooglePlayServicesAvailable=");
        sb2.append(z11);
        sb2.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb2.append(j10);
        sb2.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        sb2.append(j11);
        sb2.append("}");
        return sb2.toString();
    }
}
