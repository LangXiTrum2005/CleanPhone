package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzara implements Runnable {
    private final zzark zza;
    private final zzarq zzb;
    private final Runnable zzc;

    public zzara(zzark zzarkVar, zzarq zzarqVar, Runnable runnable) {
        this.zza = zzarkVar;
        this.zzb = zzarqVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzark zzarkVar = this.zza;
        zzarkVar.zzl();
        zzarq zzarqVar = this.zzb;
        if (zzarqVar.zzc()) {
            zzarkVar.zzs(zzarqVar.zza);
        } else {
            zzarkVar.zzt(zzarqVar.zzc);
        }
        if (zzarqVar.zzd) {
            zzarkVar.zzc("intermediate-response");
        } else {
            zzarkVar.zzd("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
