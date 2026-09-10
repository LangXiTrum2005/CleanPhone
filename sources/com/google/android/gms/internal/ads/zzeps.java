package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeps extends com.google.android.gms.ads.internal.client.zzbp {
    private final zzera zza;

    public zzeps(Context context, zzclg zzclgVar, zzfij zzfijVar, zzdnw zzdnwVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        zzerc zzercVar = new zzerc(zzdnwVar, zzclgVar.zzD());
        zzercVar.zza(zzbkVar);
        this.zza = new zzera(new zzerm(zzclgVar, context, zzercVar, zzfijVar), zzfijVar.zzh());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zze(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        this.zza.zzb(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized String zzf() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized boolean zzg() throws RemoteException {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized String zzh() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zzm zzmVar, int i2) throws RemoteException {
        this.zza.zzb(zzmVar, i2);
    }
}
