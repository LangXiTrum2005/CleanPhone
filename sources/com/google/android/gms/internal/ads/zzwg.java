package com.google.android.gms.internal.ads;

import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public final class zzwg {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    private zzwg(Object obj, int i2, int i3, long j, int i4) {
        this.zza = obj;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = j;
        this.zze = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwg)) {
            return false;
        }
        zzwg zzwgVar = (zzwg) obj;
        return this.zza.equals(zzwgVar.zza) && this.zzb == zzwgVar.zzb && this.zzc == zzwgVar.zzc && this.zzd == zzwgVar.zzd && this.zze == zzwgVar.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzwg zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzwg(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzwg(Object obj, int i2, int i3, long j) {
        this(obj, i2, i3, j, -1);
    }

    public zzwg(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public zzwg(Object obj, long j, int i2) {
        this(obj, -1, -1, j, i2);
    }
}
