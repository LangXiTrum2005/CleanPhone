package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzarq {
    public final Object zza;
    public final zzaqt zzb;
    public final zzart zzc;
    public boolean zzd;

    private zzarq(zzart zzartVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzartVar;
    }

    public static zzarq zza(Object obj, zzaqt zzaqtVar) {
        return new zzarq(obj, zzaqtVar);
    }

    public static zzarq zzb(zzart zzartVar) {
        return new zzarq(zzartVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }

    private zzarq(Object obj, zzaqt zzaqtVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzaqtVar;
        this.zzc = null;
    }
}
