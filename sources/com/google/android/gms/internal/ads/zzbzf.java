package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final class zzbzf implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbzh zzb;

    public zzbzf(zzbzh zzbzhVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzbzhVar);
        this.zzb = zzbzhVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0038  */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbze zzbzeVarZza;
        zzbzh zzbzhVar = this.zzb;
        WeakHashMap weakHashMapZzb = zzbzhVar.zzb();
        Context context = this.zza;
        zzbzg zzbzgVar = (zzbzg) weakHashMapZzb.get(context);
        if (zzbzgVar != null) {
            if (zzbzgVar.zza + ((Long) zzbhz.zzd.zze()).longValue() < com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()) {
                zzbzeVarZza = new zzbzd(context).zza();
            } else {
                zzbzeVarZza = new zzbzd(context, zzbzgVar.zzb).zza();
            }
        } else {
            zzbzeVarZza = new zzbzd(context).zza();
        }
        zzbzhVar.zzb().put(context, new zzbzg(zzbzhVar, zzbzeVarZza));
        return zzbzeVarZza;
    }
}
