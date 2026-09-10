package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzym {
    public final long zza;
    public final long zzb;

    public zzym(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzym)) {
            return false;
        }
        zzym zzymVar = (zzym) obj;
        return this.zza == zzymVar.zza && this.zzb == zzymVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
