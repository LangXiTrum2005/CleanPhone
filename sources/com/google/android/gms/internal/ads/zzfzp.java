package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzfzp extends zzgxf {
    Object zza;

    public zzfzp(Object obj, Runnable runnable) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final boolean zza(Object obj) {
        return super.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final boolean zzb(Throwable th) {
        return super.zzb(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final void zzc() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final String zzd() {
        Object obj = this.zza;
        return obj == null ? "" : obj.toString();
    }
}
