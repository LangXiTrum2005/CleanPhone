package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzfbj implements zzelc {
    final /* synthetic */ zzfbl zza;

    public zzfbj(zzfbl zzfblVar) {
        this.zza = zzfblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdoa zzdoaVar = (zzdoa) obj;
        synchronized (this.zza) {
            try {
                this.zza.zzd = zzdoaVar;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdF)).booleanValue()) {
                    zzdoaVar.zzd().zza = this.zza.zzc;
                }
                this.zza.zzd.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
