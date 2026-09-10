package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzejv implements zzejm {
    private final Context zza;
    private final zzcsq zzb;
    private final Executor zzc;

    public zzejv(Context context, zzcsq zzcsqVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcsqVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzejm
    public final void zza(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir {
        zzfji zzfjiVar = (zzfji) zzejjVar.zzb;
        zzfik zzfikVar = zzficVar.zza.zza;
        String string = zzfhrVar.zzv.toString();
        zzfjiVar.zzy(this.zza, zzfikVar.zzd, string, (zzbtf) zzejjVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzejm
    public final /* bridge */ /* synthetic */ Object zzb(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir, zzemv {
        zzcsn zzcsnVarZzf = this.zzb.zzf(new zzcwa(zzficVar, zzfhrVar, zzejjVar.zza), new zzdjw(new zzeju(this, zzejjVar, zzfhrVar), null), new zzcso(zzfhrVar.zzaa));
        zzcsnVarZzf.zza().zzq(new zzcqq((zzfji) zzejjVar.zzb), this.zzc);
        ((zzekv) zzejjVar.zzc).zzc(zzcsnVarZzf.zzf());
        return zzcsnVarZzf.zzh();
    }
}
