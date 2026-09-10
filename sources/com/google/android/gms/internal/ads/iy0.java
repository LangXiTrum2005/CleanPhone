package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class iy0 extends oy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public au0 f15870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public iw0 f15871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15872c;

    @Override // com.google.android.gms.internal.ads.py
    public final void a(zze zzeVar) {
        iw0 iw0Var = this.f15871b;
        if (this.f15870a == null || iw0Var == null) {
            return;
        }
        String string = zzeVar.zzb().toString();
        String str = this.f15872c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 51 + String.valueOf(str).length());
        sb2.append("Failed to load rewarded ad with error: ");
        sb2.append(string);
        sb2.append(", adUnitId: ");
        sb2.append(str);
        zzo.zzi(sb2.toString());
        ((ux0) iw0Var.f15865c).c(zzeVar);
        this.f15870a = null;
        this.f15871b = null;
        this.f15872c = null;
    }

    @Override // com.google.android.gms.internal.ads.py
    public final void zze() {
        iw0 iw0Var = this.f15871b;
        au0 au0Var = this.f15870a;
        if (au0Var == null || iw0Var == null) {
            return;
        }
        ((le1) iw0Var.f15864b).c(au0Var);
        this.f15870a = null;
        this.f15871b = null;
        this.f15872c = null;
    }

    @Override // com.google.android.gms.internal.ads.py
    public final void zzf(int i10) {
        this.f15870a = null;
        this.f15871b = null;
        this.f15872c = null;
    }
}
