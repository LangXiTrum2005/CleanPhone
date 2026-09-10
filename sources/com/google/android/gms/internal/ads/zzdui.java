package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdui implements zzdbf {
    private final zzcir zza;

    public zzdui(zzcir zzcirVar) {
        this.zza = zzcirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zza(Context context) {
        zzcir zzcirVar = this.zza;
        if (zzcirVar != null) {
            zzcirVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzb(Context context) {
        zzcir zzcirVar = this.zza;
        if (zzcirVar != null) {
            zzcirVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzc(Context context) {
        zzcir zzcirVar = this.zza;
        if (zzcirVar != null) {
            zzcirVar.destroy();
        }
    }
}
