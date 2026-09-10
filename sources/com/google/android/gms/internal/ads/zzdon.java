package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdon {
    private final zzdxe zza;

    public zzdon(zzdxe zzdxeVar) {
        this.zza = zzdxeVar;
    }

    public final void zza(View view, zzfhr zzfhrVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzon)).booleanValue() || view == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(view) ? "0" : "1";
        zzdxd zzdxdVarZza = this.zza.zza();
        zzdxdVarZza.zzc("action", "hcp");
        zzdxdVarZza.zzc("hcp", str);
        zzdxdVarZza.zzb(zzfhrVar);
        zzdxdVarZza.zzd();
    }
}
