package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.vc0;
import com.google.android.gms.internal.ads.wh0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzr implements vc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wh0 f11516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzq f11517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11518c;

    public zzr(wh0 wh0Var, zzq zzqVar, String str) {
        this.f11516a = wh0Var;
        this.f11517b = zzqVar;
        this.f11518c = str;
    }

    @Override // com.google.android.gms.internal.ads.vc0
    public final void zzd(@Nullable zzbc zzbcVar) {
        if (zzbcVar == null) {
            return;
        }
        wh0 wh0Var = this.f11516a;
        this.f11517b.zza(this.f11518c, zzbcVar.zzb, wh0Var);
    }

    @Override // com.google.android.gms.internal.ads.vc0
    public final void zze(@Nullable String str) {
    }
}
