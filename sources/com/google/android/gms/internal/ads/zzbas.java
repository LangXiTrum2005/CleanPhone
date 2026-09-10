package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbas extends zzbbh {
    private final zzayw zzh;
    private final long zzi;
    private final long zzj;

    public zzbas(zzazt zzaztVar, String str, String str2, zzavs zzavsVar, int i2, int i3, zzayw zzaywVar, long j, long j2) {
        super(zzaztVar, "1MiCMWad12oLn5alnMxHwTvbBZm7RpaUcGFZ/LjrpVbPksWcBk53Qc+euKdOo/dG", "/cnUVQvNHFqi3ggOmiA4o/IdQSFHoegJ/H9a2xERT14=", zzavsVar, i2, 11);
        this.zzh = zzaywVar;
        this.zzi = j;
        this.zzj = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzayw zzaywVar = this.zzh;
        if (zzaywVar != null) {
            zzayu zzayuVar = new zzayu((String) this.zze.invoke(null, zzaywVar.zzb(), Long.valueOf(this.zzi), Long.valueOf(this.zzj)));
            zzavs zzavsVar = this.zzd;
            synchronized (zzavsVar) {
                try {
                    zzavsVar.zzf(zzayuVar.zza.longValue());
                    if (zzayuVar.zzb.longValue() >= 0) {
                        zzavsVar.zzW(zzayuVar.zzb.longValue());
                    }
                    if (zzayuVar.zzc.longValue() >= 0) {
                        zzavsVar.zzX(zzayuVar.zzc.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
