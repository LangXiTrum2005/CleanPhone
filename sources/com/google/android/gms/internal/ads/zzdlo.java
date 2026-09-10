package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzdlo implements zzcvn {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzijv zzd;
    private final zzdnw zze;

    public zzdlo(Map map, Map map2, Map map3, zzijv zzijvVar, zzdnw zzdnwVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzijvVar;
        this.zze = zzdnwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvn
    public final zzejg zza(int i2, String str) {
        zzejg zzejgVarZza;
        zzejg zzejgVar = (zzejg) this.zza.get(str);
        if (zzejgVar != null) {
            return zzejgVar;
        }
        if (i2 != 1) {
            if (i2 != 4) {
                return null;
            }
            zzelm zzelmVar = (zzelm) this.zzc.get(str);
            if (zzelmVar != null) {
                return zzcvs.zza(zzelmVar);
            }
            zzejgVarZza = (zzejg) this.zzb.get(str);
            if (zzejgVarZza == null) {
                return null;
            }
        } else if (this.zze.zzd() == null || (zzejgVarZza = ((zzcvn) this.zzd.zzb()).zza(i2, str)) == null) {
            return null;
        }
        return zzcvs.zzb(zzejgVarZza);
    }
}
