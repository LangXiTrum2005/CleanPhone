package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzcfm implements Runnable {
    private final zzcey zza;
    private boolean zzb = false;

    public zzcfm(zzcey zzceyVar) {
        this.zza = zzceyVar;
    }

    private final void zzc() {
        zzfxl zzfxlVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzfxlVar.removeCallbacks(this);
        zzfxlVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzF();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzF();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
