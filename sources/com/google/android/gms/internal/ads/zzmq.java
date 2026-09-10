package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzmq {
    public static final zzmq zza;
    public static final zzmq zzb;
    public static final zzmq zzc;
    public final long zzd;
    public final long zze;

    static {
        zzmq zzmqVar = new zzmq(0L, 0L);
        zza = zzmqVar;
        new zzmq(Long.MAX_VALUE, Long.MAX_VALUE);
        zzb = new zzmq(Long.MAX_VALUE, 0L);
        new zzmq(0L, Long.MAX_VALUE);
        zzc = zzmqVar;
    }

    public zzmq(long j, long j2) {
        zzgqa.zza(j >= 0);
        zzgqa.zza(j2 >= 0);
        this.zzd = j;
        this.zze = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmq.class == obj.getClass()) {
            zzmq zzmqVar = (zzmq) obj;
            if (this.zzd == zzmqVar.zzd && this.zze == zzmqVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzd) * 31) + ((int) this.zze);
    }
}
