package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbj;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xx0 extends zzbj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kp0 f22019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public iw0 f22020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f22021c;

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb() {
        iw0 iw0Var = this.f22020b;
        kp0 kp0Var = this.f22019a;
        if (kp0Var == null || iw0Var == null) {
            return;
        }
        ((le1) iw0Var.f15864b).c(kp0Var);
        this.f22019a = null;
        this.f22020b = null;
        this.f22021c = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc(zze zzeVar) {
        iw0 iw0Var = this.f22020b;
        if (this.f22019a == null || iw0Var == null) {
            return;
        }
        String string = zzeVar.zzb().toString();
        String str = this.f22021c;
        StringBuilder sb2 = new StringBuilder(string.length() + 57 + String.valueOf(str).length());
        sb2.append("Failed to load interstitial ad with error: ");
        sb2.append(string);
        sb2.append(" for ad unit: ");
        sb2.append(str);
        zzo.zzi(sb2.toString());
        ((ux0) iw0Var.f15865c).c(zzeVar);
        this.f22019a = null;
        this.f22020b = null;
        this.f22021c = null;
    }
}
