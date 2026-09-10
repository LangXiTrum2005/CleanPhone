package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzema implements zzgyj {
    final /* synthetic */ zzfhr zza;
    final /* synthetic */ zzemb zzb;

    public zzema(zzemb zzembVar, zzfhr zzfhrVar) {
        this.zza = zzfhrVar;
        Objects.requireNonNull(zzembVar);
        this.zzb = zzembVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        zzemb zzembVar = this.zzb;
        synchronized (zzembVar) {
            try {
                zzemc zzemcVarZzc = zzembVar.zzc();
                zzfhr zzfhrVar = this.zza;
                zzemcVarZzc.zzc(th, zzfhrVar);
                zzfhr zzfhrVarZza = zzembVar.zzc().zza();
                if (zzfhrVar.zzav) {
                    while (zzfhrVarZza != null) {
                        zzembVar.zzb(zzfhrVarZza);
                        zzfhrVarZza = zzembVar.zzc().zza();
                    }
                } else if (zzfhrVarZza != null) {
                    zzembVar.zzb(zzfhrVarZza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzemb zzembVar = this.zzb;
        zzems zzemsVar = (zzems) obj;
        synchronized (zzembVar) {
            try {
                zzembVar.zzc().zzb(zzemsVar, this.zza);
                zzfhr zzfhrVarZza = zzembVar.zzc().zza();
                if (zzfhrVarZza != null) {
                    zzembVar.zzb(zzfhrVarZza);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
