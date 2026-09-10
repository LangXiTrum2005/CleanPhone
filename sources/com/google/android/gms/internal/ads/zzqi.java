package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzqi {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd = false;
    public final int zze;
    public final zzd zzf;
    public final int zzg;
    public final int zzh;

    public /* synthetic */ zzqi(zzqh zzqhVar, byte[] bArr) {
        this.zza = zzqhVar.zzi();
        this.zzb = zzqhVar.zzj();
        this.zzc = zzqhVar.zzk();
        this.zze = zzqhVar.zzl();
        this.zzf = zzqhVar.zzm();
        this.zzg = zzqhVar.zzn();
        this.zzh = zzqhVar.zzo();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzqi.class == obj.getClass()) {
            zzqi zzqiVar = (zzqi) obj;
            if (this.zza == zzqiVar.zza && this.zzb == zzqiVar.zzb && this.zzc == zzqiVar.zzc && this.zze == zzqiVar.zze && this.zzg == zzqiVar.zzg && this.zzh == zzqiVar.zzh && this.zzf.equals(zzqiVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.zza);
        Integer numValueOf2 = Integer.valueOf(this.zzb);
        Integer numValueOf3 = Integer.valueOf(this.zzc);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(numValueOf, numValueOf2, numValueOf3, bool, bool, Integer.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), Integer.valueOf(this.zzh), bool, bool);
    }
}
