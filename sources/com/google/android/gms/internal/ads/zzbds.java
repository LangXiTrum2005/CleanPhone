package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbds {
    final long zza;
    final String zzb;
    final int zzc;

    public zzbds(long j, String str, int i2) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbds)) {
            return false;
        }
        zzbds zzbdsVar = (zzbds) obj;
        return zzbdsVar.zza == this.zza && zzbdsVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
