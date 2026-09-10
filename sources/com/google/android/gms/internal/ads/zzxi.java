package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzxi {
    public final int zza;
    public final boolean zzb;

    public zzxi(int i2, boolean z2) {
        this.zza = i2;
        this.zzb = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzxi.class == obj.getClass()) {
            zzxi zzxiVar = (zzxi) obj;
            if (this.zza == zzxiVar.zza && this.zzb == zzxiVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
