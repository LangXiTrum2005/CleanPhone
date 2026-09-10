package com.google.android.gms.ads.internal.util.client;

import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzn extends zzx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f10998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10999d;

    public zzn(int i10, int i11, double d10, boolean z10) {
        this.f10996a = i10;
        this.f10997b = i11;
        this.f10998c = d10;
        this.f10999d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzx) {
            zzx zzxVar = (zzx) obj;
            if (this.f10996a == zzxVar.zza() && this.f10997b == zzxVar.zzb() && Double.doubleToLongBits(this.f10998c) == Double.doubleToLongBits(zzxVar.zzc()) && this.f10999d == zzxVar.zzd()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d10 = this.f10998c;
        return ((((this.f10997b ^ ((this.f10996a ^ 1000003) * 1000003)) * 1000003) ^ ((int) (Double.doubleToLongBits(d10) ^ (Double.doubleToLongBits(d10) >>> 32)))) * 1000003) ^ (true != this.f10999d ? 1237 : 1231);
    }

    public final String toString() {
        int i10 = this.f10996a;
        int length = String.valueOf(i10).length();
        int i11 = this.f10997b;
        int length2 = String.valueOf(i11).length();
        double d10 = this.f10998c;
        int length3 = String.valueOf(d10).length();
        boolean z10 = this.f10999d;
        StringBuilder sb2 = new StringBuilder(length + 44 + length2 + 20 + length3 + 25 + String.valueOf(z10).length() + 1);
        d.p(sb2, "PingStrategy{maxAttempts=", i10, ", initialBackoffMs=", i11);
        sb2.append(", backoffMultiplier=");
        sb2.append(d10);
        sb2.append(", bufferAfterMaxAttempts=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int zza() {
        return this.f10996a;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int zzb() {
        return this.f10997b;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final double zzc() {
        return this.f10998c;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final boolean zzd() {
        return this.f10999d;
    }
}
