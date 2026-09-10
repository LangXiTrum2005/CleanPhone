package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdzc implements zzdyn {
    private final long zza;
    private final zzdyr zzb;
    private final zzfhi zzc;

    public zzdzc(long j, Context context, zzdyr zzdyrVar, zzclg zzclgVar, String str) {
        this.zza = j;
        this.zzb = zzdyrVar;
        zzfhk zzfhkVarZzq = zzclgVar.zzq();
        zzfhkVarZzq.zzc(context);
        zzfhkVarZzq.zzb(str);
        this.zzc = zzfhkVarZzq.zza().zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdyn
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.zzc.zzc(zzmVar, new zzdza(this));
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdyn
    public final void zzb() {
        try {
            zzfhi zzfhiVar = this.zzc;
            zzfhiVar.zze(new zzdzb(this));
            zzfhiVar.zzb(ObjectWrapper.wrap(null));
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdyn
    public final void zzc() {
    }

    public final /* synthetic */ long zzd() {
        return this.zza;
    }

    public final /* synthetic */ zzdyr zze() {
        return this.zzb;
    }
}
