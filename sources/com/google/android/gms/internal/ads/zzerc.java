package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzerc {
    private final zzdnw zza;
    private final zzeqp zzb;
    private final zzdan zzc;

    public zzerc(zzdnw zzdnwVar, zzdxe zzdxeVar) {
        this.zza = zzdnwVar;
        final zzeqp zzeqpVar = new zzeqp(zzdxeVar);
        this.zzb = zzeqpVar;
        final zzbqh zzbqhVarZze = zzdnwVar.zze();
        this.zzc = new zzdan() { // from class: com.google.android.gms.internal.ads.zzerb
            @Override // com.google.android.gms.internal.ads.zzdan
            public final /* synthetic */ void zzdI(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzeqpVar.zzdI(zzeVar);
                zzbqh zzbqhVar = zzbqhVarZze;
                if (zzbqhVar != null) {
                    try {
                        zzbqhVar.zzg(zzeVar);
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
                    }
                }
                if (zzbqhVar != null) {
                    try {
                        zzbqhVar.zzf(zzeVar.zza);
                    } catch (RemoteException e3) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e3);
                    }
                }
            }
        };
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzb.zzl(zzbkVar);
    }

    public final zzdlq zzb() {
        return new zzdlq(this.zza, this.zzb.zzi());
    }

    public final zzeqp zzc() {
        return this.zzb;
    }

    public final zzdby zzd() {
        return this.zzb;
    }

    public final zzdan zze() {
        return this.zzc;
    }
}
