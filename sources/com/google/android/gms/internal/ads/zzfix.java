package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfix {
    private final zzfhr zza;
    private final zzfhu zzb;
    private final zzfpi zzc;
    private final zzfpa zzd;
    private final zzfno zze;
    private final zzcra zzf;

    public zzfix(zzfpi zzfpiVar, zzfpa zzfpaVar, zzfhr zzfhrVar, zzfhu zzfhuVar, zzcra zzcraVar, zzfno zzfnoVar) {
        this.zza = zzfhrVar;
        this.zzb = zzfhuVar;
        this.zzc = zzfpiVar;
        this.zzd = zzfpaVar;
        this.zzf = zzcraVar;
        this.zze = zzfnoVar;
    }

    public final void zza(List list, zzdcz zzdczVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), 2, zzdczVar);
        }
    }

    public final void zzb(List list, int i2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzgym.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlt)).booleanValue() && zzcra.zzc(str)) ? this.zzf.zzb(str, com.google.android.gms.ads.internal.client.zzbb.zzh()) : zzgym.zza(str), new zzfiw(this, i2), zzcdo.zza);
        }
    }

    public final void zzc(String str, int i2, zzdcz zzdczVar) {
        zzfhr zzfhrVar = this.zza;
        if (zzfhrVar.zzai) {
            this.zzd.zza(str, this.zzb.zzb, i2);
            return;
        }
        this.zzc.zzb(str, zzfhrVar.zzax, this.zze, zzdczVar);
    }
}
