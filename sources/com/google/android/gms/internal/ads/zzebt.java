package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzebt implements zzddq, zzdjd, zzdby {
    private final Context zza;
    private final zzdxe zzb;

    public zzebt(Context context, zzdxe zzdxeVar) {
        this.zza = context;
        this.zzb = zzdxeVar;
    }

    private final void zzf(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfx)).booleanValue()) {
            zzcdo.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc(context);
                }
            });
        }
    }

    public final /* synthetic */ void zzc(Context context) {
        com.google.android.gms.ads.internal.zzt.zzn().zza(context, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfA)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdO(zzbza zzbzaVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfz)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdP(zzfic zzficVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final void zze(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdby
    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfB)).booleanValue()) {
            zzf(this.zza);
        }
    }
}
