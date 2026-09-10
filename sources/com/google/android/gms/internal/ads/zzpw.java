package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzpw {
    public static final zzpw zza = new zzpv().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    public /* synthetic */ zzpw(zzpv zzpvVar, byte[] bArr) {
        this.zzb = zzpvVar.zze();
        this.zzc = zzpvVar.zzf();
        this.zzd = zzpvVar.zzg();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzpw.class == obj.getClass()) {
            zzpw zzpwVar = (zzpw) obj;
            if (this.zzb == zzpwVar.zzb && this.zzc == zzpwVar.zzc && this.zzd == zzpwVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z2 = this.zzb;
        boolean z3 = this.zzc;
        return (z3 ? 1 : 0) + (z3 ? 1 : 0) + ((z2 ? 1 : 0) << 2) + (this.zzd ? 1 : 0);
    }
}
