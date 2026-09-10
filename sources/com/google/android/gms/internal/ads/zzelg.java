package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzelg implements zzejm {
    private final Context zza;
    private final zzdkz zzb;
    private final VersionInfoParcel zzc;
    private final Executor zzd;

    public zzelg(Context context, VersionInfoParcel versionInfoParcel, zzdkz zzdkzVar, Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzdkzVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzejm
    public final void zza(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir {
        zzfji zzfjiVar = (zzfji) zzejjVar.zzb;
        zzfik zzfikVar = zzficVar.zza.zza;
        String string = zzfhrVar.zzv.toString();
        String strZzm = com.google.android.gms.ads.internal.util.zzbp.zzm(zzfhrVar.zzs);
        zzfjiVar.zzh(this.zza, zzfikVar.zzd, string, strZzm, (zzbtf) zzejjVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzejm
    public final /* bridge */ /* synthetic */ Object zzb(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir, zzemv {
        zzdjt zzdjtVarZzd = this.zzb.zzd(new zzcwa(zzficVar, zzfhrVar, zzejjVar.zza), new zzdjw(new zzelf(this, zzejjVar, zzfhrVar), null));
        zzdjtVarZzd.zza().zzq(new zzcqq((zzfji) zzejjVar.zzb), this.zzd);
        ((zzekv) zzejjVar.zzc).zzc(zzdjtVarZzd.zzf());
        return zzdjtVarZzd.zzh();
    }

    public final /* synthetic */ VersionInfoParcel zzc() {
        return this.zzc;
    }
}
