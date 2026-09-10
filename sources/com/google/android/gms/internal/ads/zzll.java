package com.google.android.gms.internal.ads;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzll {
    public final zzwg zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final boolean zzj;

    public zzll(zzwg zzwgVar, long j, long j2, long j3, long j4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        boolean z7 = true;
        zzgqa.zza(!z6 || z4);
        if (z5 && !z4) {
            z7 = false;
        }
        zzgqa.zza(z7);
        this.zza = zzwgVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = false;
        this.zzg = false;
        this.zzh = z4;
        this.zzi = z5;
        this.zzj = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzll.class == obj.getClass()) {
            zzll zzllVar = (zzll) obj;
            if (this.zzb == zzllVar.zzb && this.zzc == zzllVar.zzc && this.zzd == zzllVar.zzd && this.zze == zzllVar.zze && this.zzh == zzllVar.zzh && this.zzi == zzllVar.zzi && this.zzj == zzllVar.zzj && Objects.equals(this.zza, zzllVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        long j = this.zze;
        long j2 = this.zzd;
        return (((((((((((((iHashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j2)) * 31) + ((int) j)) * 29791) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0);
    }

    public final zzll zza(long j) {
        return j == this.zzb ? this : new zzll(this.zza, j, this.zzc, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }

    public final zzll zzb(long j) {
        return j == this.zzc ? this : new zzll(this.zza, this.zzb, j, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }
}
