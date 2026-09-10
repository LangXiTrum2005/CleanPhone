package com.google.android.gms.ads.internal.util.client;

import com.applovin.impl.ca;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzm extends zzw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10995c;

    public zzm(int i10, int i11, boolean z10) {
        this.f10993a = i10;
        this.f10994b = i11;
        this.f10995c = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzw) {
            zzw zzwVar = (zzw) obj;
            if (this.f10993a == zzwVar.zza() && this.f10994b == zzwVar.zzb() && this.f10995c == zzwVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10994b ^ ((this.f10993a ^ 1000003) * 1000003)) * 1000003) ^ (true != this.f10995c ? 1237 : 1231);
    }

    public final String toString() {
        int i10 = this.f10993a;
        int length = String.valueOf(i10).length();
        int i11 = this.f10994b;
        int length2 = String.valueOf(i11).length();
        boolean z10 = this.f10995c;
        StringBuilder sb2 = new StringBuilder(ca.h(length, 59, length2, 26, String.valueOf(z10).length()) + 1);
        d.p(sb2, "OfflineAdConfig{impressionPrerequisite=", i10, ", clickPrerequisite=", i11);
        sb2.append(", notificationFlowEnabled=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zza() {
        return this.f10993a;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zzb() {
        return this.f10994b;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final boolean zzc() {
        return this.f10995c;
    }
}
