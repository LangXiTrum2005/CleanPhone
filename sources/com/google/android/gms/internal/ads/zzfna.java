package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfna implements zzdhw, zzdba, zzdia {
    private final zzfno zza;
    private final zzfne zzb;

    public zzfna(Context context, zzfno zzfnoVar) {
        this.zza = zzfnoVar;
        this.zzb = zzfne.zzn(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzdia
    public final void zza() {
        if (((Boolean) zzbid.zzd.zze()).booleanValue()) {
            zzfno zzfnoVar = this.zza;
            zzfne zzfneVar = this.zzb;
            zzfneVar.zzd(true);
            zzfnoVar.zza(zzfneVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdia
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhw
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhw
    public final void zzh() {
        if (((Boolean) zzbid.zzd.zze()).booleanValue()) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbid.zzd.zze()).booleanValue()) {
            zzfno zzfnoVar = this.zza;
            zzfne zzfneVar = this.zzb;
            zzfneVar.zzk(zzeVar.zza().toString());
            zzfneVar.zzd(false);
            zzfnoVar.zza(zzfneVar);
        }
    }
}
