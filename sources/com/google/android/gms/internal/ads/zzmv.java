package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzmv {
    public final long zza;
    public final zzbf zzb;
    public final int zzc;
    public final zzwg zzd;
    public final long zze;
    public final zzbf zzf;
    public final int zzg;
    public final zzwg zzh;
    public final long zzi;
    public final long zzj;

    public zzmv(long j, zzbf zzbfVar, int i2, zzwg zzwgVar, long j2, zzbf zzbfVar2, int i3, zzwg zzwgVar2, long j3, long j4) {
        this.zza = j;
        this.zzb = zzbfVar;
        this.zzc = i2;
        this.zzd = zzwgVar;
        this.zze = j2;
        this.zzf = zzbfVar2;
        this.zzg = i3;
        this.zzh = zzwgVar2;
        this.zzi = j3;
        this.zzj = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmv.class == obj.getClass()) {
            zzmv zzmvVar = (zzmv) obj;
            if (this.zza == zzmvVar.zza && this.zzc == zzmvVar.zzc && this.zze == zzmvVar.zze && this.zzg == zzmvVar.zzg && this.zzi == zzmvVar.zzi && this.zzj == zzmvVar.zzj && Objects.equals(this.zzb, zzmvVar.zzb) && Objects.equals(this.zzd, zzmvVar.zzd) && Objects.equals(this.zzf, zzmvVar.zzf) && Objects.equals(this.zzh, zzmvVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj));
    }
}
