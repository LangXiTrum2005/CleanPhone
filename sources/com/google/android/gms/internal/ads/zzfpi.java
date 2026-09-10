package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfpi {
    private final Context zza;
    private final Executor zzb;
    private final zzgyx zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzfpa zze;
    private final zzfnr zzf;
    private final zzcld zzg;

    public zzfpi(Context context, Executor executor, zzgyx zzgyxVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzfpa zzfpaVar, zzfnr zzfnrVar, zzcld zzcldVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzgyxVar;
        this.zzd = zzuVar;
        this.zze = zzfpaVar;
        this.zzf = zzfnrVar;
        this.zzg = zzcldVar;
    }

    public final void zza(List list, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), zzvVar, null, null);
        }
    }

    public final void zzb(final String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzfno zzfnoVar, zzdcz zzdczVar) {
        ListenableFuture listenableFutureSubmit;
        zzfne zzfneVarZzn = null;
        if (zzfnr.zza() && ((Boolean) zzbid.zzd.zze()).booleanValue()) {
            zzfneVarZzn = zzfne.zzn(this.zza, 14);
            zzfneVarZzn.zza();
        }
        if (zzvVar != null) {
            listenableFutureSubmit = new zzfoz(zzvVar.zza(), this.zzd, this.zzc, this.zze, this.zzg).zza(str);
        } else {
            listenableFutureSubmit = this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfph
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(str);
                }
            });
        }
        zzgym.zzr(listenableFutureSubmit, new zzfpg(this, zzfneVarZzn, zzfnoVar, zzdczVar), this.zzb);
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zzc(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkf)).booleanValue() || (!com.google.android.gms.ads.internal.zzt.zzc().zzi(str) && !com.google.android.gms.ads.internal.zzt.zzc().zzj(str))) {
            return this.zzd.zzc(str, null);
        }
        String strZzb = this.zzg.zzb();
        HashMap map = new HashMap();
        if (strZzb != null) {
            map.put((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkg), strZzb);
        }
        return this.zzd.zzc(str, map);
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzu zzd() {
        return this.zzd;
    }

    public final /* synthetic */ zzfnr zze() {
        return this.zzf;
    }
}
