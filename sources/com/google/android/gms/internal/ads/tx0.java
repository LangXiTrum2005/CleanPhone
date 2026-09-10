package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tx0 extends yi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public iw0 f20519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20520b;

    @Override // com.google.android.gms.internal.ads.zi
    public final void r0(wi wiVar) {
        iw0 iw0Var = this.f20519a;
        if (iw0Var == null) {
            return;
        }
        ((le1) iw0Var.f15864b).c(wiVar);
        this.f20519a = null;
        this.f20520b = null;
    }

    @Override // com.google.android.gms.internal.ads.zi
    public final void zzc(int i10) {
        this.f20519a = null;
        this.f20520b = null;
    }

    @Override // com.google.android.gms.internal.ads.zi
    public final void zzd(zze zzeVar) {
        iw0 iw0Var = this.f20519a;
        if (iw0Var == null) {
            return;
        }
        String string = zzeVar.zzb().toString();
        String str = this.f20520b;
        StringBuilder sb2 = new StringBuilder(string.length() + 60 + String.valueOf(str).length());
        sb2.append("Failed to load app open ad with error parcel: ");
        sb2.append(string);
        sb2.append(" for ad unit: ");
        sb2.append(str);
        zzo.zzi(sb2.toString());
        ((ux0) iw0Var.f15865c).c(zzeVar);
        this.f20519a = null;
        this.f20520b = null;
    }
}
