package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbrl extends zzcea {
    private final Object zza = new Object();
    private final zzbrq zzb;
    private boolean zzc;

    public zzbrl(zzbrq zzbrqVar) {
        this.zzb = zzbrqVar;
    }

    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("release: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock acquired");
                if (this.zzc) {
                    com.google.android.gms.ads.internal.util.zze.zza("release: Lock already released");
                    return;
                }
                this.zzc = true;
                zze(new zzbri(this), new zzcdw());
                zze(new zzbrj(this), new zzbrk(this));
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ zzbrq zzb() {
        return this.zzb;
    }
}
