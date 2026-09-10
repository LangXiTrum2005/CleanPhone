package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class zzexu implements zzezv {
    public final zzfhq zza;

    public zzexu(zzfhq zzfhqVar) {
        this.zza = zzfhqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzczm zzczmVar = (zzczm) obj;
        zzfhq zzfhqVar = this.zza;
        if (zzfhqVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznn)).booleanValue()) {
                return;
            }
            Bundle bundle = zzczmVar.zza;
            bundle.putBoolean("render_in_browser", zzfhqVar.zzb());
            bundle.putBoolean("disable_ml", zzfhqVar.zzc());
        }
    }
}
