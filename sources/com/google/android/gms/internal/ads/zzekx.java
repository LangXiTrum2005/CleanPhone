package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzekx implements zzelc {
    final /* synthetic */ zzeky zza;

    public zzekx(zzeky zzekyVar) {
        this.zza = zzekyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcqz zzcqzVar = (zzcqz) obj;
        synchronized (this.zza) {
            this.zza.zzc = zzcqzVar.zzm();
            zzcqzVar.zzk();
        }
    }
}
